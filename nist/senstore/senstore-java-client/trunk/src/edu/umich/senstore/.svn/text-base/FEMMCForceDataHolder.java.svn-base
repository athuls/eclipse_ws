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

public final class FEMMCForceDataHolder
{
    public
    FEMMCForceDataHolder()
    {
    }

    public
    FEMMCForceDataHolder(FEMMCForceData value)
    {
        this.value = value;
    }

    public class Patcher implements IceInternal.Patcher
    {
        public void
        patch(Ice.Object v)
        {
            try
            {
                value = (FEMMCForceData)v;
            }
            catch(ClassCastException ex)
            {
                IceInternal.Ex.throwUOE(type(), v.ice_id());
            }
        }

        public String
        type()
        {
            return "::SenStore::FEMMCForceData";
        }
    }

    public Patcher
    getPatcher()
    {
        return new Patcher();
    }

    public FEMMCForceData value;
}
