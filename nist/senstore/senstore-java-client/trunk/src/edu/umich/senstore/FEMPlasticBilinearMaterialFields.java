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

public final class FEMPlasticBilinearMaterialFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mAlpha;

    public double mDensity;

    public double mE;

    public double mEPA;

    public double mET;

    public String mHardening;

    public long mMaterial;

    public double mNU;

    public double mTRef;

    public double mYield;

    public FEMPlasticBilinearMaterialFields()
    {
    }

    public FEMPlasticBilinearMaterialFields(long id, double mAlpha, double mDensity, double mE, double mEPA, double mET, String mHardening, long mMaterial, double mNU, double mTRef, double mYield)
    {
        this.id = id;
        this.mAlpha = mAlpha;
        this.mDensity = mDensity;
        this.mE = mE;
        this.mEPA = mEPA;
        this.mET = mET;
        this.mHardening = mHardening;
        this.mMaterial = mMaterial;
        this.mNU = mNU;
        this.mTRef = mTRef;
        this.mYield = mYield;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMPlasticBilinearMaterialFields _r = null;
        try
        {
            _r = (FEMPlasticBilinearMaterialFields)rhs;
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
            if(mAlpha != _r.mAlpha)
            {
                return false;
            }
            if(mDensity != _r.mDensity)
            {
                return false;
            }
            if(mE != _r.mE)
            {
                return false;
            }
            if(mEPA != _r.mEPA)
            {
                return false;
            }
            if(mET != _r.mET)
            {
                return false;
            }
            if(mHardening != _r.mHardening && mHardening != null && !mHardening.equals(_r.mHardening))
            {
                return false;
            }
            if(mMaterial != _r.mMaterial)
            {
                return false;
            }
            if(mNU != _r.mNU)
            {
                return false;
            }
            if(mTRef != _r.mTRef)
            {
                return false;
            }
            if(mYield != _r.mYield)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mAlpha);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mDensity);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mE);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mEPA);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mET);
        if(mHardening != null)
        {
            __h = 5 * __h + mHardening.hashCode();
        }
        __h = 5 * __h + (int)mMaterial;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mNU);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTRef);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mYield);
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
        __os.writeDouble(mAlpha);
        __os.writeDouble(mDensity);
        __os.writeDouble(mE);
        __os.writeDouble(mEPA);
        __os.writeDouble(mET);
        __os.writeString(mHardening);
        __os.writeLong(mMaterial);
        __os.writeDouble(mNU);
        __os.writeDouble(mTRef);
        __os.writeDouble(mYield);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mAlpha = __is.readDouble();
        mDensity = __is.readDouble();
        mE = __is.readDouble();
        mEPA = __is.readDouble();
        mET = __is.readDouble();
        mHardening = __is.readString();
        mMaterial = __is.readLong();
        mNU = __is.readDouble();
        mTRef = __is.readDouble();
        mYield = __is.readDouble();
    }
}
