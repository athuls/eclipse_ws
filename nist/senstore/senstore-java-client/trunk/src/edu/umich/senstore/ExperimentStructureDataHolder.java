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

public final class ExperimentStructureDataHolder
{
    public
    ExperimentStructureDataHolder()
    {
    }

    public
    ExperimentStructureDataHolder(ExperimentStructureData value)
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
                value = (ExperimentStructureData)v;
            }
            catch(ClassCastException ex)
            {
                IceInternal.Ex.throwUOE(type(), v.ice_id());
            }
        }

        public String
        type()
        {
            return "::SenStore::ExperimentStructureData";
        }
    }

    public Patcher
    getPatcher()
    {
        return new Patcher();
    }

    public ExperimentStructureData value;
}
