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

public final class FEMOrthotropicMaterialFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mDensity;

    public double mEA;

    public double mEB;

    public double mEC;

    public double mGAB;

    public double mGAC;

    public double mGBC;

    public long mMaterial;

    public double mNUAB;

    public double mNUAC;

    public double mNUBC;

    public FEMOrthotropicMaterialFields()
    {
    }

    public FEMOrthotropicMaterialFields(long id, double mDensity, double mEA, double mEB, double mEC, double mGAB, double mGAC, double mGBC, long mMaterial, double mNUAB, double mNUAC, double mNUBC)
    {
        this.id = id;
        this.mDensity = mDensity;
        this.mEA = mEA;
        this.mEB = mEB;
        this.mEC = mEC;
        this.mGAB = mGAB;
        this.mGAC = mGAC;
        this.mGBC = mGBC;
        this.mMaterial = mMaterial;
        this.mNUAB = mNUAB;
        this.mNUAC = mNUAC;
        this.mNUBC = mNUBC;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMOrthotropicMaterialFields _r = null;
        try
        {
            _r = (FEMOrthotropicMaterialFields)rhs;
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
            if(mDensity != _r.mDensity)
            {
                return false;
            }
            if(mEA != _r.mEA)
            {
                return false;
            }
            if(mEB != _r.mEB)
            {
                return false;
            }
            if(mEC != _r.mEC)
            {
                return false;
            }
            if(mGAB != _r.mGAB)
            {
                return false;
            }
            if(mGAC != _r.mGAC)
            {
                return false;
            }
            if(mGBC != _r.mGBC)
            {
                return false;
            }
            if(mMaterial != _r.mMaterial)
            {
                return false;
            }
            if(mNUAB != _r.mNUAB)
            {
                return false;
            }
            if(mNUAC != _r.mNUAC)
            {
                return false;
            }
            if(mNUBC != _r.mNUBC)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mDensity);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mEA);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mEB);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mEC);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mGAB);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mGAC);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mGBC);
        __h = 5 * __h + (int)mMaterial;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mNUAB);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mNUAC);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mNUBC);
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
        __os.writeDouble(mDensity);
        __os.writeDouble(mEA);
        __os.writeDouble(mEB);
        __os.writeDouble(mEC);
        __os.writeDouble(mGAB);
        __os.writeDouble(mGAC);
        __os.writeDouble(mGBC);
        __os.writeLong(mMaterial);
        __os.writeDouble(mNUAB);
        __os.writeDouble(mNUAC);
        __os.writeDouble(mNUBC);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDensity = __is.readDouble();
        mEA = __is.readDouble();
        mEB = __is.readDouble();
        mEC = __is.readDouble();
        mGAB = __is.readDouble();
        mGAC = __is.readDouble();
        mGBC = __is.readDouble();
        mMaterial = __is.readLong();
        mNUAB = __is.readDouble();
        mNUAC = __is.readDouble();
        mNUBC = __is.readDouble();
    }
}
