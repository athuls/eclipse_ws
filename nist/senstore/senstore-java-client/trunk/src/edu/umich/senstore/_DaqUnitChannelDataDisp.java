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

public abstract class _DaqUnitChannelDataDisp extends Ice.ObjectImpl implements DaqUnitChannelData
{
    protected void
    ice_copyStateFrom(Ice.Object __obj)
        throws java.lang.CloneNotSupportedException
    {
        throw new java.lang.CloneNotSupportedException();
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::SenStore::DaqUnitChannelData"
    };

    public boolean
    ice_isA(String s)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public boolean
    ice_isA(String s, Ice.Current __current)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public String[]
    ice_ids()
    {
        return __ids;
    }

    public String[]
    ice_ids(Ice.Current __current)
    {
        return __ids;
    }

    public String
    ice_id()
    {
        return __ids[1];
    }

    public String
    ice_id(Ice.Current __current)
    {
        return __ids[1];
    }

    public static String
    ice_staticId()
    {
        return __ids[1];
    }

    public final void
    appendToSignal(double[] t, int[] data)
    {
        appendToSignal(t, data, null);
    }

    public final void
    createSignal(long[] dims)
    {
        createSignal(dims, null);
    }

    public final DaqUnitChannelPrx
    getChannel()
    {
        return getChannel(null);
    }

    public final DaqUnitChannelDataFields
    getFields()
    {
        return getFields(null);
    }

    public final Int32Signal
    getSignalData(double tStart, float tStep, double tEnd, ArraySlice[] slices)
    {
        return getSignalData(tStart, tStep, tEnd, slices, null);
    }

    public final Int32Signal
    getSignalDataByIndexRange(long idxStart, long idxStep, long idxEnd, ArraySlice[] slices)
    {
        return getSignalDataByIndexRange(idxStart, idxStep, idxEnd, slices, null);
    }

    public final long[]
    getSignalSize()
    {
        return getSignalSize(null);
    }

    public final Quantity[]
    getSubChannelsAxis()
    {
        return getSubChannelsAxis(null);
    }

    public final TimeAxisInfo
    getTimeAxisInfo(double[] t)
    {
        return getTimeAxisInfo(t, null);
    }

    public final void
    setFields(DaqUnitChannelDataFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null);
    }

    public final void
    setSubChannelsAxis(Quantity[] data)
    {
        setSubChannelsAxis(data, null);
    }

    public static Ice.DispatchStatus
    ___getFields(DaqUnitChannelData __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        DaqUnitChannelDataFields __ret = __obj.getFields(__current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFields(DaqUnitChannelData __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        DaqUnitChannelDataFields fields;
        fields = new DaqUnitChannelDataFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getChannel(DaqUnitChannelData __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        DaqUnitChannelPrx __ret = __obj.getChannel(__current);
        DaqUnitChannelPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getSubChannelsAxis(DaqUnitChannelData __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        Quantity[] __ret = __obj.getSubChannelsAxis(__current);
        QuantityListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setSubChannelsAxis(DaqUnitChannelData __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        Quantity[] data;
        data = QuantityListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setSubChannelsAxis(data, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getSignalSize(DaqUnitChannelData __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getSignalSize(__current);
        DimensionListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___createSignal(DaqUnitChannelData __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] dims;
        dims = DimensionListHelper.read(__is);
        __is.endReadEncaps();
        __obj.createSignal(dims, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getTimeAxisInfo(DaqUnitChannelData __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        double[] t;
        t = TimestampListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        TimeAxisInfo __ret = __obj.getTimeAxisInfo(t, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getSignalData(DaqUnitChannelData __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        double tStart;
        tStart = __is.readDouble();
        float tStep;
        tStep = __is.readFloat();
        double tEnd;
        tEnd = __is.readDouble();
        ArraySlice[] slices;
        slices = ArraySliceListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        Int32Signal __ret = __obj.getSignalData(tStart, tStep, tEnd, slices, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getSignalDataByIndexRange(DaqUnitChannelData __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long idxStart;
        idxStart = __is.readLong();
        long idxStep;
        idxStep = __is.readLong();
        long idxEnd;
        idxEnd = __is.readLong();
        ArraySlice[] slices;
        slices = ArraySliceListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        Int32Signal __ret = __obj.getSignalDataByIndexRange(idxStart, idxStep, idxEnd, slices, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___appendToSignal(DaqUnitChannelData __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        double[] t;
        t = TimestampListHelper.read(__is);
        int[] data;
        data = Int32ListHelper.read(__is);
        __is.endReadEncaps();
        __obj.appendToSignal(t, data, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    private final static String[] __all =
    {
        "appendToSignal",
        "createSignal",
        "getChannel",
        "getFields",
        "getSignalData",
        "getSignalDataByIndexRange",
        "getSignalSize",
        "getSubChannelsAxis",
        "getTimeAxisInfo",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "setFields",
        "setSubChannelsAxis"
    };

    public Ice.DispatchStatus
    __dispatch(IceInternal.Incoming in, Ice.Current __current)
    {
        int pos = java.util.Arrays.binarySearch(__all, __current.operation);
        if(pos < 0)
        {
            throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return ___appendToSignal(this, in, __current);
            }
            case 1:
            {
                return ___createSignal(this, in, __current);
            }
            case 2:
            {
                return ___getChannel(this, in, __current);
            }
            case 3:
            {
                return ___getFields(this, in, __current);
            }
            case 4:
            {
                return ___getSignalData(this, in, __current);
            }
            case 5:
            {
                return ___getSignalDataByIndexRange(this, in, __current);
            }
            case 6:
            {
                return ___getSignalSize(this, in, __current);
            }
            case 7:
            {
                return ___getSubChannelsAxis(this, in, __current);
            }
            case 8:
            {
                return ___getTimeAxisInfo(this, in, __current);
            }
            case 9:
            {
                return ___ice_id(this, in, __current);
            }
            case 10:
            {
                return ___ice_ids(this, in, __current);
            }
            case 11:
            {
                return ___ice_isA(this, in, __current);
            }
            case 12:
            {
                return ___ice_ping(this, in, __current);
            }
            case 13:
            {
                return ___setFields(this, in, __current);
            }
            case 14:
            {
                return ___setSubChannelsAxis(this, in, __current);
            }
        }

        assert(false);
        throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeTypeId(ice_staticId());
        __os.startWriteSlice();
        __os.endWriteSlice();
        super.__write(__os);
    }

    public void
    __read(IceInternal.BasicStream __is, boolean __rid)
    {
        if(__rid)
        {
            __is.readTypeId();
        }
        __is.startReadSlice();
        __is.endReadSlice();
        super.__read(__is, true);
    }

    public void
    __write(Ice.OutputStream __outS)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "type SenStore::DaqUnitChannelData was not generated with stream support";
        throw ex;
    }

    public void
    __read(Ice.InputStream __inS, boolean __rid)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "type SenStore::DaqUnitChannelData was not generated with stream support";
        throw ex;
    }
}
