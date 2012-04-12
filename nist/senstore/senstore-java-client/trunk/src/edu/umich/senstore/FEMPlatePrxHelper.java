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

public final class FEMPlatePrxHelper extends Ice.ObjectPrxHelperBase implements FEMPlatePrx
{
    public FEMPlateFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMPlateFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMPlateFields
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
                _FEMPlateDel __del = (_FEMPlateDel)__delBase;
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
                _FEMPlateDel __del = (_FEMPlateDel)__delBase;
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
                _FEMPlateDel __del = (_FEMPlateDel)__delBase;
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
                _FEMPlateDel __del = (_FEMPlateDel)__delBase;
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
                _FEMPlateDel __del = (_FEMPlateDel)__delBase;
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

    public void
    setFields(FEMPlateFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMPlateFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMPlateFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMPlateDel __del = (_FEMPlateDel)__delBase;
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

    public static FEMPlatePrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMPlatePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMPlatePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMPlate"))
                {
                    FEMPlatePrxHelper __h = new FEMPlatePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMPlatePrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMPlatePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMPlatePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMPlate", __ctx))
                {
                    FEMPlatePrxHelper __h = new FEMPlatePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMPlatePrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMPlatePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMPlate"))
                {
                    FEMPlatePrxHelper __h = new FEMPlatePrxHelper();
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

    public static FEMPlatePrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMPlatePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMPlate", __ctx))
                {
                    FEMPlatePrxHelper __h = new FEMPlatePrxHelper();
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

    public static FEMPlatePrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMPlatePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMPlatePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMPlatePrxHelper __h = new FEMPlatePrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMPlatePrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMPlatePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMPlatePrxHelper __h = new FEMPlatePrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMPlateDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMPlateDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMPlatePrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMPlatePrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMPlatePrxHelper result = new FEMPlatePrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
