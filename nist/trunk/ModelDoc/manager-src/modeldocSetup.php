<?php

if ($_SESSION['loggedIn'] != 'aprakash') {
  header('Location: index.php');
  return;
}

// TODO Clone the postgres database 

?>

<form action="modeldocSetup.php" method="POST">
<table style="border: thin solid gray; margin-left: auto; margin-right: auto;">
  <tr>
    <th style="text-align: right;">Project Name:</th>
    <td><input type="text" name="projectName" size="40" /></td>
  </tr>
  
  <tr>
    <th style="text-align: right;">URL ( http://cheetah.eecs.umich.edu/[URL] ):</th>
    <td><input type="text" name="projectName" size="40" /></td>
  </tr>
  
  <tr>
    <th colspan="2"><input type="submit" name="creatingProject" value="Creating Project" /></th>
  </tr>
</table>
</form>