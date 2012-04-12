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

public interface FEMBeamNodePrx extends Ice.ObjectPrx
{
    public FEMBeamNodeFields getFields();
    public FEMBeamNodeFields getFields(java.util.Map<String, String> __ctx);

    public void setFields(FEMBeamNodeFields fields, String[] fieldNames);
    public void setFields(FEMBeamNodeFields fields, String[] fieldNames, java.util.Map<String, String> __ctx);

    public FEMGroupPrx getGroup();
    public FEMGroupPrx getGroup(java.util.Map<String, String> __ctx);
}
