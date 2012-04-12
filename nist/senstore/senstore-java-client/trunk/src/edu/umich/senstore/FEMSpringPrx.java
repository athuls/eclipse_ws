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

public interface FEMSpringPrx extends Ice.ObjectPrx
{
    public FEMSpringFields getFields();
    public FEMSpringFields getFields(java.util.Map<String, String> __ctx);

    public void setFields(FEMSpringFields fields, String[] fieldNames);
    public void setFields(FEMSpringFields fields, String[] fieldNames, java.util.Map<String, String> __ctx);

    public FEMGroupPrx getGroup();
    public FEMGroupPrx getGroup(java.util.Map<String, String> __ctx);

    public FEMNodePrx getN1();
    public FEMNodePrx getN1(java.util.Map<String, String> __ctx);

    public FEMNodePrx getN2();
    public FEMNodePrx getN2(java.util.Map<String, String> __ctx);
}
