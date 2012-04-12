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

public final class TimestampSignal implements java.lang.Cloneable, java.io.Serializable
{
    public long[] shape;

    public double[] data;

    public double[] t;

    public TimestampSignal()
    {
    }

    public TimestampSignal(long[] shape, double[] data, double[] t)
    {
        this.shape = shape;
        this.data = data;
        this.t = t;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        TimestampSignal _r = null;
        try
        {
            _r = (TimestampSignal)rhs;
        }
        catch(ClassCastException ex)
        {
        }

        if(_r != null)
        {
            if(!java.util.Arrays.equals(shape, _r.shape))
            {
                return false;
            }
            if(!java.util.Arrays.equals(data, _r.data))
            {
                return false;
            }
            if(!java.util.Arrays.equals(t, _r.t))
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
        if(shape != null)
        {
            for(int __i0 = 0; __i0 < shape.length; __i0++)
            {
                __h = 5 * __h + (int)shape[__i0];
            }
        }
        if(data != null)
        {
            for(int __i1 = 0; __i1 < data.length; __i1++)
            {
                __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(data[__i1]);
            }
        }
        if(t != null)
        {
            for(int __i2 = 0; __i2 < t.length; __i2++)
            {
                __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(t[__i2]);
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
        DimensionListHelper.write(__os, shape);
        TimestampListHelper.write(__os, data);
        TimestampListHelper.write(__os, t);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        shape = DimensionListHelper.read(__is);
        data = TimestampListHelper.read(__is);
        t = TimestampListHelper.read(__is);
    }
}
