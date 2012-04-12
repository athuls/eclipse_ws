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

public final class DaqUnitChannelPrxHelper extends Ice.ObjectPrxHelperBase implements DaqUnitChannelPrx
{
    public DaqUnitChannelFields
    getFields()
    {
        return getFields(null, false);
    }

    public DaqUnitChannelFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private DaqUnitChannelFields
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
                _DaqUnitChannelDel __del = (_DaqUnitChannelDel)__delBase;
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

    public DaqUnitPrx
    getUnit()
    {
        return getUnit(null, false);
    }

    public DaqUnitPrx
    getUnit(java.util.Map<String, String> __ctx)
    {
        return getUnit(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private DaqUnitPrx
    getUnit(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getUnit");
                __delBase = __getDelegate(false);
                _DaqUnitChannelDel __del = (_DaqUnitChannelDel)__delBase;
                return __del.getUnit(__ctx);
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
    setFields(DaqUnitChannelFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(DaqUnitChannelFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(DaqUnitChannelFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _DaqUnitChannelDel __del = (_DaqUnitChannelDel)__delBase;
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

    public static DaqUnitChannelPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        DaqUnitChannelPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (DaqUnitChannelPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::DaqUnitChannel"))
                {
                    DaqUnitChannelPrxHelper __h = new DaqUnitChannelPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static DaqUnitChannelPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        DaqUnitChannelPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (DaqUnitChannelPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::DaqUnitChannel", __ctx))
                {
                    DaqUnitChannelPrxHelper __h = new DaqUnitChannelPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static DaqUnitChannelPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        DaqUnitChannelPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::DaqUnitChannel"))
                {
                    DaqUnitChannelPrxHelper __h = new DaqUnitChannelPrxHelper();
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

    public static DaqUnitChannelPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        DaqUnitChannelPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::DaqUnitChannel", __ctx))
                {
                    DaqUnitChannelPrxHelper __h = new DaqUnitChannelPrxHelper();
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

    public static DaqUnitChannelPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        DaqUnitChannelPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (DaqUnitChannelPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                DaqUnitChannelPrxHelper __h = new DaqUnitChannelPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static DaqUnitChannelPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        DaqUnitChannelPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            DaqUnitChannelPrxHelper __h = new DaqUnitChannelPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _DaqUnitChannelDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _DaqUnitChannelDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, DaqUnitChannelPrx v)
    {
        __os.writeProxy(v);
    }

    public static DaqUnitChannelPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            DaqUnitChannelPrxHelper result = new DaqUnitChannelPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
