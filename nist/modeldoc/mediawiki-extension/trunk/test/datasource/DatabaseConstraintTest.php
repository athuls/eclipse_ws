<?php

require_once 'PHPUnit/Framework.php';

require_once __DIR__ . '/../../src/datasource/DatabaseConstraint.php';

class DatabaseConstraintTest extends PHPUnit_Framework_TestCase {
  public function testConstructor() {
    $constraint = new ModelDoc\Datasource\DatabaseConstraint(
        "constraintName",
        "constraintType",
        "columnName",
        "tableReferenced",
        "fieldReferenced");
    
    $this->assertEquals("constraintName",
        $constraint->getConstraintName());
    $this->assertEquals("constraintType",
        $constraint->getConstraintType());
    $this->assertEquals("columnName",
        $constraint->getColumnName());
    $this->assertEquals("tableReferenced",
        $constraint->getTableReferenced());
    $this->assertEquals("fieldReferenced",
        $constraint->getFieldReferenced());
  }
}
