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

public final class FEMTwoDSolidFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mBet;

    public String mDescription;

    public int mElementID;

    public long mGroup;

    public int mMaterialID;

    public long mN1;

    public long mN2;

    public long mN3;

    public long mN4;

    public long mN5;

    public long mN6;

    public long mN7;

    public long mN8;

    public long mN9;

    public short mNodeAmount;

    public int mRecordNmb;

    public String mSave;

    public double mTBirth;

    public double mTDeath;

    public double mThick;

    public FEMTwoDSolidFields()
    {
    }

    public FEMTwoDSolidFields(long id, double mBet, String mDescription, int mElementID, long mGroup, int mMaterialID, long mN1, long mN2, long mN3, long mN4, long mN5, long mN6, long mN7, long mN8, long mN9, short mNodeAmount, int mRecordNmb, String mSave, double mTBirth, double mTDeath, double mThick)
    {
        this.id = id;
        this.mBet = mBet;
        this.mDescription = mDescription;
        this.mElementID = mElementID;
        this.mGroup = mGroup;
        this.mMaterialID = mMaterialID;
        this.mN1 = mN1;
        this.mN2 = mN2;
        this.mN3 = mN3;
        this.mN4 = mN4;
        this.mN5 = mN5;
        this.mN6 = mN6;
        this.mN7 = mN7;
        this.mN8 = mN8;
        this.mN9 = mN9;
        this.mNodeAmount = mNodeAmount;
        this.mRecordNmb = mRecordNmb;
        this.mSave = mSave;
        this.mTBirth = mTBirth;
        this.mTDeath = mTDeath;
        this.mThick = mThick;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMTwoDSolidFields _r = null;
        try
        {
            _r = (FEMTwoDSolidFields)rhs;
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
            if(mBet != _r.mBet)
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
            if(mMaterialID != _r.mMaterialID)
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
            if(mN3 != _r.mN3)
            {
                return false;
            }
            if(mN4 != _r.mN4)
            {
                return false;
            }
            if(mN5 != _r.mN5)
            {
                return false;
            }
            if(mN6 != _r.mN6)
            {
                return false;
            }
            if(mN7 != _r.mN7)
            {
                return false;
            }
            if(mN8 != _r.mN8)
            {
                return false;
            }
            if(mN9 != _r.mN9)
            {
                return false;
            }
            if(mNodeAmount != _r.mNodeAmount)
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
            if(mThick != _r.mThick)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mBet);
        if(mDescription != null)
        {
            __h = 5 * __h + mDescription.hashCode();
        }
        __h = 5 * __h + mElementID;
        __h = 5 * __h + (int)mGroup;
        __h = 5 * __h + mMaterialID;
        __h = 5 * __h + (int)mN1;
        __h = 5 * __h + (int)mN2;
        __h = 5 * __h + (int)mN3;
        __h = 5 * __h + (int)mN4;
        __h = 5 * __h + (int)mN5;
        __h = 5 * __h + (int)mN6;
        __h = 5 * __h + (int)mN7;
        __h = 5 * __h + (int)mN8;
        __h = 5 * __h + (int)mN9;
        __h = 5 * __h + (int)mNodeAmount;
        __h = 5 * __h + mRecordNmb;
        if(mSave != null)
        {
            __h = 5 * __h + mSave.hashCode();
        }
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTBirth);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTDeath);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mThick);
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
        __os.writeDouble(mBet);
        __os.writeString(mDescription);
        __os.writeInt(mElementID);
        __os.writeLong(mGroup);
        __os.writeInt(mMaterialID);
        __os.writeLong(mN1);
        __os.writeLong(mN2);
        __os.writeLong(mN3);
        __os.writeLong(mN4);
        __os.writeLong(mN5);
        __os.writeLong(mN6);
        __os.writeLong(mN7);
        __os.writeLong(mN8);
        __os.writeLong(mN9);
        __os.writeShort(mNodeAmount);
        __os.writeInt(mRecordNmb);
        __os.writeString(mSave);
        __os.writeDouble(mTBirth);
        __os.writeDouble(mTDeath);
        __os.writeDouble(mThick);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mBet = __is.readDouble();
        mDescription = __is.readString();
        mElementID = __is.readInt();
        mGroup = __is.readLong();
        mMaterialID = __is.readInt();
        mN1 = __is.readLong();
        mN2 = __is.readLong();
        mN3 = __is.readLong();
        mN4 = __is.readLong();
        mN5 = __is.readLong();
        mN6 = __is.readLong();
        mN7 = __is.readLong();
        mN8 = __is.readLong();
        mN9 = __is.readLong();
        mNodeAmount = __is.readShort();
        mRecordNmb = __is.readInt();
        mSave = __is.readString();
        mTBirth = __is.readDouble();
        mTDeath = __is.readDouble();
        mThick = __is.readDouble();
    }
}
