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

public enum GroupType implements java.io.Serializable
{
    GroupTypeBEAM,
    GroupTypeTRUSS,
    GroupTypeGENERAL,
    GroupTypeISOBEAM,
    GroupTypePLATE,
    GroupTypeSHELL,
    GroupTypeSPRING,
    GroupTypeTHREEDSOLID,
    GroupTypeTWODSOLID;

    public static final int _GroupTypeBEAM = 0;
    public static final int _GroupTypeTRUSS = 1;
    public static final int _GroupTypeGENERAL = 2;
    public static final int _GroupTypeISOBEAM = 3;
    public static final int _GroupTypePLATE = 4;
    public static final int _GroupTypeSHELL = 5;
    public static final int _GroupTypeSPRING = 6;
    public static final int _GroupTypeTHREEDSOLID = 7;
    public static final int _GroupTypeTWODSOLID = 8;

    public static GroupType
    convert(int val)
    {
        assert val >= 0 && val < 9;
        return values()[val];
    }

    public static GroupType
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

    public static GroupType
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readByte(9);
        return GroupType.convert(__v);
    }
}
