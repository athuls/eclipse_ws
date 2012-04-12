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

public final class FEMNMTimeMassFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mMass;

    public int mPropertyID;

    public int mRecordNmb;

    public double mTimeValue;

    public FEMNMTimeMassFields()
    {
    }

    public FEMNMTimeMassFields(long id, double mMass, int mPropertyID, int mRecordNmb, double mTimeValue)
    {
        this.id = id;
        this.mMass = mMass;
        this.mPropertyID = mPropertyID;
        this.mRecordNmb = mRecordNmb;
        this.mTimeValue = mTimeValue;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMNMTimeMassFields _r = null;
        try
        {
            _r = (FEMNMTimeMassFields)rhs;
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
            if(mMass != _r.mMass)
            {
                return false;
            }
            if(mPropertyID != _r.mPropertyID)
            {
                return false;
            }
            if(mRecordNmb != _r.mRecordNmb)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mMass);
        __h = 5 * __h + mPropertyID;
        __h = 5 * __h + mRecordNmb;
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
        __os.writeDouble(mMass);
        __os.writeInt(mPropertyID);
        __os.writeInt(mRecordNmb);
        __os.writeDouble(mTimeValue);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mMass = __is.readDouble();
        mPropertyID = __is.readInt();
        mRecordNmb = __is.readInt();
        mTimeValue = __is.readDouble();
    }
}
