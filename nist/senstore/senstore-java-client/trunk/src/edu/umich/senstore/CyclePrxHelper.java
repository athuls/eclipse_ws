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

public final class CyclePrxHelper extends Ice.ObjectPrxHelperBase implements CyclePrx
{
    public ExperimentPrx
    getExperiment()
    {
        return getExperiment(null, false);
    }

    public ExperimentPrx
    getExperiment(java.util.Map<String, String> __ctx)
    {
        return getExperiment(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private ExperimentPrx
    getExperiment(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getExperiment");
                __delBase = __getDelegate(false);
                _CycleDel __del = (_CycleDel)__delBase;
                return __del.getExperiment(__ctx);
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

    public CycleFields
    getFields()
    {
        return getFields(null, false);
    }

    public CycleFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private CycleFields
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
                _CycleDel __del = (_CycleDel)__delBase;
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

    public void
    setFields(CycleFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(CycleFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(CycleFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _CycleDel __del = (_CycleDel)__delBase;
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

    public static CyclePrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        CyclePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (CyclePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::Cycle"))
                {
                    CyclePrxHelper __h = new CyclePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static CyclePrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        CyclePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (CyclePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::Cycle", __ctx))
                {
                    CyclePrxHelper __h = new CyclePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static CyclePrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        CyclePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::Cycle"))
                {
                    CyclePrxHelper __h = new CyclePrxHelper();
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

    public static CyclePrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        CyclePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::Cycle", __ctx))
                {
                    CyclePrxHelper __h = new CyclePrxHelper();
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

    public static CyclePrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        CyclePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (CyclePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                CyclePrxHelper __h = new CyclePrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static CyclePrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        CyclePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            CyclePrxHelper __h = new CyclePrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _CycleDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _CycleDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, CyclePrx v)
    {
        __os.writeProxy(v);
    }

    public static CyclePrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            CyclePrxHelper result = new CyclePrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
