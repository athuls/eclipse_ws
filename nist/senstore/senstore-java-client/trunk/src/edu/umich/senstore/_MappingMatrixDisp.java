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

public abstract class _MappingMatrixDisp extends Ice.ObjectImpl implements MappingMatrix
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
        "::SenStore::MappingMatrix"
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
    createArray(long[] dims)
    {
        createArray(dims, null);
    }

    public final double[]
    getArrayData(int i, long[] idxs)
    {
        return getArrayData(i, idxs, null);
    }

    public final long[]
    getArraySize()
    {
        return getArraySize(null);
    }

    public final MappingMatrixFields
    getFields()
    {
        return getFields(null);
    }

    public final long[]
    getInputNodeAxis()
    {
        return getInputNodeAxis(null);
    }

    public final long[]
    getOutputNodeAxis()
    {
        return getOutputNodeAxis(null);
    }

    public final StructurePrx
    getStructure()
    {
        return getStructure(null);
    }

    public final void
    setArrayData(int i, long[] idxs, double[] data)
    {
        setArrayData(i, idxs, data, null);
    }

    public final void
    setFields(MappingMatrixFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null);
    }

    public final void
    setInputNodeAxis(long[] data)
    {
        setInputNodeAxis(data, null);
    }

    public final void
    setOutputNodeAxis(long[] data)
    {
        setOutputNodeAxis(data, null);
    }

    public static Ice.DispatchStatus
    ___getFields(MappingMatrix __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        MappingMatrixFields __ret = __obj.getFields(__current);
        __ret.__write(__os);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setFields(MappingMatrix __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        MappingMatrixFields fields;
        fields = new MappingMatrixFields();
        fields.__read(__is);
        String[] fieldNames;
        fieldNames = FieldNameListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setFields(fields, fieldNames, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getStructure(MappingMatrix __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        StructurePrx __ret = __obj.getStructure(__current);
        StructurePrxHelper.__write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getOutputNodeAxis(MappingMatrix __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getOutputNodeAxis(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setOutputNodeAxis(MappingMatrix __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] data;
        data = IdListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setOutputNodeAxis(data, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getInputNodeAxis(MappingMatrix __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getInputNodeAxis(__current);
        IdListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setInputNodeAxis(MappingMatrix __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] data;
        data = IdListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setInputNodeAxis(data, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getArraySize(MappingMatrix __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        __inS.is().skipEmptyEncaps();
        IceInternal.BasicStream __os = __inS.os();
        long[] __ret = __obj.getArraySize(__current);
        DimensionListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___createArray(MappingMatrix __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        long[] dims;
        dims = DimensionListHelper.read(__is);
        __is.endReadEncaps();
        __obj.createArray(dims, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___getArrayData(MappingMatrix __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int i;
        i = __is.readInt();
        long[] idxs;
        idxs = DimensionListHelper.read(__is);
        __is.endReadEncaps();
        IceInternal.BasicStream __os = __inS.os();
        double[] __ret = __obj.getArrayData(i, idxs, __current);
        Float64ListHelper.write(__os, __ret);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus
    ___setArrayData(MappingMatrix __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Idempotent, __current.mode);
        IceInternal.BasicStream __is = __inS.is();
        __is.startReadEncaps();
        int i;
        i = __is.readInt();
        long[] idxs;
        idxs = DimensionListHelper.read(__is);
        double[] data;
        data = Float64ListHelper.read(__is);
        __is.endReadEncaps();
        __obj.setArrayData(i, idxs, data, __current);
        return Ice.DispatchStatus.DispatchOK;
    }

    private final static String[] __all =
    {
        "createArray",
        "getArrayData",
        "getArraySize",
        "getFields",
        "getInputNodeAxis",
        "getOutputNodeAxis",
        "getStructure",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "setArrayData",
        "setFields",
        "setInputNodeAxis",
        "setOutputNodeAxis"
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
                return ___createArray(this, in, __current);
            }
            case 1:
            {
                return ___getArrayData(this, in, __current);
            }
            case 2:
            {
                return ___getArraySize(this, in, __current);
            }
            case 3:
            {
                return ___getFields(this, in, __current);
            }
            case 4:
            {
                return ___getInputNodeAxis(this, in, __current);
            }
            case 5:
            {
                return ___getOutputNodeAxis(this, in, __current);
            }
            case 6:
            {
                return ___getStructure(this, in, __current);
            }
            case 7:
            {
                return ___ice_id(this, in, __current);
            }
            case 8:
            {
                return ___ice_ids(this, in, __current);
            }
            case 9:
            {
                return ___ice_isA(this, in, __current);
            }
            case 10:
            {
                return ___ice_ping(this, in, __current);
            }
            case 11:
            {
                return ___setArrayData(this, in, __current);
            }
            case 12:
            {
                return ___setFields(this, in, __current);
            }
            case 13:
            {
                return ___setInputNodeAxis(this, in, __current);
            }
            case 14:
            {
                return ___setOutputNodeAxis(this, in, __current);
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
        ex.reason = "type SenStore::MappingMatrix was not generated with stream support";
        throw ex;
    }

    public void
    __read(Ice.InputStream __inS, boolean __rid)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "type SenStore::MappingMatrix was not generated with stream support";
        throw ex;
    }
}
