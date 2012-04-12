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

public final class FEMTwistMomentDataFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mMoment;

    public int mRecordNmb;

    public double mTwist;

    public int mTwistMomentID;

    public FEMTwistMomentDataFields()
    {
    }

    public FEMTwistMomentDataFields(long id, double mMoment, int mRecordNmb, double mTwist, int mTwistMomentID)
    {
        this.id = id;
        this.mMoment = mMoment;
        this.mRecordNmb = mRecordNmb;
        this.mTwist = mTwist;
        this.mTwistMomentID = mTwistMomentID;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMTwistMomentDataFields _r = null;
        try
        {
            _r = (FEMTwistMomentDataFields)rhs;
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
            if(mMoment != _r.mMoment)
            {
                return false;
            }
            if(mRecordNmb != _r.mRecordNmb)
            {
                return false;
            }
            if(mTwist != _r.mTwist)
            {
                return false;
            }
            if(mTwistMomentID != _r.mTwistMomentID)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mMoment);
        __h = 5 * __h + mRecordNmb;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTwist);
        __h = 5 * __h + mTwistMomentID;
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
        __os.writeDouble(mMoment);
        __os.writeInt(mRecordNmb);
        __os.writeDouble(mTwist);
        __os.writeInt(mTwistMomentID);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mMoment = __is.readDouble();
        mRecordNmb = __is.readInt();
        mTwist = __is.readDouble();
        mTwistMomentID = __is.readInt();
    }
}
