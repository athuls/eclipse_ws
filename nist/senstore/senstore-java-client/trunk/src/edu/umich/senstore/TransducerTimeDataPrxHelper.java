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

public final class TransducerTimeDataPrxHelper extends Ice.ObjectPrxHelperBase implements TransducerTimeDataPrx
{
    public TransducerTimeDataFields
    getFields()
    {
        return getFields(null, false);
    }

    public TransducerTimeDataFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private TransducerTimeDataFields
    getFields(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getFields");
                __delBase = __getDelegate(false);
                _TransducerTimeDataDel __del = (_TransducerTimeDataDel)__delBase;
                return __del.getFields(__ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, null, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    public FEMNodePrx
    getNode()
    {
        return getNode(null, false);
    }

    public FEMNodePrx
    getNode(java.util.Map<String, String> __ctx)
    {
        return getNode(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMNodePrx
    getNode(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getNode");
                __delBase = __getDelegate(false);
                _TransducerTimeDataDel __del = (_TransducerTimeDataDel)__delBase;
                return __del.getNode(__ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, null, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    public SensorPrx
    getSensor()
    {
        return getSensor(null, false);
    }

    public SensorPrx
    getSensor(java.util.Map<String, String> __ctx)
    {
        return getSensor(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private SensorPrx
    getSensor(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getSensor");
                __delBase = __getDelegate(false);
                _TransducerTimeDataDel __del = (_TransducerTimeDataDel)__delBase;
                return __del.getSensor(__ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, null, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    public TransducerPrx
    getTransducer()
    {
        return getTransducer(null, false);
    }

    public TransducerPrx
    getTransducer(java.util.Map<String, String> __ctx)
    {
        return getTransducer(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private TransducerPrx
    getTransducer(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getTransducer");
                __delBase = __getDelegate(false);
                _TransducerTimeDataDel __del = (_TransducerTimeDataDel)__delBase;
                return __del.getTransducer(__ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, null, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    public void
    setFields(TransducerTimeDataFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(TransducerTimeDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(TransducerTimeDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __delBase = __getDelegate(false);
                _TransducerTimeDataDel __del = (_TransducerTimeDataDel)__delBase;
                __del.setFields(fields, fieldNames, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, null, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    public static TransducerTimeDataPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        TransducerTimeDataPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (TransducerTimeDataPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::TransducerTimeData"))
                {
                    TransducerTimeDataPrxHelper __h = new TransducerTimeDataPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static TransducerTimeDataPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        TransducerTimeDataPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (TransducerTimeDataPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::TransducerTimeData", __ctx))
                {
                    TransducerTimeDataPrxHelper __h = new TransducerTimeDataPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static TransducerTimeDataPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        TransducerTimeDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::TransducerTimeData"))
                {
                    TransducerTimeDataPrxHelper __h = new TransducerTimeDataPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static TransducerTimeDataPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        TransducerTimeDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::TransducerTimeData", __ctx))
                {
                    TransducerTimeDataPrxHelper __h = new TransducerTimeDataPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static TransducerTimeDataPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        TransducerTimeDataPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (TransducerTimeDataPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                TransducerTimeDataPrxHelper __h = new TransducerTimeDataPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static TransducerTimeDataPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        TransducerTimeDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            TransducerTimeDataPrxHelper __h = new TransducerTimeDataPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _TransducerTimeDataDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _TransducerTimeDataDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, TransducerTimeDataPrx v)
    {
        __os.writeProxy(v);
    }

    public static TransducerTimeDataPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            TransducerTimeDataPrxHelper result = new TransducerTimeDataPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
