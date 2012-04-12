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

public final class FEMAppliedTemperatureFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mArrivalTime;

    public double mFactor;

    public long mNode;

    public int mRecordNmbr;

    public int mTimeFunctionID;

    public FEMAppliedTemperatureFields()
    {
    }

    public FEMAppliedTemperatureFields(long id, double mArrivalTime, double mFactor, long mNode, int mRecordNmbr, int mTimeFunctionID)
    {
        this.id = id;
        this.mArrivalTime = mArrivalTime;
        this.mFactor = mFactor;
        this.mNode = mNode;
        this.mRecordNmbr = mRecordNmbr;
        this.mTimeFunctionID = mTimeFunctionID;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMAppliedTemperatureFields _r = null;
        try
        {
            _r = (FEMAppliedTemperatureFields)rhs;
        }
        catch(ClassCastException ex)
        {
        }

        if(_r != null)
        {
            if(id != _r.id)
            {
                return false;
            }
            if(mArrivalTime != _r.mArrivalTime)
            {
                return false;
            }
            if(mFactor != _r.mFactor)
            {
                return false;
            }
            if(mNode != _r.mNode)
            {
                return false;
            }
            if(mRecordNmbr != _r.mRecordNmbr)
            {
                return false;
            }
            if(mTimeFunctionID != _r.mTimeFunctionID)
            {
                return false;
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 0;
        __h = 5 * __h + (int)id;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mArrivalTime);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mFactor);
        __h = 5 * __h + (int)mNode;
        __h = 5 * __h + mRecordNmbr;
        __h = 5 * __h + mTimeFunctionID;
        return __h;
    }

    public java.lang.Object
    clone()
    {
        java.lang.Object o = null;
        try
        {
            o = super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return o;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeLong(id);
        __os.writeDouble(mArrivalTime);
        __os.writeDouble(mFactor);
        __os.writeLong(mNode);
        __os.writeInt(mRecordNmbr);
        __os.writeInt(mTimeFunctionID);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mArrivalTime = __is.readDouble();
        mFactor = __is.readDouble();
        mNode = __is.readLong();
        mRecordNmbr = __is.readInt();
        mTimeFunctionID = __is.readInt();
    }
}
