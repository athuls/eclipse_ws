<?php

/*
 * @(#)Postgres.php    0.00 Aug 13, 2009
 * Author: Jim Steinberger
 *
 * Copyright (c) 2010 University of Michigan
 * Ann Arbor, MI, 48109, USA
 * All Rights Reserved.
 * 
 * This software is the proprietary information of the University of Michigan
 * ("Proprietary Information").  You shall use it only in accordance with the
 * terms of the license agreement you entered into with the University of
 * Michigan.
 */

namespace ModelDoc\Datasource;

require_once( __DIR__ . '/Database.php' );

/**
 * Encapsulates a constraint in PSQL; i.e. a CHECK or FOREIGN/PRIMARY KEY
 * 
 * @author jsteinbe
 */
class PSQLConstraint {
  public $constraintName;
  public $constraintType;
  public $columnName;
  public $tableReferenced;
  public $fieldReferenced;
  
  function PSQLConstraint($constraintName, $constraintType,
                   $columnName, $tableReferenced, $fieldReferenced) {
    $this->constraintName = $constraintName;
    $this->constraintType = $constraintType;
    $this->columnName = $columnName;
    $this->tableReferenced = $tableReferenced;
    $this->fieldReferenced = $fieldReferenced;
  }
}

/**
 * 
 */
class Postgres extends Database {
  
  
  // - -  Constructo
  
  /**
   * 
   * @param $databaseURL
   * @param $databaseUsername
   * @param $databasePassword
   * @param $databaseName
   */
  function __construct($databaseURL, $databaseUsername,
                         $databasePassword, $databaseName) {
    parent::__construct($databaseURL, $databaseUsername,
                        $databasePassword, $databaseName);
  }
  
  
  // - -  Public Functions
  
  /**
   * 
   * @param $tableName
   * @return unknown_type
   */
  public function getConstraints($tableName) {
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
//    pg_close($databaseConnection);
    
    return $constraints;
  }
  
  /**
   * 
   * @return String[] All table names in the database
   */
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
    
    return $databaseTableNames;
  }
  
  /**
   * Just for demo purposes
   * 
   * @param $entityName
   * @param $fieldName
   * @return unknown_type
   */
  function addBitField($entityName, $fieldName) {
    $databaseConnection = $this->getDatabaseConnection();
    $result = pg_query("ALTER TABLE $entityName "
        . "ADD COLUMN $fieldName bit")
      or die("Query failed: " . pg_last_error());
    pg_free_result($result);
    
    return true;
  }
  
  /**
   * Just for demo purposes
   * 
   * @param $entityName
   * @param $fieldName
   * @return unknown_type
   */
  function deleteField($entityName, $fieldName) {
    $databaseConnection = $this->getDatabaseConnection();
    $result = pg_query("ALTER TABLE $entityName "
        . "DROP COLUMN $fieldName")
      or die("Query failed: " . pg_last_error());
    pg_free_result($result);
    
    return true;
  }
  
  /**
   * 
   * @param $tableName
   * @return Array of arrays with column data
   */
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
    
    return $columns;
  }
  
  /**
   * 
   * @return Postgres connection
   */
  private function getDatabaseConnection() {
    return \pg_connect("host=$this->databaseURL "
        . "dbname=$this->databaseName "
        . "user=$this->databaseUsername "
        . "password=$this->databasePassword")
      or die('Could not connect: ' . pg_last_error());
  }
}