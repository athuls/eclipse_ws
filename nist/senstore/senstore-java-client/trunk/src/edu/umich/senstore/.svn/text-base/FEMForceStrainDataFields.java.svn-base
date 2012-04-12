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

public final class FEMForceStrainDataFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mForce;

    public int mForceAxID;

    public int mRecordNmb;

    public double mStrain;

    public FEMForceStrainDataFields()
    {
    }

    public FEMForceStrainDataFields(long id, double mForce, int mForceAxID, int mRecordNmb, double mStrain)
    {
        this.id = id;
        this.mForce = mForce;
        this.mForceAxID = mForceAxID;
        this.mRecordNmb = mRecordNmb;
        this.mStrain = mStrain;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMForceStrainDataFields _r = null;
        try
        {
            _r = (FEMForceStrainDataFields)rhs;
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
            if(mForce != _r.mForce)
            {
                return false;
            }
            if(mForceAxID != _r.mForceAxID)
            {
                return false;
            }
            if(mRecordNmb != _r.mRecordNmb)
            {
                return false;
            }
            if(mStrain != _r.mStrain)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mForce);
        __h = 5 * __h + mForceAxID;
        __h = 5 * __h + mRecordNmb;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mStrain);
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
        __os.writeDouble(mForce);
        __os.writeInt(mForceAxID);
        __os.writeInt(mRecordNmb);
        __os.writeDouble(mStrain);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mForce = __is.readDouble();
        mForceAxID = __is.readInt();
        mRecordNmb = __is.readInt();
        mStrain = __is.readDouble();
    }
}
