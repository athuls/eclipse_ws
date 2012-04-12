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

public final class FEMThreeDSolidGroupFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mDisplacement;

    public long mGroup;

    public int mMaterialID;

    public String mResult;

    public FEMThreeDSolidGroupFields()
    {
    }

    public FEMThreeDSolidGroupFields(long id, String mDisplacement, long mGroup, int mMaterialID, String mResult)
    {
        this.id = id;
        this.mDisplacement = mDisplacement;
        this.mGroup = mGroup;
        this.mMaterialID = mMaterialID;
        this.mResult = mResult;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMThreeDSolidGroupFields _r = null;
        try
        {
            _r = (FEMThreeDSolidGroupFields)rhs;
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
            if(mDisplacement != _r.mDisplacement && mDisplacement != null && !mDisplacement.equals(_r.mDisplacement))
            {
                return false;
            }
            if(mGroup != _r.mGroup)
            {
                return false;
            }
            if(mMaterialID != _r.mMaterialID)
            {
                return false;
            }
            if(mResult != _r.mResult && mResult != null && !mResult.equals(_r.mResult))
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
        if(mDisplacement != null)
        {
            __h = 5 * __h + mDisplacement.hashCode();
        }
        __h = 5 * __h + (int)mGroup;
        __h = 5 * __h + mMaterialID;
        if(mResult != null)
        {
            __h = 5 * __h + mResult.hashCode();
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
        __os.writeString(mDisplacement);
        __os.writeLong(mGroup);
        __os.writeInt(mMaterialID);
        __os.writeString(mResult);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDisplacement = __is.readString();
        mGroup = __is.readLong();
        mMaterialID = __is.readInt();
        mResult = __is.readString();
    }
}
