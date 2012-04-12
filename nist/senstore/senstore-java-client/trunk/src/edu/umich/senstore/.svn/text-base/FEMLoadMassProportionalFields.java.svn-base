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

public final class FEMLoadMassProportionalFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mAX;

    public double mAY;

    public double mAZ;

    public short mLoadID;

    public double mMagnitude;

    public long mStructure;

    public FEMLoadMassProportionalFields()
    {
    }

    public FEMLoadMassProportionalFields(long id, double mAX, double mAY, double mAZ, short mLoadID, double mMagnitude, long mStructure)
    {
        this.id = id;
        this.mAX = mAX;
        this.mAY = mAY;
        this.mAZ = mAZ;
        this.mLoadID = mLoadID;
        this.mMagnitude = mMagnitude;
        this.mStructure = mStructure;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMLoadMassProportionalFields _r = null;
        try
        {
            _r = (FEMLoadMassProportionalFields)rhs;
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
            if(mAX != _r.mAX)
            {
                return false;
            }
            if(mAY != _r.mAY)
            {
                return false;
            }
            if(mAZ != _r.mAZ)
            {
                return false;
            }
            if(mLoadID != _r.mLoadID)
            {
                return false;
            }
            if(mMagnitude != _r.mMagnitude)
            {
                return false;
            }
            if(mStructure != _r.mStructure)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mAX);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mAY);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mAZ);
        __h = 5 * __h + (int)mLoadID;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mMagnitude);
        __h = 5 * __h + (int)mStructure;
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
        __os.writeDouble(mAX);
        __os.writeDouble(mAY);
        __os.writeDouble(mAZ);
        __os.writeShort(mLoadID);
        __os.writeDouble(mMagnitude);
        __os.writeLong(mStructure);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mAX = __is.readDouble();
        mAY = __is.readDouble();
        mAZ = __is.readDouble();
        mLoadID = __is.readShort();
        mMagnitude = __is.readDouble();
        mStructure = __is.readLong();
    }
}
