<?php

/*
 * @(#)PSQLConstraint    0.00 Jan 26, 2010
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
 * Encapsulates a database constraint
 * 
 * Needs to be extended for multi-column constraints
 * 
 * @author jsteinbe
 */
class DatabaseConstraint {


  // - -  Private Members

  private $constraintName;
  private $constraintType;
  private $columnName;
  private $tableReferenced;
  private $fieldReferenced;
  
  
  // - -  Constructor
  
  public function __construct($constraintName, $constraintType,
      $columnName, $tableReferenced, $fieldReferenced) {
    $this->constraintName = $constraintName;
    $this->constraintType = $constraintType;
    $this->columnName = $columnName;
    $this->tableReferenced = $tableReferenced;
    $this->fieldReferenced = $fieldReferenced;
  }
  
  
  // - -  Public Functions
  
  public function getConstraintName() {
    return $this->constraintName;
  }
  
  public function getConstraintType() {
    return $this->constraintType;
  }

  public function getColumnName() {
    return $this->columnName;
  }
  
  public function getTableReferenced() {
    return $this->tableReferenced;
  }
  
  public function getFieldReferenced() {
    return $this->fieldReferenced;
  }
}