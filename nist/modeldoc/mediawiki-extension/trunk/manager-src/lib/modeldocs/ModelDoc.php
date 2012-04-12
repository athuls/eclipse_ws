<?php

/**
 *
 * Represents a ModelDoc installation
 *
 */

class ModelDoc {

  // - -  Private Members

  private $name;
  private $description;


  // - -  Constructor

  public function __construct($name, $description) {
    $this->name = $name;
    $this->description = $description;
  }


  // - - -  Public Functions

  public function getName() {
    return $this->name;
  }

  public function getDescription() {
    return $this->description;
  }
}