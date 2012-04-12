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

public final class FEMPlasticMlMaterialsFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mALPHA;

    public double mDensity;

    public double mE;

    public String mHardening;

    public int mMaterialID;

    public double mNU;

    public double mTREF;

    public FEMPlasticMlMaterialsFields()
    {
    }

    public FEMPlasticMlMaterialsFields(long id, double mALPHA, double mDensity, double mE, String mHardening, int mMaterialID, double mNU, double mTREF)
    {
        this.id = id;
        this.mALPHA = mALPHA;
        this.mDensity = mDensity;
        this.mE = mE;
        this.mHardening = mHardening;
        this.mMaterialID = mMaterialID;
        this.mNU = mNU;
        this.mTREF = mTREF;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMPlasticMlMaterialsFields _r = null;
        try
        {
            _r = (FEMPlasticMlMaterialsFields)rhs;
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
            if(mALPHA != _r.mALPHA)
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
            if(mHardening != _r.mHardening && mHardening != null && !mHardening.equals(_r.mHardening))
            {
                return false;
            }
            if(mMaterialID != _r.mMaterialID)
            {
                return false;
            }
            if(mNU != _r.mNU)
            {
                return false;
            }
            if(mTREF != _r.mTREF)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mALPHA);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mDensity);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mE);
        if(mHardening != null)
        {
            __h = 5 * __h + mHardening.hashCode();
        }
        __h = 5 * __h + mMaterialID;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mNU);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTREF);
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
        __os.writeDouble(mALPHA);
        __os.writeDouble(mDensity);
        __os.writeDouble(mE);
        __os.writeString(mHardening);
        __os.writeInt(mMaterialID);
        __os.writeDouble(mNU);
        __os.writeDouble(mTREF);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mALPHA = __is.readDouble();
        mDensity = __is.readDouble();
        mE = __is.readDouble();
        mHardening = __is.readString();
        mMaterialID = __is.readInt();
        mNU = __is.readDouble();
        mTREF = __is.readDouble();
    }
}
