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

require_once(__DIR__ . '/util/Log.php');

/**
 *
 */
use ModelDoc\Util;

class MediaWiki {

//  public static function uploadFile($fileName, $localFilePath) {
//    $editToken = self::getTokenForPageEdit($fileName);
//
//    $params = array('action' => 'upload',
//        'filename' => $fileName,
//        'token' => $editToken);
//    $data = self::getApiResult($params, true,
//        array( array('file', $localFilePath)));
//    print_r($data);
//  }
//
  /**
   *
   * @param $pageTitle
   * @return <code>true</code> if the page exists, <code>false</code> otherwise.
   */
  public static function pageExists($pageTitle) {
    $params = array('action' => 'query',
        'prop' => 'info|revisions', 'intoken' => 'edit',
        'titles' => $pageTitle, 'format' => 'php');
    $data = self::getApiResult($params);

    return ! isset($data['query']['pages'][-1]);
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

    $params = array('action' => 'edit',
                'title' => $pageTitle,
                'token' => $editToken,
                'text' => $pageText,
                'bot' => true,
                'createonly' => true,
                'format' => 'php');
    $data = self::getApiResult($params);
    Util\Log::logString("Result of attempting to create page: $pageTitle");
    Util\Log::logObject($data);

    if (isset($data['error'])) {
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

    $params = array('action' => 'edit',
                'title' => $pageTitle,
                'token' => $editToken,
                'text' => $pageText,
                'format' => 'php');
    $data = self::getApiResult($params);
    Util\Log::logString("Result of attempting to edit page: $pageTitle");
    Util\Log::logObject($data);

    if (isset($data['error'])) {
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

    $params = array('action' => 'edit',
                'title' => $pageTitle,
                'token' => $editToken,
                'text' => $sectionText,
                'summary' => $sectionTitle,
                'section' => 'new',
                'format' => 'php');
    $data = self::getApiResult($params);
    Util\Log::logString("Result of attempting to append to page: $pageTitle");
    Util\Log::logObject($data);

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
  public static function deletePage($pageTitle) {
    if (! self::pageExists($pageTitle)) {
      return false;
    }

    $deleteToken = self::getTokenForPageDelete($pageTitle);

    Util\Log::logString("Delete token: " . $deleteToken . ".\r\n");

    $params = array('action' => 'delete', 'title' => $pageTitle,
              'token' => $deleteToken, 'format' => 'php');
    $data = self::getApiResult($params);

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
  public static function getPageText($pageTitle) {
    $params = array('action' => 'query',
                'titles' => $pageTitle,
                'export' => '',
                'format' => 'php');
    $data = self::getApiResult($params);
    if (isset($data['error'])) {
      Util\Log::logString("Could not retrieve text: " . $data['error']);
      die("Could not retrieve text of wiki page");
    }

    return $data['query']['export']['*'];
  }

  /**
   *
   * @param $pageTitle
   * @return the edit token
   */
  private static function getTokenForPageEdit($pageTitle) {
    $params = array('action' => 'query',
        'prop' => 'info|revisions', 'intoken' => 'edit',
        'titles' => $pageTitle, 'format' => 'php');
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

    $params = array('action' => 'query', 'prop' => 'info|revisions', 'intoken' => 'delete',
              'titles' => $pageTitle, 'format' => 'php');
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

    $result = self::getApiResult(array('action' => 'login',
            'lgname' => $mdConfiguration->mediaWikiUsername,
            'lgpassword' => $mdConfiguration->mediaWikiPassword,
            'format' => 'php'), false);

    if ($result['login']['result'] != 'Success') {
      Util\Log::logString("Could not log in");
      Util\Log::logObject($result);
      die("Background process could not log into the wiki");
      return false;
    }

    $mdConfiguration->snoopy->setcookies();

    return true;
  }

  private static function getApiResult($params, $login=true, $fileFields=NULL) {
    if ($login) {
      self::logIn();
    }

    global $mdConfiguration;

//    if (isset($fileFields)) {
//      $mdConfiguration->snoopy->set_submit_multipart();
//      $mdConfiguration->snoopy->submit($mdConfiguration->mediaWikiURL, $params,
//          $fileFields);
//    } else {

      $mdConfiguration->snoopy->submit($mdConfiguration->mediaWikiURL, $params);
//    }

    $response = unserialize($mdConfiguration->snoopy->results);
    $mdConfiguration->snoopy->set_submit_normal();
    return $response;
  }
}