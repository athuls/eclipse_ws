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

public abstract class _AccelMeasDisp extends Ice.ObjectImpl implements AccelMeas
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
        "::SenStore::AccelMeas"
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
    appendToSignal(double[] t, float[] data)
    {
        appendToSignal(t, data, null);
    }

    public final void
    createSignal(long[] dims)
    {
        createSignal(dims, null);
    }

    public final Quantity[]
    getDirectionAxis()
    {
        return getDirectionAxis(null);
    }

    public final AccelMeasFields
    getFields()
    {
        return getFields(null);
    }

    public final SensorPrx
    getSensor()
    {
        return getSensor(null);
    }

    public final Float32Signal
    getSignalData(double tStart, float tStep, double tEnd, ArraySlice[] slices)
    {
        return getSignalData(tStart, tStep, tEnd, slices, null);
    }

    public final Float32Signal
    getSignalDataByIndexRange(long idxStart, long idxStep, long idxEnd, ArraySlice[] slices)
    {
        return getSignalDataByIndexRange(idxStart, idxStep, idxEnd, slices, null);
    }

    public final long[]
    getSignalSize()
    {
        return getSignalSize(null);
    }

    public final TimeAxisInfo
    getTimeAxisInfo(double[] t)
    {
        return getTimeAxisInfo(t, null);
    }

    public final void
    setDirectionAxis(Quantity[] data)
    {
        setDirectionAxis(data, null);
    }

    public final void
    setFields(AccelMeasFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null);
    }

    public static Ice.DispatchStatus
    ___getFields(AccelMeas __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        AccelMeasFields __ret = __obj.getFields(__current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFields(AccelMeas __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        AccelMeasFields fields;
        fields = new AccelMeasFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getSensor(AccelMeas __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        SensorPrx __ret = __obj.getSensor(__current);
        SensorPrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getDirectionAxis(AccelMeas __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        Quantity[] __ret = __obj.getDirectionAxis(__current);
        QuantityListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setDirectionAxis(AccelMeas __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        Quantity[] data;
        data = QuantityListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setDirectionAxis(data, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getSignalSize(AccelMeas __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getSignalSize(__current);
        DimensionListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___createSignal(AccelMeas __obj, IceInternal.Incoming __inS, Ice.Current __current)
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
    ___getTimeAxisInfo(AccelMeas __obj, IceInternal.Incoming __inS, Ice.Current __current)
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
    ___getSignalData(AccelMeas __obj, IceInternal.Incoming __inS, Ice.Current __current)
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
        Float32Signal __ret = __obj.getSignalData(tStart, tStep, tEnd, slices, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getSignalDataByIndexRange(AccelMeas __obj, IceInternal.Incoming __inS, Ice.Current __current)
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
        Float32Signal __ret = __obj.getSignalDataByIndexRange(idxStart, idxStep, idxEnd, slices, __current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___appendToSignal(AccelMeas __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        double[] t;
        t = TimestampListHelper.read(__is);
        float[] data;
        data = Float32ListHelper.read(__is);
        __is.endReadEncaps();
        __obj.appendToSignal(t, data, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    private final static String[] __all =
    {
        "appendToSignal",
        "createSignal",
        "getDirectionAxis",
        "getFields",
        "getSensor",
        "getSignalData",
        "getSignalDataByIndexRange",
        "getSignalSize",
        "getTimeAxisInfo",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "setDirectionAxis",
        "setFields"
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
                return ___getDirectionAxis(this, in, __current);
            }
            case 3:
            {
                return ___getFields(this, in, __current);
            }
            case 4:
            {
                return ___getSensor(this, in, __current);
            }
            case 5:
            {
                return ___getSignalData(this, in, __current);
            }
            case 6:
            {
                return ___getSignalDataByIndexRange(this, in, __current);
            }
            case 7:
            {
                return ___getSignalSize(this, in, __current);
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
                return ___setDirectionAxis(this, in, __current);
            }
            case 14:
            {
                return ___setFields(this, in, __current);
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
        ex.reason = "type SenStore::AccelMeas was not generated with stream support";
        throw ex;
    }

    public void
    __read(Ice.InputStream __inS, boolean __rid)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "type SenStore::AccelMeas was not generated with stream support";
        throw ex;
    }
}
