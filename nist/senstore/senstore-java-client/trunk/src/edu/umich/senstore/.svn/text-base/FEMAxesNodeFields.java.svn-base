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

public final class FEMAxesNodeFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public int mAxNodeID;

    public long mGroup;

    public long mNode1;

    public long mNode2;

    public long mNode3;

    public int mRecordNmb;

    public FEMAxesNodeFields()
    {
    }

    public FEMAxesNodeFields(long id, int mAxNodeID, long mGroup, long mNode1, long mNode2, long mNode3, int mRecordNmb)
    {
        this.id = id;
        this.mAxNodeID = mAxNodeID;
        this.mGroup = mGroup;
        this.mNode1 = mNode1;
        this.mNode2 = mNode2;
        this.mNode3 = mNode3;
        this.mRecordNmb = mRecordNmb;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMAxesNodeFields _r = null;
        try
        {
            _r = (FEMAxesNodeFields)rhs;
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
            if(mAxNodeID != _r.mAxNodeID)
            {
                return false;
            }
            if(mGroup != _r.mGroup)
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
        __h = 5 * __h + mAxNodeID;
        __h = 5 * __h + (int)mGroup;
        __h = 5 * __h + (int)mNode1;
        __h = 5 * __h + (int)mNode2;
        __h = 5 * __h + (int)mNode3;
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
        __os.writeInt(mAxNodeID);
        __os.writeLong(mGroup);
        __os.writeLong(mNode1);
        __os.writeLong(mNode2);
        __os.writeLong(mNode3);
        __os.writeInt(mRecordNmb);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mAxNodeID = __is.readInt();
        mGroup = __is.readLong();
        mNode1 = __is.readLong();
        mNode2 = __is.readLong();
        mNode3 = __is.readLong();
        mRecordNmb = __is.readInt();
    }
}
