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

public final class FEMTimeFunctionDataFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mDataTime;

    public short mGMRecordID;

    public int mRecordNmb;

    public int mTimeFunctionID;

    public double mTimeValue;

    public FEMTimeFunctionDataFields()
    {
    }

    public FEMTimeFunctionDataFields(long id, double mDataTime, short mGMRecordID, int mRecordNmb, int mTimeFunctionID, double mTimeValue)
    {
        this.id = id;
        this.mDataTime = mDataTime;
        this.mGMRecordID = mGMRecordID;
        this.mRecordNmb = mRecordNmb;
        this.mTimeFunctionID = mTimeFunctionID;
        this.mTimeValue = mTimeValue;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMTimeFunctionDataFields _r = null;
        try
        {
            _r = (FEMTimeFunctionDataFields)rhs;
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
            if(mDataTime != _r.mDataTime)
            {
                return false;
            }
            if(mGMRecordID != _r.mGMRecordID)
            {
                return false;
            }
            if(mRecordNmb != _r.mRecordNmb)
            {
                return false;
            }
            if(mTimeFunctionID != _r.mTimeFunctionID)
            {
                return false;
            }
            if(mTimeValue != _r.mTimeValue)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mDataTime);
        __h = 5 * __h + (int)mGMRecordID;
        __h = 5 * __h + mRecordNmb;
        __h = 5 * __h + mTimeFunctionID;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTimeValue);
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
        __os.writeDouble(mDataTime);
        __os.writeShort(mGMRecordID);
        __os.writeInt(mRecordNmb);
        __os.writeInt(mTimeFunctionID);
        __os.writeDouble(mTimeValue);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDataTime = __is.readDouble();
        mGMRecordID = __is.readShort();
        mRecordNmb = __is.readInt();
        mTimeFunctionID = __is.readInt();
        mTimeValue = __is.readDouble();
    }
}
