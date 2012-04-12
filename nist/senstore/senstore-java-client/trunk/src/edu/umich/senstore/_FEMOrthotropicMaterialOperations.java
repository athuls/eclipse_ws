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

public interface _FEMOrthotropicMaterialOperations
{
    FEMOrthotropicMaterialFields getFields(Ice.Current __current);

    void setFields(FEMOrthotropicMaterialFields fields, String[] fieldNames, Ice.Current __current);

    FEMMaterialPrx getMaterial(Ice.Current __current);
}
