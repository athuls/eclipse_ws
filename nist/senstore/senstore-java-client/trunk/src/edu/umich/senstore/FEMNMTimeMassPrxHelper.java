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

public final class FEMNMTimeMassPrxHelper extends Ice.ObjectPrxHelperBase implements FEMNMTimeMassPrx
{
    public FEMNMTimeMassFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMNMTimeMassFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMNMTimeMassFields
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
                _FEMNMTimeMassDel __del = (_FEMNMTimeMassDel)__delBase;
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
    setFields(FEMNMTimeMassFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMNMTimeMassFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMNMTimeMassFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMNMTimeMassDel __del = (_FEMNMTimeMassDel)__delBase;
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

    public static FEMNMTimeMassPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMNMTimeMassPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMNMTimeMassPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMNMTimeMass"))
                {
                    FEMNMTimeMassPrxHelper __h = new FEMNMTimeMassPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMNMTimeMassPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMNMTimeMassPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMNMTimeMassPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMNMTimeMass", __ctx))
                {
                    FEMNMTimeMassPrxHelper __h = new FEMNMTimeMassPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMNMTimeMassPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMNMTimeMassPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMNMTimeMass"))
                {
                    FEMNMTimeMassPrxHelper __h = new FEMNMTimeMassPrxHelper();
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

    public static FEMNMTimeMassPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMNMTimeMassPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMNMTimeMass", __ctx))
                {
                    FEMNMTimeMassPrxHelper __h = new FEMNMTimeMassPrxHelper();
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

    public static FEMNMTimeMassPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMNMTimeMassPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMNMTimeMassPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMNMTimeMassPrxHelper __h = new FEMNMTimeMassPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMNMTimeMassPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMNMTimeMassPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMNMTimeMassPrxHelper __h = new FEMNMTimeMassPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMNMTimeMassDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMNMTimeMassDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMNMTimeMassPrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMNMTimeMassPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMNMTimeMassPrxHelper result = new FEMNMTimeMassPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
