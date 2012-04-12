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

public interface FEMBeamLoadPrx extends Ice.ObjectPrx
{
    public FEMBeamLoadFields getFields();
    public FEMBeamLoadFields getFields(java.util.Map<String, String> __ctx);

    public void setFields(FEMBeamLoadFields fields, String[] fieldNames);
    public void setFields(FEMBeamLoadFields fields, String[] fieldNames, java.util.Map<String, String> __ctx);

    public FEMGroupPrx getGroup();
    public FEMGroupPrx getGroup(java.util.Map<String, String> __ctx);
}
