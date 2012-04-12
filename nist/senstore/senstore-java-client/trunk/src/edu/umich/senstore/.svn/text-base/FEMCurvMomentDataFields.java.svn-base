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

public final class FEMCurvMomentDataFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mCurvature;

    public int mCurvMomentID;

    public double mMoment;

    public int mRecordNmb;

    public FEMCurvMomentDataFields()
    {
    }

    public FEMCurvMomentDataFields(long id, double mCurvature, int mCurvMomentID, double mMoment, int mRecordNmb)
    {
        this.id = id;
        this.mCurvature = mCurvature;
        this.mCurvMomentID = mCurvMomentID;
        this.mMoment = mMoment;
        this.mRecordNmb = mRecordNmb;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMCurvMomentDataFields _r = null;
        try
        {
            _r = (FEMCurvMomentDataFields)rhs;
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
            if(mCurvature != _r.mCurvature)
            {
                return false;
            }
            if(mCurvMomentID != _r.mCurvMomentID)
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

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 0;
        __h = 5 * __h + (int)id;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mCurvature);
        __h = 5 * __h + mCurvMomentID;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mMoment);
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
        __os.writeDouble(mCurvature);
        __os.writeInt(mCurvMomentID);
        __os.writeDouble(mMoment);
        __os.writeInt(mRecordNmb);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mCurvature = __is.readDouble();
        mCurvMomentID = __is.readInt();
        mMoment = __is.readDouble();
        mRecordNmb = __is.readInt();
    }
}
