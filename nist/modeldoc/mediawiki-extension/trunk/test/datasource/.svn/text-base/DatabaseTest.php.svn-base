<?php

use ModelDoc\Datasource;
require_once 'PHPUnit/Framework.php';

require_once __DIR__ . '/../../src/datasource/Database.php';

class DatabaseTest extends PHPUnit_Framework_TestCase {
  /**
   * @expectedException PHPUnit_Framework_Error
   */
  public function testConstructor() {
    try {
      $database = new Datasource\Database('url', 'username',
          'password', 'name');
    } catch (Exception $e) {
      print_r($e);
      return;
    }
    
    $this->fail("Should not have been able to call constructor");
  }
}