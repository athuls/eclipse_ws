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

public final class FEMNodePrxHelper extends Ice.ObjectPrxHelperBase implements FEMNodePrx
{
    public FEMNodeFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMNodeFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMNodeFields
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
                _FEMNodeDel __del = (_FEMNodeDel)__delBase;
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

    public FEMCoordSystemPrx
    getSystem()
    {
        return getSystem(null, false);
    }

    public FEMCoordSystemPrx
    getSystem(java.util.Map<String, String> __ctx)
    {
        return getSystem(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMCoordSystemPrx
    getSystem(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getSystem");
                __delBase = __getDelegate(false);
                _FEMNodeDel __del = (_FEMNodeDel)__delBase;
                return __del.getSystem(__ctx);
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
    setFields(FEMNodeFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMNodeFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMNodeFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMNodeDel __del = (_FEMNodeDel)__delBase;
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

    public static FEMNodePrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMNodePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMNodePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMNode"))
                {
                    FEMNodePrxHelper __h = new FEMNodePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMNodePrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMNodePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMNodePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMNode", __ctx))
                {
                    FEMNodePrxHelper __h = new FEMNodePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMNodePrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMNodePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMNode"))
                {
                    FEMNodePrxHelper __h = new FEMNodePrxHelper();
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

    public static FEMNodePrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMNodePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMNode", __ctx))
                {
                    FEMNodePrxHelper __h = new FEMNodePrxHelper();
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

    public static FEMNodePrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMNodePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMNodePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMNodePrxHelper __h = new FEMNodePrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMNodePrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMNodePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMNodePrxHelper __h = new FEMNodePrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMNodeDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMNodeDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMNodePrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMNodePrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMNodePrxHelper result = new FEMNodePrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
