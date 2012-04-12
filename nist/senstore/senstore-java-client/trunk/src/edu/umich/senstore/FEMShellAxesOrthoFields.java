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

public final class FEMShellAxesOrthoFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mALFA;

    public int mAxOrthoID;

    public long mGroup;

    public int mLineID;

    public int mRecordNmb;

    public FEMShellAxesOrthoFields()
    {
    }

    public FEMShellAxesOrthoFields(long id, double mALFA, int mAxOrthoID, long mGroup, int mLineID, int mRecordNmb)
    {
        this.id = id;
        this.mALFA = mALFA;
        this.mAxOrthoID = mAxOrthoID;
        this.mGroup = mGroup;
        this.mLineID = mLineID;
        this.mRecordNmb = mRecordNmb;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMShellAxesOrthoFields _r = null;
        try
        {
            _r = (FEMShellAxesOrthoFields)rhs;
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
            if(mALFA != _r.mALFA)
            {
                return false;
            }
            if(mAxOrthoID != _r.mAxOrthoID)
            {
                return false;
            }
            if(mGroup != _r.mGroup)
            {
                return false;
            }
            if(mLineID != _r.mLineID)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mALFA);
        __h = 5 * __h + mAxOrthoID;
        __h = 5 * __h + (int)mGroup;
        __h = 5 * __h + mLineID;
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
        __os.writeDouble(mALFA);
        __os.writeInt(mAxOrthoID);
        __os.writeLong(mGroup);
        __os.writeInt(mLineID);
        __os.writeInt(mRecordNmb);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mALFA = __is.readDouble();
        mAxOrthoID = __is.readInt();
        mGroup = __is.readLong();
        mLineID = __is.readInt();
        mRecordNmb = __is.readInt();
    }
}
