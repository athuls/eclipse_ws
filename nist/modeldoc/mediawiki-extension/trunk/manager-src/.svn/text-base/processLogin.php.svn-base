<?php

require_once "lib/util/Forms.php";
require_once "lib/util/SessionManager.php";
require_once 'lib/util/MySQL.php';
require_once 'lib/user/Users.php';
$username = Forms::getParameter("username");
$password = Forms::getParameter("password");
SessionManager::ensureParametersHaveBeenSupplied(array( $username, $password ));

$mysql = MySQL::getDatabaseObject();

if (! Users::doesPasswordMatch($username, $password)) {
  SessionManager::bowOutWithErrorMessage("Bad login");
}

SessionManager::startSession();
SessionManager::logUserIn($username);

include "main_menu.php";
?>

