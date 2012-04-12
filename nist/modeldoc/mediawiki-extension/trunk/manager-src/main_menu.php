<?php

require_once "lib/util/SessionManager.php";
require_once "lib/modeldocs/ModelDocs.php";

SessionManager::startSession();
SessionManager::ensureUserIsLoggedIn();

$modelDocs = ModelDocs::getModelDocs(SessionManager::getLoggedInUser());
?>

<html>

<head>
  <title>ModelDoc Administration Main Menu</title>

  <script type="text/javascript"
    src="javascript/dojo-release-1.4.2-src/dojo/dojo.js"
    djConfig="parseOnLoad: true"></script>

  <style type="text/css">
    html, body { width: 100%; height: 100%; margin: 0; padding: 15px; }
    #borderContainer { width: 1000px; height: 675px;
        margin-left: auto; margin-right: auto; border: 3px solid black;
        padding: 5px; }
  </style>

  <link rel="stylesheet" type="text/css"
      href="javascript/dojo-release-1.4.2-src/dojo/resources/dojo.css" />
  <link rel="stylesheet" type="text/css"
      href="javascript/dojo-release-1.4.2-src/dijit/themes/tundra/tundra.css" />

  <script type="text/javascript">
  dojo.require("dijit.layout.BorderContainer");
  dojo.require("dijit.layout.AccordionContainer");
  dojo.require("dijit.layout.AccordionPane");
  </script>
</head>

<body class="tundra">

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
        <td style="text-align: right; padding-right: 25px;">
          <font style="font-size: 32pt; font-weight: bold; font-family: cursive;">
            ModelDoc
          </font>
        </td>
      </tr>
    </table>
  </div>
  <div dojoType="dijit.layout.AccordionContainer" splitter="false" region="center">
    <div dojoType="dijit.layout.AccordionPane" selected="true"
        title="Your ModelDoc Installations">
      <table style="border: thin solid gray; margin-top: 20px;
          padding: 10px; margin-left: auto; margin-right: auto;">
        <tr>
          <th style="font-weight: bold; padding: 10px;" align="left">Project Name</th>
          <th style="font-weight: bold; padding: 10px;" align="left">Description</th>
          <th style="font-weight: bold; padding: 10px;">Link</th>
        </tr>

<? foreach ($modelDocs as $modelDoc) { ?>
        <tr>
          <td style="padding: 5px;"><?= $modelDoc->getName() ?></td>
          <td style="padding: 5px;"><?= $modelDoc->getDescription() ?></td>
          <td style="padding: 5px;"><a href="http://localhost/modeldoc/<?= $modelDoc->getName() ?>">Go</a></td>
        </tr>
<? } ?>

      </table>
    </div>
    <div dojoType="dijit.layout.AccordionPane"
        title="Create New ModelDoc Installation">

      <form action="processModelDocInstall.php">
        <table style="border: thin solid gray; padding: 10px;
            margin-top: 20px; margin-left: auto; margin-right: auto;">
          <tr>
            <th style="font-weight: bold; padding: 10px;">Project Name:</th>
            <td><input type="text" name="projectName" /></td>
          </tr>
          <tr>
            <th style="font-weight: bold; padding: 10px;">Description:</th>
            <td><textarea rows="5" cols="50" name="description"></textarea></td>
          </tr>
          <tr>
            <th style="font-weight: bold; padding: 10px;">Wiki Admin E-mail:</th>
            <td><input type="text" name="adminEmail" /></td>
          </tr>
          <tr>
            <th style="font-weight: bold; padding: 10px;">Wiki Admin Username:</th>
            <td><input type="text" name="adminUsername" /></td>
          </tr>
          <tr>
            <th style="font-weight: bold; padding: 10px;">Wiki Admin Password:</th>
            <td><input type="password" name="adminPassword" /></td>
          </tr>
          <tr>
            <th style="font-weight: bold; padding: 10px;">Initial (Postgres) Data Source Name:</th>
            <td><input type="text" name="dataSourceName" /></td>
          </tr>
          <tr>
            <th style="font-weight: bold; padding: 10px;">Data Source Host:</th>
            <td><input type="text" name="dataSourceHost" /></td>
          </tr>
          <tr>
            <th style="font-weight: bold; padding: 10px;">Data Source Database:</th>
            <td><input type="text" name="dataSourceDatabase" /></td>
          </tr>
          <tr>
            <th style="font-weight: bold; padding: 10px;">Data Source Username:</th>
            <td><input type="text" name="dataSourceUsername" /></td>
          </tr>
          <tr>
            <th style="font-weight: bold; padding: 10px;">Data Source Password:</th>
            <td><input type="text" name="dataSourcePassword" /></td>
          </tr>
          <tr>
            <th colspan="2" style="text-align: center; padding: 20px;">
              <input type="submit" value="Install ModelDoc" />
            </th>
          </tr>
        </table>
      </form>
    </div>

  </div>
</div>

</body>

</html>