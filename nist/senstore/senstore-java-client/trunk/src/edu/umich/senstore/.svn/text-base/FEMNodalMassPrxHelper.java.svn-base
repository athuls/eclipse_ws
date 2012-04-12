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

public final class FEMNodalMassPrxHelper extends Ice.ObjectPrxHelperBase implements FEMNodalMassPrx
{
    public FEMNodalMassFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMNodalMassFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMNodalMassFields
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
                _FEMNodalMassDel __del = (_FEMNodalMassDel)__delBase;
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
                _FEMNodalMassDel __del = (_FEMNodalMassDel)__delBase;
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
    setFields(FEMNodalMassFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMNodalMassFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMNodalMassFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMNodalMassDel __del = (_FEMNodalMassDel)__delBase;
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

    public static FEMNodalMassPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMNodalMassPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMNodalMassPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMNodalMass"))
                {
                    FEMNodalMassPrxHelper __h = new FEMNodalMassPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMNodalMassPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMNodalMassPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMNodalMassPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMNodalMass", __ctx))
                {
                    FEMNodalMassPrxHelper __h = new FEMNodalMassPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMNodalMassPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMNodalMassPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMNodalMass"))
                {
                    FEMNodalMassPrxHelper __h = new FEMNodalMassPrxHelper();
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

    public static FEMNodalMassPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMNodalMassPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMNodalMass", __ctx))
                {
                    FEMNodalMassPrxHelper __h = new FEMNodalMassPrxHelper();
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

    public static FEMNodalMassPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMNodalMassPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMNodalMassPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMNodalMassPrxHelper __h = new FEMNodalMassPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMNodalMassPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMNodalMassPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMNodalMassPrxHelper __h = new FEMNodalMassPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMNodalMassDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMNodalMassDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMNodalMassPrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMNodalMassPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMNodalMassPrxHelper result = new FEMNodalMassPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
