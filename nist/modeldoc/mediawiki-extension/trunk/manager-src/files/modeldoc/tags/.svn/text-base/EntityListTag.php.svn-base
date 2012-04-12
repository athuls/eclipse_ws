<?php

/*
 * @(#)EntityListTag.php    0.00 Aug 13, 2009
 * Author: Jim Steinberger
 *
 * Copyright (c) 2009 University of Michigan
 * Ann Arbor, MI, 48109, USA
 * All Rights Reserved.
 * 
 * This software is the proprietary information of the University of Michigan
 * ("Proprietary Information").  You shall use it only in accordance with the
 * terms of the license agreement you entered into with the University of
 * Michigan.
 */

namespace ModelDoc\Tags;

/**
 * 
 */
use ModelDoc;

require_once __DIR__ . '/../versioning/DataSourceVersionManager.php';
require_once __DIR__ . '/../util/Log.php';

class EntityListTag {
  public static function createEntityListPage($dataSourceName) {
    // TODO Check if page already exists
    \ModelDoc\Versioning\DataSourceVersionManager::createVersionPageForDataSource($dataSourceName);
    
    $dataSourceInfoPageName = ModelDoc\Configuration::getDataSourceInfoPageName($dataSourceName);
    $dataSourceHistoryPageName = ModelDoc\Configuration::getDataSourceHistoryPageName($dataSourceName);
    
    ModelDoc\MediaWiki::createPage($dataSourceInfoPageName,
        "<prevent-caching />");
    ModelDoc\MediaWiki::replacePageText($dataSourceInfoPageName,
        "<entity-list datasourcename='$dataSourceName' />"
        . ModelDoc\Configuration::LINK($dataSourceHistoryPageName, "HISTORY"));
    ModelDoc\MediaWiki::addSection($dataSourceInfoPageName, "Documentation",
        "Document the datasource here.");
  }
  
  /**
   * 
   * @param $input
   * @param $parms
   * @param $parser
   * @return unknown_type
   */
  public function mediaWikiHook($input, $params, $parser) {
    $parser->disableCache();
    
    global $mdConfiguration;
    $dataSourceName = $params['datasourcename'];
    
    $dataSourceInfoPageName = ModelDoc\Configuration::getDataSourceInfoPageName($dataSourceName);
    if (! ModelDoc\MediaWiki::pageExists($dataSourceInfoPageName)) {
      \ModelDoc\Util\Log::logString("Creating data source info page for: $dataSourceName");
      self::createEntityListPage($dataSourceName);
    }
    
    $dataSource = $mdConfiguration->databases[$dataSourceName];
    $tables = $dataSource->getTableNames();
    
    $tableListHTML = '<h3>Data Source: '
        . $parser->recursiveTagParse(ModelDoc\Configuration::LINK(
            $dataSourceInfoPageName, $dataSourceName))
        . '</h3>'
        . '<table style="width: 100%; border: thin solid black;" cellpadding="4px" cellspacing="0">'
          . '<tr style="background-color: #CCCCCC;">'
            . '<th align="left">Table</th>'
            . '<th align="left">Table</th>'
            . '<th align="left">Table</th>'
            . '<th align="left">Table</th>'
            . '<th align="left">Table</th></tr>';
    $i = 0;
    foreach ($tables as $table) {
      if ($i % 5 == 0) {
        $tableListHTML .= '<tr>';
      }
      $entityInfoPageName = ModelDoc\Configuration::getEntityInfoPageName($dataSourceName, $table);
      if (! ModelDoc\MediaWiki::pageExists($entityInfoPageName)) {
        \ModelDoc\Util\Log::logString("Creating entity info page for: $dataSourceName:$table");
        EntityInfoTag::setUpEntityInfoPage($dataSourceName, $table, $parser);
      }
      $tableListHTML .= '<td>'
          . $parser->recursiveTagParse(
                ModelDoc\Configuration::LINK(
                    ModelDoc\Configuration::getEntityInfoPageName($dataSourceName, $table),
                    $table)) . '</td>';
      if ($i % 5 == 4) {
        $tableListHTML .= '</tr>';
      }
      $i = $i + 1;
    }
    $tableListHTML .= '</table>';
    
    return $tableListHTML;
  }
}