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

public final class FEMShellDOFFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mDOFnumber;

    public long mNode;

    public int mVectorID;

    public FEMShellDOFFields()
    {
    }

    public FEMShellDOFFields(long id, String mDOFnumber, long mNode, int mVectorID)
    {
        this.id = id;
        this.mDOFnumber = mDOFnumber;
        this.mNode = mNode;
        this.mVectorID = mVectorID;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMShellDOFFields _r = null;
        try
        {
            _r = (FEMShellDOFFields)rhs;
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
            if(mDOFnumber != _r.mDOFnumber && mDOFnumber != null && !mDOFnumber.equals(_r.mDOFnumber))
            {
                return false;
            }
            if(mNode != _r.mNode)
            {
                return false;
            }
            if(mVectorID != _r.mVectorID)
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
        if(mDOFnumber != null)
        {
            __h = 5 * __h + mDOFnumber.hashCode();
        }
        __h = 5 * __h + (int)mNode;
        __h = 5 * __h + mVectorID;
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
        __os.writeString(mDOFnumber);
        __os.writeLong(mNode);
        __os.writeInt(mVectorID);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDOFnumber = __is.readString();
        mNode = __is.readLong();
        mVectorID = __is.readInt();
    }
}
