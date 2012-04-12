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

public final class FEMLinkFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mDescription;

    public String mDisplacement;

    public long mMasterNode;

    public int mRLID;

    public long mSlaveNode;

    public FEMLinkFields()
    {
    }

    public FEMLinkFields(long id, String mDescription, String mDisplacement, long mMasterNode, int mRLID, long mSlaveNode)
    {
        this.id = id;
        this.mDescription = mDescription;
        this.mDisplacement = mDisplacement;
        this.mMasterNode = mMasterNode;
        this.mRLID = mRLID;
        this.mSlaveNode = mSlaveNode;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMLinkFields _r = null;
        try
        {
            _r = (FEMLinkFields)rhs;
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
            if(mDisplacement != _r.mDisplacement && mDisplacement != null && !mDisplacement.equals(_r.mDisplacement))
            {
                return false;
            }
            if(mMasterNode != _r.mMasterNode)
            {
                return false;
            }
            if(mRLID != _r.mRLID)
            {
                return false;
            }
            if(mSlaveNode != _r.mSlaveNode)
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
        if(mDisplacement != null)
        {
            __h = 5 * __h + mDisplacement.hashCode();
        }
        __h = 5 * __h + (int)mMasterNode;
        __h = 5 * __h + mRLID;
        __h = 5 * __h + (int)mSlaveNode;
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
        __os.writeString(mDisplacement);
        __os.writeLong(mMasterNode);
        __os.writeInt(mRLID);
        __os.writeLong(mSlaveNode);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDescription = __is.readString();
        mDisplacement = __is.readString();
        mMasterNode = __is.readLong();
        mRLID = __is.readInt();
        mSlaveNode = __is.readLong();
    }
}
