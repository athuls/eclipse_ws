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

public final class FEMShellDOFPrxHelper extends Ice.ObjectPrxHelperBase implements FEMShellDOFPrx
{
    public FEMShellDOFFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMShellDOFFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMShellDOFFields
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
                _FEMShellDOFDel __del = (_FEMShellDOFDel)__delBase;
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
                _FEMShellDOFDel __del = (_FEMShellDOFDel)__delBase;
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
    setFields(FEMShellDOFFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMShellDOFFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMShellDOFFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMShellDOFDel __del = (_FEMShellDOFDel)__delBase;
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

    public static FEMShellDOFPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMShellDOFPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMShellDOFPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMShellDOF"))
                {
                    FEMShellDOFPrxHelper __h = new FEMShellDOFPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMShellDOFPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMShellDOFPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMShellDOFPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMShellDOF", __ctx))
                {
                    FEMShellDOFPrxHelper __h = new FEMShellDOFPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMShellDOFPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMShellDOFPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMShellDOF"))
                {
                    FEMShellDOFPrxHelper __h = new FEMShellDOFPrxHelper();
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

    public static FEMShellDOFPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMShellDOFPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMShellDOF", __ctx))
                {
                    FEMShellDOFPrxHelper __h = new FEMShellDOFPrxHelper();
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

    public static FEMShellDOFPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMShellDOFPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMShellDOFPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMShellDOFPrxHelper __h = new FEMShellDOFPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMShellDOFPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMShellDOFPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMShellDOFPrxHelper __h = new FEMShellDOFPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMShellDOFDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMShellDOFDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMShellDOFPrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMShellDOFPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMShellDOFPrxHelper result = new FEMShellDOFPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
