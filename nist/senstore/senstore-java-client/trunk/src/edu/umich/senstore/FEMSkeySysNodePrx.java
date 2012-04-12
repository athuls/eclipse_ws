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

public interface FEMSkeySysNodePrx extends Ice.ObjectPrx
{
    public FEMSkeySysNodeFields getFields();
    public FEMSkeySysNodeFields getFields(java.util.Map<String, String> __ctx);

    public void setFields(FEMSkeySysNodeFields fields, String[] fieldNames);
    public void setFields(FEMSkeySysNodeFields fields, String[] fieldNames, java.util.Map<String, String> __ctx);

    public FEMNodePrx getNode1();
    public FEMNodePrx getNode1(java.util.Map<String, String> __ctx);

    public FEMNodePrx getNode2();
    public FEMNodePrx getNode2(java.util.Map<String, String> __ctx);

    public FEMNodePrx getNode3();
    public FEMNodePrx getNode3(java.util.Map<String, String> __ctx);
}
