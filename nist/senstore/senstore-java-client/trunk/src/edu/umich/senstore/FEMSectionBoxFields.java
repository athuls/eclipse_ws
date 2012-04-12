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

public final class FEMSectionBoxFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mHeight;

    public double mSC;

    public int mSectionID;

    public double mSSarea;

    public double mTC;

    public double mThick1;

    public double mThick2;

    public double mTorfac;

    public double mTSarea;

    public double mWidth;

    public FEMSectionBoxFields()
    {
    }

    public FEMSectionBoxFields(long id, double mHeight, double mSC, int mSectionID, double mSSarea, double mTC, double mThick1, double mThick2, double mTorfac, double mTSarea, double mWidth)
    {
        this.id = id;
        this.mHeight = mHeight;
        this.mSC = mSC;
        this.mSectionID = mSectionID;
        this.mSSarea = mSSarea;
        this.mTC = mTC;
        this.mThick1 = mThick1;
        this.mThick2 = mThick2;
        this.mTorfac = mTorfac;
        this.mTSarea = mTSarea;
        this.mWidth = mWidth;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMSectionBoxFields _r = null;
        try
        {
            _r = (FEMSectionBoxFields)rhs;
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
            if(mHeight != _r.mHeight)
            {
                return false;
            }
            if(mSC != _r.mSC)
            {
                return false;
            }
            if(mSectionID != _r.mSectionID)
            {
                return false;
            }
            if(mSSarea != _r.mSSarea)
            {
                return false;
            }
            if(mTC != _r.mTC)
            {
                return false;
            }
            if(mThick1 != _r.mThick1)
            {
                return false;
            }
            if(mThick2 != _r.mThick2)
            {
                return false;
            }
            if(mTorfac != _r.mTorfac)
            {
                return false;
            }
            if(mTSarea != _r.mTSarea)
            {
                return false;
            }
            if(mWidth != _r.mWidth)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mHeight);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mSC);
        __h = 5 * __h + mSectionID;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mSSarea);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTC);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mThick1);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mThick2);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTorfac);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTSarea);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mWidth);
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
        __os.writeDouble(mHeight);
        __os.writeDouble(mSC);
        __os.writeInt(mSectionID);
        __os.writeDouble(mSSarea);
        __os.writeDouble(mTC);
        __os.writeDouble(mThick1);
        __os.writeDouble(mThick2);
        __os.writeDouble(mTorfac);
        __os.writeDouble(mTSarea);
        __os.writeDouble(mWidth);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mHeight = __is.readDouble();
        mSC = __is.readDouble();
        mSectionID = __is.readInt();
        mSSarea = __is.readDouble();
        mTC = __is.readDouble();
        mThick1 = __is.readDouble();
        mThick2 = __is.readDouble();
        mTorfac = __is.readDouble();
        mTSarea = __is.readDouble();
        mWidth = __is.readDouble();
    }
}
