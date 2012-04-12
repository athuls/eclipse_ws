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

public interface FEMIsoBeamPrx extends Ice.ObjectPrx
{
    public FEMIsoBeamFields getFields();
    public FEMIsoBeamFields getFields(java.util.Map<String, String> __ctx);

    public void setFields(FEMIsoBeamFields fields, String[] fieldNames);
    public void setFields(FEMIsoBeamFields fields, String[] fieldNames, java.util.Map<String, String> __ctx);

    public FEMNodePrx getAUX();
    public FEMNodePrx getAUX(java.util.Map<String, String> __ctx);

    public FEMGroupPrx getGroup();
    public FEMGroupPrx getGroup(java.util.Map<String, String> __ctx);

    public FEMNodePrx getN1();
    public FEMNodePrx getN1(java.util.Map<String, String> __ctx);

    public FEMNodePrx getN2();
    public FEMNodePrx getN2(java.util.Map<String, String> __ctx);

    public FEMNodePrx getN3();
    public FEMNodePrx getN3(java.util.Map<String, String> __ctx);

    public FEMNodePrx getN4();
    public FEMNodePrx getN4(java.util.Map<String, String> __ctx);
}
