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

public final class FEMGeneralGroupPrxHelper extends Ice.ObjectPrxHelperBase implements FEMGeneralGroupPrx
{
    public FEMGeneralGroupFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMGeneralGroupFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMGeneralGroupFields
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
                _FEMGeneralGroupDel __del = (_FEMGeneralGroupDel)__delBase;
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
                _FEMGeneralGroupDel __del = (_FEMGeneralGroupDel)__delBase;
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
    setFields(FEMGeneralGroupFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMGeneralGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMGeneralGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMGeneralGroupDel __del = (_FEMGeneralGroupDel)__delBase;
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

    public static FEMGeneralGroupPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMGeneralGroupPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMGeneralGroupPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMGeneralGroup"))
                {
                    FEMGeneralGroupPrxHelper __h = new FEMGeneralGroupPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMGeneralGroupPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMGeneralGroupPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMGeneralGroupPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMGeneralGroup", __ctx))
                {
                    FEMGeneralGroupPrxHelper __h = new FEMGeneralGroupPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMGeneralGroupPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMGeneralGroupPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMGeneralGroup"))
                {
                    FEMGeneralGroupPrxHelper __h = new FEMGeneralGroupPrxHelper();
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

    public static FEMGeneralGroupPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMGeneralGroupPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMGeneralGroup", __ctx))
                {
                    FEMGeneralGroupPrxHelper __h = new FEMGeneralGroupPrxHelper();
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

    public static FEMGeneralGroupPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMGeneralGroupPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMGeneralGroupPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMGeneralGroupPrxHelper __h = new FEMGeneralGroupPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMGeneralGroupPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMGeneralGroupPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMGeneralGroupPrxHelper __h = new FEMGeneralGroupPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMGeneralGroupDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMGeneralGroupDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMGeneralGroupPrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMGeneralGroupPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMGeneralGroupPrxHelper result = new FEMGeneralGroupPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
