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

public final class FEMTrussFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mDescription;

    public int mElementID;

    public double mEpsin;

    public double mGapwidth;

    public long mGroup;

    public long mMaterial;

    public long mN1;

    public long mN2;

    public int mRecordNmb;

    public String mSave;

    public double mSectionArea;

    public double mTBirth;

    public double mTDeath;

    public FEMTrussFields()
    {
    }

    public FEMTrussFields(long id, String mDescription, int mElementID, double mEpsin, double mGapwidth, long mGroup, long mMaterial, long mN1, long mN2, int mRecordNmb, String mSave, double mSectionArea, double mTBirth, double mTDeath)
    {
        this.id = id;
        this.mDescription = mDescription;
        this.mElementID = mElementID;
        this.mEpsin = mEpsin;
        this.mGapwidth = mGapwidth;
        this.mGroup = mGroup;
        this.mMaterial = mMaterial;
        this.mN1 = mN1;
        this.mN2 = mN2;
        this.mRecordNmb = mRecordNmb;
        this.mSave = mSave;
        this.mSectionArea = mSectionArea;
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
        FEMTrussFields _r = null;
        try
        {
            _r = (FEMTrussFields)rhs;
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
            if(mEpsin != _r.mEpsin)
            {
                return false;
            }
            if(mGapwidth != _r.mGapwidth)
            {
                return false;
            }
            if(mGroup != _r.mGroup)
            {
                return false;
            }
            if(mMaterial != _r.mMaterial)
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
            if(mRecordNmb != _r.mRecordNmb)
            {
                return false;
            }
            if(mSave != _r.mSave && mSave != null && !mSave.equals(_r.mSave))
            {
                return false;
            }
            if(mSectionArea != _r.mSectionArea)
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
        if(mDescription != null)
        {
            __h = 5 * __h + mDescription.hashCode();
        }
        __h = 5 * __h + mElementID;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mEpsin);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mGapwidth);
        __h = 5 * __h + (int)mGroup;
        __h = 5 * __h + (int)mMaterial;
        __h = 5 * __h + (int)mN1;
        __h = 5 * __h + (int)mN2;
        __h = 5 * __h + mRecordNmb;
        if(mSave != null)
        {
            __h = 5 * __h + mSave.hashCode();
        }
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mSectionArea);
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
        __os.writeString(mDescription);
        __os.writeInt(mElementID);
        __os.writeDouble(mEpsin);
        __os.writeDouble(mGapwidth);
        __os.writeLong(mGroup);
        __os.writeLong(mMaterial);
        __os.writeLong(mN1);
        __os.writeLong(mN2);
        __os.writeInt(mRecordNmb);
        __os.writeString(mSave);
        __os.writeDouble(mSectionArea);
        __os.writeDouble(mTBirth);
        __os.writeDouble(mTDeath);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDescription = __is.readString();
        mElementID = __is.readInt();
        mEpsin = __is.readDouble();
        mGapwidth = __is.readDouble();
        mGroup = __is.readLong();
        mMaterial = __is.readLong();
        mN1 = __is.readLong();
        mN2 = __is.readLong();
        mRecordNmb = __is.readInt();
        mSave = __is.readString();
        mSectionArea = __is.readDouble();
        mTBirth = __is.readDouble();
        mTDeath = __is.readDouble();
    }
}
