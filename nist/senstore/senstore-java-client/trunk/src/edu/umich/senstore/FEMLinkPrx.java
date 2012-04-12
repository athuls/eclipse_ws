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

public interface FEMLinkPrx extends Ice.ObjectPrx
{
    public FEMLinkFields getFields();
    public FEMLinkFields getFields(java.util.Map<String, String> __ctx);

    public void setFields(FEMLinkFields fields, String[] fieldNames);
    public void setFields(FEMLinkFields fields, String[] fieldNames, java.util.Map<String, String> __ctx);

    public FEMNodePrx getMasterNode();
    public FEMNodePrx getMasterNode(java.util.Map<String, String> __ctx);

    public FEMNodePrx getSlaveNode();
    public FEMNodePrx getSlaveNode(java.util.Map<String, String> __ctx);
}
