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

public interface _DaqUnitChannelDataDel extends Ice._ObjectDel
{
    DaqUnitChannelDataFields getFields(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFields(DaqUnitChannelDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    DaqUnitChannelPrx getChannel(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    Quantity[] getSubChannelsAxis(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setSubChannelsAxis(Quantity[] data, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    long[] getSignalSize(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void createSignal(long[] dims, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    TimeAxisInfo getTimeAxisInfo(double[] t, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    Int32Signal getSignalData(double tStart, float tStep, double tEnd, ArraySlice[] slices, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    Int32Signal getSignalDataByIndexRange(long idxStart, long idxStep, long idxEnd, ArraySlice[] slices, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void appendToSignal(double[] t, int[] data, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;
}
