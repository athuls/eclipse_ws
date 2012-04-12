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

public final class FEMSectionPipePrxHelper extends Ice.ObjectPrxHelperBase implements FEMSectionPipePrx
{
    public FEMSectionPipeFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMSectionPipeFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMSectionPipeFields
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
                _FEMSectionPipeDel __del = (_FEMSectionPipeDel)__delBase;
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

    public void
    setFields(FEMSectionPipeFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMSectionPipeFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMSectionPipeFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMSectionPipeDel __del = (_FEMSectionPipeDel)__delBase;
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

    public static FEMSectionPipePrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMSectionPipePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMSectionPipePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMSectionPipe"))
                {
                    FEMSectionPipePrxHelper __h = new FEMSectionPipePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMSectionPipePrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMSectionPipePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMSectionPipePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMSectionPipe", __ctx))
                {
                    FEMSectionPipePrxHelper __h = new FEMSectionPipePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMSectionPipePrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMSectionPipePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMSectionPipe"))
                {
                    FEMSectionPipePrxHelper __h = new FEMSectionPipePrxHelper();
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

    public static FEMSectionPipePrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMSectionPipePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMSectionPipe", __ctx))
                {
                    FEMSectionPipePrxHelper __h = new FEMSectionPipePrxHelper();
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

    public static FEMSectionPipePrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMSectionPipePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMSectionPipePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMSectionPipePrxHelper __h = new FEMSectionPipePrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMSectionPipePrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMSectionPipePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMSectionPipePrxHelper __h = new FEMSectionPipePrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMSectionPipeDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMSectionPipeDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMSectionPipePrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMSectionPipePrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMSectionPipePrxHelper result = new FEMSectionPipePrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
