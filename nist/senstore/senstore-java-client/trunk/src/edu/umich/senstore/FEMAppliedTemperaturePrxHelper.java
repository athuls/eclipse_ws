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

public final class FEMAppliedTemperaturePrxHelper extends Ice.ObjectPrxHelperBase implements FEMAppliedTemperaturePrx
{
    public FEMAppliedTemperatureFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMAppliedTemperatureFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMAppliedTemperatureFields
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
                _FEMAppliedTemperatureDel __del = (_FEMAppliedTemperatureDel)__delBase;
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

    public FEMNodePrx
    getNode()
    {
        return getNode(null, false);
    }

    public FEMNodePrx
    getNode(java.util.Map<String, String> __ctx)
    {
        return getNode(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMNodePrx
    getNode(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getNode");
                __delBase = __getDelegate(false);
                _FEMAppliedTemperatureDel __del = (_FEMAppliedTemperatureDel)__delBase;
                return __del.getNode(__ctx);
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
    setFields(FEMAppliedTemperatureFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMAppliedTemperatureFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMAppliedTemperatureFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMAppliedTemperatureDel __del = (_FEMAppliedTemperatureDel)__delBase;
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

    public static FEMAppliedTemperaturePrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMAppliedTemperaturePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMAppliedTemperaturePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMAppliedTemperature"))
                {
                    FEMAppliedTemperaturePrxHelper __h = new FEMAppliedTemperaturePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMAppliedTemperaturePrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMAppliedTemperaturePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMAppliedTemperaturePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMAppliedTemperature", __ctx))
                {
                    FEMAppliedTemperaturePrxHelper __h = new FEMAppliedTemperaturePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMAppliedTemperaturePrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMAppliedTemperaturePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMAppliedTemperature"))
                {
                    FEMAppliedTemperaturePrxHelper __h = new FEMAppliedTemperaturePrxHelper();
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

    public static FEMAppliedTemperaturePrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMAppliedTemperaturePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMAppliedTemperature", __ctx))
                {
                    FEMAppliedTemperaturePrxHelper __h = new FEMAppliedTemperaturePrxHelper();
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

    public static FEMAppliedTemperaturePrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMAppliedTemperaturePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMAppliedTemperaturePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMAppliedTemperaturePrxHelper __h = new FEMAppliedTemperaturePrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMAppliedTemperaturePrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMAppliedTemperaturePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMAppliedTemperaturePrxHelper __h = new FEMAppliedTemperaturePrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMAppliedTemperatureDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMAppliedTemperatureDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMAppliedTemperaturePrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMAppliedTemperaturePrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMAppliedTemperaturePrxHelper result = new FEMAppliedTemperaturePrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}