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

public final class FEMSectionPropFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mArea;

    public double mRinertia;

    public double mSarea;

    public int mSectionID;

    public double mSinertia;

    public double mTarea;

    public double mTinertia;

    public FEMSectionPropFields()
    {
    }

    public FEMSectionPropFields(long id, double mArea, double mRinertia, double mSarea, int mSectionID, double mSinertia, double mTarea, double mTinertia)
    {
        this.id = id;
        this.mArea = mArea;
        this.mRinertia = mRinertia;
        this.mSarea = mSarea;
        this.mSectionID = mSectionID;
        this.mSinertia = mSinertia;
        this.mTarea = mTarea;
        this.mTinertia = mTinertia;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMSectionPropFields _r = null;
        try
        {
            _r = (FEMSectionPropFields)rhs;
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
            if(mArea != _r.mArea)
            {
                return false;
            }
            if(mRinertia != _r.mRinertia)
            {
                return false;
            }
            if(mSarea != _r.mSarea)
            {
                return false;
            }
            if(mSectionID != _r.mSectionID)
            {
                return false;
            }
            if(mSinertia != _r.mSinertia)
            {
                return false;
            }
            if(mTarea != _r.mTarea)
            {
                return false;
            }
            if(mTinertia != _r.mTinertia)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mArea);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mRinertia);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mSarea);
        __h = 5 * __h + mSectionID;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mSinertia);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTarea);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTinertia);
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
        __os.writeDouble(mArea);
        __os.writeDouble(mRinertia);
        __os.writeDouble(mSarea);
        __os.writeInt(mSectionID);
        __os.writeDouble(mSinertia);
        __os.writeDouble(mTarea);
        __os.writeDouble(mTinertia);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mArea = __is.readDouble();
        mRinertia = __is.readDouble();
        mSarea = __is.readDouble();
        mSectionID = __is.readInt();
        mSinertia = __is.readDouble();
        mTarea = __is.readDouble();
        mTinertia = __is.readDouble();
    }
}
