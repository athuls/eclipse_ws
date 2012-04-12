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

public final class FEMTrussPrxHelper extends Ice.ObjectPrxHelperBase implements FEMTrussPrx
{
    public FEMTrussFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMTrussFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMTrussFields
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
                _FEMTrussDel __del = (_FEMTrussDel)__delBase;
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
                _FEMTrussDel __del = (_FEMTrussDel)__delBase;
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

    public FEMMaterialPrx
    getMaterial()
    {
        return getMaterial(null, false);
    }

    public FEMMaterialPrx
    getMaterial(java.util.Map<String, String> __ctx)
    {
        return getMaterial(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMMaterialPrx
    getMaterial(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getMaterial");
                __delBase = __getDelegate(false);
                _FEMTrussDel __del = (_FEMTrussDel)__delBase;
                return __del.getMaterial(__ctx);
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
    getN1()
    {
        return getN1(null, false);
    }

    public FEMNodePrx
    getN1(java.util.Map<String, String> __ctx)
    {
        return getN1(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMNodePrx
    getN1(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getN1");
                __delBase = __getDelegate(false);
                _FEMTrussDel __del = (_FEMTrussDel)__delBase;
                return __del.getN1(__ctx);
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
    getN2()
    {
        return getN2(null, false);
    }

    public FEMNodePrx
    getN2(java.util.Map<String, String> __ctx)
    {
        return getN2(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMNodePrx
    getN2(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getN2");
                __delBase = __getDelegate(false);
                _FEMTrussDel __del = (_FEMTrussDel)__delBase;
                return __del.getN2(__ctx);
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
    setFields(FEMTrussFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMTrussFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMTrussFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMTrussDel __del = (_FEMTrussDel)__delBase;
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

    public static FEMTrussPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMTrussPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMTrussPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMTruss"))
                {
                    FEMTrussPrxHelper __h = new FEMTrussPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMTrussPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMTrussPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMTrussPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMTruss", __ctx))
                {
                    FEMTrussPrxHelper __h = new FEMTrussPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMTrussPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMTrussPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMTruss"))
                {
                    FEMTrussPrxHelper __h = new FEMTrussPrxHelper();
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

    public static FEMTrussPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMTrussPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMTruss", __ctx))
                {
                    FEMTrussPrxHelper __h = new FEMTrussPrxHelper();
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

    public static FEMTrussPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMTrussPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMTrussPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMTrussPrxHelper __h = new FEMTrussPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMTrussPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMTrussPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMTrussPrxHelper __h = new FEMTrussPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMTrussDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMTrussDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMTrussPrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMTrussPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMTrussPrxHelper result = new FEMTrussPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
