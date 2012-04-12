<?php

require_once "lib/util/SessionManager.php";
require_once "files/modeldoc/MediaWiki.php";

$projectName = Forms::getParameter("projectName");
SessionManager::ensureParametersHaveBeenSupplied(array( $projectName ));



$mysql = MySQL::getDatabaseObject();

if (! Users::doesPasswordMatch($username, $password)) {
  SessionManager::bowOutWithErrorMessage("Bad login");
}

SessionManager::startSession();
SessionManager::logUserIn($username);

include "main_menu.php";
?>

