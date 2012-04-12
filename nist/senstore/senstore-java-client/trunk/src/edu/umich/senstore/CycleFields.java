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

public final class CycleFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mTime;

    public long mExperiment;

    public CycleFields()
    {
    }

    public CycleFields(long id, double mTime, long mExperiment)
    {
        this.id = id;
        this.mTime = mTime;
        this.mExperiment = mExperiment;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        CycleFields _r = null;
        try
        {
            _r = (CycleFields)rhs;
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
            if(mTime != _r.mTime)
            {
                return false;
            }
            if(mExperiment != _r.mExperiment)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTime);
        __h = 5 * __h + (int)mExperiment;
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
        __os.writeDouble(mTime);
        __os.writeLong(mExperiment);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mTime = __is.readDouble();
        mExperiment = __is.readLong();
    }
}
