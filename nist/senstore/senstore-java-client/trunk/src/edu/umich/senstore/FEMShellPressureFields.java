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

public final class FEMShellPressureFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mArrivalTime;

    public short mDeformDepend;

    public String mDescription;

    public short mDirectFilter;

    public int mElementID;

    public short mFace;

    public long mGroup;

    public int mNodaux;

    public double mP1;

    public double mP2;

    public double mP3;

    public double mP4;

    public int mRecordNmb;

    public int mTimeFunctionID;

    public FEMShellPressureFields()
    {
    }

    public FEMShellPressureFields(long id, double mArrivalTime, short mDeformDepend, String mDescription, short mDirectFilter, int mElementID, short mFace, long mGroup, int mNodaux, double mP1, double mP2, double mP3, double mP4, int mRecordNmb, int mTimeFunctionID)
    {
        this.id = id;
        this.mArrivalTime = mArrivalTime;
        this.mDeformDepend = mDeformDepend;
        this.mDescription = mDescription;
        this.mDirectFilter = mDirectFilter;
        this.mElementID = mElementID;
        this.mFace = mFace;
        this.mGroup = mGroup;
        this.mNodaux = mNodaux;
        this.mP1 = mP1;
        this.mP2 = mP2;
        this.mP3 = mP3;
        this.mP4 = mP4;
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
        FEMShellPressureFields _r = null;
        try
        {
            _r = (FEMShellPressureFields)rhs;
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
            if(mDescription != _r.mDescription && mDescription != null && !mDescription.equals(_r.mDescription))
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
            if(mNodaux != _r.mNodaux)
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
            if(mP3 != _r.mP3)
            {
                return false;
            }
            if(mP4 != _r.mP4)
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
        if(mDescription != null)
        {
            __h = 5 * __h + mDescription.hashCode();
        }
        __h = 5 * __h + (int)mDirectFilter;
        __h = 5 * __h + mElementID;
        __h = 5 * __h + (int)mFace;
        __h = 5 * __h + (int)mGroup;
        __h = 5 * __h + mNodaux;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mP1);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mP2);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mP3);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mP4);
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
        __os.writeString(mDescription);
        __os.writeShort(mDirectFilter);
        __os.writeInt(mElementID);
        __os.writeShort(mFace);
        __os.writeLong(mGroup);
        __os.writeInt(mNodaux);
        __os.writeDouble(mP1);
        __os.writeDouble(mP2);
        __os.writeDouble(mP3);
        __os.writeDouble(mP4);
        __os.writeInt(mRecordNmb);
        __os.writeInt(mTimeFunctionID);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mArrivalTime = __is.readDouble();
        mDeformDepend = __is.readShort();
        mDescription = __is.readString();
        mDirectFilter = __is.readShort();
        mElementID = __is.readInt();
        mFace = __is.readShort();
        mGroup = __is.readLong();
        mNodaux = __is.readInt();
        mP1 = __is.readDouble();
        mP2 = __is.readDouble();
        mP3 = __is.readDouble();
        mP4 = __is.readDouble();
        mRecordNmb = __is.readInt();
        mTimeFunctionID = __is.readInt();
    }
}
