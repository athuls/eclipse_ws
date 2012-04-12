<?php

/*
 * @(#)DatasourceListTag.php    0.00 Jan 2, 2010
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

namespace ModelDoc\Tags;

use ModelDoc\Util;

use ModelDoc;

require_once( __DIR__ . "/../util/Log.php" );
require_once( __DIR__ . "/../MediaWiki.php" );

/**
 * Generates a browseable list of the configured datasources
 */
class DatasourceListTag {

  /**
   * TODO Display useful information about each datasource
   * TODO Allow other output formats?
   * 
   * @param $input
   * @param $params
   * @param $parser
   * @global $mdConfiguration /ModelDoc/Configuration
   */
  public function mediaWikiHook($input, $params, $parser) {
    $parser->disableCache();
    
    global $mdConfiguration;
    
    // Creating the list of data sources
    $tableListHTML = "<table style='width: 400px; border: thin solid black;' cellspacing='0' cellpadding='4px'>"
        . '<tr style="background-color: #CCCCCC;">'
          . '<th>Type</th>'
          . '<th>Name</th>'
          . '<th>Entities</th>'
          . '<th>Refresh All</th>'
        . '</tr>';
    foreach ($mdConfiguration->databases as $dataSourceName => $database) {
      // Creating the entity-list page for each data source
      $entityListPageName = "MD_ENTITY_LIST_" . $dataSourceName;

      if (! ModelDoc\MediaWiki::pageExists($entityListPageName)) {
        self::createEntityListPage($dataSourceName);
      }
      
      $tableListHTML .= '<tr><td>Postgres</td>'
          . '<td>' . $database->getDatabaseName() . '</td>'
          . '<td align="center">'
//            . '[[' . $entityListPageName . '|Entities]]'
            . $parser->recursiveTagParse('[[' . $entityListPageName . '|Entities]]')
            . '</td>'
          . '<td align="center">Refresh</td>'
          . '</tr>';
    }
    $tableListHTML .= "</table>";
    
    return $tableListHTML;
  }
  
  private static function createEntityListPage($dataSourceName) {
    $entityListPageName = 'MD_ENTITY_LIST_' . $dataSourceName;
    
    // Bowing out if the page already exists
    if (ModelDoc\MediaWiki::pageExists($entityListPageName)) {
      return;
    }
    
    global $mdConfiguration;
    $tableNames = $mdConfiguration->databases[$dataSourceName]->getTableNames();
    
    $tableListHTML = "<table style='width: 400px; border: thin solid black;' caption='Entities'>"
        . '<tr style="background-color: #CCCCCC;">'
          . '<th>Table</th>'
          . '<th>Info</th>'
          . '<th>Refresh</th>'
        . '</tr>';
    foreach ($tableNames as $tableName) {
      $entityPageName = 'MD_ENTITY_' . $dataSourceName . '_' . $tableName;
      
      // Gotta create the entity pages before linking to them
      if (! ModelDoc\MediaWiki::pageExists($entityPageName)) {
        self::createEntityPage($dataSourceName, $tableName);
      }
      
      $tableListHTML .= '<tr><td align="center">'
          . '[[' . $entityPageName . '|' . $tableName . ']]'
            // TODO . $parser->recursiveTagParse('[[' . $entityPageName . '|' . $tableName . ']]')
            . '</td>'
          . '<td align="center">Info</td>'
          . '<td align="center">Refresh</td>'
          . '</tr>';
    }
    $tableListHTML .= "</table>";
  }
  
  private static function createEntityPage($dataSourceName, $entity) {
    $entityPageName = 'MD_ENTITY_' . $dataSourceName . '_' . $entity;
    
    if (ModelDoc\MediaWiki::pageExists($entityPageName)) {
      return;
    }
    
    global $mdConfiguration;
    $dataSource = $mdConfiguration->databases[$dataSourceName];
    
    $columns = $dataSource->getColumns($entity);
    $tableListHTML = "<h3>Table: $entity</h3>"
        . '<table width="100%">'
          . '<tr><th>Position</th>'
            . '<th align="left">Name</th>'
            . '<th align="left">Type</th>'
            . '<th>Length</th>'
            . '<th>Not Null</th>'
            . '<th>Has Default</th></tr>';
    foreach ($columns as $column) {
      $tableListHTML .= "<tr><td>{$column['position']}</td>"
            . "<td>{$column['name']}</td>"
            . "<td>{$column['dataType']}</td>"
            . "<td>{$column['length']}</td>"
            . "<td>{$column['notNull']}</td>"
            . "<td>{$column['hasdefault']}</td></tr>";
    }
    $tableListHTML .= "</table>";
    
    $constraints = $dataSource->getConstraints($entity);
    $tableListHTML .= "<h4>Constraints</h4>"
        . '<table width="100%">'
          . '<tr><th align="left">Constraint</th>'
            . '<th align="left">Type</th>'
            . '<th align="left">Column</th>'
            . '<th align="left">Table</th>'
            . '<th align="left">Field</th></tr>';
    foreach ($constraints as $constraint) {
      $tableListHTML .= "<tr><td>$constraint->constraintName</td>"
          . "<td>$constraint->constraintType</td>"
          . "<td>$constraint->columnName</td>"
          . "<td>";
      if ($constraint->constraintType == 'FOREIGN KEY') {
        $tableListHTML .= "[[TABLE_$constraint->tableReferenced|$constraint->tableReferenced]]";
        // TODO $tableListHTML .= $parser->recursiveTagParse("[[TABLE_$constraint->tableReferenced|$constraint->tableReferenced]]");
      }
      $tableListHTML .= "</td><td>$constraint->fieldReferenced</td></tr>";
    }
    $tableListHTML .= "</table>";
    
    ModelDoc\MediaWiki::createPage($entityPageName, $tableListHTML);
  }
}