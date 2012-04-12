<?php

/*
 * @(#)EntityVersionManager    0.00 Jan 11, 2010
 * Author: Jim Steinberger
 *
 * Copyright (c) 2010 University of Michigan
 * Ann Arbor, MI, 48109, USA
 * All Rights Reserved.
 * 
 * This software is the proprietary information of the University of Michigan
 * ("Proprietary Information").  You shall use it only in accordance with the
 * terms of the license agreement you entered into with the University of
 * Michigan.
 */

namespace ModelDoc\Versioning;

use ModelDoc\Util;

use ModelDoc;

require_once( __DIR__ . "/../util/Log.php" );
require_once( __DIR__ . "/../MediaWiki.php" );

/**
 * 
 * 
 */
class DataSourceVersionManager {
  /**
   * 
   * @param $dataSourceName
   * @param $entityName
   * @return <code>true</code> if the specified version page exists.
   *   <code>false</code> otherwise.
   */
  public static function versionPageExists($dataSourceName) {
    global $mdConfiguration;
    
    return ModelDoc\MediaWiki::pageExists(
        $mdConfiguration::getDataSourceHistoryPageName($dataSourceName));
  }
  
  public static function refreshVersioning($dataSourceName, $entityName) {
    global $mdConfiguration;
    
    $dataSource = $mdConfiguration->databases[$dataSourceName];
    
    $currentTableNames = $dataSource->getTableNames();
    
    $previousTableNames = self::getPreviousTableNames($dataSourceName);

    $deletedTableNames= array_diff($previousTableNames, $currentTableNames);
    $addedTableNames = array_diff($currentTableNames, $previousTableNames);
    
    if (sizeof($deletedTableNames) > 0 || sizeof($addedTableNames) > 0) {
      $changeText = '';
      if (sizeof($deletedTableNames) > 0) {
        $changeText .= '<b>Deleted Tables</b>: ';
        foreach ($deletedTableNames as $table) {
          $changeText .= $table;
        }
        $changeText .= '<br />';
      }
      if (sizeof($addedTableNames) > 0) {
        $changeText .= '<b>Added Tables</b>: ';
        foreach ($addedTableNames as $table) {
          $changeText .= $table;
        }
        $changeText .= '<br />';
      }
      ModelDoc\MediaWiki::addSection(
          ModelDoc\Configuration::getDataSourceHistoryPageName($dataSourceName),
          'Changes <i>(' . date("F j, Y, g:i a") . ')</i>: ',
          $changeText);
      
      $xml = self::getCurrentVersionInXML($dataSourceName);
      ModelDoc\MediaWiki::replacePageText(
          ModelDoc\Configuration::getDataSourceHistoryPageName($dataSourceName),
        $xml->asXML());
    }
  }
  
  public static function getPreviousTableNames($dataSourceName) {
    $page = ModelDoc\MediaWiki::getPageText(
        ModelDoc\Configuration::getDataSourceHistoryPageName($dataSourceName));
    $xml = simplexml_load_string($page);

    $versionXML = simplexml_load_string($xml->page->revision->text);
    
    $tables = array();
    foreach ($versionXML->table as $table) {
      $tables[] = (string) $table->name;
    }
    sort($tables);
    return $tables;
  }
  
  private static function getCurrentVersionInXML($dataSourceName) {
    global $mdConfiguration;
    $dataSource = $mdConfiguration->databases[$dataSourceName]; // TODO This is Postgres-specific
    $xml = new \SimpleXMLElement("<datasource name='" . $dataSourceName . "' />");
    
    foreach ($dataSource->getTableNames() as $table) {
      $tableElement = $xml->addChild("table");
      $tableElement->addAttribute('name', $table);
    }
    
    return $xml;
  }
  
  public static function createVersionPageForDataSource($dataSourceName) {
    if (self::versionPageExists(
        ModelDoc\Configuration::getDataSourceHistoryPageName($dataSourceName))) {
      Util\Log::logString("Version page for '$dataSourceName' already exists");
      return false;
    }
    
    global $mdConfiguration;
    
    $xml = self::getCurrentVersionInXML($dataSourceName);
    
    ModelDoc\MediaWiki::createPage(
        ModelDoc\Configuration::getDataSourceHistoryPageName($dataSourceName),
        $xml->asXML());
  }
}