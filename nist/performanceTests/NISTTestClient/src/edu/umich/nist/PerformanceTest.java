/*******************************************************************************
 * Copyright (c) 2010 The Regents of the University of Michigan.
 * All rights reserved.
 ******************************************************************************/
/*
 * @author Jim Steinberger and Atul Prakash
 *
 */



package edu.umich.nist;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.Random;

import org.junit.Test;

import Ice.Communicator;
import Ice.ObjectPrx;
import edu.umich.senstore.AccelMeasPrx;
import edu.umich.senstore.Float32Signal;
import edu.umich.senstore.SenStoreMngrPrx;
import edu.umich.senstore.SenStoreMngrPrxHelper;
import edu.umich.senstore.SensorType;
import edu.umich.senstore.TimeAxisInfo;


public class PerformanceTest {
	
	long accelSignalID; // written to by TestWrites. The ID of accelerometer
	double epocharray[]; // written to by testWrites. Array of time values.
	double beginSampleTime; // written to by  testWrites. 
	
	
	static String SERVER_DEFAULT = "cheetah.eecs.umich.edu";
	static short PORT_DEFAULT = 10001;
	String server = SERVER_DEFAULT; 
	short port = PORT_DEFAULT;
	Calendar cal = Calendar.getInstance();
	String clientIPName;

	@Test
	public void testWrites() {		
		
		try{ 
			InetAddress addr = InetAddress.getLocalHost();
			clientIPName = addr.toString();
			clientIPName = clientIPName.replaceAll("/", "_"); /* slashes cause a problem */
		} catch (UnknownHostException e) {
			e.printStackTrace();
			clientIPName = "unknownClient";
		}
	
		String fileout = server + "_" + port + "performance1test" + clientIPName + "_" + server + "_" + cal.getTime() + ".csv";
		FileOutputStream fos = null;
		OutputStreamWriter out = null;
		try {
			fos = new FileOutputStream(fileout);			
			out = new OutputStreamWriter(fos);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			fail("result file could not be created or modified");
		} 



		Communicator communicator = null;
		try {
			// Retrieving SenSore Manager
			System.out.println("Initializing Communicator");
			communicator = Ice.Util.initialize();
			System.out.println("Attempting to retrieve SenStore");
			ObjectPrx objectProxy = communicator.stringToProxy(
					"SenStore:default -h " + server + " -p " + port);
			SenStoreMngrPrx manager = SenStoreMngrPrxHelper.checkedCast(objectProxy);
			SenStore senStore = new SenStore(manager);

			long sensorID = senStore.createSensor("SenStore Test Big 1", SensorType.SensorTypeACCELEROMETER);
			System.out.println("Sensor: " + sensorID);
			accelSignalID = senStore.createAccelerometerSignal(sensorID);
			System.out.println("Accel ID: " + accelSignalID);

			AccelMeasPrx proxy = manager.getAccelMeas(accelSignalID);
			int arraySizes[] = {1, 10, 100, 1000, 10000, 50000};
			epocharray = new double[arraySizes.length];
			

			Random generator = new Random();

			long milliseconds = System.currentTimeMillis();
			double currentTime = (double) milliseconds / 1000;
			beginSampleTime = currentTime;

			for (int aindex = 0;  aindex < arraySizes.length; aindex++) {

				int cycles = arraySizes[aindex];
				double time[] = new double[cycles];			
				float data[] = new float[cycles * 3];
				int doublelength = 8;
				int floatlength = 4;
				long payloadsize = 0;
				payloadsize +=  doublelength*time.length;
				payloadsize += floatlength*data.length;
				long bytes_sent = 0;

				for (int i = 0; i < time.length; ++i) { //  we don't want to time this.
					time[i] = currentTime;
					currentTime += 0.001f; // Use different time indices
				}

				for (int i = 0; i < data.length; ++i) {
					data[i] = generator.nextFloat();
				}
				epocharray[aindex] = currentTime;

				long startTime = System.currentTimeMillis();
				int numruns = 1; // set to 1 for testing read time.
				for (int i = 0; i < numruns; i++) {
					// Repeat this numruns times and average
					proxy.appendToSignal(time, data);
					bytes_sent += payloadsize;
				}
				long stopTime = System.currentTimeMillis();

				for (int j = 0; j < time.length; j++ ) {
					out.write("sensor values: " + time[j] + ":" + data[3*j] + ", " +
							data[3*j+1] + ", " + data[3*j+2] + "\n");
				}
				out.write("\n\n\n------------\n\n\n");
				double timeforthousandcyles_in_secs = (stopTime - startTime)*1.0/(cycles*numruns);
				System.out.println("Data consisting of 20 bytes; " +  "batch size = " + cycles  + "; average time per 1000 cycles = " + timeforthousandcyles_in_secs + "sec.");
				out.write("20, " + cycles + ", " + timeforthousandcyles_in_secs + "\n");
				System.out.println("Data throughput in KBytes/second = " + (bytes_sent * 1.0)/(stopTime-startTime));
			}
			System.out.println("Done!");
			out.close();

		} catch (Exception e) {
			e.printStackTrace();
			fail("Something went wrong in performance run");
		}
		if (communicator != null) {
			try {
				communicator.destroy();
			} catch (Exception e) {
				e.printStackTrace();
				fail("Could not destroy communicator");
			}
		} 
		// readTest();
		readTest2();
	}


	public void readTest() {	// Call from testWrites	
		
		try{ 
			InetAddress addr = InetAddress.getLocalHost();
			clientIPName = addr.toString();
			clientIPName = clientIPName.replaceAll("/", "_"); /* slashes cause a problem */
		} catch (UnknownHostException e) {
			e.printStackTrace();
			clientIPName = "unknownClient";
		}
	
		String fileout = "Read_test_Efficient:" + server + "_" + port + "performance1test" + clientIPName + "_" + server + "_" + cal.getTime() + ".csv";
		FileOutputStream fos = null;
		OutputStreamWriter out = null;
		try {
			fos = new FileOutputStream(fileout);			
			out = new OutputStreamWriter(fos);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			fail("result file could not be created or modified");
		} 
	
	
	
		Communicator communicator = null;
		try {
			// Retrieving SenSore Manager
			System.out.println("Initializing Communicator");
			communicator = Ice.Util.initialize();
			System.out.println("Attempting to retrieve SenStore");
			ObjectPrx objectProxy = communicator.stringToProxy(
					"SenStore:default -h " + server + " -p " + port);
			SenStoreMngrPrx manager = SenStoreMngrPrxHelper.checkedCast(objectProxy);
			SenStore senStore = new SenStore(manager);
			double initSampleTime = beginSampleTime;
			for (int i = 0; i < epocharray.length; i++) {				
				long startTime = System.currentTimeMillis();
				System.out.println("accelSignalID = " + accelSignalID);
				Float32Signal signal = senStore.getSignalData(accelSignalID, initSampleTime, epocharray[i]);
				initSampleTime = epocharray[i];
				double[] timeArray = signal.t;
	            int cycles = timeArray.length;
	            float[] dataArray = signal.data;
	            int numberOfDataPoints = dataArray.length;
	            long bytes_received = timeArray.length*8 + dataArray.length*4;
	            
	            System.out.println("Signal " + 
	                    " has " + cycles + " times ("
	                    + numberOfDataPoints + " data points)");
	            
	            long stopTime = System.currentTimeMillis();
				double timeforthousandcyles_in_secs = (stopTime - startTime)*1.0/(cycles);
				System.out.println("Data consisting of 20 bytes; " +  "batch size = " + cycles  + "; average time per 1000 cycles = " + timeforthousandcyles_in_secs + "sec.");
				out.write("20, " + cycles + ", " + timeforthousandcyles_in_secs + "\n");
				System.out.println("Data throughput in KBytes/second = " + (bytes_received * 1.0)/(stopTime-startTime));
				for (int j = 0; j < timeArray.length; j++ ) {
					out.write("sensor values: " + timeArray[j] + ":" + dataArray[3*j] + ", " +
							dataArray[3*j+1] + ", " + dataArray[3*j+2] + "\n");
				}
				out.write(" \n\n\n_________________\n\n\n");
			}
			System.out.println("Done!");
			out.close();
	
		} catch (Exception e) {
			e.printStackTrace();
			fail("Something went wrong in performance run");
		}
		if (communicator != null) {
			try {
				communicator.destroy();
			} catch (Exception e) {
				e.printStackTrace();
				fail("Could not destroy communicator");
			}
		} 
	}


	public void readTest2() {	// Call from testWrites	
		
		try{ 
			InetAddress addr = InetAddress.getLocalHost();
			clientIPName = addr.toString();
			clientIPName = clientIPName.replaceAll("/", "_"); /* slashes cause a problem */
		} catch (UnknownHostException e) {
			e.printStackTrace();
			clientIPName = "unknownClient";
		}
	
		String fileout = "Read_test:" + server + "_" + port + "performance1test" + clientIPName + "_" + server + "_" + cal.getTime() + ".csv";
		FileOutputStream fos = null;
		OutputStreamWriter out = null;
		try {
			fos = new FileOutputStream(fileout);			
			out = new OutputStreamWriter(fos);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			fail("result file could not be created or modified");
		} 
	
	
	
		Communicator communicator = null;
		try {
			// Retrieving SenSore Manager
			System.out.println("Initializing Communicator");
			communicator = Ice.Util.initialize();
			System.out.println("Attempting to retrieve SenStore");
			ObjectPrx objectProxy = communicator.stringToProxy(
					"SenStore:default -h " + server + " -p " + port);
			SenStoreMngrPrx manager = SenStoreMngrPrxHelper.checkedCast(objectProxy);
			SenStore senStore = new SenStore(manager);
			double initSampleTime = beginSampleTime;
			double starttime = 0;
			for (int i = 0; i < epocharray.length; i++) {				
				long startTime = System.currentTimeMillis();
				System.out.println("accelSignalID = " + accelSignalID);
				AccelMeasPrx accelerationSignal = manager.getAccelMeas(accelSignalID);
				double[] timerange = new double[2];
				timerange[0] = starttime;
				timerange[1] = epocharray[i];
				starttime = timerange[1]; // advance to the next round.
				TimeAxisInfo timeInfo = accelerationSignal.getTimeAxisInfo(timerange);
				if (timeInfo.t.length == 0) {
					fail("Empty time info array received");
				}
				long idxStart = timeInfo.idx[0]; // initial index for the time range
				long idxEnd = timeInfo.idx[timeInfo.idx.length-1]; // we will get 10000 files max
				Float32Signal signal = accelerationSignal.getSignalDataByIndexRange(idxStart, 1, idxEnd, null);
				initSampleTime = epocharray[i];
				double[] timeArray = signal.t;
	            int cycles = timeArray.length;
	            float[] dataArray = signal.data;
	            int numberOfDataPoints = dataArray.length;
	            long bytes_received = timeArray.length*8 + dataArray.length*4;
	            
	            System.out.println("Signal " + 
	                    " has " + cycles + " times ("
	                    + numberOfDataPoints + " data points)");
	            
	            long stopTime = System.currentTimeMillis();
				double timeforthousandcyles_in_secs = (stopTime - startTime)*1.0/(cycles);
				System.out.println("Data consisting of 20 bytes; " +  "batch size = " + cycles  + "; average time per 1000 cycles = " + timeforthousandcyles_in_secs + "sec.");
				out.write("20, " + cycles + ", " + timeforthousandcyles_in_secs + "\n");
				System.out.println("Data throughput in KBytes/second = " + (bytes_received * 1.0)/(stopTime-startTime));
				for (int j = 0; j < timeArray.length; j++ ) {
					out.write("sensor values: " + timeArray[j] + ":" + dataArray[3*j] + ", " +
							dataArray[3*j+1] + ", " + dataArray[3*j+2] + "\n");
				}
				out.write(" \n\n\n_________________\n\n\n");
			}
			System.out.println("Done!");
			out.close();
	
		} catch (Exception e) {
			e.printStackTrace();
			fail("Something went wrong in performance run");
		}
		if (communicator != null) {
			try {
				communicator.destroy();
			} catch (Exception e) {
				e.printStackTrace();
				fail("Could not destroy communicator");
			}
		} 
	}



}
