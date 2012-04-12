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

public enum CoordinateSystemType implements java.io.Serializable
{
    CoordinateSystemTypeCARTESIAN,
    CoordinateSystemTypeSPHERICAL,
    CoordinateSystemTypeCYLINDRICAL;

    public static final int _CoordinateSystemTypeCARTESIAN = 0;
    public static final int _CoordinateSystemTypeSPHERICAL = 1;
    public static final int _CoordinateSystemTypeCYLINDRICAL = 2;

    public static CoordinateSystemType
    convert(int val)
    {
        assert val >= 0 && val < 3;
        return values()[val];
    }

    public static CoordinateSystemType
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

    public static CoordinateSystemType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(3);
        return CoordinateSystemType.convert(__v);
    }
}
