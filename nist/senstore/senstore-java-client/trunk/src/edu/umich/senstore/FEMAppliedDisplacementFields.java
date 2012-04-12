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

public final class FEMAppliedDisplacementFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mArrivalTime;

    public String mDescription;

    public short mDirection;

    public double mFactor;

    public long mNode;

    public int mRecordNmb;

    public int mTimeFunctionID;

    public FEMAppliedDisplacementFields()
    {
    }

    public FEMAppliedDisplacementFields(long id, double mArrivalTime, String mDescription, short mDirection, double mFactor, long mNode, int mRecordNmb, int mTimeFunctionID)
    {
        this.id = id;
        this.mArrivalTime = mArrivalTime;
        this.mDescription = mDescription;
        this.mDirection = mDirection;
        this.mFactor = mFactor;
        this.mNode = mNode;
        this.mRecordNmb = mRecordNmb;
        this.mTimeFunctionID = mTimeFunctionID;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMAppliedDisplacementFields _r = null;
        try
        {
            _r = (FEMAppliedDisplacementFields)rhs;
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
            if(mDescription != _r.mDescription && mDescription != null && !mDescription.equals(_r.mDescription))
            {
                return false;
            }
            if(mDirection != _r.mDirection)
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
            if(mRecordNmb != _r.mRecordNmb)
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
        if(mDescription != null)
        {
            __h = 5 * __h + mDescription.hashCode();
        }
        __h = 5 * __h + (int)mDirection;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mFactor);
        __h = 5 * __h + (int)mNode;
        __h = 5 * __h + mRecordNmb;
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
        __os.writeString(mDescription);
        __os.writeShort(mDirection);
        __os.writeDouble(mFactor);
        __os.writeLong(mNode);
        __os.writeInt(mRecordNmb);
        __os.writeInt(mTimeFunctionID);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mArrivalTime = __is.readDouble();
        mDescription = __is.readString();
        mDirection = __is.readShort();
        mFactor = __is.readDouble();
        mNode = __is.readLong();
        mRecordNmb = __is.readInt();
        mTimeFunctionID = __is.readInt();
    }
}