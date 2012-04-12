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
class EntityVersionManager {
  /**
   * 
   * @param $dataSourceName
   * @param $entityName
   * @return <code>true</code> if the specified version page exists.
   *   <code>false</code> otherwise.
   */
  public static function versionPageExists($dataSourceName, $entityName) {
    global $mdConfiguration;
    
    return ModelDoc\MediaWiki::pageExists(
        $mdConfiguration::getEntityHistoryPageName($dataSourceName, $entityName));
  }
  
  public static function refreshVersioning($dataSourceName, $entityName) {
    global $mdConfiguration;
    
    $dataSource = $mdConfiguration->databases[$dataSourceName];
    $currentFields = $dataSource->getColumns($entityName);
    $currentFieldNames = array();
    foreach($currentFields as $currentField) {
      $currentFieldNames[] = $currentField['name'];
    }
    
    $fieldsInLastVersion = self::getLastVersionFieldNames($dataSourceName, $entityName);

    $deletedFields = array_diff($fieldsInLastVersion, $currentFieldNames);
    $addedFields = array_diff($currentFieldNames, $fieldsInLastVersion);
    
    if (sizeof($deletedFields) > 0 || sizeof($addedFields) > 0) {
      $changeText = '';
      if (sizeof($deletedFields) > 0) {
        $changeText .= '<b>Deleted Fields</b>: ';
        foreach ($deletedFields as $field) {
          $changeText .= $field;
        }
        $changeText .= '<br />';
      }
      if (sizeof($addedFields) > 0) {
        $changeText .= '<b>Added Fields</b>: ';
        foreach ($addedFields as $field) {
          $changeText .= $field;
        }
        $changeText .= '<br />';
      }
      ModelDoc\MediaWiki::addSection(
          ModelDoc\Configuration::getEntityInfoPageName($dataSourceName, $entityName),
          'Changes <i>(' . date("F j, Y, g:i a") . ')</i>: ',
          $changeText);
      
      $xml = self::getCurrentVersionInXML($dataSourceName, $entityName);
      ModelDoc\MediaWiki::replacePageText(
        $mdConfiguration::getEntityHistoryPageName($dataSourceName, $entityName),
        $xml->asXML());
    }
  }
  
  public static function getLastVersionFieldNames($dataSourceName, $entityName) {
    global $mdConfiguration;
    
    $page = ModelDoc\MediaWiki::getPageText(
        $mdConfiguration::getEntityHistoryPageName($dataSourceName, $entityName));
    $xml = simplexml_load_string($page);

    $versionXML = simplexml_load_string($xml->page->revision->text);
    
    $columns = array();
    foreach ($versionXML->column as $column) {
      $columns[] = (string) $column->name;
    }
    sort($columns);
    return $columns;
  }
  
  private static function getCurrentVersionInXML($dataSourceName, $entityName) {
    global $mdConfiguration;
    $dataSource = $mdConfiguration->databases[$dataSourceName]; // TODO This is Postgres-specific
    $xml = new \SimpleXMLElement("<entity><name>" . $entityName . "</name></entity>");
    
    foreach ($dataSource->getColumns($entityName) as $column) {
      $columnElement = $xml->addChild("column");
      $columnElement->addChild('name', $column['name']);
      $columnElement->addChild('position', $column['position']);
      $columnElement->addChild('dataType', $column['dataType']);
      $columnElement->addChild('length', $column['length']);
      if (isset($column['notnull'])) {
        $columnElement->addChild('notNull', $column['notnull'] ? 't' : 'f');
      } else {
        $columnElement->addChild('notNull', 'f');
      }
      $columnElement->addChild('hasdefault', $column['hasdefault'] ? 't' : 'f');
    }
    
    foreach ($dataSource->getConstraints($entityName) as $constraint) {
      $constraintElement = $xml->addChild('constraint');
      $constraintElement->addChild('name', $constraint->constraintName);
      $constraintElement->addChild('type', $constraint->constraintType);
      $constraintElement->addChild('column', $constraint->columnName);
      $constraintElement->addChild('tableReferenced', $constraint->tableReferenced);
      $constraintElement->addChild('fieldReferenced', $constraint->fieldReferenced);
    }
    
    return $xml;
  }
  
  public static function createVersionPageForEntity($dataSourceName, $entityName) {
    if (self::versionPageExists($dataSourceName, $entityName)) {
      Util\Log::logString("Version page for '$entityName' already exists");
      return false;
    }
    
    global $mdConfiguration;
    
    $xml = self::getCurrentVersionInXML($dataSourceName, $entityName);
    
    ModelDoc\MediaWiki::createPage(
        $mdConfiguration::getEntityHistoryPageName($dataSourceName, $entityName),
        $xml->asXML());
  }
}