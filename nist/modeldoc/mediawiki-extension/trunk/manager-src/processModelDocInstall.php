<?php

require_once "lib/util/SessionManager.php";
require_once "lib/util/Forms.php";
require_once "lib/modeldocs/ModelDocs.php";
require_once "lib/util/MySQL.php";

SessionManager::startSession();
SessionManager::ensureUserIsLoggedIn();

$projectName = Forms::getParameter('projectName');
$description = Forms::getParameter('description');
$adminEmail = Forms::getParameter('adminEmail');
$adminUsername = Forms::getParameter('adminUsername');
$adminPassword = Forms::getParameter('adminPassword');

$dataSourceName = Forms::getParameter('dataSourceName');
$dataSourceHost = Forms::getParameter('dataSourceHost');
$dataSourceDatabase = Forms::getParameter("dataSourceDatabase");
$dataSourceUsername = Forms::getParameter("dataSourceUsername");
$dataSourcePassword = Forms::getParameter("dataSourcePassword");

SessionManager::ensureParametersHaveBeenSupplied(
    array( $projectName, $description, $adminEmail, $adminUsername, $adminPassword,
        $dataSourceName, $dataSourceHost, $dataSourceDatabase, $dataSourceUsername, $dataSourcePassword ));
?>

<html>

<head>
  <title>ModelDoc Administration Main Menu</title>

  <script type="text/javascript"
    src="javascript/dojo-release-1.4.2-src/dojo/dojo.js"
    djConfig="parseOnLoad: true"></script>

  <style type="text/css">
    html, body { width: 100%; height: 100%; margin: 0; padding: 15px; }
    #borderContainer { width: 700px; height: 450px;
        border: 3px solid black; padding: 5px; }
  </style>

  <link rel="stylesheet" type="text/css"
      href="javascript/dojo-release-1.4.2-src/dojo/resources/dojo.css" />
  <link rel="stylesheet" type="text/css"
      href="javascript/dojo-release-1.4.2-src/dijit/themes/tundra/tundra.css" />

  <script type="text/javascript">
  dojo.require("dijit.layout.BorderContainer");
  dojo.require("dijit.layout.ContentPane");
  </script>
</head>

<body class="tundra" style="margin-top: 75px; margin-left: 300px;">

<div dojoType="dijit.layout.BorderContainer" design="headline" gutters="true"
    liveSplitters="false" id="borderContainer">
  <div dojoType="dijit.layout.ContentPane" splitter="false" region="top"
      style="padding: 5px; vertical-align: bottom; height: 80px;">
    <table width="100%">
      <tr>
        <td valign="center" style="width: 100px;">
          <img src="images/umich-cse.gif"
              style="margin-left: auto; margin-right: auto;" />
        </td>
        <td style="text-align: right; padding-right: 40px;">
          <font style="font-size: 32pt; font-weight: bold; font-family: cursive;">
            ModelDoc
          </font>
        </td>
      </tr>
    </table>
  </div>

  <div dojoType="dijit.layout.ContentPane" splitter="false" region="center"
        style="padding: 10px;">

    Beginning installation of
    <span style="font-size: 14px; font-weight: bold;">"<?= $projectName ?>"</span><br />

    Ensuring you don't already own a project by this name ...<br />
<? $foundAProblem = false;
if (ModelDocs::doesModelDocExist($projectName))  {
  $foundAProblem = true; ?>
      <font color="red">... failure: project already exists.</font>
<? } else { ?>
      <font color="blue">... success.</font>
<? } ?>
    <hr />

<? if (! $foundAProblem) { ?>
    Copying MediaWiki-1.15.2 Files ...
    <font color="red"><?= shell_exec( " cp -aR "
      . dirname(__FILE__) . "/files/mediawiki-1.15.2 "
      . "/opt/local/apache2/htdocs/modeldoc/" . $projectName . " 2>&1 " );
    ?></font>
    Done.<br /><br />

    Copying ModelDoc Extension ...
    <font color="red"><?= shell_exec( " cp -aR "
      . dirname(__FILE__) . "/files/modeldoc "
      . "/opt/local/apache2/htdocs/modeldoc/" . $projectName . "/extensions/modeldoc 2>&1 " );
    ?></font>
    Done.<br /><br />

    Updating MediaWiki LocalSettings.php configuration settings ...
    <?
    $settingsTemplate = fopen("files/LocalSettings.php_template", "r");
    $settingsOutput = fopen("/opt/local/apache2/htdocs/modeldoc/$projectName/LocalSettings.php", "w");
    while (! feof($settingsTemplate)) {
      $line = fgets($settingsTemplate);
      if (preg_match('/^[$]wgSitename/', $line) || preg_match('/^[$]wgScriptPath/', $line)) {
        $line = preg_replace('/\*REPLACEME\*/', $projectName, $line);
        fputs($settingsOutput, $line);
      } else if (preg_match('/^[$]wgDBname/', $line)) {
        $line = preg_replace('/\*REPLACEME\*/', "md_$projectName", $line);
        fputs($settingsOutput, $line);
      } else if (preg_match('/^[$]wgDBuser/', $line)) {
        $line = preg_replace('/\*REPLACEME\*/', "md_aprakash", $line);
        fputs($settingsOutput, $line);
      } else if (preg_match('/^[$]wgDBpassword/', $line)) {
        $line = preg_replace('/\*REPLACEME\*/', "bip", $line);
        fputs($settingsOutput, $line);
      } else if (preg_match('/^[$]wgEmergencyContact/', $line) || preg_match('/^[$]wgPasswordSender/', $line)) {
        $line = preg_replace('/\*REPLACEME\*/', $adminEmail, $line);
        fputs($settingsOutput, $line);
      }else {
        fputs($settingsOutput, $line);
      }
    }
    fclose($settingsTemplate);
    fclose($settingsOutput);
     ?>
    Done.<br /><br />

    Cloning baseline MediaWiki database ...<br />
    <?
    $mysql = MySQL::getDatabaseObject();
    $mysql->executeQuery("create database md_$projectName;");
    $mysql->executeQuery("grant all on md_$projectName.* to 'md_aprakash'@'localhost' IDENTIFIED BY 'bip'; ")
    ?> Done.<br /><br />

    <font color="red"><?= shell_exec(
        " /usr/local/mysql-5.1.41-osx10.5-x86_64/bin/mysqldump -uroot -pbip --no-create-db modeldoc_base "
        . "| /usr/local/mysql-5.1.41-osx10.5-x86_64/bin/mysql -umd_aprakash -pbip md_$projectName 2>&1 " ) ?></font><br />
    Database cloned; privileges granted.<br /><br />

    <?
    $mysql->changeDatabase("md_$projectName");
    $mysql->executeQuery("UPDATE md_$projectName.user SET user_name = '$adminUsername', "
        . "user_password = MD5(CONCAT(user_id, '-', MD5('$adminPassword'))) WHERE user_id = 1;");
    $mysql->changeDatabase("modeldoc");
    ?>
    Wiki admin account created.<br /><br />

    <?
    $configXML = fopen("/opt/local/apache2/htdocs/modeldoc/$projectName/extensions/modeldoc/config.xml", "w");
    fputs($configXML, '<?xml version="1.0" encoding="UTF-8"?>' . "\n");
    fputs($configXML, '<modeldoc>' . "\n");
    fputs($configXML, '<mediawiki url="http://localhost/modeldoc/' . $projectName . '/api.php"' . "\n");
    fputs($configXML, '   username="' . $adminUsername . '" password="' . $adminPassword . '" />' . "\n");
    fputs($configXML, '</modeldoc>' . "\n");
    fclose($configXML);
    ?>
    config.xml generated for the ModelDoc extension.

    <?
    require_once 'files/modeldoc/MediaWiki.php';
    require_once 'files/modeldoc/Configuration.php';

    global $mdConfiguration;
    $mdConfiguration = new ModelDoc\Configuration("/opt/local/apache2/htdocs/modeldoc/$projectName/extensions/modeldoc/config.xml");
    ModelDoc\MediaWiki::createPage("ModelDoc::Configuration",
        "<modeldoc><dataSources>"
        . "<dataSource type='postgres' name='$dataSourceName' host='$dataSourceHost' "
            . "username='$dataSourceUsername' password='$dataSourcePassword' database='$dataSourceDatabase' />"
        . "</dataSources></modeldoc>");
    ?>
    Configured for initial data source.<br /><br />

<?  ModelDocs::createModelDoc($projectName, $description, SessionManager::getLoggedInUser()); ?>

    Project created.  You can access it
    <a href="http://localhost/modeldoc/<?= $projectName ?>">here</a>.<br />
<? } ?>
    <hr />
    If you see any red-text above, there was probably a problem;
    please e-mail <a href="mailto:jsteinbe@eecs.umich.edu">jsteinbe@eecs.umich.edu</a><br />
   <a href="main_menu.php">Main Menu</a>
  </div>
</div>

</body>

</html>