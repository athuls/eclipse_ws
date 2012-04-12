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

public final class BoolArray implements java.lang.Cloneable, java.io.Serializable
{
    public long[] shape;

    public boolean[] data;

    public BoolArray()
    {
    }

    public BoolArray(long[] shape, boolean[] data)
    {
        this.shape = shape;
        this.data = data;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        BoolArray _r = null;
        try
        {
            _r = (BoolArray)rhs;
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
                __h = 5 * __h + (data[__i1] ? 1 : 0);
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
        BoolListHelper.write(__os, data);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        shape = DimensionListHelper.read(__is);
        data = BoolListHelper.read(__is);
    }
}
