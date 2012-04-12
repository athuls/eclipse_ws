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

public final class FEMLinkPrxHelper extends Ice.ObjectPrxHelperBase implements FEMLinkPrx
{
    public FEMLinkFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMLinkFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMLinkFields
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
                _FEMLinkDel __del = (_FEMLinkDel)__delBase;
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
    getMasterNode()
    {
        return getMasterNode(null, false);
    }

    public FEMNodePrx
    getMasterNode(java.util.Map<String, String> __ctx)
    {
        return getMasterNode(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMNodePrx
    getMasterNode(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getMasterNode");
                __delBase = __getDelegate(false);
                _FEMLinkDel __del = (_FEMLinkDel)__delBase;
                return __del.getMasterNode(__ctx);
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
    getSlaveNode()
    {
        return getSlaveNode(null, false);
    }

    public FEMNodePrx
    getSlaveNode(java.util.Map<String, String> __ctx)
    {
        return getSlaveNode(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMNodePrx
    getSlaveNode(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getSlaveNode");
                __delBase = __getDelegate(false);
                _FEMLinkDel __del = (_FEMLinkDel)__delBase;
                return __del.getSlaveNode(__ctx);
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
    setFields(FEMLinkFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMLinkFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMLinkFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMLinkDel __del = (_FEMLinkDel)__delBase;
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

    public static FEMLinkPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMLinkPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMLinkPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMLink"))
                {
                    FEMLinkPrxHelper __h = new FEMLinkPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMLinkPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMLinkPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMLinkPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMLink", __ctx))
                {
                    FEMLinkPrxHelper __h = new FEMLinkPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMLinkPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMLinkPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMLink"))
                {
                    FEMLinkPrxHelper __h = new FEMLinkPrxHelper();
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

    public static FEMLinkPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMLinkPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMLink", __ctx))
                {
                    FEMLinkPrxHelper __h = new FEMLinkPrxHelper();
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

    public static FEMLinkPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMLinkPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMLinkPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMLinkPrxHelper __h = new FEMLinkPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMLinkPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMLinkPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMLinkPrxHelper __h = new FEMLinkPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMLinkDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMLinkDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMLinkPrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMLinkPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMLinkPrxHelper result = new FEMLinkPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
