<?php

/*
 * @(#)DemoFieldTag.php    0.00 Jan 20, 2010
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

/**
 * 
 * @author jsteinbe
 *
 */
use ModelDoc;

use ModelDoc\Util;

use ModelDoc\Versioning;

class DemoFieldTag {

  public function mediaWikiHook($input, $params, $parser) {
    $parser->disableCache();
    
    $dataSourceName = $params['datasourcename'];
    $entityName = $params['entityname'];
    $fieldName = $params['fieldname'];
    $action = $params['action'];
    
    global $mdConfiguration;
    $dataSource = $mdConfiguration->databases[$dataSourceName];
    
    if ($action == 'add') {
      $dataSource->addBitField($entityName, $fieldName);
    } else {
      $dataSource->deleteField($entityName, $fieldName);
    }

    return '';
  }
}