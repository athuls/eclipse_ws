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

public final class FEMNodalMassFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mDescription;

    public double mMass1;

    public double mMass2;

    public double mMass3;

    public double mMass4;

    public double mMass5;

    public double mMass6;

    public long mNode;

    public FEMNodalMassFields()
    {
    }

    public FEMNodalMassFields(long id, String mDescription, double mMass1, double mMass2, double mMass3, double mMass4, double mMass5, double mMass6, long mNode)
    {
        this.id = id;
        this.mDescription = mDescription;
        this.mMass1 = mMass1;
        this.mMass2 = mMass2;
        this.mMass3 = mMass3;
        this.mMass4 = mMass4;
        this.mMass5 = mMass5;
        this.mMass6 = mMass6;
        this.mNode = mNode;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMNodalMassFields _r = null;
        try
        {
            _r = (FEMNodalMassFields)rhs;
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
            if(mMass1 != _r.mMass1)
            {
                return false;
            }
            if(mMass2 != _r.mMass2)
            {
                return false;
            }
            if(mMass3 != _r.mMass3)
            {
                return false;
            }
            if(mMass4 != _r.mMass4)
            {
                return false;
            }
            if(mMass5 != _r.mMass5)
            {
                return false;
            }
            if(mMass6 != _r.mMass6)
            {
                return false;
            }
            if(mNode != _r.mNode)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mMass1);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mMass2);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mMass3);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mMass4);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mMass5);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mMass6);
        __h = 5 * __h + (int)mNode;
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
        __os.writeDouble(mMass1);
        __os.writeDouble(mMass2);
        __os.writeDouble(mMass3);
        __os.writeDouble(mMass4);
        __os.writeDouble(mMass5);
        __os.writeDouble(mMass6);
        __os.writeLong(mNode);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDescription = __is.readString();
        mMass1 = __is.readDouble();
        mMass2 = __is.readDouble();
        mMass3 = __is.readDouble();
        mMass4 = __is.readDouble();
        mMass5 = __is.readDouble();
        mMass6 = __is.readDouble();
        mNode = __is.readLong();
    }
}
