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

public interface FEMAppliedConcentratedLoadPrx extends Ice.ObjectPrx
{
    public FEMAppliedConcentratedLoadFields getFields();
    public FEMAppliedConcentratedLoadFields getFields(java.util.Map<String, String> __ctx);

    public void setFields(FEMAppliedConcentratedLoadFields fields, String[] fieldNames);
    public void setFields(FEMAppliedConcentratedLoadFields fields, String[] fieldNames, java.util.Map<String, String> __ctx);

    public FEMNodePrx getNodeAux();
    public FEMNodePrx getNodeAux(java.util.Map<String, String> __ctx);

    public FEMNodePrx getNodeID();
    public FEMNodePrx getNodeID(java.util.Map<String, String> __ctx);
}
