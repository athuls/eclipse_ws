<?php

/*
 * @(#)Registration.php    0.00 Aug 13, 2009
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

//require_once( __DIR__ . "/tags/EntityInfoTag.php" );
use ModelDoc\Tags;

require_once( __DIR__ . "/tags/DataSourceListTag.php" );
require_once( __DIR__ . "/tags/EntityInfoTag.php" );
require_once( __DIR__ . "/tags/EntityListTag.php" );
require_once( __DIR__ . "/tags/PreventCacheTag.php" );
require_once( __DIR__ . "/tags/RefreshEntityTag.php" );
require_once( __DIR__ . "/tags/TestTag.php" );

require_once( __DIR__ . "/tags/DemoFieldTag.php" );

require_once( __DIR__ . "/Configuration.php" );

$wgHooks['ParserFirstCallInit'][] = 'registerDBWikiTags';

/**
 * Registers the tags and their implementations
 */
function registerDBWikiTags(&$parser) {
  global $mdConfiguration;
  $mdConfiguration = new \ModelDoc\Configuration( __DIR__ . "/config.xml" );
  $mdConfiguration->loadDatasourcesFromWiki();
  
  $parser->setHook('entity-list',
      array(new Tags\EntityListTag(), "mediaWikiHook"));
  $parser->setHook('datasource-list',
      array(new Tags\DataSourceListTag(), "mediaWikiHook"));
  $parser->setHook('entity-info',
      array(new Tags\EntityInfoTag(), "mediaWikiHook"));
  $parser->setHook('prevent-caching',
      array(new Tags\PreventCacheTag(), "mediaWikiHook"));
  $parser->setHook('test-tag',
      array(new Tags\TestTag(), 'mediaWikiHook'));
  $parser->setHook('refresh-entity',
      array(new Tags\RefreshEntityTag(), 'mediaWikiHook'));

  // Tags for demo
  $parser->setHook('demo-field',
      array(new Tags\DemoFieldTag(), "mediaWikiHook"));
      
  return true;
}

//$wgExtensionFunctions[] = 'registerDBWikiTags';
$wgExtensionCredits['parserHook'][] = array(
    'name' => 'ModelDoc',
    'author' => 'U of M',
    'url' => 'http://www.eecs.umich.edu');