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

public final class FEMSpringGroupFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mBolt;

    public long mGroup;

    public String mNonlinear;

    public int mPropertySet;

    public String mResult;

    public String mSkewSystem;

    public FEMSpringGroupFields()
    {
    }

    public FEMSpringGroupFields(long id, String mBolt, long mGroup, String mNonlinear, int mPropertySet, String mResult, String mSkewSystem)
    {
        this.id = id;
        this.mBolt = mBolt;
        this.mGroup = mGroup;
        this.mNonlinear = mNonlinear;
        this.mPropertySet = mPropertySet;
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
        FEMSpringGroupFields _r = null;
        try
        {
            _r = (FEMSpringGroupFields)rhs;
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
            if(mBolt != _r.mBolt && mBolt != null && !mBolt.equals(_r.mBolt))
            {
                return false;
            }
            if(mGroup != _r.mGroup)
            {
                return false;
            }
            if(mNonlinear != _r.mNonlinear && mNonlinear != null && !mNonlinear.equals(_r.mNonlinear))
            {
                return false;
            }
            if(mPropertySet != _r.mPropertySet)
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
        if(mBolt != null)
        {
            __h = 5 * __h + mBolt.hashCode();
        }
        __h = 5 * __h + (int)mGroup;
        if(mNonlinear != null)
        {
            __h = 5 * __h + mNonlinear.hashCode();
        }
        __h = 5 * __h + mPropertySet;
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
        __os.writeString(mBolt);
        __os.writeLong(mGroup);
        __os.writeString(mNonlinear);
        __os.writeInt(mPropertySet);
        __os.writeString(mResult);
        __os.writeString(mSkewSystem);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mBolt = __is.readString();
        mGroup = __is.readLong();
        mNonlinear = __is.readString();
        mPropertySet = __is.readInt();
        mResult = __is.readString();
        mSkewSystem = __is.readString();
    }
}
