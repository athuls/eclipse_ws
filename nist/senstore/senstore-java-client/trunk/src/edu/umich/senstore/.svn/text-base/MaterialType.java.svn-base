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

public enum MaterialType implements java.io.Serializable
{
    MaterialTypeELASTIC,
    MaterialTypeORTHOTROPIC,
    MaterialTypeNONLINEARELASTIC,
    MaterialTypePLASTICBILINEAR,
    MaterialTypePLASTICMULTILINEAR,
    MaterialTypeTHERMOISOTROPIC,
    MaterialTypeTHERMOORTHOTROPIC;

    public static final int _MaterialTypeELASTIC = 0;
    public static final int _MaterialTypeORTHOTROPIC = 1;
    public static final int _MaterialTypeNONLINEARELASTIC = 2;
    public static final int _MaterialTypePLASTICBILINEAR = 3;
    public static final int _MaterialTypePLASTICMULTILINEAR = 4;
    public static final int _MaterialTypeTHERMOISOTROPIC = 5;
    public static final int _MaterialTypeTHERMOORTHOTROPIC = 6;

    public static MaterialType
    convert(int val)
    {
        assert val >= 0 && val < 7;
        return values()[val];
    }

    public static MaterialType
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

    public static MaterialType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(7);
        return MaterialType.convert(__v);
    }
}
