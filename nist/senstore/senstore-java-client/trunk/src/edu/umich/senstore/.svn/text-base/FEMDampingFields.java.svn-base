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

public final class FEMDampingFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mALPHA;

    public double mBETA;

    public long mGroup;

    public FEMDampingFields()
    {
    }

    public FEMDampingFields(long id, double mALPHA, double mBETA, long mGroup)
    {
        this.id = id;
        this.mALPHA = mALPHA;
        this.mBETA = mBETA;
        this.mGroup = mGroup;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMDampingFields _r = null;
        try
        {
            _r = (FEMDampingFields)rhs;
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
            if(mBETA != _r.mBETA)
            {
                return false;
            }
            if(mGroup != _r.mGroup)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mBETA);
        __h = 5 * __h + (int)mGroup;
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
        __os.writeDouble(mBETA);
        __os.writeLong(mGroup);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mALPHA = __is.readDouble();
        mBETA = __is.readDouble();
        mGroup = __is.readLong();
    }
}
