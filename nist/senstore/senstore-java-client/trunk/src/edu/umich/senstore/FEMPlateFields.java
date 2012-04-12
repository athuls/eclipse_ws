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

public final class FEMPlateFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mDescription;

    public int mElementID;

    public double mFlex11;

    public double mFlex12;

    public double mFlex22;

    public long mGroup;

    public int mMaterialID;

    public double mMeps11;

    public double mMeps12;

    public double mMeps22;

    public long mN1;

    public long mN2;

    public long mN3;

    public int mRecordNmb;

    public String mSave;

    public double mTBirth;

    public double mTDeath;

    public double mThick;

    public FEMPlateFields()
    {
    }

    public FEMPlateFields(long id, String mDescription, int mElementID, double mFlex11, double mFlex12, double mFlex22, long mGroup, int mMaterialID, double mMeps11, double mMeps12, double mMeps22, long mN1, long mN2, long mN3, int mRecordNmb, String mSave, double mTBirth, double mTDeath, double mThick)
    {
        this.id = id;
        this.mDescription = mDescription;
        this.mElementID = mElementID;
        this.mFlex11 = mFlex11;
        this.mFlex12 = mFlex12;
        this.mFlex22 = mFlex22;
        this.mGroup = mGroup;
        this.mMaterialID = mMaterialID;
        this.mMeps11 = mMeps11;
        this.mMeps12 = mMeps12;
        this.mMeps22 = mMeps22;
        this.mN1 = mN1;
        this.mN2 = mN2;
        this.mN3 = mN3;
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
        FEMPlateFields _r = null;
        try
        {
            _r = (FEMPlateFields)rhs;
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
            if(mDescription != _r.mDescription && mDescription != null && !mDescription.equals(_r.mDescription))
            {
                return false;
            }
            if(mElementID != _r.mElementID)
            {
                return false;
            }
            if(mFlex11 != _r.mFlex11)
            {
                return false;
            }
            if(mFlex12 != _r.mFlex12)
            {
                return false;
            }
            if(mFlex22 != _r.mFlex22)
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
            if(mMeps11 != _r.mMeps11)
            {
                return false;
            }
            if(mMeps12 != _r.mMeps12)
            {
                return false;
            }
            if(mMeps22 != _r.mMeps22)
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
        if(mDescription != null)
        {
            __h = 5 * __h + mDescription.hashCode();
        }
        __h = 5 * __h + mElementID;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mFlex11);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mFlex12);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mFlex22);
        __h = 5 * __h + (int)mGroup;
        __h = 5 * __h + mMaterialID;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mMeps11);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mMeps12);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mMeps22);
        __h = 5 * __h + (int)mN1;
        __h = 5 * __h + (int)mN2;
        __h = 5 * __h + (int)mN3;
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
        __os.writeString(mDescription);
        __os.writeInt(mElementID);
        __os.writeDouble(mFlex11);
        __os.writeDouble(mFlex12);
        __os.writeDouble(mFlex22);
        __os.writeLong(mGroup);
        __os.writeInt(mMaterialID);
        __os.writeDouble(mMeps11);
        __os.writeDouble(mMeps12);
        __os.writeDouble(mMeps22);
        __os.writeLong(mN1);
        __os.writeLong(mN2);
        __os.writeLong(mN3);
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
        mDescription = __is.readString();
        mElementID = __is.readInt();
        mFlex11 = __is.readDouble();
        mFlex12 = __is.readDouble();
        mFlex22 = __is.readDouble();
        mGroup = __is.readLong();
        mMaterialID = __is.readInt();
        mMeps11 = __is.readDouble();
        mMeps12 = __is.readDouble();
        mMeps22 = __is.readDouble();
        mN1 = __is.readLong();
        mN2 = __is.readLong();
        mN3 = __is.readLong();
        mRecordNmb = __is.readInt();
        mSave = __is.readString();
        mTBirth = __is.readDouble();
        mTDeath = __is.readDouble();
        mThick = __is.readDouble();
    }
}
