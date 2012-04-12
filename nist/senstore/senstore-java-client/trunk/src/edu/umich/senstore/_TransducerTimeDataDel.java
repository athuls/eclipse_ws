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

public interface _TransducerTimeDataDel extends Ice._ObjectDel
{
    TransducerTimeDataFields getFields(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void setFields(TransducerTimeDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    TransducerPrx getTransducer(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    SensorPrx getSensor(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FEMNodePrx getNode(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;
}
