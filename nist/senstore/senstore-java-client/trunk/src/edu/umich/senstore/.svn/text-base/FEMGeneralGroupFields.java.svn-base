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

public final class FEMGeneralGroupFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public long mGroup;

    public int mMatrixSet;

    public String mResult;

    public String mSkewSystem;

    public FEMGeneralGroupFields()
    {
    }

    public FEMGeneralGroupFields(long id, long mGroup, int mMatrixSet, String mResult, String mSkewSystem)
    {
        this.id = id;
        this.mGroup = mGroup;
        this.mMatrixSet = mMatrixSet;
        this.mResult = mResult;
        this.mSkewSystem = mSkewSystem;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMGeneralGroupFields _r = null;
        try
        {
            _r = (FEMGeneralGroupFields)rhs;
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
            if(mGroup != _r.mGroup)
            {
                return false;
            }
            if(mMatrixSet != _r.mMatrixSet)
            {
                return false;
            }
            if(mResult != _r.mResult && mResult != null && !mResult.equals(_r.mResult))
            {
                return false;
            }
            if(mSkewSystem != _r.mSkewSystem && mSkewSystem != null && !mSkewSystem.equals(_r.mSkewSystem))
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
        __h = 5 * __h + (int)mGroup;
        __h = 5 * __h + mMatrixSet;
        if(mResult != null)
        {
            __h = 5 * __h + mResult.hashCode();
        }
        if(mSkewSystem != null)
        {
            __h = 5 * __h + mSkewSystem.hashCode();
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
        __os.writeLong(mGroup);
        __os.writeInt(mMatrixSet);
        __os.writeString(mResult);
        __os.writeString(mSkewSystem);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mGroup = __is.readLong();
        mMatrixSet = __is.readInt();
        mResult = __is.readString();
        mSkewSystem = __is.readString();
    }
}
