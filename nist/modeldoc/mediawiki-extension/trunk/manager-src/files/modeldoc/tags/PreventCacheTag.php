<?php

/*
 * @(#)PreventCacheTag.php    0.00 Jan 19, 2010
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
use ModelDoc\Util;

class PreventCacheTag {

  public function mediaWikiHook($input, $params, $parser) {
    $parser->disableCache();
    Util\Log::logString("No issues precluding caching; returning empty string");
    return '';
  }
}