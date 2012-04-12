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

public final class FEMContactGroup3PrxHelper extends Ice.ObjectPrxHelperBase implements FEMContactGroup3Prx
{
    public FEMContactGroup3Fields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMContactGroup3Fields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMContactGroup3Fields
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
                _FEMContactGroup3Del __del = (_FEMContactGroup3Del)__delBase;
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
    setFields(FEMContactGroup3Fields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMContactGroup3Fields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMContactGroup3Fields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMContactGroup3Del __del = (_FEMContactGroup3Del)__delBase;
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

    public static FEMContactGroup3Prx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMContactGroup3Prx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMContactGroup3Prx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMContactGroup3"))
                {
                    FEMContactGroup3PrxHelper __h = new FEMContactGroup3PrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMContactGroup3Prx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMContactGroup3Prx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMContactGroup3Prx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMContactGroup3", __ctx))
                {
                    FEMContactGroup3PrxHelper __h = new FEMContactGroup3PrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMContactGroup3Prx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMContactGroup3Prx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMContactGroup3"))
                {
                    FEMContactGroup3PrxHelper __h = new FEMContactGroup3PrxHelper();
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

    public static FEMContactGroup3Prx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMContactGroup3Prx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMContactGroup3", __ctx))
                {
                    FEMContactGroup3PrxHelper __h = new FEMContactGroup3PrxHelper();
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

    public static FEMContactGroup3Prx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMContactGroup3Prx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMContactGroup3Prx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMContactGroup3PrxHelper __h = new FEMContactGroup3PrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMContactGroup3Prx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMContactGroup3Prx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMContactGroup3PrxHelper __h = new FEMContactGroup3PrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMContactGroup3DelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMContactGroup3DelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMContactGroup3Prx v)
    {
        __os.writeProxy(v);
    }

    public static FEMContactGroup3Prx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMContactGroup3PrxHelper result = new FEMContactGroup3PrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
