# Gwendolyn van der Linden
# Copyright (c) 2009 SC Solutions, Inc.
# See LICENSE.txt
#
# $Id: narada_create.py,v 1.3 2011/02/10 00:39:22 glinden Exp $
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

## \file narada_create.py Narada sensor registration example script.

## \package narada_create Narada sensor registration example script.

## Registers the configured Narada nodes.
#
# This function connects to the SenStore server, reads the
# Narada sensor configuration file, and registers each Narada
# node as a \c DaqUnit object, with four \c DaqUnitChannel objects.
# To each \c DaqUnitChannel a \c DaqUnitChannelData signal object
# is attached, that will hold the raw sensor data.
def main(sensorConfigFile='narada.cfg'):
    # Load configuration
    config = ConfigParser.ConfigParser()
    config.read(['config/client/SenStore.cfg'])
    
    #
    # Connect to server and get manager proxy
    #
    client = SenStoreClient(sys.argv, 'Narada Node Registrar Python client')
    mngr = client.getManager()
    logging.info('Connected to SenStore')

    # Load the defined Narada units and channels
    daqUnits = daqlib.loadConfigUnits('narada.cfg')
    
    # Create the units
    daqlib.createUnits(mngr, daqUnits, "NaradaNode")

    # All done
    client.close()

if __name__ == '__main__':
    # Setup logging
    FORMAT = "%(asctime)-15s:%(levelname)s %(message)s"
    logging.basicConfig(level=logging.DEBUG,format=FORMAT)

    main()