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

public final class FEMMatrixSetsPrxHelper extends Ice.ObjectPrxHelperBase implements FEMMatrixSetsPrx
{
    public FEMMatrixSetsFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMMatrixSetsFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMMatrixSetsFields
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
                _FEMMatrixSetsDel __del = (_FEMMatrixSetsDel)__delBase;
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
    setFields(FEMMatrixSetsFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMMatrixSetsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMMatrixSetsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMMatrixSetsDel __del = (_FEMMatrixSetsDel)__delBase;
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

    public static FEMMatrixSetsPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMMatrixSetsPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMMatrixSetsPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMMatrixSets"))
                {
                    FEMMatrixSetsPrxHelper __h = new FEMMatrixSetsPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMMatrixSetsPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMMatrixSetsPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMMatrixSetsPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMMatrixSets", __ctx))
                {
                    FEMMatrixSetsPrxHelper __h = new FEMMatrixSetsPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMMatrixSetsPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMMatrixSetsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMMatrixSets"))
                {
                    FEMMatrixSetsPrxHelper __h = new FEMMatrixSetsPrxHelper();
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

    public static FEMMatrixSetsPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMMatrixSetsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMMatrixSets", __ctx))
                {
                    FEMMatrixSetsPrxHelper __h = new FEMMatrixSetsPrxHelper();
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

    public static FEMMatrixSetsPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMMatrixSetsPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMMatrixSetsPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMMatrixSetsPrxHelper __h = new FEMMatrixSetsPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMMatrixSetsPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMMatrixSetsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMMatrixSetsPrxHelper __h = new FEMMatrixSetsPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMMatrixSetsDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMMatrixSetsDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMMatrixSetsPrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMMatrixSetsPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMMatrixSetsPrxHelper result = new FEMMatrixSetsPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
