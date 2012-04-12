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

public interface _AccelMeasOperationsNC
{
    AccelMeasFields getFields();

    void setFields(AccelMeasFields fields, String[] fieldNames);

    SensorPrx getSensor();

    Quantity[] getDirectionAxis();

    void setDirectionAxis(Quantity[] data);

    long[] getSignalSize();

    void createSignal(long[] dims);

    TimeAxisInfo getTimeAxisInfo(double[] t);

    Float32Signal getSignalData(double tStart, float tStep, double tEnd, ArraySlice[] slices);

    Float32Signal getSignalDataByIndexRange(long idxStart, long idxStep, long idxEnd, ArraySlice[] slices);

    void appendToSignal(double[] t, float[] data);
}
