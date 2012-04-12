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

public final class FEMMatrixDataPrxHelper extends Ice.ObjectPrxHelperBase implements FEMMatrixDataPrx
{
    public FEMMatrixDataFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMMatrixDataFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMMatrixDataFields
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
                _FEMMatrixDataDel __del = (_FEMMatrixDataDel)__delBase;
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
    setFields(FEMMatrixDataFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMMatrixDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMMatrixDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMMatrixDataDel __del = (_FEMMatrixDataDel)__delBase;
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

    public static FEMMatrixDataPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMMatrixDataPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMMatrixDataPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMMatrixData"))
                {
                    FEMMatrixDataPrxHelper __h = new FEMMatrixDataPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMMatrixDataPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMMatrixDataPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMMatrixDataPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMMatrixData", __ctx))
                {
                    FEMMatrixDataPrxHelper __h = new FEMMatrixDataPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMMatrixDataPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMMatrixDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMMatrixData"))
                {
                    FEMMatrixDataPrxHelper __h = new FEMMatrixDataPrxHelper();
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

    public static FEMMatrixDataPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMMatrixDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMMatrixData", __ctx))
                {
                    FEMMatrixDataPrxHelper __h = new FEMMatrixDataPrxHelper();
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

    public static FEMMatrixDataPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMMatrixDataPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMMatrixDataPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMMatrixDataPrxHelper __h = new FEMMatrixDataPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMMatrixDataPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMMatrixDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMMatrixDataPrxHelper __h = new FEMMatrixDataPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMMatrixDataDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMMatrixDataDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMMatrixDataPrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMMatrixDataPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMMatrixDataPrxHelper result = new FEMMatrixDataPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
