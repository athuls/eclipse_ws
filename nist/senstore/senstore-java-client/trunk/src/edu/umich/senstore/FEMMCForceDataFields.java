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

public final class FEMMCForceDataFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public int mCurvMomentID;

    public double mForce;

    public int mMomentSTID;

    public int mRecordNmb;

    public FEMMCForceDataFields()
    {
    }

    public FEMMCForceDataFields(long id, int mCurvMomentID, double mForce, int mMomentSTID, int mRecordNmb)
    {
        this.id = id;
        this.mCurvMomentID = mCurvMomentID;
        this.mForce = mForce;
        this.mMomentSTID = mMomentSTID;
        this.mRecordNmb = mRecordNmb;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMMCForceDataFields _r = null;
        try
        {
            _r = (FEMMCForceDataFields)rhs;
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
            if(mCurvMomentID != _r.mCurvMomentID)
            {
                return false;
            }
            if(mForce != _r.mForce)
            {
                return false;
            }
            if(mMomentSTID != _r.mMomentSTID)
            {
                return false;
            }
            if(mRecordNmb != _r.mRecordNmb)
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
        __h = 5 * __h + mCurvMomentID;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mForce);
        __h = 5 * __h + mMomentSTID;
        __h = 5 * __h + mRecordNmb;
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
        __os.writeInt(mCurvMomentID);
        __os.writeDouble(mForce);
        __os.writeInt(mMomentSTID);
        __os.writeInt(mRecordNmb);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mCurvMomentID = __is.readInt();
        mForce = __is.readDouble();
        mMomentSTID = __is.readInt();
        mRecordNmb = __is.readInt();
    }
}
