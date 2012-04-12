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

public final class TimeAxisInfo implements java.lang.Cloneable, java.io.Serializable
{
    public double[] t;

    public long[] idx;

    public TimeAxisInfo()
    {
    }

    public TimeAxisInfo(double[] t, long[] idx)
    {
        this.t = t;
        this.idx = idx;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        TimeAxisInfo _r = null;
        try
        {
            _r = (TimeAxisInfo)rhs;
        }
        catch(ClassCastException ex)
        {
        }

        if(_r != null)
        {
            if(!java.util.Arrays.equals(t, _r.t))
            {
                return false;
            }
            if(!java.util.Arrays.equals(idx, _r.idx))
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
        if(t != null)
        {
            for(int __i0 = 0; __i0 < t.length; __i0++)
            {
                __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(t[__i0]);
            }
        }
        if(idx != null)
        {
            for(int __i1 = 0; __i1 < idx.length; __i1++)
            {
                __h = 5 * __h + (int)idx[__i1];
            }
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
        TimestampListHelper.write(__os, t);
        IndexListHelper.write(__os, idx);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        t = TimestampListHelper.read(__is);
        idx = IndexListHelper.read(__is);
    }
}
