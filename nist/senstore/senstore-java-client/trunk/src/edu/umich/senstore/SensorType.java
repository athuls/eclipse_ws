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

public enum SensorType implements java.io.Serializable
{
    SensorTypeACCELEROMETER,
    SensorTypeANEMOMETER,
    SensorTypeWINDVANE,
    SensorTypeSTRAINGAUGE;

    public static final int _SensorTypeACCELEROMETER = 0;
    public static final int _SensorTypeANEMOMETER = 1;
    public static final int _SensorTypeWINDVANE = 2;
    public static final int _SensorTypeSTRAINGAUGE = 3;

    public static SensorType
    convert(int val)
    {
        assert val >= 0 && val < 4;
        return values()[val];
    }

    public static SensorType
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

    public static SensorType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(4);
        return SensorType.convert(__v);
    }
}
