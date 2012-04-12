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

public final class FEMBoundaryFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public long mNode;

    public BoundaryType mOvalization;

    public BoundaryType mPhi;

    public BoundaryType mRx;

    public BoundaryType mRy;

    public BoundaryType mRz;

    public BoundaryType mUx;

    public BoundaryType mUy;

    public BoundaryType mUz;

    public String mWarping;

    public FEMBoundaryFields()
    {
    }

    public FEMBoundaryFields(long id, long mNode, BoundaryType mOvalization, BoundaryType mPhi, BoundaryType mRx, BoundaryType mRy, BoundaryType mRz, BoundaryType mUx, BoundaryType mUy, BoundaryType mUz, String mWarping)
    {
        this.id = id;
        this.mNode = mNode;
        this.mOvalization = mOvalization;
        this.mPhi = mPhi;
        this.mRx = mRx;
        this.mRy = mRy;
        this.mRz = mRz;
        this.mUx = mUx;
        this.mUy = mUy;
        this.mUz = mUz;
        this.mWarping = mWarping;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMBoundaryFields _r = null;
        try
        {
            _r = (FEMBoundaryFields)rhs;
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
            if(mNode != _r.mNode)
            {
                return false;
            }
            if(mOvalization != _r.mOvalization && mOvalization != null && !mOvalization.equals(_r.mOvalization))
            {
                return false;
            }
            if(mPhi != _r.mPhi && mPhi != null && !mPhi.equals(_r.mPhi))
            {
                return false;
            }
            if(mRx != _r.mRx && mRx != null && !mRx.equals(_r.mRx))
            {
                return false;
            }
            if(mRy != _r.mRy && mRy != null && !mRy.equals(_r.mRy))
            {
                return false;
            }
            if(mRz != _r.mRz && mRz != null && !mRz.equals(_r.mRz))
            {
                return false;
            }
            if(mUx != _r.mUx && mUx != null && !mUx.equals(_r.mUx))
            {
                return false;
            }
            if(mUy != _r.mUy && mUy != null && !mUy.equals(_r.mUy))
            {
                return false;
            }
            if(mUz != _r.mUz && mUz != null && !mUz.equals(_r.mUz))
            {
                return false;
            }
            if(mWarping != _r.mWarping && mWarping != null && !mWarping.equals(_r.mWarping))
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
        __h = 5 * __h + (int)mNode;
        if(mOvalization != null)
        {
            __h = 5 * __h + mOvalization.hashCode();
        }
        if(mPhi != null)
        {
            __h = 5 * __h + mPhi.hashCode();
        }
        if(mRx != null)
        {
            __h = 5 * __h + mRx.hashCode();
        }
        if(mRy != null)
        {
            __h = 5 * __h + mRy.hashCode();
        }
        if(mRz != null)
        {
            __h = 5 * __h + mRz.hashCode();
        }
        if(mUx != null)
        {
            __h = 5 * __h + mUx.hashCode();
        }
        if(mUy != null)
        {
            __h = 5 * __h + mUy.hashCode();
        }
        if(mUz != null)
        {
            __h = 5 * __h + mUz.hashCode();
        }
        if(mWarping != null)
        {
            __h = 5 * __h + mWarping.hashCode();
        }
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
        __os.writeLong(mNode);
        mOvalization.__write(__os);
        mPhi.__write(__os);
        mRx.__write(__os);
        mRy.__write(__os);
        mRz.__write(__os);
        mUx.__write(__os);
        mUy.__write(__os);
        mUz.__write(__os);
        __os.writeString(mWarping);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mNode = __is.readLong();
        mOvalization = BoundaryType.__read(__is);
        mPhi = BoundaryType.__read(__is);
        mRx = BoundaryType.__read(__is);
        mRy = BoundaryType.__read(__is);
        mRz = BoundaryType.__read(__is);
        mUx = BoundaryType.__read(__is);
        mUy = BoundaryType.__read(__is);
        mUz = BoundaryType.__read(__is);
        mWarping = __is.readString();
    }
}
