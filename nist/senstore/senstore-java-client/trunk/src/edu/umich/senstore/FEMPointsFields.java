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

public final class FEMPointsFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mDescription;

    public int mPointID;

    public int mSystemID;

    public double mX;

    public double mY;

    public double mZ;

    public FEMPointsFields()
    {
    }

    public FEMPointsFields(long id, String mDescription, int mPointID, int mSystemID, double mX, double mY, double mZ)
    {
        this.id = id;
        this.mDescription = mDescription;
        this.mPointID = mPointID;
        this.mSystemID = mSystemID;
        this.mX = mX;
        this.mY = mY;
        this.mZ = mZ;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMPointsFields _r = null;
        try
        {
            _r = (FEMPointsFields)rhs;
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
            if(mPointID != _r.mPointID)
            {
                return false;
            }
            if(mSystemID != _r.mSystemID)
            {
                return false;
            }
            if(mX != _r.mX)
            {
                return false;
            }
            if(mY != _r.mY)
            {
                return false;
            }
            if(mZ != _r.mZ)
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
        __h = 5 * __h + mPointID;
        __h = 5 * __h + mSystemID;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mX);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mY);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mZ);
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
        __os.writeInt(mPointID);
        __os.writeInt(mSystemID);
        __os.writeDouble(mX);
        __os.writeDouble(mY);
        __os.writeDouble(mZ);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDescription = __is.readString();
        mPointID = __is.readInt();
        mSystemID = __is.readInt();
        mX = __is.readDouble();
        mY = __is.readDouble();
        mZ = __is.readDouble();
    }
}
