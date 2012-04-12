<?php

/*
 * @(#)Configuration.php    0.00 Dec 30, 2009
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

/**
 * Contains the Configuration class
 * @package ModelDoc
 */
namespace ModelDoc;

use ModelDoc\Util;

use ModelDoc\Database;

require_once( __DIR__ . '/MediaWiki.php' );
require_once( __DIR__ . '/datasource/Postgres.php' );

/**
 * This class encompasses the configuration of ModelDoc
 */
class Configuration {
  // Constants
  
  const MEDIAWIKI_USERNAME = 'username';
  const MEDIAWIKI_PASSWORD = 'password';
  
  /** The type of the data source */
  const DATASOURCE_TYPE = 'type';
  /** @var string Used for database-backed data sources */
  const DATASOURCE_HOST = 'host';
  /** @var string The abstract name of the data source */
	const DATASOURCE_NAME = 'name';
	/** @var string Used for database-backed data sources */
	const DATASOURCE_USERNAME = 'username';
	/** @var string Used for database-backed data sources */
	const DATASOURCE_PASSWORD = 'password';
	/** @var string The name of the database; for database-backed data sources */
	const DATASOURCE_DATABASE = 'database';
	
  private $configFilePath;
  public $mediaWikiUsername;
  public $mediaWikiPassword;
  public $databases;
  
  /**
   * The constructor
   * @param $configFilePath
   */
  function Configuration($configFilePath) {
    $this->configFilePath = $configFilePath;
    
    $xml = simplexml_load_file( __DIR__ . "/config.xml" );
    
    $this->mediaWikiUsername = $xml->mediawiki[self::MEDIAWIKI_USERNAME];
    $this->mediaWikiPassword = $xml->mediawiki[self::MEDIAWIKI_PASSWORD];
    
    $configXML = simplexml_load_string(MediaWiki::getPageText('MD_CONFIG'));
    $dataSourceConfig = simplexml_load_string($configXML->page->revision->text);
    
    $this->databases = array();
    foreach ($dataSourceConfig->dataSources->dataSource as $dataSource) {
      Util\Log::logString("Adding data source " . (string) $dataSource[self::DATASOURCE_NAME]);
      switch ($dataSource[self::DATASOURCE_TYPE]) {
        case "postgres":
          $this->databases[ (string) $dataSource[self::DATASOURCE_NAME] ]
              = new Datasource\Postgres(
                  (string) $dataSource[self::DATASOURCE_HOST],
                  (string) $dataSource[self::DATASOURCE_USERNAME],
                  (string) $dataSource[self::DATASOURCE_PASSWORD],
                  (string) $dataSource[self::DATASOURCE_DATABASE]
                  );
          break;
      }
    }
  }
}