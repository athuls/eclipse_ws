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

public final class FEMAppliedConcentratedLoadPrxHelper extends Ice.ObjectPrxHelperBase implements FEMAppliedConcentratedLoadPrx
{
    public FEMAppliedConcentratedLoadFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMAppliedConcentratedLoadFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMAppliedConcentratedLoadFields
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
                _FEMAppliedConcentratedLoadDel __del = (_FEMAppliedConcentratedLoadDel)__delBase;
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
    getNodeAux()
    {
        return getNodeAux(null, false);
    }

    public FEMNodePrx
    getNodeAux(java.util.Map<String, String> __ctx)
    {
        return getNodeAux(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMNodePrx
    getNodeAux(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getNodeAux");
                __delBase = __getDelegate(false);
                _FEMAppliedConcentratedLoadDel __del = (_FEMAppliedConcentratedLoadDel)__delBase;
                return __del.getNodeAux(__ctx);
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
    getNodeID()
    {
        return getNodeID(null, false);
    }

    public FEMNodePrx
    getNodeID(java.util.Map<String, String> __ctx)
    {
        return getNodeID(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMNodePrx
    getNodeID(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getNodeID");
                __delBase = __getDelegate(false);
                _FEMAppliedConcentratedLoadDel __del = (_FEMAppliedConcentratedLoadDel)__delBase;
                return __del.getNodeID(__ctx);
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
    setFields(FEMAppliedConcentratedLoadFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMAppliedConcentratedLoadFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMAppliedConcentratedLoadFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMAppliedConcentratedLoadDel __del = (_FEMAppliedConcentratedLoadDel)__delBase;
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

    public static FEMAppliedConcentratedLoadPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMAppliedConcentratedLoadPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMAppliedConcentratedLoadPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMAppliedConcentratedLoad"))
                {
                    FEMAppliedConcentratedLoadPrxHelper __h = new FEMAppliedConcentratedLoadPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMAppliedConcentratedLoadPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMAppliedConcentratedLoadPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMAppliedConcentratedLoadPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMAppliedConcentratedLoad", __ctx))
                {
                    FEMAppliedConcentratedLoadPrxHelper __h = new FEMAppliedConcentratedLoadPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMAppliedConcentratedLoadPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMAppliedConcentratedLoadPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMAppliedConcentratedLoad"))
                {
                    FEMAppliedConcentratedLoadPrxHelper __h = new FEMAppliedConcentratedLoadPrxHelper();
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

    public static FEMAppliedConcentratedLoadPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMAppliedConcentratedLoadPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMAppliedConcentratedLoad", __ctx))
                {
                    FEMAppliedConcentratedLoadPrxHelper __h = new FEMAppliedConcentratedLoadPrxHelper();
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

    public static FEMAppliedConcentratedLoadPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMAppliedConcentratedLoadPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMAppliedConcentratedLoadPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMAppliedConcentratedLoadPrxHelper __h = new FEMAppliedConcentratedLoadPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMAppliedConcentratedLoadPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMAppliedConcentratedLoadPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMAppliedConcentratedLoadPrxHelper __h = new FEMAppliedConcentratedLoadPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMAppliedConcentratedLoadDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMAppliedConcentratedLoadDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMAppliedConcentratedLoadPrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMAppliedConcentratedLoadPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMAppliedConcentratedLoadPrxHelper result = new FEMAppliedConcentratedLoadPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
