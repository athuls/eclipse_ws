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

public final class FEMShellPrxHelper extends Ice.ObjectPrxHelperBase implements FEMShellPrx
{
    public FEMShellFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMShellFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMShellFields
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
                _FEMShellDel __del = (_FEMShellDel)__delBase;
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
                _FEMShellDel __del = (_FEMShellDel)__delBase;
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
                _FEMShellDel __del = (_FEMShellDel)__delBase;
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
                _FEMShellDel __del = (_FEMShellDel)__delBase;
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
                _FEMShellDel __del = (_FEMShellDel)__delBase;
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

    public FEMNodePrx
    getN3()
    {
        return getN3(null, false);
    }

    public FEMNodePrx
    getN3(java.util.Map<String, String> __ctx)
    {
        return getN3(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMNodePrx
    getN3(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getN3");
                __delBase = __getDelegate(false);
                _FEMShellDel __del = (_FEMShellDel)__delBase;
                return __del.getN3(__ctx);
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
    getN4()
    {
        return getN4(null, false);
    }

    public FEMNodePrx
    getN4(java.util.Map<String, String> __ctx)
    {
        return getN4(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMNodePrx
    getN4(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getN4");
                __delBase = __getDelegate(false);
                _FEMShellDel __del = (_FEMShellDel)__delBase;
                return __del.getN4(__ctx);
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
    getN5()
    {
        return getN5(null, false);
    }

    public FEMNodePrx
    getN5(java.util.Map<String, String> __ctx)
    {
        return getN5(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMNodePrx
    getN5(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getN5");
                __delBase = __getDelegate(false);
                _FEMShellDel __del = (_FEMShellDel)__delBase;
                return __del.getN5(__ctx);
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
    getN6()
    {
        return getN6(null, false);
    }

    public FEMNodePrx
    getN6(java.util.Map<String, String> __ctx)
    {
        return getN6(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMNodePrx
    getN6(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getN6");
                __delBase = __getDelegate(false);
                _FEMShellDel __del = (_FEMShellDel)__delBase;
                return __del.getN6(__ctx);
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
    getN7()
    {
        return getN7(null, false);
    }

    public FEMNodePrx
    getN7(java.util.Map<String, String> __ctx)
    {
        return getN7(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMNodePrx
    getN7(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getN7");
                __delBase = __getDelegate(false);
                _FEMShellDel __del = (_FEMShellDel)__delBase;
                return __del.getN7(__ctx);
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
    getN8()
    {
        return getN8(null, false);
    }

    public FEMNodePrx
    getN8(java.util.Map<String, String> __ctx)
    {
        return getN8(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMNodePrx
    getN8(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getN8");
                __delBase = __getDelegate(false);
                _FEMShellDel __del = (_FEMShellDel)__delBase;
                return __del.getN8(__ctx);
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
    getN9()
    {
        return getN9(null, false);
    }

    public FEMNodePrx
    getN9(java.util.Map<String, String> __ctx)
    {
        return getN9(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMNodePrx
    getN9(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getN9");
                __delBase = __getDelegate(false);
                _FEMShellDel __del = (_FEMShellDel)__delBase;
                return __del.getN9(__ctx);
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
    setFields(FEMShellFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMShellFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMShellFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMShellDel __del = (_FEMShellDel)__delBase;
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

    public static FEMShellPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMShellPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMShellPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMShell"))
                {
                    FEMShellPrxHelper __h = new FEMShellPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMShellPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMShellPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMShellPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMShell", __ctx))
                {
                    FEMShellPrxHelper __h = new FEMShellPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMShellPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMShellPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMShell"))
                {
                    FEMShellPrxHelper __h = new FEMShellPrxHelper();
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

    public static FEMShellPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMShellPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMShell", __ctx))
                {
                    FEMShellPrxHelper __h = new FEMShellPrxHelper();
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

    public static FEMShellPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMShellPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMShellPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMShellPrxHelper __h = new FEMShellPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMShellPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMShellPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMShellPrxHelper __h = new FEMShellPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMShellDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMShellDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMShellPrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMShellPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMShellPrxHelper result = new FEMShellPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
