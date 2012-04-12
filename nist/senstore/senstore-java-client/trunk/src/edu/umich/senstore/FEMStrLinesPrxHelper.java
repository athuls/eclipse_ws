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

public final class FEMStrLinesPrxHelper extends Ice.ObjectPrxHelperBase implements FEMStrLinesPrx
{
    public FEMStrLinesFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMStrLinesFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMStrLinesFields
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
                _FEMStrLinesDel __del = (_FEMStrLinesDel)__delBase;
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
    setFields(FEMStrLinesFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMStrLinesFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMStrLinesFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMStrLinesDel __del = (_FEMStrLinesDel)__delBase;
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

    public static FEMStrLinesPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMStrLinesPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMStrLinesPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMStrLines"))
                {
                    FEMStrLinesPrxHelper __h = new FEMStrLinesPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMStrLinesPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMStrLinesPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMStrLinesPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMStrLines", __ctx))
                {
                    FEMStrLinesPrxHelper __h = new FEMStrLinesPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMStrLinesPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMStrLinesPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMStrLines"))
                {
                    FEMStrLinesPrxHelper __h = new FEMStrLinesPrxHelper();
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

    public static FEMStrLinesPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMStrLinesPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMStrLines", __ctx))
                {
                    FEMStrLinesPrxHelper __h = new FEMStrLinesPrxHelper();
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

    public static FEMStrLinesPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMStrLinesPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMStrLinesPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMStrLinesPrxHelper __h = new FEMStrLinesPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMStrLinesPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMStrLinesPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMStrLinesPrxHelper __h = new FEMStrLinesPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMStrLinesDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMStrLinesDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMStrLinesPrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMStrLinesPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMStrLinesPrxHelper result = new FEMStrLinesPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
