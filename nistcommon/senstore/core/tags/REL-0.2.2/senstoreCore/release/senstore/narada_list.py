# Gwendolyn van der Linden
# Copyright (c) 2009 SC Solutions, Inc.
# See LICENSE.txt
#
# $Id: narada_list.py,v 1.3 2011/02/10 00:39:22 glinden Exp $
import sys
import time
import logging
import numpy
import ConfigParser

# Include client API.
# SenStoreClient is a small wrapper around the client API
# for connection management.  SenStore is the actual client API.
from scshm.database.client.SenStoreClient import SenStoreClient, SenStore

## \file narada_query.py Reports which Narada channels have data.

## \package narada_save Reports which Narada channels have data.

## Reports Narada units and channels.
#
# This script gets all Narada units and their channels from the server, and
# prints the unit/channel information.
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
    client = SenStoreClient(sys.argv, 'Narada List Python client')
    mngr = client.getManager()
    logging.info('Connected to SenStore')

    # Get Narada units
    ids = mngr.getDaqUnitIds()
    unitPrxs = mngr.getDaqUnitList(ids)
    for unitPrx in unitPrxs:
        unitId = unitPrx.getFields().mIdentifier
        # Get Narada unit channels
        ids = unitPrx.getDaqUnitChannelChildIds()
        channelPrxs = mngr.getDaqUnitChannelList(ids)
        channels = []
        for channelPrx in channelPrxs:
            channelNumber = channelPrx.getFields().mNumber
            channels.append(channelNumber)
        channels.sort()
        print 'Narada unit %s; channels %s' % (unitId, str(channels))

    # All done
    client.close()

if __name__ == '__main__':
    main()