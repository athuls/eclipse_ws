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

public final class FEMBeamLoadFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mArrivalTime;

    public short mDeformDepend;

    public short mDirectFilter;

    public int mElementID;

    public short mFace;

    public long mGroup;

    public double mP1;

    public double mP2;

    public int mRecordNmb;

    public int mTimeFunctionID;

    public FEMBeamLoadFields()
    {
    }

    public FEMBeamLoadFields(long id, double mArrivalTime, short mDeformDepend, short mDirectFilter, int mElementID, short mFace, long mGroup, double mP1, double mP2, int mRecordNmb, int mTimeFunctionID)
    {
        this.id = id;
        this.mArrivalTime = mArrivalTime;
        this.mDeformDepend = mDeformDepend;
        this.mDirectFilter = mDirectFilter;
        this.mElementID = mElementID;
        this.mFace = mFace;
        this.mGroup = mGroup;
        this.mP1 = mP1;
        this.mP2 = mP2;
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
        FEMBeamLoadFields _r = null;
        try
        {
            _r = (FEMBeamLoadFields)rhs;
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
            if(mDeformDepend != _r.mDeformDepend)
            {
                return false;
            }
            if(mDirectFilter != _r.mDirectFilter)
            {
                return false;
            }
            if(mElementID != _r.mElementID)
            {
                return false;
            }
            if(mFace != _r.mFace)
            {
                return false;
            }
            if(mGroup != _r.mGroup)
            {
                return false;
            }
            if(mP1 != _r.mP1)
            {
                return false;
            }
            if(mP2 != _r.mP2)
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
        __h = 5 * __h + (int)mDeformDepend;
        __h = 5 * __h + (int)mDirectFilter;
        __h = 5 * __h + mElementID;
        __h = 5 * __h + (int)mFace;
        __h = 5 * __h + (int)mGroup;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mP1);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mP2);
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
        __os.writeShort(mDeformDepend);
        __os.writeShort(mDirectFilter);
        __os.writeInt(mElementID);
        __os.writeShort(mFace);
        __os.writeLong(mGroup);
        __os.writeDouble(mP1);
        __os.writeDouble(mP2);
        __os.writeInt(mRecordNmb);
        __os.writeInt(mTimeFunctionID);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mArrivalTime = __is.readDouble();
        mDeformDepend = __is.readShort();
        mDirectFilter = __is.readShort();
        mElementID = __is.readInt();
        mFace = __is.readShort();
        mGroup = __is.readLong();
        mP1 = __is.readDouble();
        mP2 = __is.readDouble();
        mRecordNmb = __is.readInt();
        mTimeFunctionID = __is.readInt();
    }
}
