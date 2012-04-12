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

public final class FEMShellLayerPrxHelper extends Ice.ObjectPrxHelperBase implements FEMShellLayerPrx
{
    public FEMShellLayerFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMShellLayerFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMShellLayerFields
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
                _FEMShellLayerDel __del = (_FEMShellLayerDel)__delBase;
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

    public FEMGroupPrx
    getGroup()
    {
        return getGroup(null, false);
    }

    public FEMGroupPrx
    getGroup(java.util.Map<String, String> __ctx)
    {
        return getGroup(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMGroupPrx
    getGroup(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getGroup");
                __delBase = __getDelegate(false);
                _FEMShellLayerDel __del = (_FEMShellLayerDel)__delBase;
                return __del.getGroup(__ctx);
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
    setFields(FEMShellLayerFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMShellLayerFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMShellLayerFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMShellLayerDel __del = (_FEMShellLayerDel)__delBase;
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

    public static FEMShellLayerPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMShellLayerPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMShellLayerPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMShellLayer"))
                {
                    FEMShellLayerPrxHelper __h = new FEMShellLayerPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMShellLayerPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMShellLayerPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMShellLayerPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMShellLayer", __ctx))
                {
                    FEMShellLayerPrxHelper __h = new FEMShellLayerPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMShellLayerPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMShellLayerPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMShellLayer"))
                {
                    FEMShellLayerPrxHelper __h = new FEMShellLayerPrxHelper();
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

    public static FEMShellLayerPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMShellLayerPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMShellLayer", __ctx))
                {
                    FEMShellLayerPrxHelper __h = new FEMShellLayerPrxHelper();
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

    public static FEMShellLayerPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMShellLayerPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMShellLayerPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMShellLayerPrxHelper __h = new FEMShellLayerPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMShellLayerPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMShellLayerPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMShellLayerPrxHelper __h = new FEMShellLayerPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMShellLayerDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMShellLayerDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMShellLayerPrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMShellLayerPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMShellLayerPrxHelper result = new FEMShellLayerPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
