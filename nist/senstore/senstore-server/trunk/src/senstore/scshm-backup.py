# Gwendolyn van der Linden
# Copyright (c) 2009 SC Solutions, Inc.
# All rights reserved
# $Id: scshm-backup.py,v 1.1 2010/06/18 23:21:50 glinden Exp $
import sys
import time
import logging
import Ice
from scshm.database.client.backup import *

if __name__ == '__main__':
    # Load configuration
    config = ConfigParser.ConfigParser()
    config.read(['config/client/SenStore.cfg'])
    # Setup logging
    try:
        level = config.get('Logging', 'LEVEL').upper()
        loglevel = logging.__dict__[level]
    except:
        loglevel = logging.INFO
    FORMAT = "%(asctime)-15s:%(levelname)s %(message)s"
    logging.basicConfig(level=loglevel,format=FORMAT)
    t = time.time()
    tstamp = time.strftime('%Y-%m-%d_%H%M', time.localtime(t))
    filename = 'SenStore-%s.h5' % tstamp
    backup(config, filename)
