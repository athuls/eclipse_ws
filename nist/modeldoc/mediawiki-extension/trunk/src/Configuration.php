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

require_once(__DIR__ . '/MediaWiki.php');
require_once(__DIR__ . '/mediawiki/Snoopy.class.php');
require_once(__DIR__ . '/datasource/Postgres.php');
require_once(__DIR__ . '/log4php/Logger.php');

\Logger::configure(__DIR__ . '/log4php.properties');

/**
 * This class encompasses the configuration of ModelDoc
 */
class Configuration {
  // Constants

  const MEDIAWIKI_USERNAME = 'username';
  const MEDIAWIKI_PASSWORD = 'password';
  const MEDIAWIKI_URL = 'url';

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

  public $mediaWikiAPI;

  public $mediaWikiUsername;
  public $mediaWikiPassword;
  public $mediaWikiURL;
  public $databases;

  public $snoopy;

  /**
   * The constructor
   * @param $configFilePath
   */
  public function __construct($configFilePath) {
    date_default_timezone_set('America/Detroit');

    $this->configFilePath = $configFilePath;
    $this->snoopy = new \Snoopy();

    $xml = simplexml_load_file( $this->configFilePath );

    $this->mediaWikiAPI = new MediaWiki(
        (string) $xml->mediawiki[self::MEDIAWIKI_USERNAME],
        (string) $xml->mediawiki[self::MEDIAWIKI_PASSWORD],
        (string) $xml->mediawiki[self::MEDIAWIKI_URL],
        $this->snoopy);
  }

  public function loadDatasourcesFromWiki() {
    $configXML = simplexml_load_string(MediaWiki::getPageText(
        self::getConfigPageName()));

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

  public static function LINK($page, $label = NULL) {
    if (is_null($label)) {
      $label = $page;
    }
    return "[[$page|$label]]";
  }

  public static function getConfigPageName() {
    return "ModelDoc::Configuration";
  }

  public static function getEntityInfoPageName($dataSourceName, $entityName) {
    return "ModelDoc::DataSource(\"$dataSourceName\")::Entity(\"$entityName\")";
  }

  public static function getEntityHistoryPageName($dataSourceName, $entityName) {
    return "ModelDoc::DataSource(\"$dataSourceName\")::Entity(\"$entityName\")::HISTORY";
  }

  public static function getDataSourceInfoPageName($dataSourceName) {
    return "ModelDoc::DataSource(\"$dataSourceName\")";
  }

  public static function getDataSourceHistoryPageName($dataSourceName) {
    return "ModelDoc::DataSource(\"$dataSourceName\")::HISTORY";
  }

  /**
   * Custom error handler
   *
   * @param unknown_type $errno
   * @param unknown_type $errstr
   * @param unknown_type $errfile
   * @param unknown_type $errline
   */
  public function modelDocErrorHandler($errno, $errstr, $errfile, $errline) {
    $logger = \Logger::getLogger("ModelDoc");

    if (($errno == E_ERROR) || ($errno == E_USER_ERROR)) {
      $logger->error("$errfile(line $errline): $errstr");
      die("ERROR");
    } else {
      $logger->info("$errfile(line $errline): $errstr");
    }
  }
}

set_error_handler(array("\\ModelDoc\\Configuration", "modelDocErrorHandler"));
?>