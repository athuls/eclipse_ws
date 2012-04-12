<?php

/*
 * @(#)Log.php    0.00 Jan 10, 2010
 * Author: Jim Steinberger
 *
 * Copyright (c) 2010 University of Michigan
 * Ann Arbor, MI, 48109, USA
 * All Rights Reserved.
 * 
 * This software is the proprietary information of the University of Michigan
 * ("Proprietary Information").  You shall use it only in accordance with the
 * terms of the license agreement you entered into with the University of
 * Michigan.
 */

namespace ModelDoc\Util; 

/**
 * Provides logging facilities
 */
class Log {
  private static $LOG_DIRECTORY;
  
  public static function init() {
    date_default_timezone_set('America/Detroit'); // TODO
    self::$LOG_DIRECTORY = __DIR__ . "/../modeldoc.log";
  }
  
  public static function logString($string) {
    error_log(date("F j, Y, g:i a") . ': ' . $string . "\r\n",
        3, self::$LOG_DIRECTORY);
  }
  
  public static function logObject($object) {
    error_log(date("F j, Y, g:i a") . ': ' . print_r($object, true) . "\r\n",
        3, self::$LOG_DIRECTORY);
  }
}
Log::init();