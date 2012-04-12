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

public final class ArraySlice implements java.lang.Cloneable, java.io.Serializable
{
    public int start;

    public int step;

    public int end;

    public ArraySlice()
    {
    }

    public ArraySlice(int start, int step, int end)
    {
        this.start = start;
        this.step = step;
        this.end = end;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        ArraySlice _r = null;
        try
        {
            _r = (ArraySlice)rhs;
        }
        catch(ClassCastException ex)
        {
        }

        if(_r != null)
        {
            if(start != _r.start)
            {
                return false;
            }
            if(step != _r.step)
            {
                return false;
            }
            if(end != _r.end)
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
        __h = 5 * __h + start;
        __h = 5 * __h + step;
        __h = 5 * __h + end;
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
        __os.writeInt(start);
        __os.writeInt(step);
        __os.writeInt(end);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        start = __is.readInt();
        step = __is.readInt();
        end = __is.readInt();
    }
}
