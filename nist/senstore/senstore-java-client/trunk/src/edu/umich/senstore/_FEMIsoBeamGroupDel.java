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

public interface _FEMIsoBeamGroupDel extends Ice._ObjectDel
{
    FEMIsoBeamGroupFields getFields(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFields(FEMIsoBeamGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMGroupPrx getGroup(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;
}
