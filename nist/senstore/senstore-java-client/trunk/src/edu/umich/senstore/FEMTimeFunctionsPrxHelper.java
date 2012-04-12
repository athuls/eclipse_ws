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

public final class FEMTimeFunctionsPrxHelper extends Ice.ObjectPrxHelperBase implements FEMTimeFunctionsPrx
{
    public FEMTimeFunctionsFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMTimeFunctionsFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMTimeFunctionsFields
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
                _FEMTimeFunctionsDel __del = (_FEMTimeFunctionsDel)__delBase;
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
    setFields(FEMTimeFunctionsFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMTimeFunctionsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMTimeFunctionsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMTimeFunctionsDel __del = (_FEMTimeFunctionsDel)__delBase;
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

    public static FEMTimeFunctionsPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMTimeFunctionsPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMTimeFunctionsPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMTimeFunctions"))
                {
                    FEMTimeFunctionsPrxHelper __h = new FEMTimeFunctionsPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMTimeFunctionsPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMTimeFunctionsPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMTimeFunctionsPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMTimeFunctions", __ctx))
                {
                    FEMTimeFunctionsPrxHelper __h = new FEMTimeFunctionsPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMTimeFunctionsPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMTimeFunctionsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMTimeFunctions"))
                {
                    FEMTimeFunctionsPrxHelper __h = new FEMTimeFunctionsPrxHelper();
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

    public static FEMTimeFunctionsPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMTimeFunctionsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMTimeFunctions", __ctx))
                {
                    FEMTimeFunctionsPrxHelper __h = new FEMTimeFunctionsPrxHelper();
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

    public static FEMTimeFunctionsPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMTimeFunctionsPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMTimeFunctionsPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMTimeFunctionsPrxHelper __h = new FEMTimeFunctionsPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMTimeFunctionsPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMTimeFunctionsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMTimeFunctionsPrxHelper __h = new FEMTimeFunctionsPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMTimeFunctionsDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMTimeFunctionsDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMTimeFunctionsPrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMTimeFunctionsPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMTimeFunctionsPrxHelper result = new FEMTimeFunctionsPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
