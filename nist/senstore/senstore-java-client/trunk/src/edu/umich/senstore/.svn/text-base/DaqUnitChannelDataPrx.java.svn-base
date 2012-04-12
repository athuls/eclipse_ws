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

public interface DaqUnitChannelDataPrx extends Ice.ObjectPrx
{
    public DaqUnitChannelDataFields getFields();
    public DaqUnitChannelDataFields getFields(java.util.Map<String, String> __ctx);

    public void setFields(DaqUnitChannelDataFields fields, String[] fieldNames);
    public void setFields(DaqUnitChannelDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx);

    public DaqUnitChannelPrx getChannel();
    public DaqUnitChannelPrx getChannel(java.util.Map<String, String> __ctx);

    public Quantity[] getSubChannelsAxis();
    public Quantity[] getSubChannelsAxis(java.util.Map<String, String> __ctx);

    public void setSubChannelsAxis(Quantity[] data);
    public void setSubChannelsAxis(Quantity[] data, java.util.Map<String, String> __ctx);

    public long[] getSignalSize();
    public long[] getSignalSize(java.util.Map<String, String> __ctx);

    public void createSignal(long[] dims);
    public void createSignal(long[] dims, java.util.Map<String, String> __ctx);

    public TimeAxisInfo getTimeAxisInfo(double[] t);
    public TimeAxisInfo getTimeAxisInfo(double[] t, java.util.Map<String, String> __ctx);

    public Int32Signal getSignalData(double tStart, float tStep, double tEnd, ArraySlice[] slices);
    public Int32Signal getSignalData(double tStart, float tStep, double tEnd, ArraySlice[] slices, java.util.Map<String, String> __ctx);

    public Int32Signal getSignalDataByIndexRange(long idxStart, long idxStep, long idxEnd, ArraySlice[] slices);
    public Int32Signal getSignalDataByIndexRange(long idxStart, long idxStep, long idxEnd, ArraySlice[] slices, java.util.Map<String, String> __ctx);

    public void appendToSignal(double[] t, int[] data);
    public void appendToSignal(double[] t, int[] data, java.util.Map<String, String> __ctx);
}
