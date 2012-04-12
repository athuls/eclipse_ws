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

public interface AccelMeasPrx extends Ice.ObjectPrx
{
    public AccelMeasFields getFields();
    public AccelMeasFields getFields(java.util.Map<String, String> __ctx);

    public void setFields(AccelMeasFields fields, String[] fieldNames);
    public void setFields(AccelMeasFields fields, String[] fieldNames, java.util.Map<String, String> __ctx);

    public SensorPrx getSensor();
    public SensorPrx getSensor(java.util.Map<String, String> __ctx);

    public Quantity[] getDirectionAxis();
    public Quantity[] getDirectionAxis(java.util.Map<String, String> __ctx);

    public void setDirectionAxis(Quantity[] data);
    public void setDirectionAxis(Quantity[] data, java.util.Map<String, String> __ctx);

    public long[] getSignalSize();
    public long[] getSignalSize(java.util.Map<String, String> __ctx);

    public void createSignal(long[] dims);
    public void createSignal(long[] dims, java.util.Map<String, String> __ctx);

    public TimeAxisInfo getTimeAxisInfo(double[] t);
    public TimeAxisInfo getTimeAxisInfo(double[] t, java.util.Map<String, String> __ctx);

    public Float32Signal getSignalData(double tStart, float tStep, double tEnd, ArraySlice[] slices);
    public Float32Signal getSignalData(double tStart, float tStep, double tEnd, ArraySlice[] slices, java.util.Map<String, String> __ctx);

    public Float32Signal getSignalDataByIndexRange(long idxStart, long idxStep, long idxEnd, ArraySlice[] slices);
    public Float32Signal getSignalDataByIndexRange(long idxStart, long idxStep, long idxEnd, ArraySlice[] slices, java.util.Map<String, String> __ctx);

    public void appendToSignal(double[] t, float[] data);
    public void appendToSignal(double[] t, float[] data, java.util.Map<String, String> __ctx);
}
