# Gwendolyn van der Linden
# Copyright (c) 2009 SC Solutions, Inc.
# All rights reserved
# $Id: scshm-start.py,v 1.2 2010/06/16 19:01:14 glinden Exp $
import sys
import logging
import Ice
from scshm.database.server.SenStoreServer import Server

if __name__ == '__main__':
  configFile = 'config/server/SenStore.cfg'
  # Setup logging
  p = Ice.createProperties()
  p.load(configFile)
  level = p.getProperty('Logging.level').upper()
  try:
      loglevel = logging.__dict__[level]
  except:
      loglevel = logging.INFO
  FORMAT = "%(asctime)-15s:%(levelname)s %(message)s"
  logging.basicConfig(level=loglevel,format=FORMAT)
  # Start server
  app = Server()
  sys.exit(app.main(sys.argv, configFile=configFile))
