<html>

<head>
  <title>ModelDoc - Administration</title>

  <script type="text/javascript"
      src="javascript/dojo-release-1.4.2-src/dojo/dojo.js"
      djConfig="parseOnLoad: true"></script>

  <style type="text/css">
    html, body { width: 100%; height: 100%; margin: 0; padding: 15px; }
    #borderContainer { width: 1000px; height: 500px;
        margin-left: auto; margin-right: auto; border: 3px solid black;
        padding: 5px; }
  </style>

  <link rel="stylesheet" type="text/css"
      href="javascript/dojo-release-1.4.2-src/dojo/resources/dojo.css" />
  <link rel="stylesheet" type="text/css"
      href="javascript/dojo-release-1.4.2-src/dijit/themes/tundra/tundra.css" />

</head>


<body class="tundra">

<?php
$output = shell_exec( " cp -aR "
    . dirname(__FILE__) . "/files/mediawiki-1.15.2 "
    . "/opt/local/apache2/htdocs/modeldoc/project1 2>&1 " );
?>

<?= $output ?>

</body>

</html>