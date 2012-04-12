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

public final class Float32ListHelper
{
    public static void
    write(IceInternal.BasicStream __os, float[] __v)
    {
        __os.writeFloatSeq(__v);
    }

    public static float[]
    read(IceInternal.BasicStream __is)
    {
        float[] __v;
        __v = __is.readFloatSeq();
        return __v;
    }
}
