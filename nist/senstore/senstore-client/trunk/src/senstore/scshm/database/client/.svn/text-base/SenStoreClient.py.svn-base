# Copyright (c) 2010 SC Solutions, Inc.
# All rights reserved.
# $Id: client-tpl.py,v 1.1 2010/05/21 15:48:03 glinden Exp $
import sys
import os.path
import logging
import Ice
import ConfigParser
Ice.loadSlice(os.path.join(os.path.dirname(__file__),\
                           '..', 'SenStore.ice'))
import SenStore

## SenStore database server client interface.
class SenStoreClient:
    ## Initializes the client.
    #
    # The client connects to the server and retrieves the database
    # manager proxy.
    def __init__(self, config):
        # TODO: use Ice configuration?
        port = int(config.get('Server', 'port'))
        hostname = config.get('Server', 'hostname')
        self.ic = None
        # Boiler plate to get manager proxy
        self.ic = Ice.initialize(sys.argv)
        base = self.ic.stringToProxy("SenStore:default -h %s -p %d" % \
                                         (hostname, port))
        self.mngr = SenStore.SenStoreMngrPrx.checkedCast(base)
        if not self.mngr:
            raise RuntimeError("Invalid manager proxy")
        base = self.ic.stringToProxy("Inspector:default -h %s -p %d" % \
                                         (hostname, port))
        self.inspector = SenStore.Info.InspectorPrx.checkedCast(base)
        if not self.inspector:
            raise RuntimeError("Invalid inspector proxy")

    ## Gets the manager proxy
    def getManager(self):
        return self.mngr

    ## Gets the inspector proxy
    def getInspector(self):
        return self.inspector
    
    ## Closes the connection.
    def close(self):
        if self.ic:
            self.ic.destroy()
        self.mngr = None
