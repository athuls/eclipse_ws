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

public final class FEMSkewSysAnglesFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mDescription;

    public double mPHI;

    public int mSkewSystemID;

    public double mTHETA;

    public double mXSI;

    public FEMSkewSysAnglesFields()
    {
    }

    public FEMSkewSysAnglesFields(long id, String mDescription, double mPHI, int mSkewSystemID, double mTHETA, double mXSI)
    {
        this.id = id;
        this.mDescription = mDescription;
        this.mPHI = mPHI;
        this.mSkewSystemID = mSkewSystemID;
        this.mTHETA = mTHETA;
        this.mXSI = mXSI;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMSkewSysAnglesFields _r = null;
        try
        {
            _r = (FEMSkewSysAnglesFields)rhs;
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
            if(mPHI != _r.mPHI)
            {
                return false;
            }
            if(mSkewSystemID != _r.mSkewSystemID)
            {
                return false;
            }
            if(mTHETA != _r.mTHETA)
            {
                return false;
            }
            if(mXSI != _r.mXSI)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mPHI);
        __h = 5 * __h + mSkewSystemID;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTHETA);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mXSI);
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
        __os.writeDouble(mPHI);
        __os.writeInt(mSkewSystemID);
        __os.writeDouble(mTHETA);
        __os.writeDouble(mXSI);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDescription = __is.readString();
        mPHI = __is.readDouble();
        mSkewSystemID = __is.readInt();
        mTHETA = __is.readDouble();
        mXSI = __is.readDouble();
    }
}
