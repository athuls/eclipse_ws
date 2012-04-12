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

public final class FEMTrussGroupFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mDisplacement;

    public String mGAPS;

    public long mGroup;

    public String mIniStrain;

    public long mMaterial;

    public double mSectionArea;

    public FEMTrussGroupFields()
    {
    }

    public FEMTrussGroupFields(long id, String mDisplacement, String mGAPS, long mGroup, String mIniStrain, long mMaterial, double mSectionArea)
    {
        this.id = id;
        this.mDisplacement = mDisplacement;
        this.mGAPS = mGAPS;
        this.mGroup = mGroup;
        this.mIniStrain = mIniStrain;
        this.mMaterial = mMaterial;
        this.mSectionArea = mSectionArea;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMTrussGroupFields _r = null;
        try
        {
            _r = (FEMTrussGroupFields)rhs;
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
            if(mDisplacement != _r.mDisplacement && mDisplacement != null && !mDisplacement.equals(_r.mDisplacement))
            {
                return false;
            }
            if(mGAPS != _r.mGAPS && mGAPS != null && !mGAPS.equals(_r.mGAPS))
            {
                return false;
            }
            if(mGroup != _r.mGroup)
            {
                return false;
            }
            if(mIniStrain != _r.mIniStrain && mIniStrain != null && !mIniStrain.equals(_r.mIniStrain))
            {
                return false;
            }
            if(mMaterial != _r.mMaterial)
            {
                return false;
            }
            if(mSectionArea != _r.mSectionArea)
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
        if(mDisplacement != null)
        {
            __h = 5 * __h + mDisplacement.hashCode();
        }
        if(mGAPS != null)
        {
            __h = 5 * __h + mGAPS.hashCode();
        }
        __h = 5 * __h + (int)mGroup;
        if(mIniStrain != null)
        {
            __h = 5 * __h + mIniStrain.hashCode();
        }
        __h = 5 * __h + (int)mMaterial;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mSectionArea);
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
        __os.writeString(mDisplacement);
        __os.writeString(mGAPS);
        __os.writeLong(mGroup);
        __os.writeString(mIniStrain);
        __os.writeLong(mMaterial);
        __os.writeDouble(mSectionArea);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDisplacement = __is.readString();
        mGAPS = __is.readString();
        mGroup = __is.readLong();
        mIniStrain = __is.readString();
        mMaterial = __is.readLong();
        mSectionArea = __is.readDouble();
    }
}
