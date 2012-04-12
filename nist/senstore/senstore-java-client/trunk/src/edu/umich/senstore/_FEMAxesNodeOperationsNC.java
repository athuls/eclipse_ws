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

public interface _FEMAxesNodeOperationsNC
{
    FEMAxesNodeFields getFields();

    void setFields(FEMAxesNodeFields fields, String[] fieldNames);

    FEMGroupPrx getGroup();

    FEMNodePrx getNode1();

    FEMNodePrx getNode2();

    FEMNodePrx getNode3();
}
