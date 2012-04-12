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

public final class MappingMatrixFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public long mStructure;

    public String mName;

    public String mDescription;

    public Quantity mOutputQuantity;

    public Quantity mInputQuantity;

    public MappingMatrixFields()
    {
    }

    public MappingMatrixFields(long id, long mStructure, String mName, String mDescription, Quantity mOutputQuantity, Quantity mInputQuantity)
    {
        this.id = id;
        this.mStructure = mStructure;
        this.mName = mName;
        this.mDescription = mDescription;
        this.mOutputQuantity = mOutputQuantity;
        this.mInputQuantity = mInputQuantity;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        MappingMatrixFields _r = null;
        try
        {
            _r = (MappingMatrixFields)rhs;
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
            if(mStructure != _r.mStructure)
            {
                return false;
            }
            if(mName != _r.mName && mName != null && !mName.equals(_r.mName))
            {
                return false;
            }
            if(mDescription != _r.mDescription && mDescription != null && !mDescription.equals(_r.mDescription))
            {
                return false;
            }
            if(mOutputQuantity != _r.mOutputQuantity && mOutputQuantity != null && !mOutputQuantity.equals(_r.mOutputQuantity))
            {
                return false;
            }
            if(mInputQuantity != _r.mInputQuantity && mInputQuantity != null && !mInputQuantity.equals(_r.mInputQuantity))
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
        __h = 5 * __h + (int)mStructure;
        if(mName != null)
        {
            __h = 5 * __h + mName.hashCode();
        }
        if(mDescription != null)
        {
            __h = 5 * __h + mDescription.hashCode();
        }
        if(mOutputQuantity != null)
        {
            __h = 5 * __h + mOutputQuantity.hashCode();
        }
        if(mInputQuantity != null)
        {
            __h = 5 * __h + mInputQuantity.hashCode();
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
        __os.writeLong(mStructure);
        __os.writeString(mName);
        __os.writeString(mDescription);
        mOutputQuantity.__write(__os);
        mInputQuantity.__write(__os);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mStructure = __is.readLong();
        mName = __is.readString();
        mDescription = __is.readString();
        mOutputQuantity = Quantity.__read(__is);
        mInputQuantity = Quantity.__read(__is);
    }
}
