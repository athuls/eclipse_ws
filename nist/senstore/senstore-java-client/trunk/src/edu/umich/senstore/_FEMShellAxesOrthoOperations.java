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

public interface _FEMShellAxesOrthoOperations
{
    FEMShellAxesOrthoFields getFields(Ice.Current __current);

    void setFields(FEMShellAxesOrthoFields fields, String[] fieldNames, Ice.Current __current);

    FEMGroupPrx getGroup(Ice.Current __current);
}
