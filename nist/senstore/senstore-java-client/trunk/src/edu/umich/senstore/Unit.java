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

public enum Unit implements java.io.Serializable
{
    UnitMETER,
    UnitKILOGRAM,
    UnitNEWTON,
    UnitFOOT,
    UnitPOUND,
    UnitKILOPOUND,
    UnitSLUG,
    UnitKILOSLUG;

    public static final int _UnitMETER = 0;
    public static final int _UnitKILOGRAM = 1;
    public static final int _UnitNEWTON = 2;
    public static final int _UnitFOOT = 3;
    public static final int _UnitPOUND = 4;
    public static final int _UnitKILOPOUND = 5;
    public static final int _UnitSLUG = 6;
    public static final int _UnitKILOSLUG = 7;

    public static Unit
    convert(int val)
    {
        assert val >= 0 && val < 8;
        return values()[val];
    }

    public static Unit
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

    public static Unit
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(8);
        return Unit.convert(__v);
    }
}
