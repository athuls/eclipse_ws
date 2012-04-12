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

public final class DaqUnitChannelFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public long mUnit;

    public short mNumber;

    public DaqUnitChannelFields()
    {
    }

    public DaqUnitChannelFields(long id, long mUnit, short mNumber)
    {
        this.id = id;
        this.mUnit = mUnit;
        this.mNumber = mNumber;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        DaqUnitChannelFields _r = null;
        try
        {
            _r = (DaqUnitChannelFields)rhs;
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
            if(mUnit != _r.mUnit)
            {
                return false;
            }
            if(mNumber != _r.mNumber)
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
        __h = 5 * __h + (int)mUnit;
        __h = 5 * __h + (int)mNumber;
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
        __os.writeLong(mUnit);
        __os.writeShort(mNumber);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mUnit = __is.readLong();
        mNumber = __is.readShort();
    }
}
