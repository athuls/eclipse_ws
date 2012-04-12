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

public final class TransducerCycleDataFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public long mTransducer;

    public long mCycle;

    public float mSoftwareScaling;

    public TransducerCycleDataFields()
    {
    }

    public TransducerCycleDataFields(long id, long mTransducer, long mCycle, float mSoftwareScaling)
    {
        this.id = id;
        this.mTransducer = mTransducer;
        this.mCycle = mCycle;
        this.mSoftwareScaling = mSoftwareScaling;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        TransducerCycleDataFields _r = null;
        try
        {
            _r = (TransducerCycleDataFields)rhs;
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
            if(mTransducer != _r.mTransducer)
            {
                return false;
            }
            if(mCycle != _r.mCycle)
            {
                return false;
            }
            if(mSoftwareScaling != _r.mSoftwareScaling)
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
        __h = 5 * __h + (int)mTransducer;
        __h = 5 * __h + (int)mCycle;
        __h = 5 * __h + java.lang.Float.floatToIntBits(mSoftwareScaling);
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
        __os.writeLong(mTransducer);
        __os.writeLong(mCycle);
        __os.writeFloat(mSoftwareScaling);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mTransducer = __is.readLong();
        mCycle = __is.readLong();
        mSoftwareScaling = __is.readFloat();
    }
}