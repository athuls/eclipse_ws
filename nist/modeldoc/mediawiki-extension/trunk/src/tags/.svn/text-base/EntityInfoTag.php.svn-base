<?php

/*
 * @(#)TableInfoTag.php    0.00 Aug 13, 2009
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

use ModelDoc\Util;

require_once __DIR__ . '/../versioning/EntityVersionManager.php';

/**
 *
 *
 */
use ModelDoc\Versioning;

use ModelDoc;

class EntityInfoTag {

  public static function setUpEntityInfoPage($dataSourceName, $entity, $parser) {
    // TODO Check if page already exists

    // Creating the version page first so we can link to it
    Versioning\EntityVersionManager::createVersionPageForEntity($dataSourceName, $entity);

    // Setting up the entity-info page
    $entityInfoPageName = ModelDoc\Configuration::getEntityInfoPageName(
        $dataSourceName, $entity);
    $entityHistoryPageName = ModelDoc\Configuration::getEntityHistoryPageName(
        $dataSourceName, $entity);

    // Creating the refresh page
    ModelDoc\MediaWiki::createPage("MD_REFRESH_$dataSourceName_$entity",
        "<prevent-caching /><refresh-entity datasourcename='$dataSourceName' entityname='$entity' />"
        . "Go back to: " . ModelDoc\Configuration::LINK($entityInfoPageName, $entity));
    // Creating the entity info page
    ModelDoc\MediaWiki::createPage($entityInfoPageName,
          '<prevent-caching />'); // To avoid infinite loop
    ModelDoc\MediaWiki::replacePageText($entityInfoPageName,
          "<entity-info datasourcename='$dataSourceName' entityname='$entity' />"
          . ModelDoc\Configuration::LINK($entityHistoryPageName, "View History") . "<br />"
          . ModelDoc\Configuration::LINK("MD_REFRESH_$dataSourceName_$entity", "Refresh Versioning"));

    ModelDoc\MediaWiki::addSection($entityInfoPageName, "Documentation",
        "Document the table here.");
  }

  /**
   *
   * @param $input
   * @param $params
   * @param $parser
   * @return unknown_type
   */
  public function mediaWikiHook($input, $params, $parser) {
    $parser->disableCache();

    global $mdConfiguration;
    $entity = $params['entityname'];
    $dataSourceName = $params['datasourcename'];

    $entityInfoPageName = ModelDoc\Configuration::getEntityInfoPageName(
        $dataSourceName, $entity);
    if (! ModelDoc\MediaWiki::pageExists($entityInfoPageName)) {
      Util\Log::logString("Entity pages did not exist; creating");
      self::setUpEntityInfoPage($dataSourceName, $entity, $parser);
    }

    $dataSource = $mdConfiguration->databases[$dataSourceName];

    $columns = $dataSource->getColumns($entity);
    $tableListHTML = "<h3>Table: "
        . $parser->recursiveTagParse(ModelDoc\Configuration::LINK(
            $entityInfoPageName, $entity)) . '</h3>'
        . '<table style="width: 100%; border: thin solid black;" cellpadding="4px" cellspacing="0">'
          . '<tr style="background-color: #CCCCCC;">'
            . '<th align="left">Position</th>'
            . '<th align="left">Name</th>'
            . '<th align="left">Type</th>'
            . '<th align="right">Length</th>'
            . '<th align="center">Not Null</th>'
            . '<th align="center">Has Default</th></tr>';
    foreach ($columns as $column) {
      $tableListHTML .= "<tr><td>{$column['position']}</td>"
            . "<td>{$column['name']}</td>"
            . "<td>{$column['dataType']}</td>"
            . "<td align='right'>{$column['length']}</td>"
            . "<td align='center'>{$column['notNull']}</td>"
            . "<td align='center'>{$column['hasdefault']}</td></tr>";
    }
    $tableListHTML .= "</table>";

    $constraints = $dataSource->getConstraints($entity);
    $tableListHTML .= "<h4>Constraints</h4>"
        . '<table style="width: 100%; border: thin solid black;" cellpadding="4px" cellspacing="0">'
          . '<tr style="background-color: #CCCCCC;"><th align="left">Constraint</th>'
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
        $tableListHTML .= $parser->recursiveTagParse(
            ModelDoc\Configuration::LINK(
                ModelDoc\Configuration::getEntityInfoPageName(
                    $dataSourceName, $constraint->tableReferenced),
                $constraint->tableReferenced));
      }
      $tableListHTML .= "</td><td>$constraint->fieldReferenced</td></tr>";
    }
    $tableListHTML .= "</table>";

    return $tableListHTML;
  }
}