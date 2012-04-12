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

public enum BoundaryType implements java.io.Serializable
{
    BoundaryTypeFREE,
    BoundaryTypeFIXED;

    public static final int _BoundaryTypeFREE = 0;
    public static final int _BoundaryTypeFIXED = 1;

    public static BoundaryType
    convert(int val)
    {
        assert val >= 0 && val < 2;
        return values()[val];
    }

    public static BoundaryType
    convert(String val)
    {
        try
        {
            return valueOf(val);
        }
        catch(java.lang.IllegalArgumentException ex)
        {
            return null;
        }
    }

    public int
    value()
    {
        return ordinal();
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeByte((byte)value());
    }

    public static BoundaryType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(2);
        return BoundaryType.convert(__v);
    }
}
