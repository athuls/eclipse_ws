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

public final class FEMSkeySysNodeFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mDescription;

    public long mNode1;

    public long mNode2;

    public long mNode3;

    public int mSkewSystemID;

    public FEMSkeySysNodeFields()
    {
    }

    public FEMSkeySysNodeFields(long id, String mDescription, long mNode1, long mNode2, long mNode3, int mSkewSystemID)
    {
        this.id = id;
        this.mDescription = mDescription;
        this.mNode1 = mNode1;
        this.mNode2 = mNode2;
        this.mNode3 = mNode3;
        this.mSkewSystemID = mSkewSystemID;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMSkeySysNodeFields _r = null;
        try
        {
            _r = (FEMSkeySysNodeFields)rhs;
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
            if(mNode1 != _r.mNode1)
            {
                return false;
            }
            if(mNode2 != _r.mNode2)
            {
                return false;
            }
            if(mNode3 != _r.mNode3)
            {
                return false;
            }
            if(mSkewSystemID != _r.mSkewSystemID)
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
        __h = 5 * __h + (int)mNode1;
        __h = 5 * __h + (int)mNode2;
        __h = 5 * __h + (int)mNode3;
        __h = 5 * __h + mSkewSystemID;
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
        __os.writeLong(mNode1);
        __os.writeLong(mNode2);
        __os.writeLong(mNode3);
        __os.writeInt(mSkewSystemID);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDescription = __is.readString();
        mNode1 = __is.readLong();
        mNode2 = __is.readLong();
        mNode3 = __is.readLong();
        mSkewSystemID = __is.readInt();
    }
}
