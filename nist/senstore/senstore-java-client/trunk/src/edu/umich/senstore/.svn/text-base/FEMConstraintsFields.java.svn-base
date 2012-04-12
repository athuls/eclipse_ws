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

public final class FEMConstraintsFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public int mConstraintID;

    public String mDescription;

    public String mSlaveDOF;

    public int mSlaveNode;

    public FEMConstraintsFields()
    {
    }

    public FEMConstraintsFields(long id, int mConstraintID, String mDescription, String mSlaveDOF, int mSlaveNode)
    {
        this.id = id;
        this.mConstraintID = mConstraintID;
        this.mDescription = mDescription;
        this.mSlaveDOF = mSlaveDOF;
        this.mSlaveNode = mSlaveNode;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMConstraintsFields _r = null;
        try
        {
            _r = (FEMConstraintsFields)rhs;
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
            if(mConstraintID != _r.mConstraintID)
            {
                return false;
            }
            if(mDescription != _r.mDescription && mDescription != null && !mDescription.equals(_r.mDescription))
            {
                return false;
            }
            if(mSlaveDOF != _r.mSlaveDOF && mSlaveDOF != null && !mSlaveDOF.equals(_r.mSlaveDOF))
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
        __h = 5 * __h + mConstraintID;
        if(mDescription != null)
        {
            __h = 5 * __h + mDescription.hashCode();
        }
        if(mSlaveDOF != null)
        {
            __h = 5 * __h + mSlaveDOF.hashCode();
        }
        __h = 5 * __h + mSlaveNode;
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
        __os.writeInt(mConstraintID);
        __os.writeString(mDescription);
        __os.writeString(mSlaveDOF);
        __os.writeInt(mSlaveNode);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mConstraintID = __is.readInt();
        mDescription = __is.readString();
        mSlaveDOF = __is.readString();
        mSlaveNode = __is.readInt();
    }
}
