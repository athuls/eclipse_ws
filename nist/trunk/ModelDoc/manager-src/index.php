<?php
$loggingIn = $_POST['loggingIn'] ? true : false;
if ($loggingIn) {
  $username = $_POST['username'];
  $password = $_POST['password'];
  
  if ($username == 'aprakash' && $password == 'hsakarpa1234') {
    $_SESSION['loggedIn'] = 'aprakash';
    header('Location: modeldocSetup.php');
    return;
  }
}
?>

<form action="index.php" method="POST">
<table style="border: thin solid gray; margin-left: auto; margin-right: auto;">
  <tr>
    <th style="text-align: right;">Username:</th>
    <td><input type="text" name="username" size="40" /></td>
  </tr>
  
  <tr>
    <th style="text-align: right;">Password:</th>
    <td><input type="password" name="password" size="40" /></td>
  </tr>
  
  <tr>
    <th colspan="2"><input type="submit" name="loggingIn" value="Log In" /></th>
  </tr>
</table>
</form>