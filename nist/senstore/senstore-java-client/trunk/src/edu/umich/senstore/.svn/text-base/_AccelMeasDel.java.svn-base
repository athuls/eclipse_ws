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

public interface _AccelMeasDel extends Ice._ObjectDel
{
    AccelMeasFields getFields(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFields(AccelMeasFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    SensorPrx getSensor(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    Quantity[] getDirectionAxis(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setDirectionAxis(Quantity[] data, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getSignalSize(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void createSignal(long[] dims, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    TimeAxisInfo getTimeAxisInfo(double[] t, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    Float32Signal getSignalData(double tStart, float tStep, double tEnd, ArraySlice[] slices, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    Float32Signal getSignalDataByIndexRange(long idxStart, long idxStep, long idxEnd, ArraySlice[] slices, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void appendToSignal(double[] t, float[] data, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;
}
