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

public final class FEMSkewDOFFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mDescription;

    public long mNode;

    public int mSkewSystemID;

    public FEMSkewDOFFields()
    {
    }

    public FEMSkewDOFFields(long id, String mDescription, long mNode, int mSkewSystemID)
    {
        this.id = id;
        this.mDescription = mDescription;
        this.mNode = mNode;
        this.mSkewSystemID = mSkewSystemID;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMSkewDOFFields _r = null;
        try
        {
            _r = (FEMSkewDOFFields)rhs;
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
            if(mNode != _r.mNode)
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
        __h = 5 * __h + (int)mNode;
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
        __os.writeLong(mNode);
        __os.writeInt(mSkewSystemID);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDescription = __is.readString();
        mNode = __is.readLong();
        mSkewSystemID = __is.readInt();
    }
}
