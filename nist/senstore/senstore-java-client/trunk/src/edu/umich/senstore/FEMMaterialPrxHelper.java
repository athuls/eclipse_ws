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

public final class FEMMaterialPrxHelper extends Ice.ObjectPrxHelperBase implements FEMMaterialPrx
{
    public FEMMaterialFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMMaterialFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMMaterialFields
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
                _FEMMaterialDel __del = (_FEMMaterialDel)__delBase;
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

    public StructurePrx
    getStructure()
    {
        return getStructure(null, false);
    }

    public StructurePrx
    getStructure(java.util.Map<String, String> __ctx)
    {
        return getStructure(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private StructurePrx
    getStructure(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getStructure");
                __delBase = __getDelegate(false);
                _FEMMaterialDel __del = (_FEMMaterialDel)__delBase;
                return __del.getStructure(__ctx);
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
    setFields(FEMMaterialFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMMaterialFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMMaterialFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMMaterialDel __del = (_FEMMaterialDel)__delBase;
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

    public static FEMMaterialPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMMaterialPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMMaterialPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMMaterial"))
                {
                    FEMMaterialPrxHelper __h = new FEMMaterialPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMMaterialPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMMaterialPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMMaterialPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMMaterial", __ctx))
                {
                    FEMMaterialPrxHelper __h = new FEMMaterialPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMMaterialPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMMaterialPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMMaterial"))
                {
                    FEMMaterialPrxHelper __h = new FEMMaterialPrxHelper();
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

    public static FEMMaterialPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMMaterialPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMMaterial", __ctx))
                {
                    FEMMaterialPrxHelper __h = new FEMMaterialPrxHelper();
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

    public static FEMMaterialPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMMaterialPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMMaterialPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMMaterialPrxHelper __h = new FEMMaterialPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMMaterialPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMMaterialPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMMaterialPrxHelper __h = new FEMMaterialPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMMaterialDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMMaterialDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMMaterialPrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMMaterialPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMMaterialPrxHelper result = new FEMMaterialPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
