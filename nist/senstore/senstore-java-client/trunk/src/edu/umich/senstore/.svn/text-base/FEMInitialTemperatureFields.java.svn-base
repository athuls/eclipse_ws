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

public final class FEMInitialTemperatureFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public long mNode;

    public double mTemperature;

    public FEMInitialTemperatureFields()
    {
    }

    public FEMInitialTemperatureFields(long id, long mNode, double mTemperature)
    {
        this.id = id;
        this.mNode = mNode;
        this.mTemperature = mTemperature;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMInitialTemperatureFields _r = null;
        try
        {
            _r = (FEMInitialTemperatureFields)rhs;
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
            if(mNode != _r.mNode)
            {
                return false;
            }
            if(mTemperature != _r.mTemperature)
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
        __h = 5 * __h + (int)mNode;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTemperature);
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
        __os.writeLong(mNode);
        __os.writeDouble(mTemperature);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mNode = __is.readLong();
        mTemperature = __is.readDouble();
    }
}
