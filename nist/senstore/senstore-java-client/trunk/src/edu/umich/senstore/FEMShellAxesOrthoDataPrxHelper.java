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

public final class FEMShellAxesOrthoDataPrxHelper extends Ice.ObjectPrxHelperBase implements FEMShellAxesOrthoDataPrx
{
    public FEMShellAxesOrthoDataFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMShellAxesOrthoDataFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMShellAxesOrthoDataFields
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
                _FEMShellAxesOrthoDataDel __del = (_FEMShellAxesOrthoDataDel)__delBase;
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
    setFields(FEMShellAxesOrthoDataFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMShellAxesOrthoDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMShellAxesOrthoDataFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMShellAxesOrthoDataDel __del = (_FEMShellAxesOrthoDataDel)__delBase;
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

    public static FEMShellAxesOrthoDataPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMShellAxesOrthoDataPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMShellAxesOrthoDataPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMShellAxesOrthoData"))
                {
                    FEMShellAxesOrthoDataPrxHelper __h = new FEMShellAxesOrthoDataPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMShellAxesOrthoDataPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMShellAxesOrthoDataPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMShellAxesOrthoDataPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMShellAxesOrthoData", __ctx))
                {
                    FEMShellAxesOrthoDataPrxHelper __h = new FEMShellAxesOrthoDataPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMShellAxesOrthoDataPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMShellAxesOrthoDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMShellAxesOrthoData"))
                {
                    FEMShellAxesOrthoDataPrxHelper __h = new FEMShellAxesOrthoDataPrxHelper();
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

    public static FEMShellAxesOrthoDataPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMShellAxesOrthoDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMShellAxesOrthoData", __ctx))
                {
                    FEMShellAxesOrthoDataPrxHelper __h = new FEMShellAxesOrthoDataPrxHelper();
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

    public static FEMShellAxesOrthoDataPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMShellAxesOrthoDataPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMShellAxesOrthoDataPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMShellAxesOrthoDataPrxHelper __h = new FEMShellAxesOrthoDataPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMShellAxesOrthoDataPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMShellAxesOrthoDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMShellAxesOrthoDataPrxHelper __h = new FEMShellAxesOrthoDataPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMShellAxesOrthoDataDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMShellAxesOrthoDataDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMShellAxesOrthoDataPrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMShellAxesOrthoDataPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMShellAxesOrthoDataPrxHelper result = new FEMShellAxesOrthoDataPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
