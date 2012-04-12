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

public final class FEMAppliedLoadsPrxHelper extends Ice.ObjectPrxHelperBase implements FEMAppliedLoadsPrx
{
    public FEMAppliedLoadsFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMAppliedLoadsFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMAppliedLoadsFields
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
                _FEMAppliedLoadsDel __del = (_FEMAppliedLoadsDel)__delBase;
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
    setFields(FEMAppliedLoadsFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMAppliedLoadsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMAppliedLoadsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMAppliedLoadsDel __del = (_FEMAppliedLoadsDel)__delBase;
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

    public static FEMAppliedLoadsPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMAppliedLoadsPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMAppliedLoadsPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMAppliedLoads"))
                {
                    FEMAppliedLoadsPrxHelper __h = new FEMAppliedLoadsPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMAppliedLoadsPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMAppliedLoadsPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMAppliedLoadsPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMAppliedLoads", __ctx))
                {
                    FEMAppliedLoadsPrxHelper __h = new FEMAppliedLoadsPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMAppliedLoadsPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMAppliedLoadsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMAppliedLoads"))
                {
                    FEMAppliedLoadsPrxHelper __h = new FEMAppliedLoadsPrxHelper();
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

    public static FEMAppliedLoadsPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMAppliedLoadsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMAppliedLoads", __ctx))
                {
                    FEMAppliedLoadsPrxHelper __h = new FEMAppliedLoadsPrxHelper();
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

    public static FEMAppliedLoadsPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMAppliedLoadsPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMAppliedLoadsPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMAppliedLoadsPrxHelper __h = new FEMAppliedLoadsPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMAppliedLoadsPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMAppliedLoadsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMAppliedLoadsPrxHelper __h = new FEMAppliedLoadsPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMAppliedLoadsDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMAppliedLoadsDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMAppliedLoadsPrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMAppliedLoadsPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMAppliedLoadsPrxHelper result = new FEMAppliedLoadsPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
