/*******************************************************************************
 * Copyright (c) 2010 The Regents of the University of Michigan.
 * All rights reserved.
 ******************************************************************************/
/**
 * 
 */
package edu.umich.nist;

import Ice.Communicator;
import Ice.ObjectPrx;
import edu.umich.senstore.SenStoreMngrPrx;
import edu.umich.senstore.SenStoreMngrPrxHelper;


/**
 * @author University of Michigan
 *
 */
public class TestClient {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int status = 0;
        Communicator communicator = null;
        try {
            // Retrieving SenSore Manager
            System.out.println("Initializing Communicator");
            communicator = Ice.Util.initialize();
            System.out.println("Attempting to retrieve SenStore");
            ObjectPrx proxy = communicator.stringToProxy(
                    "SenStore:default -h 141.212.207.190 -p 10001");
            SenStoreMngrPrx manager = SenStoreMngrPrxHelper.checkedCast(proxy);

            SenStore senStore = new SenStore(manager);
            
            System.out.println("Success: found " 
                   + senStore.getSensorIDs().length
                   + " sensors on Cheetah");

        } catch (Exception e) {
            e.printStackTrace();
            status = 1;
        }
        if (communicator != null) {
            try {
                communicator.destroy();
            } catch (Exception e) {
                e.printStackTrace();
                status = 1;
            }
        }
        
        System.exit(status);
    }

}
