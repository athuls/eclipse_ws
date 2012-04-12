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
import edu.umich.senstore.AccelMeasPrx;
import edu.umich.senstore.Float32Signal;
import edu.umich.senstore.SenStoreMngrPrx;
import edu.umich.senstore.SenStoreMngrPrxHelper;
import edu.umich.senstore.SensorType;


/**
 * @author University of Michigan
 *
 */
public class TestClient3 {

    /**
     * @param args
     */
	
	static long accelSignalID;
	static String SERVER_DEFAULT = "cheetah.eecs.umich.edu";
	
	static String server = SERVER_DEFAULT; 
	
	
	TestClient3() {
		server = SERVER_DEFAULT:
			
	}
	
	
	
    public static void main(String[] args) {
        int status = 0;
        Communicator communicator = null;
        try {
            // Retrieving SenSore Manager
            System.out.println("Initializing Communicator");
            communicator = Ice.Util.initialize();
            System.out.println("Attempting to retrieve SenStore");
            ObjectPrx objectProxy = communicator.stringToProxy(
                    "SenStore:default -h 141.212.207.190 -p 10001");
            SenStoreMngrPrx manager = SenStoreMngrPrxHelper.checkedCast(objectProxy);

            SenStore senStore = new SenStore(manager);
            
            
            long sensorID = senStore.createSensor("SenStore Test Big 1", SensorType.SensorTypeACCELEROMETER);
            System.out.println("Sensor: " + sensorID);
            accelSignalID = senStore.createAccelerometerSignal(sensorID);
            System.out.println("Accel ID: " + accelSignalID);
            
            AccelMeasPrx proxy = manager.getAccelMeas(accelSignalID);

            long milliseconds = System.currentTimeMillis();
            double currentTime = (double) milliseconds / 1000;
            
            double time[] = new double[5000];
            for (int i = 0; i < time.length; ++i) {
                time[i] = currentTime + (0.001 * i);
            }
            float data[] = new float[5000 * 3];
            
            long startTime = System.currentTimeMillis();
            int loopcount = 50;

            for (int j = 0; j < loopcount; j++)  {            
            	for (int i = 0; i < time.length; ++i) {
            		time[i] = startTime;
            		startTime += 0.001;
            	}
            	proxy.appendToSignal(time, data);
            }

            long stopTime = System.currentTimeMillis();
            System.out.println("Inserting 5000 cycles on average took " + (stopTime - startTime)/(1.0*loopcount) + "ms.");
            
            System.out.println("Done!");
            
   

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
        
        readTest();
        System.exit(status);
    }
    
    public static void readTest() {
        int status = 0;
        Communicator communicator = null;
        try {
            // Retrieving SenSore Manager
            System.out.println("Initializing Communicator");
            communicator = Ice.Util.initialize();
            System.out.println("Attempting to retrieve SenStore");
            ObjectPrx objectProxy = communicator.stringToProxy(
                    "SenStore:default -h 141.212.207.190 -p 10001");
            SenStoreMngrPrx manager = SenStoreMngrPrxHelper.checkedCast(objectProxy);

            SenStore senStore = new SenStore(manager);
            
            
            Float32Signal signal = senStore.getSignalData(accelSignalID, 0, System.currentTimeMillis());
            double[] timeArray = signal.t;
            int numberOfTimes = timeArray.length;
            float[] dataArray = signal.data;
            int numberOfDataPoints = dataArray.length;
            
            System.out.println("Signal " + 
                    " has " + numberOfTimes + " times ("
                    + numberOfDataPoints + " data points)");
            
            System.out.println("Done!");

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
        
            
            AccelMeasPrx proxy = manager.getAccelMeas(accelSignalID);

            long milliseconds = System.currentTimeMillis();
            double currentTime = (double) milliseconds / 1000;
            
            double time[] = new double[5000];
            for (int i = 0; i < time.length; ++i) {
                time[i] = currentTime + (0.001 * i);
            }
            float data[] = new float[5000 * 3];
            
            long startTime = System.currentTimeMillis();
            int loopcount = 50;

            for (int j = 0; j < loopcount; j++)  {            
            	for (int i = 0; i < time.length; ++i) {
            		time[i] = startTime;
            		startTime += 0.001;
            	}
            	proxy.appendToSignal(time, data);
            }

            long stopTime = System.currentTimeMillis();
            System.out.println("Inserting 5000 cycles on average took " + (stopTime - startTime)/(1.0*loopcount) + "ms.");
            
            System.out.println("Done!");
            
   

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
        
        readTest();
        System.exit(status);
    }

}

