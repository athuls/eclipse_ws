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

public final class FEMMTForceDataFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mForce;

    public int mMomentRID;

    public int mRecordNmb;

    public int mTwistMomentID;

    public FEMMTForceDataFields()
    {
    }

    public FEMMTForceDataFields(long id, double mForce, int mMomentRID, int mRecordNmb, int mTwistMomentID)
    {
        this.id = id;
        this.mForce = mForce;
        this.mMomentRID = mMomentRID;
        this.mRecordNmb = mRecordNmb;
        this.mTwistMomentID = mTwistMomentID;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMMTForceDataFields _r = null;
        try
        {
            _r = (FEMMTForceDataFields)rhs;
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
            if(mForce != _r.mForce)
            {
                return false;
            }
            if(mMomentRID != _r.mMomentRID)
            {
                return false;
            }
            if(mRecordNmb != _r.mRecordNmb)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mForce);
        __h = 5 * __h + mMomentRID;
        __h = 5 * __h + mRecordNmb;
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
        __os.writeDouble(mForce);
        __os.writeInt(mMomentRID);
        __os.writeInt(mRecordNmb);
        __os.writeInt(mTwistMomentID);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mForce = __is.readDouble();
        mMomentRID = __is.readInt();
        mRecordNmb = __is.readInt();
        mTwistMomentID = __is.readInt();
    }
}
