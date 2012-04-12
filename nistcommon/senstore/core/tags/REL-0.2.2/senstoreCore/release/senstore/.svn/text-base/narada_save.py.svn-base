# Gwendolyn van der Linden
# Copyright (c) 2009 SC Solutions, Inc.
# See LICENSE.txt
#
# $Id: narada_save.py,v 1.4 2011/05/10 18:17:13 glinden Exp $
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

## \file narada_save.py Saves random data to a Narada sensor signal object.

## \package narada_save Saves random data to a Narada sensor signal object.

## Saves random data to a Narada sensor signal object.
#
# This script is provided as an example (and to generate test data),
# not for actual use.
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
    client = SenStoreClient(sys.argv, 'Narada Sensor Data Saver Python client')
    mngr = client.getManager()
    logging.info('Connected to SenStore')

    # Load the defined Narada units and channels
    daqUnits = daqlib.loadConfigUnits('narada.cfg')
    
    # Get the signals
    signalPrxTable = daqlib.getChannelDataProxies(mngr, daqUnits.keys())

    # Create time axis
    t0 = time.time()
    dt = 0.01   # Sampled data interval
    n = 5*60*100 # Number of samples per run
    ts = 6*3600   # Interval between runs
    N = 3     # Number of runs
    t = numpy.zeros(n)
    for k in range(-N,0):
        for i in range(-len(t),0):
            t[i] = t0 + i*dt + k*ts

        # Insert dummy data for each signal (channel)
        for key, signalPrx in signalPrxTable.iteritems():
            data = numpy.random.random_integers(0,2**16-1,n)
            signalPrx.appendToSignal(t.tolist(), data.tolist())
            logging.info('Stored random data in Narada channel signal %s:%d' % key)

    # All done
    client.close()

if __name__ == '__main__':
    main()
