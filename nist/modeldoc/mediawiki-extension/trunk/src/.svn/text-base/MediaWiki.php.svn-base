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

/**
 *
 * @author jsteinbe
 * @package \ModeLDoc\MediaWiki
 */

namespace ModelDoc;

use ModelDoc\Util;

class MediaWiki {

  /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
   * Private Properties
   * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

  /** @var Logger */
  private $logger;

  /** @var string */
  private $username;
  /** @var string */
  private $password;
  /** @var url */
  private $url;

  /** @var unknown */
  private $snoopy;


  /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
   * Constructor
   * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

  /**
   *
   * @param string $username
   * @param string $password
   * @param string $url
   * @param Snoopy $snoopy
   */
  public function __construct($username, $password, $url, $snoopy) {
    $this->logger = \Logger::getLogger(__CLASS__);

    $this->username = $username;
    $this->password = $password;
    $this->url = $url;
    $this->snoopy = $snoopy;

    $this->logger->info("MediaWiki object initialized");
  }


  /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
   * API Functions
   * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

  /**
   *
   * @param string $pageTitle
   * @return boolean <code>true</code> if the page exists, <code>false</code> otherwise.
   */
  public function pageExists($pageTitle) {
    $pageExists = false;

    try {
      $params = array('action'  => 'query',
                      'prop'    => 'info|revisions',
                      'intoken' => 'edit',
                      'titles'  => $pageTitle,
                      'format'  => 'php');

      $data = $this->getApiResult($params);

      throw new \Exception("hooah");

      $pageExists = ! isset($data['query']['pages'][-1]);
    } catch (\Exception $e) {
      trigger_error($e->getMessage(), E_USER_ERROR);
    }

    return $pageExists;
  }

  /**
   *
   * @param string $pageTitle
   * @param string $pageText
   * @return unknown_type
   */
  public function createPage($pageTitle, $pageText) {
    if ($this->pageExists($pageTitle)) {
      return false;
    }

    $editToken = $this->getTokenForPageEdit($pageTitle);

    $params = array('action' => 'edit',
                'title' => $pageTitle,
                'token' => $editToken,
                'text' => $pageText,
                'bot' => true,
                'createonly' => true,
                'format' => 'php');
    $data = $this->getApiResult($params);

    if (isset($data['error'])) {
      echo 'There was a problem creating the page: ' . $data['error'] . "\r\n";
      return false;
    }

    return true;
  }

  /**
   *
   * @param unknown_type $pageTitle
   * @param unknown_type $pageText
   * @return unknown_type
   */
  public function replacePageText($pageTitle, $pageText) {
    if (! $this->pageExists($pageTitle)) {
      return false;
    }

    $editToken = $this->getTokenForPageEdit($pageTitle);

    $params = array('action' => 'edit',
                'title' => $pageTitle,
                'token' => $editToken,
                'text' => $pageText,
                'format' => 'php');
    $data = $this->getApiResult($params);

    if (isset($data['error'])) {
      echo 'There was a problem editing the page: ' . $data['error'] . "\r\n";
      return false;
    }

    return true;
  }

  public static function addSection($pageTitle, $sectionTitle, $sectionText) {
    if (! $this->pageExists($pageTitle)) {
      return false;
    }

    $editToken = $this->getTokenForPageEdit($pageTitle);

    $params = array('action' => 'edit',
                'title' => $pageTitle,
                'token' => $editToken,
                'text' => $sectionText,
                'summary' => $sectionTitle,
                'section' => 'new',
                'format' => 'php');
    $data = $this->getApiResult($params);

    if (isset($data['error'])) {
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
  public function deletePage($pageTitle) {
    if (! $this->pageExists($pageTitle)) {
      return false;
    }

    $deleteToken = $this->getTokenForPageDelete($pageTitle);

    $params = array('action' => 'delete', 'title' => $pageTitle,
              'token' => $deleteToken, 'format' => 'php');
    $data = $this->getApiResult($params);

    if (isset($data['error'])) {
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
  public function getPageText($pageTitle) {
    $params = array('action' => 'query',
                'titles' => $pageTitle,
                'export' => '',
                'format' => 'php');
    $data = $this->getApiResult($params);
    if (isset($data['error'])) {
//      Util\Log::logString("Could not retrieve text: " . $data['error']);
      die("Could not retrieve text of wiki page");
    }

    return $data['query']['export']['*'];
  }


  /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
   * Private Functions
   * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

  /**
   *
   * @param $pageTitle
   * @return the edit token
   */
  private function getTokenForPageEdit($pageTitle) {
    $params = array('action' => 'query',
        'prop' => 'info|revisions', 'intoken' => 'edit',
        'titles' => $pageTitle, 'format' => 'php');
    $data = $this->getApiResult($params);
    $page = array_pop($data['query']['pages']);
    return $page['edittoken'];
  }

  /**
   *
   * @param $pageTitle
   * @return The delete-token
   */
  private function getTokenForPageDelete($pageTitle) {
    if (!$this->logIn()) {
//      Util\Log::logString("Could not log in");
    }

    $params = array('action' => 'query', 'prop' => 'info|revisions', 'intoken' => 'delete',
              'titles' => $pageTitle, 'format' => 'php');
    $data = $this->getApiResult($params);
    $page = array_pop($data['query']['pages']);
    return $page['deletetoken'];
  }

  /**
   *
   * @return boolean Whether or not the login was successful
   */
  private function logIn() {
    global $mdConfiguration;

    $result = $this->getApiResult(array('action' => 'login',
            'lgname' => $this->username,
            'lgpassword' => $this->password,
            'format' => 'php'), false);

    if ($result['login']['result'] != 'Success') {
      trigger_error("Background process could not log into the wiki", E_USER_ERROR);
    }

    $mdConfiguration->snoopy->setcookies();

    return true;
  }

  /**
   *
   * @param unknown_type $params
   * @param unknown_type $login
   * @return unknown_type
   */
  private function getApiResult($params, $login=true) { //, $fileFields=NULL) {
    if ($login) {
      $this->logIn();
    }

//    if (isset($fileFields)) {
//      $mdConfiguration->snoopy->set_submit_multipart();
//      $mdConfiguration->snoopy->submit($mdConfiguration->mediaWikiURL, $params,
//          $fileFields);
//    } else {
      $this->snoopy->submit($this->url, $params);
//    }

    $response = unserialize($this->snoopy->results);
    $this->snoopy->set_submit_normal();
    return $response;
  }

//  public static function uploadFile($fileName, $localFilePath) {
//    $editToken = $this->getTokenForPageEdit($fileName);
//
//    $params = array('action' => 'upload',
//        'filename' => $fileName,
//        'token' => $editToken);
//    $data = $this->getApiResult($params, true,
//        array( array('file', $localFilePath)));
//    print_r($data);
//  }
}