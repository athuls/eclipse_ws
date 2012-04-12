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

public final class FEMCoordSystemFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mAX;

    public double mAY;

    public double mAZ;

    public double mBBY;

    public double mBX;

    public double mBZ;

    public String mDescription;

    public short mMode;

    public int mP1;

    public int mP2;

    public int mP3;

    public String mType;

    public double mXorigin;

    public double mYorigin;

    public double mZorigin;

    public int mLocalID;

    public FEMCoordSystemFields()
    {
    }

    public FEMCoordSystemFields(long id, double mAX, double mAY, double mAZ, double mBBY, double mBX, double mBZ, String mDescription, short mMode, int mP1, int mP2, int mP3, String mType, double mXorigin, double mYorigin, double mZorigin, int mLocalID)
    {
        this.id = id;
        this.mAX = mAX;
        this.mAY = mAY;
        this.mAZ = mAZ;
        this.mBBY = mBBY;
        this.mBX = mBX;
        this.mBZ = mBZ;
        this.mDescription = mDescription;
        this.mMode = mMode;
        this.mP1 = mP1;
        this.mP2 = mP2;
        this.mP3 = mP3;
        this.mType = mType;
        this.mXorigin = mXorigin;
        this.mYorigin = mYorigin;
        this.mZorigin = mZorigin;
        this.mLocalID = mLocalID;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMCoordSystemFields _r = null;
        try
        {
            _r = (FEMCoordSystemFields)rhs;
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
            if(mBBY != _r.mBBY)
            {
                return false;
            }
            if(mBX != _r.mBX)
            {
                return false;
            }
            if(mBZ != _r.mBZ)
            {
                return false;
            }
            if(mDescription != _r.mDescription && mDescription != null && !mDescription.equals(_r.mDescription))
            {
                return false;
            }
            if(mMode != _r.mMode)
            {
                return false;
            }
            if(mP1 != _r.mP1)
            {
                return false;
            }
            if(mP2 != _r.mP2)
            {
                return false;
            }
            if(mP3 != _r.mP3)
            {
                return false;
            }
            if(mType != _r.mType && mType != null && !mType.equals(_r.mType))
            {
                return false;
            }
            if(mXorigin != _r.mXorigin)
            {
                return false;
            }
            if(mYorigin != _r.mYorigin)
            {
                return false;
            }
            if(mZorigin != _r.mZorigin)
            {
                return false;
            }
            if(mLocalID != _r.mLocalID)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mBBY);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mBX);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mBZ);
        if(mDescription != null)
        {
            __h = 5 * __h + mDescription.hashCode();
        }
        __h = 5 * __h + (int)mMode;
        __h = 5 * __h + mP1;
        __h = 5 * __h + mP2;
        __h = 5 * __h + mP3;
        if(mType != null)
        {
            __h = 5 * __h + mType.hashCode();
        }
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mXorigin);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mYorigin);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mZorigin);
        __h = 5 * __h + mLocalID;
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
        __os.writeDouble(mBBY);
        __os.writeDouble(mBX);
        __os.writeDouble(mBZ);
        __os.writeString(mDescription);
        __os.writeShort(mMode);
        __os.writeInt(mP1);
        __os.writeInt(mP2);
        __os.writeInt(mP3);
        __os.writeString(mType);
        __os.writeDouble(mXorigin);
        __os.writeDouble(mYorigin);
        __os.writeDouble(mZorigin);
        __os.writeInt(mLocalID);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mAX = __is.readDouble();
        mAY = __is.readDouble();
        mAZ = __is.readDouble();
        mBBY = __is.readDouble();
        mBX = __is.readDouble();
        mBZ = __is.readDouble();
        mDescription = __is.readString();
        mMode = __is.readShort();
        mP1 = __is.readInt();
        mP2 = __is.readInt();
        mP3 = __is.readInt();
        mType = __is.readString();
        mXorigin = __is.readDouble();
        mYorigin = __is.readDouble();
        mZorigin = __is.readDouble();
        mLocalID = __is.readInt();
    }
}
