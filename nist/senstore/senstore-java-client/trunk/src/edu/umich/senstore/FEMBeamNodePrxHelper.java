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

public final class FEMBeamNodePrxHelper extends Ice.ObjectPrxHelperBase implements FEMBeamNodePrx
{
    public FEMBeamNodeFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMBeamNodeFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMBeamNodeFields
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
                _FEMBeamNodeDel __del = (_FEMBeamNodeDel)__delBase;
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
                _FEMBeamNodeDel __del = (_FEMBeamNodeDel)__delBase;
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
    setFields(FEMBeamNodeFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMBeamNodeFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMBeamNodeFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMBeamNodeDel __del = (_FEMBeamNodeDel)__delBase;
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

    public static FEMBeamNodePrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMBeamNodePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMBeamNodePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMBeamNode"))
                {
                    FEMBeamNodePrxHelper __h = new FEMBeamNodePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMBeamNodePrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMBeamNodePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMBeamNodePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMBeamNode", __ctx))
                {
                    FEMBeamNodePrxHelper __h = new FEMBeamNodePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMBeamNodePrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMBeamNodePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMBeamNode"))
                {
                    FEMBeamNodePrxHelper __h = new FEMBeamNodePrxHelper();
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

    public static FEMBeamNodePrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMBeamNodePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMBeamNode", __ctx))
                {
                    FEMBeamNodePrxHelper __h = new FEMBeamNodePrxHelper();
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

    public static FEMBeamNodePrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMBeamNodePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMBeamNodePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMBeamNodePrxHelper __h = new FEMBeamNodePrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMBeamNodePrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMBeamNodePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMBeamNodePrxHelper __h = new FEMBeamNodePrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMBeamNodeDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMBeamNodeDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMBeamNodePrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMBeamNodePrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMBeamNodePrxHelper result = new FEMBeamNodePrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
