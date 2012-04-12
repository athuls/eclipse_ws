<?php
$dataFile = fopen(dirname(__FILE__) . "/data/frequency-data.txt", "r");

if (! $dataFile) {
  $message = array();
  $message['message'] = "Could not open frequency-data.txt";
  $message['error'] = true;
  die(json_encode($message));
}

$offset = isset($_REQUEST['offset']) ? $_REQUEST['offset'] : 0;
$numResults = isset($_REQUEST['numresults']) ? $_REQUEST['numresults'] : 500;

$timeData = array();
$accelData = array();
$i = 0;
while (! feof($dataFile)) {
  $line = trim(fgets($dataFile, 100));
  $i++;
  if ($i < $offset) {
    continue;
  }
  $pieces = explode(" ", $line);

  $accelData[] = 0 + $pieces[1];
  if (sizeof($accelData) == $numResults) {
    break;
  }
}

$message = array();
//$message['timeData'] = $timeData;
$message['frequencyData'] = $accelData;
echo json_encode($message);