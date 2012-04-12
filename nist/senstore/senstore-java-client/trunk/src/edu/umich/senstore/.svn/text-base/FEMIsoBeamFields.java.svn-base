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

public final class FEMIsoBeamFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public long mAUX;

    public String mDescription;

    public int mElementID;

    public double mEpaxl;

    public double mEphoop;

    public long mGroup;

    public int mMaterialID;

    public long mN1;

    public long mN2;

    public long mN3;

    public long mN4;

    public short mNodeAmount;

    public int mRecordNmb;

    public String mSave;

    public int mSectionID;

    public double mTBirth;

    public double mTDeath;

    public FEMIsoBeamFields()
    {
    }

    public FEMIsoBeamFields(long id, long mAUX, String mDescription, int mElementID, double mEpaxl, double mEphoop, long mGroup, int mMaterialID, long mN1, long mN2, long mN3, long mN4, short mNodeAmount, int mRecordNmb, String mSave, int mSectionID, double mTBirth, double mTDeath)
    {
        this.id = id;
        this.mAUX = mAUX;
        this.mDescription = mDescription;
        this.mElementID = mElementID;
        this.mEpaxl = mEpaxl;
        this.mEphoop = mEphoop;
        this.mGroup = mGroup;
        this.mMaterialID = mMaterialID;
        this.mN1 = mN1;
        this.mN2 = mN2;
        this.mN3 = mN3;
        this.mN4 = mN4;
        this.mNodeAmount = mNodeAmount;
        this.mRecordNmb = mRecordNmb;
        this.mSave = mSave;
        this.mSectionID = mSectionID;
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
        FEMIsoBeamFields _r = null;
        try
        {
            _r = (FEMIsoBeamFields)rhs;
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
            if(mAUX != _r.mAUX)
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
            if(mEpaxl != _r.mEpaxl)
            {
                return false;
            }
            if(mEphoop != _r.mEphoop)
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
            if(mSectionID != _r.mSectionID)
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
        __h = 5 * __h + (int)mAUX;
        if(mDescription != null)
        {
            __h = 5 * __h + mDescription.hashCode();
        }
        __h = 5 * __h + mElementID;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mEpaxl);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mEphoop);
        __h = 5 * __h + (int)mGroup;
        __h = 5 * __h + mMaterialID;
        __h = 5 * __h + (int)mN1;
        __h = 5 * __h + (int)mN2;
        __h = 5 * __h + (int)mN3;
        __h = 5 * __h + (int)mN4;
        __h = 5 * __h + (int)mNodeAmount;
        __h = 5 * __h + mRecordNmb;
        if(mSave != null)
        {
            __h = 5 * __h + mSave.hashCode();
        }
        __h = 5 * __h + mSectionID;
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
        __os.writeLong(mAUX);
        __os.writeString(mDescription);
        __os.writeInt(mElementID);
        __os.writeDouble(mEpaxl);
        __os.writeDouble(mEphoop);
        __os.writeLong(mGroup);
        __os.writeInt(mMaterialID);
        __os.writeLong(mN1);
        __os.writeLong(mN2);
        __os.writeLong(mN3);
        __os.writeLong(mN4);
        __os.writeShort(mNodeAmount);
        __os.writeInt(mRecordNmb);
        __os.writeString(mSave);
        __os.writeInt(mSectionID);
        __os.writeDouble(mTBirth);
        __os.writeDouble(mTDeath);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mAUX = __is.readLong();
        mDescription = __is.readString();
        mElementID = __is.readInt();
        mEpaxl = __is.readDouble();
        mEphoop = __is.readDouble();
        mGroup = __is.readLong();
        mMaterialID = __is.readInt();
        mN1 = __is.readLong();
        mN2 = __is.readLong();
        mN3 = __is.readLong();
        mN4 = __is.readLong();
        mNodeAmount = __is.readShort();
        mRecordNmb = __is.readInt();
        mSave = __is.readString();
        mSectionID = __is.readInt();
        mTBirth = __is.readDouble();
        mTDeath = __is.readDouble();
    }
}
