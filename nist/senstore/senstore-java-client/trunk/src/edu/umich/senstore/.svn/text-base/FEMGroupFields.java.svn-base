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

public final class FEMGroupFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mDescription;

    public GroupType mGroupType;

    public int mLocalID;

    public long mStructure;

    public FEMGroupFields()
    {
    }

    public FEMGroupFields(long id, String mDescription, GroupType mGroupType, int mLocalID, long mStructure)
    {
        this.id = id;
        this.mDescription = mDescription;
        this.mGroupType = mGroupType;
        this.mLocalID = mLocalID;
        this.mStructure = mStructure;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMGroupFields _r = null;
        try
        {
            _r = (FEMGroupFields)rhs;
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
            if(mGroupType != _r.mGroupType && mGroupType != null && !mGroupType.equals(_r.mGroupType))
            {
                return false;
            }
            if(mLocalID != _r.mLocalID)
            {
                return false;
            }
            if(mStructure != _r.mStructure)
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
        if(mGroupType != null)
        {
            __h = 5 * __h + mGroupType.hashCode();
        }
        __h = 5 * __h + mLocalID;
        __h = 5 * __h + (int)mStructure;
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
        mGroupType.__write(__os);
        __os.writeInt(mLocalID);
        __os.writeLong(mStructure);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDescription = __is.readString();
        mGroupType = GroupType.__read(__is);
        mLocalID = __is.readInt();
        mStructure = __is.readLong();
    }
}
