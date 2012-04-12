<?php

/*
 * @(#)TestTag.php    0.00 Jan 19, 2010
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

class TestTag {

  public function mediaWikiHook($input, $params, $parser) {
    $parser->disableCache();

    ModelDoc\MediaWiki::addSection('MD_ENTITY_postgres1_trusses',
        "Documentation", "<h2>Documentation:</h2>");
    ModelDoc\MediaWiki::addSection('MD_ENTITY_postgres1_trusses',
        "Change", "<h2>Change:</h2>Added column: 'bip'<br />bip");
    
    return '';
  }
}