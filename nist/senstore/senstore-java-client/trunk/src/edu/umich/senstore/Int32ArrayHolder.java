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

public final class Int32ArrayHolder
{
    public
    Int32ArrayHolder()
    {
    }

    public
    Int32ArrayHolder(Int32Array value)
    {
        this.value = value;
    }

    public Int32Array value;
}