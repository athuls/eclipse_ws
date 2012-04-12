<?php

require_once dirname(__FILE__) . "/../util/MySQL.php";
require_once "ModelDoc.php";

class ModelDocs {
  public static function getModelDocs($username) {
    $mysql = MySQL::getDatabaseObject();
    $result = $mysql->executeQuery("SELECT * "
        . "FROM md_modeldoc_instance "
        . "WHERE ownerUsername = '" . $mysql->ESCAPE($username) . "'");
    $instances = array();
    while ($entry = mysql_fetch_object($result)) {
      $instances[] = new ModelDoc($entry->name, $entry->description);
    }
    return $instances;
  }

  public static function doesModelDocExist($projectName) {
    $mysql = MySQL::getDatabaseObject();

    $result = $mysql->executeQuery(
        "SELECT count(*) AS numModelDocs "
        . "FROM md_modeldoc_instance "
        . "WHERE name = '" . $mysql->ESCAPE($projectName) . "';");

    $entry = mysql_fetch_object($result);
    if ($entry->numModelDocs == 0) {
      return false;
    } else if ($entry->numModelDocs > 0) {
      return true;
    }

    die("A negative number of ModelDocs?");
  }

  public static function createModelDoc($projectName, $description,
      $ownerUsername) {
    $mysql = MySQL::getDatabaseObject();

    $mysql->executeQuery('INSERT INTO md_modeldoc_instance '
       . '(name, description, ownerUsername) '
      . sprintf("VALUES ('%s', '%s', '%s');",
         $mysql->ESCAPE($projectName),
         $mysql->ESCAPE($description),
         $mysql->ESCAPE($ownerUsername) )
    );
  }
}