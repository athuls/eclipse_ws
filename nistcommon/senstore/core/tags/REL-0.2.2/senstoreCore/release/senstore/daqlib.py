# Gwendolyn van der Linden
# Copyright (c) 2009 SC Solutions, Inc.
# See LICENSE.txt
#
# $Id: daqlib.py,v 1.1 2011/02/10 00:39:22 glinden Exp $
import sys
import time
import logging
import numpy
import ConfigParser

# Include client API.
# SenStoreClient is a small wrapper around the client API
# for connection management.  SenStore is the actual client API.
from scshm.database.client.SenStoreClient import SenStoreClient, SenStore

## \package daqlib DAQ unit access.

## Gets the configured DAQ units from file.
#
# @param sensorConfigFile name of sensor configuration file
# @return dictionary of unit identifiers (string) to channel numbers (list of integers)
def loadConfigUnits(sensorConfigFile):
    daqUnits = {}
    # Create a unit object and channel objects for each defined DAQ unit
    f = open(sensorConfigFile, 'r')
    for line in f:
        line = line.strip()
        if not line or line[0] == '#':
            # Skip this line (empty or comment)
            continue
        tokens = line.split()
        id = tokens[0]
        channels = [int(token) for token in tokens[1:]]
        daqUnits[id] = channels
    f.close()
    return daqUnits

## Registers DAQ units with the database.
#
# This function registers each DAQ
# unit as a \c DaqUnit object, with \c DaqUnitChannel objects.
# To each \c DaqUnitChannel a \c DaqUnitChannelData signal object
# is attached, that will hold the raw sensor data.
#
# @param mngr SenStore database manager proxy
# @param daqUnits dictionary with configured DAQ units
# @param model name of DAQ units model
# @see loadConfigUnits()
def createUnits(mngr, daqUnits, model):
    for id in daqUnits.keys():
        daqUnit = SenStore.DaqUnitFields()
        daqUnit.mModel = model
        daqUnit.mIdentifier = id
        daqUnit.id = mngr.addDaqUnit(daqUnit)
        logging.info('Created DAQ unit %s [oid=%d]' % \
                     (id, daqUnit.id))
        channels = daqUnits[id]
        for channel in channels:
            # Create channel object
            channelObj = SenStore.DaqUnitChannelFields()
            channelObj.mUnit = daqUnit.id
            channelObj.mNumber = channel
            channelObj.id = mngr.addDaqUnitChannel(channelObj)
            logging.info('Created DAQ unit channel %s:%d [oid=%d]' % \
                         (id, channel, channelObj.id))
            # Create channel data signal object
            signalObj = SenStore.DaqUnitChannelDataFields()
            signalObj.mChannel = channelObj.id
            signalObj.id = mngr.addDaqUnitChannelData(signalObj)
            # Create 1D raw signal data array
            signalPrx = mngr.getDaqUnitChannelData(signalObj.id)
            signalPrx.createSignal([1])
            signalPrx.setSubChannelsAxis([SenStore.Quantity.QuantityRAW])
            logging.info('Created DAQ unit channel data signal %s:%d [oid=%d]' % \
                         (id, channel, signalObj.id))


## Gets the proxies to the DAQ units defined in the database.
#
# @param mngr SenStore database manager proxy
# @param ids list of DAQ unit identifiers (\c None is all)
# @return dictionary with identifier -> unit proxy mapping
# @see loadConfigUnits()
def getUnitProxies(mngr, ids=None):
    unitPrxTable = {}

    if ids==None:
        # Get all DAQ units
        oids = mngr.getDaqUnitIds()
        unitPrxs = mngr.getDaqUnitList(oids)
        for oid in oids:
            prx = mngr.getDaqUnit(oid)
            fields = prx.getFields() 
            unitPrxTable[fields.mIdentifier] = prx
        return unitPrxTable
    
    # Get requested DAQ units
    fields = SenStore.DaqUnitFields()
    for id in ids:
        fields.mIdentifier = id
        oids = mngr.findEqualDaqUnit(fields, ['Identifier'])
        if len(oids) == 0:
            continue
        if len(oids) > 1:
            logging.warn('There is more than one DAQ unit with identifier=%s' % id)
        prx = mngr.getDaqUnit(oids[-1])
        unitPrxTable[id] = prx
    return unitPrxTable


## Gets the proxies to the DAQ units defined in the database.
#
# @param mngr SenStore database manager proxy
# @param ids list of DAQ unit identifiers (\c None is all)
# @return dictionary with (identifier,channel#) -> channel data proxy mapping
# @see loadConfigUnits()
def getChannelDataProxies(mngr, ids=None):
    signalPrxTable = {}
    # Get unit proxies
    unitPrxTable = getUnitProxies(mngr, ids)
    # Get channel data proxies
    for id,unitPrx in unitPrxTable.iteritems():
        # Get unit channel proxies
        oids = unitPrx.getDaqUnitChannelChildIds()
        for oid in oids:
            channelPrx = mngr.getDaqUnitChannel(oid)
            fields = channelPrx.getFields()
            # Get channel data proxy (should be only one)
            oids = channelPrx.getDaqUnitChannelDataChildIds()
            if len(oids) == 0:
                continue
            signalPrx = mngr.getDaqUnitChannelData(oids[-1])
            key = (id, fields.mNumber)
            logging.info('Obtained proxy for DAQ unit channel signal %s:%d' % key)
            signalPrxTable[key] = signalPrx
    return signalPrxTable
