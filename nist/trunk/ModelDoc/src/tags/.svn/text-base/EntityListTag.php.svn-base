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
class EntityListTag {

  /**
   * 
   * @param $input
   * @param $parms
   * @param $parser
   * @return unknown_type
   */
  function mediaWikiHook($input, $parms, $parser) {
    $parser->disableCache();
    
    global $mdConfiguration;
    
    $tableListHTML = '<table>';
    
    foreach ($mdConfiguration->databases as $database) {
      foreach ($database->getTableNames() as $tableName) {
        // TODO EntityManager->refreshEntity($tableName);
        //   Create the entity page with the info tag inside
        //     And a link to the version page
        $tableListHTML .= '<tr><td>'
            . $parser->recursiveTagParse("[[MD_ENTITY_$tablename|$tableName]]")
            . '</td></tr>';
      }
    }
    
    $tableListHTML = '</table>';
    
    return $tableListHTML;
  }
  
  public static function createEntityListPage($dataSourceName) {
    
  }
}