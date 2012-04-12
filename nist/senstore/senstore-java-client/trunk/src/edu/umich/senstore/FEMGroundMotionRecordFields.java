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

public final class FEMGroundMotionRecordFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mDescription;

    public short mGMRecordID;

    public String mGMRecordName;

    public FEMGroundMotionRecordFields()
    {
    }

    public FEMGroundMotionRecordFields(long id, String mDescription, short mGMRecordID, String mGMRecordName)
    {
        this.id = id;
        this.mDescription = mDescription;
        this.mGMRecordID = mGMRecordID;
        this.mGMRecordName = mGMRecordName;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMGroundMotionRecordFields _r = null;
        try
        {
            _r = (FEMGroundMotionRecordFields)rhs;
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
            if(mGMRecordID != _r.mGMRecordID)
            {
                return false;
            }
            if(mGMRecordName != _r.mGMRecordName && mGMRecordName != null && !mGMRecordName.equals(_r.mGMRecordName))
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
        __h = 5 * __h + (int)mGMRecordID;
        if(mGMRecordName != null)
        {
            __h = 5 * __h + mGMRecordName.hashCode();
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
        __os.writeString(mDescription);
        __os.writeShort(mGMRecordID);
        __os.writeString(mGMRecordName);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDescription = __is.readString();
        mGMRecordID = __is.readShort();
        mGMRecordName = __is.readString();
    }
}
