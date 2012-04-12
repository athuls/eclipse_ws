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

public final class FEMPropertysetsPrxHelper extends Ice.ObjectPrxHelperBase implements FEMPropertysetsPrx
{
    public FEMPropertysetsFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMPropertysetsFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMPropertysetsFields
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
                _FEMPropertysetsDel __del = (_FEMPropertysetsDel)__delBase;
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
    setFields(FEMPropertysetsFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMPropertysetsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMPropertysetsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMPropertysetsDel __del = (_FEMPropertysetsDel)__delBase;
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

    public static FEMPropertysetsPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMPropertysetsPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMPropertysetsPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMPropertysets"))
                {
                    FEMPropertysetsPrxHelper __h = new FEMPropertysetsPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMPropertysetsPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMPropertysetsPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMPropertysetsPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMPropertysets", __ctx))
                {
                    FEMPropertysetsPrxHelper __h = new FEMPropertysetsPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMPropertysetsPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMPropertysetsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMPropertysets"))
                {
                    FEMPropertysetsPrxHelper __h = new FEMPropertysetsPrxHelper();
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

    public static FEMPropertysetsPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMPropertysetsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMPropertysets", __ctx))
                {
                    FEMPropertysetsPrxHelper __h = new FEMPropertysetsPrxHelper();
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

    public static FEMPropertysetsPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMPropertysetsPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMPropertysetsPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMPropertysetsPrxHelper __h = new FEMPropertysetsPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMPropertysetsPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMPropertysetsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMPropertysetsPrxHelper __h = new FEMPropertysetsPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMPropertysetsDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMPropertysetsDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMPropertysetsPrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMPropertysetsPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMPropertysetsPrxHelper result = new FEMPropertysetsPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
