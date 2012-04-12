<html>

<head>
  <title>ModelDoc Administration</title>

  <script type="text/javascript"
    src="javascript/dojo-release-1.4.2-src/dojo/dojo.js"
    djConfig="parseOnLoad: true"></script>

  <style type="text/css">
    html, body { width: 100%; height: 100%; margin: 0; padding: 15px; }
    #borderContainer { width: 700px; height: 400px;
        margin-left: auto; margin-right: auto; border: 3px solid black;
        padding: 5px; }
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

<? if (isset($errorMessage)) : ?>
<div style="border: thin dashed gray; color: red; margin-left: auto;
    margin-right: auto; width: 80%; padding: 10px;">ERROR: <?= $errorMessage ?></div>
<? endif; ?>


    <form action="processLogin.php" method="POST">
    <table style="border: thin solid gray; margin-left: auto; margin-right: auto;
        width: 100px; margin-top: 50px; padding: 25px;">
      <tr>
        <th style="text-align: right; font-weight: bold; padding: 10px;">Username:</th>
        <td><input type="text" name="username" size="40" /></td>
      </tr>

      <tr>
        <th style="text-align: right; font-weight: bold; padding: 10px;">Password:</th>
        <td><input type="password" name="password" size="40" /></td>
      </tr>

      <tr>
        <th colspan="2" style="text-align: center; padding: 15px;"><input type="submit" name="loggingIn" value="Log In" /></th>
      </tr>
    </table>
    </form>
  </div>
</div>

</body>

</html>