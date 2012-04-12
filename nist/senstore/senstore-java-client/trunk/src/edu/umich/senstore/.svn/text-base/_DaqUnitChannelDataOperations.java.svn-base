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

public interface _DaqUnitChannelDataOperations
{
    DaqUnitChannelDataFields getFields(Ice.Current __current);

    void setFields(DaqUnitChannelDataFields fields, String[] fieldNames, Ice.Current __current);

    DaqUnitChannelPrx getChannel(Ice.Current __current);

    Quantity[] getSubChannelsAxis(Ice.Current __current);

    void setSubChannelsAxis(Quantity[] data, Ice.Current __current);

    long[] getSignalSize(Ice.Current __current);

    void createSignal(long[] dims, Ice.Current __current);

    TimeAxisInfo getTimeAxisInfo(double[] t, Ice.Current __current);

    Int32Signal getSignalData(double tStart, float tStep, double tEnd, ArraySlice[] slices, Ice.Current __current);

    Int32Signal getSignalDataByIndexRange(long idxStart, long idxStep, long idxEnd, ArraySlice[] slices, Ice.Current __current);

    void appendToSignal(double[] t, int[] data, Ice.Current __current);
}
