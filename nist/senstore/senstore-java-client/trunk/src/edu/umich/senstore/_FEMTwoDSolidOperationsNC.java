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

public interface _FEMTwoDSolidOperationsNC
{
    FEMTwoDSolidFields getFields();

    void setFields(FEMTwoDSolidFields fields, String[] fieldNames);

    FEMGroupPrx getGroup();

    FEMNodePrx getN1();

    FEMNodePrx getN2();

    FEMNodePrx getN3();

    FEMNodePrx getN4();

    FEMNodePrx getN5();

    FEMNodePrx getN6();

    FEMNodePrx getN7();

    FEMNodePrx getN8();

    FEMNodePrx getN9();
}
