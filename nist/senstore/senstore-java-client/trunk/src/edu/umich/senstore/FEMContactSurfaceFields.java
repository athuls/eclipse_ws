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

public final class FEMContactSurfaceFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public int mContGroupID;

    public int mContSegment;

    public int mContSurface;

    public long mN1;

    public long mN2;

    public long mN3;

    public long mN4;

    public int mRecordNmb;

    public FEMContactSurfaceFields()
    {
    }

    public FEMContactSurfaceFields(long id, int mContGroupID, int mContSegment, int mContSurface, long mN1, long mN2, long mN3, long mN4, int mRecordNmb)
    {
        this.id = id;
        this.mContGroupID = mContGroupID;
        this.mContSegment = mContSegment;
        this.mContSurface = mContSurface;
        this.mN1 = mN1;
        this.mN2 = mN2;
        this.mN3 = mN3;
        this.mN4 = mN4;
        this.mRecordNmb = mRecordNmb;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMContactSurfaceFields _r = null;
        try
        {
            _r = (FEMContactSurfaceFields)rhs;
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
            if(mContGroupID != _r.mContGroupID)
            {
                return false;
            }
            if(mContSegment != _r.mContSegment)
            {
                return false;
            }
            if(mContSurface != _r.mContSurface)
            {
                return false;
            }
            if(mN1 != _r.mN1)
            {
                return false;
            }
            if(mN2 != _r.mN2)
            {
                return false;
            }
            if(mN3 != _r.mN3)
            {
                return false;
            }
            if(mN4 != _r.mN4)
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
        __h = 5 * __h + mContGroupID;
        __h = 5 * __h + mContSegment;
        __h = 5 * __h + mContSurface;
        __h = 5 * __h + (int)mN1;
        __h = 5 * __h + (int)mN2;
        __h = 5 * __h + (int)mN3;
        __h = 5 * __h + (int)mN4;
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
        __os.writeInt(mContGroupID);
        __os.writeInt(mContSegment);
        __os.writeInt(mContSurface);
        __os.writeLong(mN1);
        __os.writeLong(mN2);
        __os.writeLong(mN3);
        __os.writeLong(mN4);
        __os.writeInt(mRecordNmb);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mContGroupID = __is.readInt();
        mContSegment = __is.readInt();
        mContSurface = __is.readInt();
        mN1 = __is.readLong();
        mN2 = __is.readLong();
        mN3 = __is.readLong();
        mN4 = __is.readLong();
        mRecordNmb = __is.readInt();
    }
}
