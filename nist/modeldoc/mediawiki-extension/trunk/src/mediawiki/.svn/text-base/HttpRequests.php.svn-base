<?php

/*
 * @(#)HttpRequests.php    0.00 Aug 13, 2009
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

require_once( __DIR__ . "/Snoopy.class.php" );

class HttpRequests {
  private static $snoopy;
  static function initialize() {
    self::$snoopy = new Snoopy();
  }
  
  public static function sendRequest($scheme, $host, $path='/', $method='GET',
      $cookies, $data='') {
    // Supply a default method of GET if the one passed was empty
    if (empty($method)) {
      $method = 'GET';
    }
    
    if (! self::$snoopy->submit("$scheme://$host/$path", $data))
        die("Snoopy error: {self::$snoopy->error}");
    
    return self::$snoopy->results;
    
//    $requestData = http_build_query($data);
//    
//    if ($method == 'GET') {
//      die("Unsupported: GET");
//    }
//    
//    $headerString = 'Content-type: application/x-www-form-urlencoded';
//    if (count($cookies) != 0) {
//      $headerString .= "\r\nCookie: ";
//      foreach ($cookies as $key => $value) {
//        $headerString .= $key . '=' . urlencode($value) . '; ';
//      }
//      $headerString .= substr($headerString,0,-2) . "\r\n";
//    }
//    print_r($headerString . "\r\n");
//    
//    $requestBody = array($scheme =>
//        array(
//          'method'  =>  $method,
//          'header'  =>  $headerString,
//          'content' =>  $requestData));
//    
//    $context = stream_context_create($requestBody);
//    
//    ini_set('user_agent', 'Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)');
//    return file_get_contents("$scheme://$host/$path", false, $context);
  }
}
HttpRequests::initialize();