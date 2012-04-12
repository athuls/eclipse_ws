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

public final class FEMPropertiesFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mDescription;

    public int mPropertyID;

    public String mPropertyType;

    public String mRupture;

    public double mXC;

    public double mXN;

    public FEMPropertiesFields()
    {
    }

    public FEMPropertiesFields(long id, String mDescription, int mPropertyID, String mPropertyType, String mRupture, double mXC, double mXN)
    {
        this.id = id;
        this.mDescription = mDescription;
        this.mPropertyID = mPropertyID;
        this.mPropertyType = mPropertyType;
        this.mRupture = mRupture;
        this.mXC = mXC;
        this.mXN = mXN;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMPropertiesFields _r = null;
        try
        {
            _r = (FEMPropertiesFields)rhs;
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
            if(mPropertyID != _r.mPropertyID)
            {
                return false;
            }
            if(mPropertyType != _r.mPropertyType && mPropertyType != null && !mPropertyType.equals(_r.mPropertyType))
            {
                return false;
            }
            if(mRupture != _r.mRupture && mRupture != null && !mRupture.equals(_r.mRupture))
            {
                return false;
            }
            if(mXC != _r.mXC)
            {
                return false;
            }
            if(mXN != _r.mXN)
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
        __h = 5 * __h + mPropertyID;
        if(mPropertyType != null)
        {
            __h = 5 * __h + mPropertyType.hashCode();
        }
        if(mRupture != null)
        {
            __h = 5 * __h + mRupture.hashCode();
        }
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mXC);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mXN);
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
        __os.writeInt(mPropertyID);
        __os.writeString(mPropertyType);
        __os.writeString(mRupture);
        __os.writeDouble(mXC);
        __os.writeDouble(mXN);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDescription = __is.readString();
        mPropertyID = __is.readInt();
        mPropertyType = __is.readString();
        mRupture = __is.readString();
        mXC = __is.readDouble();
        mXN = __is.readDouble();
    }
}
