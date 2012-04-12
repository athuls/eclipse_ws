<?php

/*
 * @(#)MediaWiki.php    0.00 Aug 13, 2009
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
namespace ModelDoc;

/**
 *
 */
use ModelDoc\Util;

class MediaWiki {
  /**
   * 
   * @param $pageTitle
   * @return <code>true</code> if the page exists, <code>false</code> otherwise.
   */
  public static function pageExists($pageTitle) {
    $params = new \FauxRequest(array('action' => 'query',
        'prop' => 'info|revisions', 'intoken' => 'edit',
        'titles' => $pageTitle, 'format' => 'php'));
    $api = new \ApiMain($params);
    $api->execute();
    $data = & $api->getResultData();
    
    return is_null($data['query']['pages'][-1]);
  }

  /**
   * 
   * @param $pageTitle
   * @param $pageText
   * @return unknown_type
   */
  public static function createPage($pageTitle, $pageText) {
    if (self::pageExists($pageTitle)) {
      return false;
    }
    
    $editToken = self::getTokenForPageEdit($pageTitle);
    
    $params = new \FauxRequest(
        array('action' => 'edit',
                'title' => $pageTitle,
                'token' => $editToken,
                'text' => $pageText,
                'bot' => true,
                'createonly' => true,
                'format' => 'php'));
    $data = self::getApiResult($params);
    Util\Log::logString("Result of attempting to create page: $pageTitle");
    Util\Log::logObject($data);
    
    if (! is_null($data['error'])) {
      echo 'There was a problem creating the page: ' . $data['error'] . "\r\n";
      return false;
    }
    
    return true;
  }
  
  public static function replacePageText($pageTitle, $pageText) {
    if (! self::pageExists($pageTitle)) {
      return false;
    }
    
    $editToken = self::getTokenForPageEdit($pageTitle);
    
    $params = new \FauxRequest(
        array('action' => 'edit',
                'title' => $pageTitle,
                'token' => $editToken,
                'text' => $pageText,
                'format' => 'php'));
    $data = self::getApiResult($params);
    Util\Log::logString("Result of attempting to edit page: $pageTitle");
    Util\Log::logObject($data);
    
    if (! is_null($data['error'])) {
      echo 'There was a problem editing the page: ' . $data['error'] . "\r\n";
      return false;
    }
    
    return true;
  }
  
  public static function addSection($pageTitle, $sectionTitle, $sectionText) {
    if (! self::pageExists($pageTitle)) {
      return false;
    }
    
    $editToken = self::getTokenForPageEdit($pageTitle);
    
    $params = new \FauxRequest(
        array('action' => 'edit',
                'title' => $pageTitle,
                'token' => $editToken,
                'text' => $sectionText,
                'summary' => $sectionTitle,
                'section' => 'new',
                'format' => 'php'));
    $data = self::getApiResult($params);
    Util\Log::logString("Result of attempting to append to page: $pageTitle");
    Util\Log::logObject($data);
    
    if (! is_null($data['error'])) {
      echo 'There was a problem appending to the page: ' . $data['error'] . "\r\n";
      return false;
    }
    
    return true;
  }
  
  /**
   * 
   * @param $pageTitle
   * @return unknown_type
   */
  public static function deletePage($pageTitle) {
    if (! self::pageExists($pageTitle)) {
      return false;
    }
    
    $deleteToken = self::getTokenForPageDelete($pageTitle);
    
    Util\Log::logString("Delete token: " . $deleteToken . ".\r\n");
    
    $params = new \FauxRequest(
        array('action' => 'delete', 'title' => $pageTitle,
              'token' => $deleteToken, 'format' => 'php'));
    $data = self::getApiResult($params);
    
    if (! is_null($data['error'])) {
      echo 'There was a problem deleting the page: ' . $data['error'] . "\r\n";
      return false;
    }
    
    return true;
  }
  
  /**
   * 
   * @param $pageTitle
   * @return unknown_type
   */
  public static function getPageText($pageTitle) {
    $params = new \FauxRequest(
        array('action' => 'query',
                'titles' => $pageTitle,
                'export' => '',
                'format' => 'php'));
    $data = self::getApiResult($params);

    return $data['query']['export']['*'];
  }
  
  private static function getApiResult($params) {
    $api = new \ApiMain($params, true);
    $api->execute();
    return $api->getResultData();
  }
  
  /**
   * 
   * @param $pageTitle
   * @return the edit token
   */
  private static function getTokenForPageEdit($pageTitle) {
    $params = new \FauxRequest(array('action' => 'query',
        'prop' => 'info|revisions', 'intoken' => 'edit',
        'titles' => $pageTitle, 'format' => 'php'));
    $data = self::getApiResult($params);
    $page = array_pop($data['query']['pages']);
    return $page['edittoken'];
  }
  
  /**
   * 
   * @param $pageTitle
   * @return The delete-token
   */
  private static function getTokenForPageDelete($pageTitle) {
    if (!self::logIn()) {
      Util\Log::logString("Could not log in");
    }
    
    $params = new \FauxRequest(
        array('action' => 'query', 'prop' => 'info|revisions', 'intoken' => 'delete',
              'titles' => $pageTitle, 'format' => 'php'));
    $data = self::getApiResult($params);
    Util\Log::logString("Here comes the data!");
    Util\Log::logObject($data);
    $page = array_pop($data['query']['pages']);
    return $page['deletetoken'];
  }
  
  /*
   * Private Functions
   */
  
  private static function logIn() {
    global $mdConfiguration;

    $params = new \FauxRequest(
        array('action' => 'login',
            'lgname' => $mdConfiguration->mediaWikiUsername,
            'lgpassword' => $mdConfiguration->mediaWikiPassword,
            'format' => 'php'));
    $data = self::getApiResult($params);
    Util\Log::logString("Result of login attempt:");
    Util\Log::logObject($data);
    
    if ($data['login']['result'] != 'Success') {
      return false;
    }
    
    return true;
  }
}