# Copyright (c) 2010 SC Solutions, Inc.
# See LICENCE.TXT for licensing terms.
# $Id: scshm_start.py,v 1.3 2011/01/26 21:52:37 glinden Exp $
import sys
import logging
import logging.handlers
import Ice
from scshm.database.server.SenStoreServer import Server

## \file scshm_start.py  Database server start script.

## \package scshm_start  Database server start script.

## Database server application entry point.
#
# Starts the server.
#
# @param configFile configuration file name
def main(configFile = 'config/server/SenStore.cfg'):
  # Setup logging
  p = Ice.createProperties()
  p.load(configFile)
  level = p.getProperty('Logging.level').upper()
  logFile = p.getProperty('Logging.file')
  try:
      loglevel = logging.__dict__[level]
  except:
      loglevel = logging.INFO
  FORMAT = "%(asctime)-15s:%(levelname)s %(message)s"
  logging.basicConfig(level=loglevel,format=FORMAT)
  handler = logging.handlers.RotatingFileHandler(logFile, maxBytes=100000,
                                                 backupCount=10)
  formatter = logging.Formatter(FORMAT)
  handler.setFormatter(formatter)
  logger = logging.getLogger()
  logger.addHandler(handler)
  # Start server
  app = Server()
  args = ['--Ice.Config=%s' % configFile] + sys.argv
  sys.exit(app.main(args))

if __name__ == '__main__':
    main()
