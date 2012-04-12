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

public final class FEMElasticMaterialFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mAlpha;

    public double mDensity;

    public double mE;

    public long mMaterial;

    public double mNU;

    public FEMElasticMaterialFields()
    {
    }

    public FEMElasticMaterialFields(long id, double mAlpha, double mDensity, double mE, long mMaterial, double mNU)
    {
        this.id = id;
        this.mAlpha = mAlpha;
        this.mDensity = mDensity;
        this.mE = mE;
        this.mMaterial = mMaterial;
        this.mNU = mNU;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMElasticMaterialFields _r = null;
        try
        {
            _r = (FEMElasticMaterialFields)rhs;
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
            if(mMaterial != _r.mMaterial)
            {
                return false;
            }
            if(mNU != _r.mNU)
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
        __h = 5 * __h + (int)mMaterial;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mNU);
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
        __os.writeLong(mMaterial);
        __os.writeDouble(mNU);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mAlpha = __is.readDouble();
        mDensity = __is.readDouble();
        mE = __is.readDouble();
        mMaterial = __is.readLong();
        mNU = __is.readDouble();
    }
}
