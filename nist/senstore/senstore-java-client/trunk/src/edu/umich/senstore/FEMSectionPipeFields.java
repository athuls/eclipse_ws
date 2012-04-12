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

public final class FEMSectionPipeFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mDiameter;

    public double mSC;

    public int mSectionID;

    public double mSSarea;

    public double mTC;

    public double mThickness;

    public double mTorfac;

    public double mTSarea;

    public FEMSectionPipeFields()
    {
    }

    public FEMSectionPipeFields(long id, double mDiameter, double mSC, int mSectionID, double mSSarea, double mTC, double mThickness, double mTorfac, double mTSarea)
    {
        this.id = id;
        this.mDiameter = mDiameter;
        this.mSC = mSC;
        this.mSectionID = mSectionID;
        this.mSSarea = mSSarea;
        this.mTC = mTC;
        this.mThickness = mThickness;
        this.mTorfac = mTorfac;
        this.mTSarea = mTSarea;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMSectionPipeFields _r = null;
        try
        {
            _r = (FEMSectionPipeFields)rhs;
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
            if(mDiameter != _r.mDiameter)
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
            if(mThickness != _r.mThickness)
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

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 0;
        __h = 5 * __h + (int)id;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mDiameter);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mSC);
        __h = 5 * __h + mSectionID;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mSSarea);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTC);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mThickness);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTorfac);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTSarea);
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
        __os.writeDouble(mDiameter);
        __os.writeDouble(mSC);
        __os.writeInt(mSectionID);
        __os.writeDouble(mSSarea);
        __os.writeDouble(mTC);
        __os.writeDouble(mThickness);
        __os.writeDouble(mTorfac);
        __os.writeDouble(mTSarea);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDiameter = __is.readDouble();
        mSC = __is.readDouble();
        mSectionID = __is.readInt();
        mSSarea = __is.readDouble();
        mTC = __is.readDouble();
        mThickness = __is.readDouble();
        mTorfac = __is.readDouble();
        mTSarea = __is.readDouble();
    }
}
