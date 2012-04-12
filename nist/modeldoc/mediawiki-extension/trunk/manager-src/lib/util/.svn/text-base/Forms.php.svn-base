<?php

class Forms {
  const METHOD_GET = 'GET';
  const METHOD_POST = 'POST';
  const METHOD_REQUEST = 'REQUEST';
  
  public static function getParameter($fieldName, $method=NULL) {
    if (is_null($method) || $method == self::METHOD_REQUEST) {
      return isset($_REQUEST[$fieldName]) ? $_REQUEST[$fieldName] : NULL;
    }
    if ($method == self::METHOD_GET) {
      return isset($_GET[$fieldName]) ? $_GET[$fieldName] : NULL;
    }
    if ($method = self::METHOD_POST) {
      return isset($_POST[$fieldName]) ? $_POST[$fieldName] : NULL;
    }
    return NULL;
  }
}