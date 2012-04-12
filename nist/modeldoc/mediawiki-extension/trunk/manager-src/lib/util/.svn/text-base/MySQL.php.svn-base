<?php

/**
 * Contains some utility help-functions for working with a MySQL data source
 *
 * @author lemast
 *
 */

class MySQL {

  public static function getDatabaseObject() {
    if (! self::$mysql) {
      self::$mysql = new MySQL("localhost", "root", "bip", "modeldoc");
    }
    return self::$mysql;
  }

  private static $mysql;

  // - -  Private Members

  private $connection;

  // - -  Constructor

  /**
   * Constructor
   *
   * @param $host
   * @param $username
   * @param $password
   * @param $database
   * @param $prefix
   */
  public function __construct($host, $username, $password, $database) {
    $this->connection = mysql_connect($host, $username, $password)
        or die("Could not connect: " . mysql_error());

    $this->changeDatabase($database);
  }


  // - -  Functions

  public function ESCAPE($string) {
    return mysql_real_escape_string($string);
  }

  /**
   *
   * @param $query The query-string -- this function assumes the query's
   *   parameters have been properly escaped to protect against SQL-injection.
   * @param $errorMessagePrefix (optional) Used instead of "Query error: "
   *   (the default) when displaying the error of a bad query.
   * @return The result of the query
   */
  public function executeQuery($query, $errorMessagePrefix = 'Query error: ') {
    $result = mysql_query($query);
    if (mysql_errno() != 0)
        die ($errorMessagePrefix . mysql_error());

    return $result;
  }

  /**
   * @param $database The name of the database to swich this connection to using
   */
  public function changeDatabase($database) {
    mysql_select_db($database) or die("Could not select database");
  }

  /**
   * @return The MySQL connection this class encapsulates
   */
  public function getConnection() {
    return $this->connection;
  }
}