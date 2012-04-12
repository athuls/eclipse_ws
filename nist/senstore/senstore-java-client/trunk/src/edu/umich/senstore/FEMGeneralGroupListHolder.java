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

public final class FEMGeneralGroupListHolder
{
    public
    FEMGeneralGroupListHolder()
    {
    }

    public
    FEMGeneralGroupListHolder(FEMGeneralGroupPrx[] value)
    {
        this.value = value;
    }

    public FEMGeneralGroupPrx[] value;
}
