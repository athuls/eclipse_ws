<?php

/*
 * @(#)Database.php    0.00 Jan 02, 2010
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

/**
 * Abstract superclass for live database datasources.
 */
class Database {
  protected $databaseURL;
  protected $databaseName;
  protected $databaseUsername;
  protected $databasePassword;
  
  /**
   * 
   * @param $databaseURL
   * @param $databaseUsername
   * @param $databasePassword
   * @param $databaseName
   */
  protected function __construct($databaseURL, $databaseUsername,
                                $databasePassword, $databaseName) {
    $this->databaseURL = $databaseURL;
    $this->databaseName = $databaseName;
    $this->databaseUsername = $databaseUsername;
    $this->databasePassword = $databasePassword;
  }
  
  public function getDatabaseURL() {
    return $this->databaseURL;
  }
  
  public function getDatabaseName() {
    return $this->databaseName;
  }
  
  public function getDatabaseUsername() {
    return $this->databaseUsername;
  }
  
  public function getDatabasePassword() {
    return $this->databasePassword;
  }
}