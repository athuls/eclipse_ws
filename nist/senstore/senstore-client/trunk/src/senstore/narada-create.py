# Gwendolyn van der Linden
# Copyright (c) 2009 SC Solutions, Inc.
# All rights reserved
# $Id: narada-create.py,v 1.2 2010/06/18 23:21:50 glinden Exp $
import sys
import time
import logging
import numpy
import ConfigParser

# Include client API.
# SenStoreClient is a small wrapper around the client API
# for connection management.  SenStore is the actual client API.
from scshm.database.client.SenStoreClient import SenStoreClient, SenStore

if __name__ == '__main__':
    # Setup logging
    FORMAT = "%(asctime)-15s:%(levelname)s %(message)s"
    logging.basicConfig(level=logging.DEBUG,format=FORMAT)

    # Load configuration
    config = ConfigParser.ConfigParser()
    config.read(['config/client/SenStore.cfg'])
    
    #
    # Connect to server and get manager proxy
    #
    client = SenStoreClient(config)
    mngr = client.getManager()
    logging.info('Connected to SenStore')

    # Create a unit object and channel objects for each defined Narada unit
    f = open('narada.cfg', 'r')
    for line in f:
        id = line.strip()
        if not id or id[0] == '#':
            # Skip this line
            continue
        daqUnit = SenStore.DaqUnitFields()
        daqUnit.mModel = "Narada"
        daqUnit.mIdentifier = id
        daqUnit.id = mngr.addDaqUnit(daqUnit)
        logging.info('Created Narada unit %d [oid=%d]' % \
                     (int(id), daqUnit.id))
        for channel in [0,1,2,3]:
            # Create channel object
            channelObj = SenStore.DaqUnitChannelFields()
            channelObj.mUnit = daqUnit.id
            channelObj.mNumber = channel
            channelObj.id = mngr.addDaqUnitChannel(channelObj)
            logging.info('Created Narada channel %d:%d [oid=%d]' % \
                         (int(id), channel, channelObj.id))
            # Create channel data signal object
            signalObj = SenStore.DaqUnitChannelDataFields()
            signalObj.mChannel = channelObj.id
            signalObj.id = mngr.addDaqUnitChannelData(signalObj)
            # Create 1D raw signal data array
            signalPrx = mngr.getDaqUnitChannelData(signalObj.id)
            signalPrx.createSignal([1])
            signalPrx.setSubChannelsAxis([SenStore.Quantity.QuantityRAW])
            logging.info('Created Narada channel data signal %d:%d [oid=%d]' % \
                         (int(id), channel, signalObj.id))

    f.close()

    # All done
    client.close()
