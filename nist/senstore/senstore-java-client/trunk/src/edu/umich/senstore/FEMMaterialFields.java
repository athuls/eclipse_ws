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

public final class FEMMaterialFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mDescription;

    public MaterialType mMaterialType;

    public int mLocalID;

    public long mStructure;

    public FEMMaterialFields()
    {
    }

    public FEMMaterialFields(long id, String mDescription, MaterialType mMaterialType, int mLocalID, long mStructure)
    {
        this.id = id;
        this.mDescription = mDescription;
        this.mMaterialType = mMaterialType;
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
        FEMMaterialFields _r = null;
        try
        {
            _r = (FEMMaterialFields)rhs;
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
            if(mMaterialType != _r.mMaterialType && mMaterialType != null && !mMaterialType.equals(_r.mMaterialType))
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
        if(mMaterialType != null)
        {
            __h = 5 * __h + mMaterialType.hashCode();
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
        mMaterialType.__write(__os);
        __os.writeInt(mLocalID);
        __os.writeLong(mStructure);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDescription = __is.readString();
        mMaterialType = MaterialType.__read(__is);
        mLocalID = __is.readInt();
        mStructure = __is.readLong();
    }
}
