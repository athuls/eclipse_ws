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

public final class FEMNLElasticMaterialsFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public int mDcurve;

    public double mDensity;

    public int mMaterialID;

    public FEMNLElasticMaterialsFields()
    {
    }

    public FEMNLElasticMaterialsFields(long id, int mDcurve, double mDensity, int mMaterialID)
    {
        this.id = id;
        this.mDcurve = mDcurve;
        this.mDensity = mDensity;
        this.mMaterialID = mMaterialID;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMNLElasticMaterialsFields _r = null;
        try
        {
            _r = (FEMNLElasticMaterialsFields)rhs;
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
            if(mDcurve != _r.mDcurve)
            {
                return false;
            }
            if(mDensity != _r.mDensity)
            {
                return false;
            }
            if(mMaterialID != _r.mMaterialID)
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
        __h = 5 * __h + mDcurve;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mDensity);
        __h = 5 * __h + mMaterialID;
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
        __os.writeInt(mDcurve);
        __os.writeDouble(mDensity);
        __os.writeInt(mMaterialID);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDcurve = __is.readInt();
        mDensity = __is.readDouble();
        mMaterialID = __is.readInt();
    }
}
