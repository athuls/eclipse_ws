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

public final class FEMDofFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public long mStructure;

    public int mLocalId;

    public long mNode;

    public Quantity mDirection;

    public FEMDofFields()
    {
    }

    public FEMDofFields(long id, long mStructure, int mLocalId, long mNode, Quantity mDirection)
    {
        this.id = id;
        this.mStructure = mStructure;
        this.mLocalId = mLocalId;
        this.mNode = mNode;
        this.mDirection = mDirection;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMDofFields _r = null;
        try
        {
            _r = (FEMDofFields)rhs;
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
            if(mLocalId != _r.mLocalId)
            {
                return false;
            }
            if(mNode != _r.mNode)
            {
                return false;
            }
            if(mDirection != _r.mDirection && mDirection != null && !mDirection.equals(_r.mDirection))
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
        __h = 5 * __h + mLocalId;
        __h = 5 * __h + (int)mNode;
        if(mDirection != null)
        {
            __h = 5 * __h + mDirection.hashCode();
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
        __os.writeInt(mLocalId);
        __os.writeLong(mNode);
        mDirection.__write(__os);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mStructure = __is.readLong();
        mLocalId = __is.readInt();
        mNode = __is.readLong();
        mDirection = Quantity.__read(__is);
    }
}
