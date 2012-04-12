# Copyright (c) 2010 SC Solutions, Inc.
# See LICENCE.TXT for licensing terms.
# $Id: client-tpl.py,v 1.7 2011/01/29 01:44:30 glinden Exp $
import sys
import math
import os.path
import threading
import time
import logging
import Ice
import ConfigParser
Ice.loadSlice(os.path.join(os.path.dirname(__file__),\
                           '..', 'SenStore.ice'))
import SenStore

## \package scshm.database.client.SenStoreClient
# Python wrapper to simplify connecting to the SenStore server.

## Session refresher daemon.
#
# Keeps the session alive while the client application is connected to
# the server.
class SessionRefresher(threading.Thread):
    ## Initializes the refresher thread.
    #
    # @param session session proxy
    def __init__(self, session):
        self.session = session
        threading.Thread.__init__(self)
        self.timeout = session.getTimeout()/10.0
        self.stop = False
        self.daemon = True
    def run(self):
        # Get number of seconds to sleep between refreshes
        n = int(math.ceil(self.timeout))
        while not self.stop:
            self.session.refresh()
            # Sleep for for 1 second at a time, so we're responsive
            # to a quit() request
            for i in range(n):
                if self.stop: break
                time.sleep(1.0)
    # Quits the refresher thread.
    def quit(self):
        self.stop = True


## SenStore database server client connection helper.
class SenStoreClient:
    ## Initializes the client connection.
    #
    # The client connects to the server, starts a session, and retrieves the database
    # manager and inspector proxies.  It also starts a SessionRefresher daemon to
    # keep the session alive.
    #
    # An exclusive session should only be used when absolutely necessary, as it will
    # block access to the server by other clients until this session is ended by
    # calling close() or exiting the client application.
    #
    # By default, the file config/client/SenStore-ice.cfg will be set as the
    # Ice configuration file.  This can be overriden by manually setting Ice properties
    # on the command line, e.g. --Ice.Config=myiceconfigfile.cfg.  See the ZeroC Ice
    # documentation for more information on Ice properties. 
    #
    # @param argv      command line arguments (typically sys.argv)
    # @param name      (optional) client session name
    # @param exclusive (optional) create an exclusive access session
    def __init__(self, argv, name='Python client', exclusive=False):
        self.name = name
        # Add default Ice configuration, if needed
        hasIceConfig = False
        for arg in argv:
            if arg.startswith('--Ice'):
                hasIceConfig = True
                break
        if not hasIceConfig:
            configFile = 'config/client/SenStore-ice.cfg'
            if os.path.exists(configFile):
                logging.info('Loading default configuration: %s' % configFile)
                argv.insert(1, '--Ice.Config=%s' % configFile)

        # Initialize Ice runtime
        self.ic = Ice.initialize(argv)
        props = self.ic.getProperties()
        
        # Get SessionFactory to get Session, to get Manager
        base = self.ic.propertyToProxy("SessionFactory.Proxy")
        self.sessionFactory = SenStore.SessionFactoryPrx.checkedCast(base)
        if exclusive:
            self.session = self.sessionFactory.createSessionExclusive(name)
        else:
            self.session = self.sessionFactory.createSession(name)
        self.mngr = self.session.getManager()
        if not self.mngr:
            msg = "Invalid manager proxy"
            logging.error(msg)
            raise RuntimeError(msg)

        # Get Inspector
        base = self.ic.propertyToProxy("Inspector.Proxy")
        self.inspector = SenStore.Info.InspectorPrx.checkedCast(base)
        if not self.inspector:
            msg = "Invalid inspector proxy"
            logging.error(msg)
            raise RuntimeError(msg)
        self.refresher = SessionRefresher(self.session)
        self.refresher.start()

    ## Gets the manager proxy
    def getManager(self):
        return self.mngr

    ## Gets the inspector proxy
    def getInspector(self):
        return self.inspector
    
    ## Closes the connection.
    #
    # The SessionRefresher daemon is stopped, the session ended, and the
    # connection to the server closed.  After calling this method this
    # object can no longer be used.
    def close(self):
        if self.ic:
            self.refresher.quit()
            self.refresher.join()
            self.session.destroy()
            self.ic.destroy()
        self.mngr = None
        self.inspector = None
