<?php

/**
 *
 * Represents a user/account in the system.
 * 
 * @author lemast
 *
 */

class User {
  
  // - -  Private Members
  
  private $username;
  private $firstName;
  private $lastName;
  private $admin;

  
  // - -  Constructor
  
  /**
   * 
   * @param $username
   * @param $firstName
   * @param $lastName
   * @param $admin
   */
  public function __construct($username, $firstName, $lastName, $admin) {
    $this->username = $username;
    $this->firstName = $firstName;
    $this->lastName = $lastName;
    $this->admin = $admin;
  }
  
  
  // - - -  Public Functions
  
  public function getFullName() {
    return $this->lastName . ', ' . $this->firstName;
  }
  
  public function getUsername() {
    return $this->username;
  }
  
  public function getFirstName() {
    return $this->firstName;
  }
  
  public function getLastName() {
    return $this->lastName;
  }
  
  public function isAdmin() {
    return $this->admin;
  }
}