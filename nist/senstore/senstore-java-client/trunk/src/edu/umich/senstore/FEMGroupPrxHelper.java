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

public final class FEMGroupPrxHelper extends Ice.ObjectPrxHelperBase implements FEMGroupPrx
{
    public FEMGroupFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMGroupFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMGroupFields
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
                _FEMGroupDel __del = (_FEMGroupDel)__delBase;
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
                _FEMGroupDel __del = (_FEMGroupDel)__delBase;
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
    setFields(FEMGroupFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMGroupFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMGroupDel __del = (_FEMGroupDel)__delBase;
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

    public static FEMGroupPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMGroupPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMGroupPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMGroup"))
                {
                    FEMGroupPrxHelper __h = new FEMGroupPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMGroupPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMGroupPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMGroupPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMGroup", __ctx))
                {
                    FEMGroupPrxHelper __h = new FEMGroupPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMGroupPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMGroupPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMGroup"))
                {
                    FEMGroupPrxHelper __h = new FEMGroupPrxHelper();
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

    public static FEMGroupPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMGroupPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMGroup", __ctx))
                {
                    FEMGroupPrxHelper __h = new FEMGroupPrxHelper();
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

    public static FEMGroupPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMGroupPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMGroupPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMGroupPrxHelper __h = new FEMGroupPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMGroupPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMGroupPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMGroupPrxHelper __h = new FEMGroupPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMGroupDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMGroupDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMGroupPrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMGroupPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMGroupPrxHelper result = new FEMGroupPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
