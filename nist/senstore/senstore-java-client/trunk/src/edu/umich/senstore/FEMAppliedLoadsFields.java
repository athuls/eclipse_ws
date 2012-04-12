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

public final class FEMAppliedLoadsFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public int mAppliedLoadNmb;

    public double mArrivalTime;

    public short mLoadID;

    public String mLoadType;

    public String mSiteType;

    public int mTimeFunctionID;

    public FEMAppliedLoadsFields()
    {
    }

    public FEMAppliedLoadsFields(long id, int mAppliedLoadNmb, double mArrivalTime, short mLoadID, String mLoadType, String mSiteType, int mTimeFunctionID)
    {
        this.id = id;
        this.mAppliedLoadNmb = mAppliedLoadNmb;
        this.mArrivalTime = mArrivalTime;
        this.mLoadID = mLoadID;
        this.mLoadType = mLoadType;
        this.mSiteType = mSiteType;
        this.mTimeFunctionID = mTimeFunctionID;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMAppliedLoadsFields _r = null;
        try
        {
            _r = (FEMAppliedLoadsFields)rhs;
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
            if(mAppliedLoadNmb != _r.mAppliedLoadNmb)
            {
                return false;
            }
            if(mArrivalTime != _r.mArrivalTime)
            {
                return false;
            }
            if(mLoadID != _r.mLoadID)
            {
                return false;
            }
            if(mLoadType != _r.mLoadType && mLoadType != null && !mLoadType.equals(_r.mLoadType))
            {
                return false;
            }
            if(mSiteType != _r.mSiteType && mSiteType != null && !mSiteType.equals(_r.mSiteType))
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
        __h = 5 * __h + mAppliedLoadNmb;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mArrivalTime);
        __h = 5 * __h + (int)mLoadID;
        if(mLoadType != null)
        {
            __h = 5 * __h + mLoadType.hashCode();
        }
        if(mSiteType != null)
        {
            __h = 5 * __h + mSiteType.hashCode();
        }
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
        __os.writeInt(mAppliedLoadNmb);
        __os.writeDouble(mArrivalTime);
        __os.writeShort(mLoadID);
        __os.writeString(mLoadType);
        __os.writeString(mSiteType);
        __os.writeInt(mTimeFunctionID);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mAppliedLoadNmb = __is.readInt();
        mArrivalTime = __is.readDouble();
        mLoadID = __is.readShort();
        mLoadType = __is.readString();
        mSiteType = __is.readString();
        mTimeFunctionID = __is.readInt();
    }
}
