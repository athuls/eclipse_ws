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

public enum Quantity implements java.io.Serializable
{
    QuantityXDISPLACEMENT,
    QuantityYDISPLACEMENT,
    QuantityZDISPLACEMENT,
    QuantityXROTATION,
    QuantityYROTATION,
    QuantityZROTATION,
    QuantityXFORCE,
    QuantityYFORCE,
    QuantityZFORCE,
    QuantityRAW;

    public static final int _QuantityXDISPLACEMENT = 0;
    public static final int _QuantityYDISPLACEMENT = 1;
    public static final int _QuantityZDISPLACEMENT = 2;
    public static final int _QuantityXROTATION = 3;
    public static final int _QuantityYROTATION = 4;
    public static final int _QuantityZROTATION = 5;
    public static final int _QuantityXFORCE = 6;
    public static final int _QuantityYFORCE = 7;
    public static final int _QuantityZFORCE = 8;
    public static final int _QuantityRAW = 9;

    public static Quantity
    convert(int val)
    {
        assert val >= 0 && val < 10;
        return values()[val];
    }

    public static Quantity
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

    public static Quantity
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(10);
        return Quantity.convert(__v);
    }
}
