# Gwendolyn van der Linden
# Copyright (c) 2009 SC Solutions, Inc.
# See LICENSE.txt
#
# $Id: narada_query.py,v 1.4 2011/05/10 18:17:13 glinden Exp $
import sys
import time
import logging
import numpy
import ConfigParser

# Include client API.
# SenStoreClient is a small wrapper around the client API
# for connection management.  SenStore is the actual client API.
from scshm.database.client.SenStoreClient import SenStoreClient, SenStore

import daqlib

## \file narada_query.py Reports which Narada channels have data.

## \package narada_save Reports which Narada channels have data.

## Reports which Narada channels have data.
#
# This script gets all Narada channels from the server, and shows
# information on the signal data, if any is available.
def main():
    # Setup logging
    FORMAT = "%(asctime)-15s:%(levelname)s %(message)s"
    logging.basicConfig(level=logging.DEBUG,format=FORMAT)

    # Load configuration
    config = ConfigParser.ConfigParser()
    config.read(['config/client/SenStore.cfg'])
    
    #
    # Connect to server and get manager proxy
    #
    client = SenStoreClient(sys.argv, 'Narada Query Python client')
    mngr = client.getManager()
    logging.info('Connected to SenStore')

    # Load the defined Narada units and channels
    daqUnits = daqlib.loadConfigUnits('narada.cfg')
    
    # Get the signals
    signalPrxTable = daqlib.getChannelDataProxies(mngr, daqUnits.keys())
    nSum = 0
    print 'Applied time zone is: %s' % time.strftime("%Z", time.localtime())
    for key, signalPrx in signalPrxTable.iteritems():
        # Get time range of available signal data
        timeInfo = signalPrx.getTimeAxisInfo([])
        if len(timeInfo.t) > 0:
            t0 = timeInfo.t[0]
            t1 = timeInfo.t[-1]
            print 'Narada unit %s channel %d info:' % key
            s0 = time.strftime("%Y-%m-%d %H:%M:%S", time.localtime(t0))
            s1 = time.strftime("%Y-%m-%d %H:%M:%S", time.localtime(t1))
            print '  time: %s to %s' % (s0, s1)
            print '  sample index: %d to %d' % (timeInfo.idx[0], timeInfo.idx[-1])
            dimInfo = signalPrx.getSignalSize()
            print "  size: %s" % 'x'.join(['%d' % dim for dim in dimInfo])
            nSum += timeInfo.idx[-1] - timeInfo.idx[0] + 1
    print 'Total number of samples: %d (%dk, %dM)' % (nSum, nSum/1000, nSum/1000000)

    # All done
    client.close()

if __name__ == '__main__':
    main()