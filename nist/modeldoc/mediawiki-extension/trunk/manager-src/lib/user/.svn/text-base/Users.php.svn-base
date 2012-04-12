<?php

require_once 'User.php';
require_once dirname( __FILE__ ) . "/../util/MySQL.php";

/**
 * Contains functions for working with the users in the application.
 *
 * @author Jim Steinberger
 *
 */
class Users {
  public static function isAdminUser($username) {
    if (! self::doesUserExist($username)) {
      return false;
    }

    global $lemast_config; $cfg = $lemast_config;

    $result = $cfg->mysql->executeQuery(
        "SELECT admin "
        . "FROM " . $cfg->mysql->TABLE('account') . ' '
        . "WHERE username = '" . $cfg->mysql->ESCAPE($username) . "';");

    return mysql_fetch_object($result)->admin;
  }

  public static function changeAdminStatus($username, $makeAdmin) {
    global $lemast_config; $cfg = $lemast_config;

    $cfg->mysql->executeQuery(
        "UPDATE " . $cfg->mysql->TABLE('account') . ' '
        . "SET admin = " . ($makeAdmin ? 'true' : 'false') . " "
        . "WHERE username = '" . $cfg->mysql->ESCAPE($username) . "';");
  }

  public static function removeUser($username) {
    global $lemast_config; $cfg = $lemast_config;

    $cfg->mysql->executeQuery(
        "DELETE FROM " . $cfg->mysql->TABLE('albumuser') . ' '
        . "WHERE username = '" . $cfg->mysql->ESCAPE($username) . "';");

    Albums::deleteAlbums($username);

    $cfg->mysql->executeQuery(
        "DELETE FROM " . $cfg->mysql->TABLE('account') . ' '
        . "WHERE username = '" . $cfg->mysql->ESCAPE($username) . "';");
  }

  public static function doesUserExist($username) {
    $mysql = MySQL::getDatabaseObject();

    $result = $mysql->executeQuery(
        "SELECT count(*) AS numUsers "
        . "FROM md_account "
        . "WHERE username = '" . $mysql->ESCAPE($username) . "';");

    $entry = mysql_fetch_object($result);
    if ($entry->numUsers == 0) {
      return false;
    } else if ($entry->numUsers > 0) {
      return true;
    }

    die("A negative number of users?");
  }

  public static function doesPasswordMatch($username, $password) {
    if (! self::doesUserExist($username)) {
      return false;
    }

    $mysql = MySQL::getDatabaseObject();

    $result = $mysql->executeQuery(
        "SELECT password "
        . "FROM md_account "
        . "WHERE username = '" . $mysql->ESCAPE($username) . "';");

    $passwordInDB = mysql_fetch_object($result)->password;
    return $passwordInDB == $password;
  }

  /**
   * Returns all users, sorted on their last names.
   * @return User[]
   */
  public static function getUsersOrderedByLastName() {
    global $lemast_config; $cfg = $lemast_config;

    $result = $cfg->mysql->executeQuery("SELECT * "
        . "FROM " . $cfg->mysql->TABLE('account') . ' '
        . "ORDER BY lastname",
        "Could not query users: ");

    $users = array();
    while ($entry = mysql_fetch_object($result)) {
      $users[] = new User($entry->username, $entry->firstname, $entry->lastname,
          $entry->admin);
    }

    return $users;
  }

  /**
   * Returns all users sorted on their usernames.
   * @return User[]
   */
  public static function getUsersOrderedByUsername() {
    global $lemast_config; $cfg = $lemast_config;

    $result = $cfg->mysql->executeQuery(
        "SELECT * "
        . "FROM " . $cfg->mysql->TABLE('account') . ' '
        . "ORDER BY username",
      "Could not query users: ");

    $users = array();
    while ($entry = mysql_fetch_object($result)) {
      $users[] = new User($entry->username, $entry->firstname, $entry->lastname,
          $entry->admin);
    }

    return $users;
  }

  public static function addUser($username, $firstname, $lastname, $password, $email) {
  	global $lemast_config; $cfg = $lemast_config;

  	$cfg->mysql->executeQuery('INSERT INTO ' . $cfg->mysql->TABLE('account')
  	       . '(username, firstname, lastname, password, email) '
  		    . sprintf("VALUES ('%s', '%s', '%s', '%s', '%s');",
  			     $cfg->mysql->ESCAPE($username),
  			     $cfg->mysql->ESCAPE($firstname),
  			     $cfg->mysql->ESCAPE($lastname),
  			     md5($cfg->mysql->ESCAPE($password)),
  			     $cfg->mysql->ESCAPE($email)) );
  }

  public static function updateUser($username, $firstname, $lastname,
                                    $password, $email) {
    global $lemast_config; $cfg = $lemast_config;
    $cfg->mysql->executeQuery(
      "UPDATE " . $cfg->mysql->TABLE('account'). ' '
      . "SET firstname = '" . $cfg->mysql->ESCAPE($firstname) . "', "
      . "    lastname = '" . $cfg->mysql->ESCAPE($lastname) . "', "
      . "    password = '" . md5($cfg->mysql->ESCAPE($password)) . "', "
      . "    email  = '" . $cfg->mysql->ESCAPE($email) . "' "
      . "WHERE username = '" . $cfg->mysql->ESCAPE($username) . "';");
  }

  public static function getUser($username) {
  	global $lemast_config; $cfg = $lemast_config;

  	$result = $cfg->mysql->executeQuery(
  		"SELECT * "
  		. "FROM ". $cfg->mysql->TABLE('account'). ' '
  		. "WHERE username = '" . $cfg->mysql->ESCAPE($username) . "';");

  	$entry = mysql_fetch_object($result);
  	$user = new User($entry->username, $entry->firstname, $entry->lastname,
  	   $entry->admin);

  	return $user;
  }
}