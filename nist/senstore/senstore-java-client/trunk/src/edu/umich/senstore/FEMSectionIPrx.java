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

public interface FEMSectionIPrx extends Ice.ObjectPrx
{
    public FEMSectionIFields getFields();
    public FEMSectionIFields getFields(java.util.Map<String, String> __ctx);

    public void setFields(FEMSectionIFields fields, String[] fieldNames);
    public void setFields(FEMSectionIFields fields, String[] fieldNames, java.util.Map<String, String> __ctx);
}
