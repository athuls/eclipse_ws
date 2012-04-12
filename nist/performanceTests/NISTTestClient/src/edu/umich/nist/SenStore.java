/*******************************************************************************
 * Copyright (c) 2010 The Regents of the University of Michigan.
 * All rights reserved.
 ******************************************************************************/
/**
 * 
 */
package edu.umich.nist;

import java.util.ArrayList;

import edu.umich.senstore.AccelMeasFields;
import edu.umich.senstore.AccelMeasPrx;
import edu.umich.senstore.ArraySlice;
import edu.umich.senstore.DaqUnitPrx;
import edu.umich.senstore.FEMCoordSystemFields;
import edu.umich.senstore.FEMNodeFields;
import edu.umich.senstore.Float32Signal;
import edu.umich.senstore.Quantity;
import edu.umich.senstore.SenStoreMngrPrx;
import edu.umich.senstore.SensorFields;
import edu.umich.senstore.SensorPrx;
import edu.umich.senstore.SensorType;
import edu.umich.senstore.StructureFields;
import edu.umich.senstore.StructurePrx;
import edu.umich.senstore.Unit;

/**
 * @author bippy
 *
 */
public class SenStore {
    private SenStoreMngrPrx manager;
    
    public SenStore(SenStoreMngrPrx manager) {
        this.manager = manager;
    }
    
    public long createTestStructure() {
        StructureFields fields = new StructureFields();
        fields.mDistanceUnit = Unit.UnitFOOT;
        fields.mForceUnit = Unit.UnitKILOPOUND;
        fields.mWeightUnit = Unit.UnitKILOSLUG;
        fields.mName = "Demo Bridge";
        fields.mType = "Suspension Bridge";
        fields.mDescription = "Dummy Bridge for CyberInfrastructure Testing";

        long structureID = this.manager.addStructure(fields);
        
        FEMCoordSystemFields coordFields = new FEMCoordSystemFields();
        coordFields.mAX = 1.0;
        coordFields.mAY = 0.0;
        coordFields.mAZ = 0.0;
        coordFields.mBX = 0.0;
        coordFields.mBBY = 1.0;
        coordFields.mBZ = 0.0;
        coordFields.mDescription = "Default coordinate system";
        coordFields.mXorigin = 0.0;
        coordFields.mYorigin = 0.0;
        coordFields.mZorigin = 0.0;
        long coordID = this.manager.addFEMCoordSystem(coordFields);
        
        for (int i = 0; i < 250000; ++i) {
            FEMNodeFields nodeFields = new FEMNodeFields();
            nodeFields.mLocalID = i;
            nodeFields.mSystem = coordID;
            nodeFields.mX = 0.0;
            nodeFields.mY = 10.0;
            nodeFields.mZ = 15.0;
            this.manager.addFEMNode(nodeFields);
        }
        
        return structureID;
    }
    
    public long createSensor(String sensorModel,
                             SensorType sensorType) {
        SensorFields newSensorProperties = new SensorFields();
        newSensorProperties.mModel = sensorModel;
        newSensorProperties.mType = sensorType;

        long id = this.manager.addSensor(newSensorProperties);
        return id;
    }
    
    public long createAccelerometerSignal(long sensorID) {
        AccelMeasFields accelMeasurementProperties = new AccelMeasFields();
        accelMeasurementProperties.mSensor = sensorID;
        accelMeasurementProperties.mName = "";
        accelMeasurementProperties.mDescription = "";
        
        long accelMeasID = this.manager.addAccelMeas(accelMeasurementProperties);
        
        AccelMeasPrx measurementProxy = this.manager.getAccelMeas(accelMeasID);
        measurementProxy.createSignal(new long[] { 3 });
        measurementProxy.setDirectionAxis(new Quantity[] {
           Quantity.QuantityXDISPLACEMENT,
           Quantity.QuantityYDISPLACEMENT,
           Quantity.QuantityZDISPLACEMENT
        });
        
        return accelMeasID;
    }
    
    public void addTenRandomDataPoints(long accelMeasID) {
        AccelMeasPrx measurementProxy = this.manager.getAccelMeas(accelMeasID);
        
        long milliseconds = System.currentTimeMillis();
        double currentTime = (double) milliseconds / 1000;
        measurementProxy.appendToSignal(
                new double[] {
                        (double) currentTime, (double) currentTime + 0.001,
                        (double) currentTime + 0.002, (double) currentTime + 0.003,
                        (double) currentTime + 0.004, (double) currentTime + 0.005,
                        (double) currentTime + 0.006, (double) currentTime + 0.007,
                        (double) currentTime + 0.008, (double) currentTime + 0.009
                },
                new float[] {
                        (float) Math.random(), (float) Math.random(), (float) Math.random(),
                        (float) Math.random(), (float) Math.random(), (float) Math.random(),
                        (float) Math.random(), (float) Math.random(), (float) Math.random(),
                        (float) Math.random(), (float) Math.random(), (float) Math.random(),
                        (float) Math.random(), (float) Math.random(), (float) Math.random(),
                        (float) Math.random(), (float) Math.random(), (float) Math.random(),
                        (float) Math.random(), (float) Math.random(), (float) Math.random(),
                        (float) Math.random(), (float) Math.random(), (float) Math.random(),
                        (float) Math.random(), (float) Math.random(), (float) Math.random(),
                        (float) Math.random(), (float) Math.random(), (float) Math.random()
                }
        );
    }
    
    public Float32Signal getSignalData(long accelMeasID, double start, double end) {
        AccelMeasPrx measurementProxy = this.manager.getAccelMeas(accelMeasID);
        
        return measurementProxy.getSignalData(start, 0.001f, end, new ArraySlice[] { });
    }
    
    public long[] getSensorIDs() {
        return this.manager.getSensorIds();
    }
    
    public long[] getAccelMeasIDs() {
        return this.manager.getAccelMeasIds();
    }
    
    public DaqUnitPrx[] getUnits() {
        long[] unitIDs = this.manager.getDaqUnitIds();
        DaqUnitPrx[] units = new DaqUnitPrx[unitIDs.length];
        for (int i = 0; i < unitIDs.length; ++i) {
            long unitID = unitIDs[i];
            units[i] = this.manager.getDaqUnit(unitID);
        }
        return units;
    }
    
    public StructurePrx[] getStructures() {
        long[] structureIDs = this.manager.getStructureIds();
        StructurePrx[] structures = new StructurePrx[structureIDs.length];
        for (int i = 0; i < structureIDs.length; ++i) {
            long structureID = structureIDs[i];
            structures[i] = this.manager.getStructure(structureID);
        }
        return structures;
    }
    
    public SensorPrx[] getSensors() {
        long[] sensorIDs = this.manager.getSensorIds();
        SensorPrx[] allSensors = new SensorPrx[sensorIDs.length];
        for (int i = 0; i < sensorIDs.length; ++i) {
            long sensorID = sensorIDs[i];
            allSensors[i] = this.manager.getSensor(sensorID);
        }
        return allSensors;
    }

    public AccelMeasPrx[] getAccelerationSignals(long sensorID) {
        ArrayList<AccelMeasPrx> signals = new ArrayList<AccelMeasPrx>();
        long[] accelMeasIDs = this.manager.getAccelMeasIds();
        for (int i = 0; i < accelMeasIDs.length; ++i) {
            long accelMeasID = accelMeasIDs[i];
            AccelMeasPrx proxy = this.manager.getAccelMeas(accelMeasID);
            if (proxy.getFields().mSensor == sensorID) {
                signals.add(proxy);
            }
        }
        return signals.toArray(new AccelMeasPrx[signals.size()]);
    }
}
