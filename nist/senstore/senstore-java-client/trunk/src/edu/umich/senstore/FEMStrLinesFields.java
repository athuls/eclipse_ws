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

public final class FEMStrLinesFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public int mLineID;

    public int mP1;

    public int mP2;

    public FEMStrLinesFields()
    {
    }

    public FEMStrLinesFields(long id, int mLineID, int mP1, int mP2)
    {
        this.id = id;
        this.mLineID = mLineID;
        this.mP1 = mP1;
        this.mP2 = mP2;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMStrLinesFields _r = null;
        try
        {
            _r = (FEMStrLinesFields)rhs;
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
            if(mLineID != _r.mLineID)
            {
                return false;
            }
            if(mP1 != _r.mP1)
            {
                return false;
            }
            if(mP2 != _r.mP2)
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
        __h = 5 * __h + mLineID;
        __h = 5 * __h + mP1;
        __h = 5 * __h + mP2;
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
        __os.writeInt(mLineID);
        __os.writeInt(mP1);
        __os.writeInt(mP2);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mLineID = __is.readInt();
        mP1 = __is.readInt();
        mP2 = __is.readInt();
    }
}
