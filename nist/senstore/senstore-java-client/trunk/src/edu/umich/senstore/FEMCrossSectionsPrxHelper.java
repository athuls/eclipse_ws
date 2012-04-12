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

public final class FEMCrossSectionsPrxHelper extends Ice.ObjectPrxHelperBase implements FEMCrossSectionsPrx
{
    public FEMCrossSectionsFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMCrossSectionsFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMCrossSectionsFields
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
                _FEMCrossSectionsDel __del = (_FEMCrossSectionsDel)__delBase;
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
    setFields(FEMCrossSectionsFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMCrossSectionsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMCrossSectionsFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMCrossSectionsDel __del = (_FEMCrossSectionsDel)__delBase;
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

    public static FEMCrossSectionsPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMCrossSectionsPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMCrossSectionsPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMCrossSections"))
                {
                    FEMCrossSectionsPrxHelper __h = new FEMCrossSectionsPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMCrossSectionsPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMCrossSectionsPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMCrossSectionsPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMCrossSections", __ctx))
                {
                    FEMCrossSectionsPrxHelper __h = new FEMCrossSectionsPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMCrossSectionsPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMCrossSectionsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMCrossSections"))
                {
                    FEMCrossSectionsPrxHelper __h = new FEMCrossSectionsPrxHelper();
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

    public static FEMCrossSectionsPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMCrossSectionsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMCrossSections", __ctx))
                {
                    FEMCrossSectionsPrxHelper __h = new FEMCrossSectionsPrxHelper();
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

    public static FEMCrossSectionsPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMCrossSectionsPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMCrossSectionsPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMCrossSectionsPrxHelper __h = new FEMCrossSectionsPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMCrossSectionsPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMCrossSectionsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMCrossSectionsPrxHelper __h = new FEMCrossSectionsPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMCrossSectionsDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMCrossSectionsDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMCrossSectionsPrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMCrossSectionsPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMCrossSectionsPrxHelper result = new FEMCrossSectionsPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
