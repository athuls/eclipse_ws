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

public final class FEMContactPairsFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public int mContactorSurf;

    public int mContGroupID;

    public int mContPair;

    public double mFContactor;

    public double mFriction;

    public double mFTarget;

    public double mHeatTransf;

    public int mRecordNmb;

    public int mTargetSurf;

    public double mTBirth;

    public double mTDeath;

    public FEMContactPairsFields()
    {
    }

    public FEMContactPairsFields(long id, int mContactorSurf, int mContGroupID, int mContPair, double mFContactor, double mFriction, double mFTarget, double mHeatTransf, int mRecordNmb, int mTargetSurf, double mTBirth, double mTDeath)
    {
        this.id = id;
        this.mContactorSurf = mContactorSurf;
        this.mContGroupID = mContGroupID;
        this.mContPair = mContPair;
        this.mFContactor = mFContactor;
        this.mFriction = mFriction;
        this.mFTarget = mFTarget;
        this.mHeatTransf = mHeatTransf;
        this.mRecordNmb = mRecordNmb;
        this.mTargetSurf = mTargetSurf;
        this.mTBirth = mTBirth;
        this.mTDeath = mTDeath;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMContactPairsFields _r = null;
        try
        {
            _r = (FEMContactPairsFields)rhs;
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
            if(mContactorSurf != _r.mContactorSurf)
            {
                return false;
            }
            if(mContGroupID != _r.mContGroupID)
            {
                return false;
            }
            if(mContPair != _r.mContPair)
            {
                return false;
            }
            if(mFContactor != _r.mFContactor)
            {
                return false;
            }
            if(mFriction != _r.mFriction)
            {
                return false;
            }
            if(mFTarget != _r.mFTarget)
            {
                return false;
            }
            if(mHeatTransf != _r.mHeatTransf)
            {
                return false;
            }
            if(mRecordNmb != _r.mRecordNmb)
            {
                return false;
            }
            if(mTargetSurf != _r.mTargetSurf)
            {
                return false;
            }
            if(mTBirth != _r.mTBirth)
            {
                return false;
            }
            if(mTDeath != _r.mTDeath)
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
        __h = 5 * __h + mContactorSurf;
        __h = 5 * __h + mContGroupID;
        __h = 5 * __h + mContPair;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mFContactor);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mFriction);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mFTarget);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mHeatTransf);
        __h = 5 * __h + mRecordNmb;
        __h = 5 * __h + mTargetSurf;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTBirth);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTDeath);
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
        __os.writeInt(mContactorSurf);
        __os.writeInt(mContGroupID);
        __os.writeInt(mContPair);
        __os.writeDouble(mFContactor);
        __os.writeDouble(mFriction);
        __os.writeDouble(mFTarget);
        __os.writeDouble(mHeatTransf);
        __os.writeInt(mRecordNmb);
        __os.writeInt(mTargetSurf);
        __os.writeDouble(mTBirth);
        __os.writeDouble(mTDeath);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mContactorSurf = __is.readInt();
        mContGroupID = __is.readInt();
        mContPair = __is.readInt();
        mFContactor = __is.readDouble();
        mFriction = __is.readDouble();
        mFTarget = __is.readDouble();
        mHeatTransf = __is.readDouble();
        mRecordNmb = __is.readInt();
        mTargetSurf = __is.readInt();
        mTBirth = __is.readDouble();
        mTDeath = __is.readDouble();
    }
}
