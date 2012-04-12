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

public final class FEMSpringFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mAX;

    public double mAY;

    public double mAZ;

    public String mDescription;

    public int mElementID;

    public long mGroup;

    public short mID1;

    public short mID2;

    public long mN1;

    public long mN2;

    public int mPropertySet;

    public int mRecordNmb;

    public String mSave;

    public double mTBirth;

    public double mTDeath;

    public FEMSpringFields()
    {
    }

    public FEMSpringFields(long id, double mAX, double mAY, double mAZ, String mDescription, int mElementID, long mGroup, short mID1, short mID2, long mN1, long mN2, int mPropertySet, int mRecordNmb, String mSave, double mTBirth, double mTDeath)
    {
        this.id = id;
        this.mAX = mAX;
        this.mAY = mAY;
        this.mAZ = mAZ;
        this.mDescription = mDescription;
        this.mElementID = mElementID;
        this.mGroup = mGroup;
        this.mID1 = mID1;
        this.mID2 = mID2;
        this.mN1 = mN1;
        this.mN2 = mN2;
        this.mPropertySet = mPropertySet;
        this.mRecordNmb = mRecordNmb;
        this.mSave = mSave;
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
        FEMSpringFields _r = null;
        try
        {
            _r = (FEMSpringFields)rhs;
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
            if(mAX != _r.mAX)
            {
                return false;
            }
            if(mAY != _r.mAY)
            {
                return false;
            }
            if(mAZ != _r.mAZ)
            {
                return false;
            }
            if(mDescription != _r.mDescription && mDescription != null && !mDescription.equals(_r.mDescription))
            {
                return false;
            }
            if(mElementID != _r.mElementID)
            {
                return false;
            }
            if(mGroup != _r.mGroup)
            {
                return false;
            }
            if(mID1 != _r.mID1)
            {
                return false;
            }
            if(mID2 != _r.mID2)
            {
                return false;
            }
            if(mN1 != _r.mN1)
            {
                return false;
            }
            if(mN2 != _r.mN2)
            {
                return false;
            }
            if(mPropertySet != _r.mPropertySet)
            {
                return false;
            }
            if(mRecordNmb != _r.mRecordNmb)
            {
                return false;
            }
            if(mSave != _r.mSave && mSave != null && !mSave.equals(_r.mSave))
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mAX);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mAY);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mAZ);
        if(mDescription != null)
        {
            __h = 5 * __h + mDescription.hashCode();
        }
        __h = 5 * __h + mElementID;
        __h = 5 * __h + (int)mGroup;
        __h = 5 * __h + (int)mID1;
        __h = 5 * __h + (int)mID2;
        __h = 5 * __h + (int)mN1;
        __h = 5 * __h + (int)mN2;
        __h = 5 * __h + mPropertySet;
        __h = 5 * __h + mRecordNmb;
        if(mSave != null)
        {
            __h = 5 * __h + mSave.hashCode();
        }
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
        __os.writeDouble(mAX);
        __os.writeDouble(mAY);
        __os.writeDouble(mAZ);
        __os.writeString(mDescription);
        __os.writeInt(mElementID);
        __os.writeLong(mGroup);
        __os.writeShort(mID1);
        __os.writeShort(mID2);
        __os.writeLong(mN1);
        __os.writeLong(mN2);
        __os.writeInt(mPropertySet);
        __os.writeInt(mRecordNmb);
        __os.writeString(mSave);
        __os.writeDouble(mTBirth);
        __os.writeDouble(mTDeath);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mAX = __is.readDouble();
        mAY = __is.readDouble();
        mAZ = __is.readDouble();
        mDescription = __is.readString();
        mElementID = __is.readInt();
        mGroup = __is.readLong();
        mID1 = __is.readShort();
        mID2 = __is.readShort();
        mN1 = __is.readLong();
        mN2 = __is.readLong();
        mPropertySet = __is.readInt();
        mRecordNmb = __is.readInt();
        mSave = __is.readString();
        mTBirth = __is.readDouble();
        mTDeath = __is.readDouble();
    }
}
