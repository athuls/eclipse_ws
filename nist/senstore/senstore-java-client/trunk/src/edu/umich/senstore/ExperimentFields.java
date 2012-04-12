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

public final class ExperimentFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public short mFrequency;

    public int mDuration;

    public int mBufferData;

    public ExperimentFields()
    {
    }

    public ExperimentFields(long id, short mFrequency, int mDuration, int mBufferData)
    {
        this.id = id;
        this.mFrequency = mFrequency;
        this.mDuration = mDuration;
        this.mBufferData = mBufferData;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        ExperimentFields _r = null;
        try
        {
            _r = (ExperimentFields)rhs;
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
            if(mFrequency != _r.mFrequency)
            {
                return false;
            }
            if(mDuration != _r.mDuration)
            {
                return false;
            }
            if(mBufferData != _r.mBufferData)
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
        __h = 5 * __h + (int)mFrequency;
        __h = 5 * __h + mDuration;
        __h = 5 * __h + mBufferData;
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
        __os.writeShort(mFrequency);
        __os.writeInt(mDuration);
        __os.writeInt(mBufferData);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mFrequency = __is.readShort();
        mDuration = __is.readInt();
        mBufferData = __is.readInt();
    }
}
