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

public enum ClassType implements java.io.Serializable
{
    ClassTypeCLASS,
    ClassTypeARRAY,
    ClassTypeSIGNAL;

    public static final int _ClassTypeCLASS = 0;
    public static final int _ClassTypeARRAY = 1;
    public static final int _ClassTypeSIGNAL = 2;

    public static ClassType
    convert(int val)
    {
        assert val >= 0 && val < 3;
        return values()[val];
    }

    public static ClassType
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

    public static ClassType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(3);
        return ClassType.convert(__v);
    }
}
