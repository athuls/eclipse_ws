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

public final class FEMNKDisplForceFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mDisplacement;

    public double mForce;

    public int mPropertyID;

    public int mRecordNmb;

    public FEMNKDisplForceFields()
    {
    }

    public FEMNKDisplForceFields(long id, double mDisplacement, double mForce, int mPropertyID, int mRecordNmb)
    {
        this.id = id;
        this.mDisplacement = mDisplacement;
        this.mForce = mForce;
        this.mPropertyID = mPropertyID;
        this.mRecordNmb = mRecordNmb;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMNKDisplForceFields _r = null;
        try
        {
            _r = (FEMNKDisplForceFields)rhs;
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
            if(mDisplacement != _r.mDisplacement)
            {
                return false;
            }
            if(mForce != _r.mForce)
            {
                return false;
            }
            if(mPropertyID != _r.mPropertyID)
            {
                return false;
            }
            if(mRecordNmb != _r.mRecordNmb)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mDisplacement);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mForce);
        __h = 5 * __h + mPropertyID;
        __h = 5 * __h + mRecordNmb;
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
        __os.writeDouble(mDisplacement);
        __os.writeDouble(mForce);
        __os.writeInt(mPropertyID);
        __os.writeInt(mRecordNmb);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDisplacement = __is.readDouble();
        mForce = __is.readDouble();
        mPropertyID = __is.readInt();
        mRecordNmb = __is.readInt();
    }
}
