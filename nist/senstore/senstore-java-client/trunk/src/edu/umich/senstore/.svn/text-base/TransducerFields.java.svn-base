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

public final class TransducerFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mModel;

    public String mIdentifier;

    public TransducerFields()
    {
    }

    public TransducerFields(long id, String mModel, String mIdentifier)
    {
        this.id = id;
        this.mModel = mModel;
        this.mIdentifier = mIdentifier;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        TransducerFields _r = null;
        try
        {
            _r = (TransducerFields)rhs;
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
            if(mModel != _r.mModel && mModel != null && !mModel.equals(_r.mModel))
            {
                return false;
            }
            if(mIdentifier != _r.mIdentifier && mIdentifier != null && !mIdentifier.equals(_r.mIdentifier))
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
        if(mModel != null)
        {
            __h = 5 * __h + mModel.hashCode();
        }
        if(mIdentifier != null)
        {
            __h = 5 * __h + mIdentifier.hashCode();
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
        __os.writeString(mModel);
        __os.writeString(mIdentifier);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mModel = __is.readString();
        mIdentifier = __is.readString();
    }
}
