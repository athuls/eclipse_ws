<?php
$dataFile = fopen(dirname(__FILE__) . "/data/frequency-psd-data.txt", "r");

if (! $dataFile) {
  $message = array();
  $message['message'] = "Could not open frequency-psd-data.txt";
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

//  $timeData[] = 0 + $pieces[0];
  $accelData[] = 0 + $pieces[1];
  if (sizeof($accelData) == $numResults) {
    break;
  }
}

$message = array();
//$message['timeData'] = $timeData;
$message['strainData'] = $accelData;
echo json_encode($message);