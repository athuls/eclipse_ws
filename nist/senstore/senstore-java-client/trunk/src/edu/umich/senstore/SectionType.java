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

public enum SectionType implements java.io.Serializable
{
    SectionTypeBOX,
    SectionTypePROPERTIES,
    SectionTypeRECTANGULAR,
    SectionTypePIPE,
    SectionTypeI,
    SectionTypeL,
    SectionTypeU;

    public static final int _SectionTypeBOX = 0;
    public static final int _SectionTypePROPERTIES = 1;
    public static final int _SectionTypeRECTANGULAR = 2;
    public static final int _SectionTypePIPE = 3;
    public static final int _SectionTypeI = 4;
    public static final int _SectionTypeL = 5;
    public static final int _SectionTypeU = 6;

    public static SectionType
    convert(int val)
    {
        assert val >= 0 && val < 7;
        return values()[val];
    }

    public static SectionType
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

    public static SectionType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(7);
        return SectionType.convert(__v);
    }
}
