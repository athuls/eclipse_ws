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

public interface _FEMTwoDSolidOperations
{
    FEMTwoDSolidFields getFields(Ice.Current __current);

    void setFields(FEMTwoDSolidFields fields, String[] fieldNames, Ice.Current __current);

    FEMGroupPrx getGroup(Ice.Current __current);

    FEMNodePrx getN1(Ice.Current __current);

    FEMNodePrx getN2(Ice.Current __current);

    FEMNodePrx getN3(Ice.Current __current);

    FEMNodePrx getN4(Ice.Current __current);

    FEMNodePrx getN5(Ice.Current __current);

    FEMNodePrx getN6(Ice.Current __current);

    FEMNodePrx getN7(Ice.Current __current);

    FEMNodePrx getN8(Ice.Current __current);

    FEMNodePrx getN9(Ice.Current __current);
}
