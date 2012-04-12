<?php

/*
 * @(#)MySQL.php    0.00 Dec 31, 2009
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
namespace ModelDoc\Database;

/**
 * Encapsulates a constraint in PSQL; i.e. a CHECK or FOREIGN/PRIMARY KEY
 * 
 * @author bipsterite
 */
//class PSQLConstraint {
//  public $constraintName;
//  public $constraintType;
//  public $columnName;
//  public $tableReferenced;
//  public $fieldReferenced;
//  
//  function PSQLConstraint($constraintName, $constraintType, $columnName, $tableReferenced, $fieldReferenced) {
//    $this->constraintName = $constraintName;
//    $this->constraintType = $constraintType;
//    $this->columnName = $columnName;
//    $this->tableReferenced = $tableReferenced;
//    $this->fieldReferenced = $fieldReferenced;
//  }
//}

class MySQL {
  private $databaseURL;
  private $databaseName;
  private $databaseUsername;
  private $databasePassword;
  
  function MySQL($databaseURL, $databaseUsername, $databasePassword, $databaseName) {
    $this->databaseURL = $databaseURL;
    $this->databaseName = $databaseName;
    $this->databaseUsername = $databaseUsername;
    $this->databasePassword = $databasePassword;
  }
  
  function getConstraints($tableName) {
    $databaseConnection = $this->getDatabaseConnection();
    $result = pg_query(' SELECT tc.constraint_name, tc.constraint_type, tc.table_name, kcu.column_name, '
        . ' tc.is_deferrable, tc.initially_deferred, rc.match_option AS match_type, '
        . 'rc.update_rule AS on_update, rc.delete_rule AS on_delete, ccu.table_name AS references_table, '
        . 'ccu.column_name AS references_field '
        . 'FROM information_schema.table_constraints tc '
          . 'LEFT JOIN information_schema.key_column_usage kcu '
            . 'ON tc.constraint_catalog = kcu.constraint_catalog '
              . 'AND tc.constraint_schema = kcu.constraint_schema '
              . 'AND tc.constraint_name = kcu.constraint_name '
          . ' LEFT JOIN information_schema.referential_constraints rc '
            . 'ON tc.constraint_catalog = rc.constraint_catalog '
              . 'AND tc.constraint_schema = rc.constraint_schema '
              . 'AND tc.constraint_name = rc.constraint_name '
          . 'LEFT JOIN information_schema.constraint_column_usage ccu '
            . 'ON rc.unique_constraint_catalog = ccu.constraint_catalog '
              . 'AND rc.unique_constraint_schema = ccu.constraint_schema '
              . 'AND rc.unique_constraint_name = ccu.constraint_name '
        . "WHERE tc.table_name = '$tableName' ")
        or die("Query failed: " . pg_last_error());

    $constraints = array();
    while ($row = pg_fetch_array($result, null, PGSQL_ASSOC)) {
      $constraints[] = new PSQLConstraint($row['constraint_name'],
                                          $row['constraint_type'],
                                          $row['column_name'],
                                          $row['references_table'],
                                          $row['references_field']);
    }
    
    pg_free_result($result);
    pg_close($databaseConnection);
    
    return $constraints;
  }
  
  function getTableNames() {
    $databaseConnection = $this->getDatabaseConnection();
    $result = pg_query('SELECT relname FROM pg_class '
        . 'WHERE relname !~ \'^(pg_|sql_)\' AND relkind = \'r\' '
        . 'ORDER BY relname;')
      or die("Query failed: " . pg_last_error());
    
    $databaseTableNames = array();
    while ($row = pg_fetch_array($result, null, PGSQL_ASSOC)) {
      $databaseTableNames[] = $row['relname'];
    }
    
    pg_free_result($result);
    pg_close($databaseConnection);
    
    return $databaseTableNames;
  }
  
  function getColumns($tableName) {
    $databaseConnection = $this->getDatabaseConnection();
    $result = pg_query('SELECT a.attnum AS ordinal_position, '
        . 'a.attname AS column_name, t.typname AS data_type, '
        . 'a.attlen AS character_maximum_length, a.atttypmod AS modifier, '
        . 'a.attnotnull AS notnull, a.atthasdef AS hasdefault '
        . 'FROM pg_class c, pg_attribute a, pg_type t '
        . "WHERE c.relname = '$tableName' "
            . 'AND a.attnum > 0 '
            . 'AND a.attrelid = c.oid '
            . 'AND a.atttypid = t.oid '
        . 'ORDER BY a.attnum')
      or die("Query failed: " . pg_last_error());
    
    $columns = array();
    while ($row = pg_fetch_array($result, null, PGSQL_ASSOC)) {
      $columns[] = array('name' => $row['column_name'],
            'position' => $row['ordinal_position'],
            'dataType' => $row['data_type'],
            'length' => $row['character_maximum_length'],
            'notNull' => $row['notnull'],
            'hasdefault' => $row['hasdefault']);
    }
    
    pg_free_result($result);
    pg_close($databaseConnection);
    
    return $columns;
  }
  
  private function getDatabaseConnection() {
    $databaseConnection = \pg_connect("host=$this->databaseURL "
        . "dbname=$this->databaseName user=$this->databaseUsername "
        . "password=$this->databasePassword")
      or die('Could not connect: ' . pg_last_error());
    return $databaseConnection;
  }
}