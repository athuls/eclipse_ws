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

public final class IndexListHelper
{
    public static void
    write(IceInternal.BasicStream __os, long[] __v)
    {
        __os.writeLongSeq(__v);
    }

    public static long[]
    read(IceInternal.BasicStream __is)
    {
        long[] __v;
        __v = __is.readLongSeq();
        return __v;
    }
}
