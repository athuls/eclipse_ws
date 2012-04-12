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

public final class FEMGeneralNodeFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public int mElementID;

    public long mGroup;

    public short mLocalNmb;

    public long mNode;

    public int mRecordNmb;

    public FEMGeneralNodeFields()
    {
    }

    public FEMGeneralNodeFields(long id, int mElementID, long mGroup, short mLocalNmb, long mNode, int mRecordNmb)
    {
        this.id = id;
        this.mElementID = mElementID;
        this.mGroup = mGroup;
        this.mLocalNmb = mLocalNmb;
        this.mNode = mNode;
        this.mRecordNmb = mRecordNmb;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMGeneralNodeFields _r = null;
        try
        {
            _r = (FEMGeneralNodeFields)rhs;
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
            if(mElementID != _r.mElementID)
            {
                return false;
            }
            if(mGroup != _r.mGroup)
            {
                return false;
            }
            if(mLocalNmb != _r.mLocalNmb)
            {
                return false;
            }
            if(mNode != _r.mNode)
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
        __h = 5 * __h + mElementID;
        __h = 5 * __h + (int)mGroup;
        __h = 5 * __h + (int)mLocalNmb;
        __h = 5 * __h + (int)mNode;
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
        __os.writeInt(mElementID);
        __os.writeLong(mGroup);
        __os.writeShort(mLocalNmb);
        __os.writeLong(mNode);
        __os.writeInt(mRecordNmb);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mElementID = __is.readInt();
        mGroup = __is.readLong();
        mLocalNmb = __is.readShort();
        mNode = __is.readLong();
        mRecordNmb = __is.readInt();
    }
}
