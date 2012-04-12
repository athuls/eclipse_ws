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

public final class FEMTimeFunctionDataPrxHelper extends Ice.ObjectPrxHelperBase implements FEMTimeFunctionDataPrx
{
    public FEMTimeFunctionDataFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMTimeFunctionDataFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMTimeFunctionDataFields
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
                _FEMTimeFunctionDataDel __del = (_FEMTimeFunctionDataDel)__delBase;
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
    setFields(FEMTimeFunctionDataFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMTimeFunctionDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMTimeFunctionDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMTimeFunctionDataDel __del = (_FEMTimeFunctionDataDel)__delBase;
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

    public static FEMTimeFunctionDataPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMTimeFunctionDataPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMTimeFunctionDataPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMTimeFunctionData"))
                {
                    FEMTimeFunctionDataPrxHelper __h = new FEMTimeFunctionDataPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMTimeFunctionDataPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMTimeFunctionDataPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMTimeFunctionDataPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMTimeFunctionData", __ctx))
                {
                    FEMTimeFunctionDataPrxHelper __h = new FEMTimeFunctionDataPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMTimeFunctionDataPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMTimeFunctionDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMTimeFunctionData"))
                {
                    FEMTimeFunctionDataPrxHelper __h = new FEMTimeFunctionDataPrxHelper();
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

    public static FEMTimeFunctionDataPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMTimeFunctionDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMTimeFunctionData", __ctx))
                {
                    FEMTimeFunctionDataPrxHelper __h = new FEMTimeFunctionDataPrxHelper();
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

    public static FEMTimeFunctionDataPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMTimeFunctionDataPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMTimeFunctionDataPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMTimeFunctionDataPrxHelper __h = new FEMTimeFunctionDataPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMTimeFunctionDataPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMTimeFunctionDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMTimeFunctionDataPrxHelper __h = new FEMTimeFunctionDataPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMTimeFunctionDataDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMTimeFunctionDataDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMTimeFunctionDataPrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMTimeFunctionDataPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMTimeFunctionDataPrxHelper result = new FEMTimeFunctionDataPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
