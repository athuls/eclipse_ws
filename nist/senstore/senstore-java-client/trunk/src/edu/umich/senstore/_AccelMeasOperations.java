// **********************************************************************
//
// Copyright (c) 2003-2009 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.3.1

package edu.umich.senstore;

public interface _AccelMeasOperations
{
    AccelMeasFields getFields(Ice.Current __current);

    void setFields(AccelMeasFields fields, String[] fieldNames, Ice.Current __current);

    SensorPrx getSensor(Ice.Current __current);

    Quantity[] getDirectionAxis(Ice.Current __current);

    void setDirectionAxis(Quantity[] data, Ice.Current __current);

    long[] getSignalSize(Ice.Current __current);

    void createSignal(long[] dims, Ice.Current __current);

    TimeAxisInfo getTimeAxisInfo(double[] t, Ice.Current __current);

    Float32Signal getSignalData(double tStart, float tStep, double tEnd, ArraySlice[] slices, Ice.Current __current);

    Float32Signal getSignalDataByIndexRange(long idxStart, long idxStep, long idxEnd, ArraySlice[] slices, Ice.Current __current);

    void appendToSignal(double[] t, float[] data, Ice.Current __current);
}
