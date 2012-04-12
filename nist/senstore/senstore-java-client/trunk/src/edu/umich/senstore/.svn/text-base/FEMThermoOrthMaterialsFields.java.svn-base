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

public final class FEMThermoOrthMaterialsFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mDensity;

    public int mMaterialID;

    public double mTREF;

    public FEMThermoOrthMaterialsFields()
    {
    }

    public FEMThermoOrthMaterialsFields(long id, double mDensity, int mMaterialID, double mTREF)
    {
        this.id = id;
        this.mDensity = mDensity;
        this.mMaterialID = mMaterialID;
        this.mTREF = mTREF;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMThermoOrthMaterialsFields _r = null;
        try
        {
            _r = (FEMThermoOrthMaterialsFields)rhs;
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
            if(mMaterialID != _r.mMaterialID)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mDensity);
        __h = 5 * __h + mMaterialID;
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
        __os.writeDouble(mDensity);
        __os.writeInt(mMaterialID);
        __os.writeDouble(mTREF);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDensity = __is.readDouble();
        mMaterialID = __is.readInt();
        mTREF = __is.readDouble();
    }
}
