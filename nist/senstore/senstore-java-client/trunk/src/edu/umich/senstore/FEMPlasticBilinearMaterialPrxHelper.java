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

public final class FEMPlasticBilinearMaterialPrxHelper extends Ice.ObjectPrxHelperBase implements FEMPlasticBilinearMaterialPrx
{
    public FEMPlasticBilinearMaterialFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMPlasticBilinearMaterialFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMPlasticBilinearMaterialFields
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
                _FEMPlasticBilinearMaterialDel __del = (_FEMPlasticBilinearMaterialDel)__delBase;
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

    public FEMMaterialPrx
    getMaterial()
    {
        return getMaterial(null, false);
    }

    public FEMMaterialPrx
    getMaterial(java.util.Map<String, String> __ctx)
    {
        return getMaterial(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMMaterialPrx
    getMaterial(java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getMaterial");
                __delBase = __getDelegate(false);
                _FEMPlasticBilinearMaterialDel __del = (_FEMPlasticBilinearMaterialDel)__delBase;
                return __del.getMaterial(__ctx);
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
    setFields(FEMPlasticBilinearMaterialFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMPlasticBilinearMaterialFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMPlasticBilinearMaterialFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMPlasticBilinearMaterialDel __del = (_FEMPlasticBilinearMaterialDel)__delBase;
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

    public static FEMPlasticBilinearMaterialPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMPlasticBilinearMaterialPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMPlasticBilinearMaterialPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMPlasticBilinearMaterial"))
                {
                    FEMPlasticBilinearMaterialPrxHelper __h = new FEMPlasticBilinearMaterialPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMPlasticBilinearMaterialPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMPlasticBilinearMaterialPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMPlasticBilinearMaterialPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMPlasticBilinearMaterial", __ctx))
                {
                    FEMPlasticBilinearMaterialPrxHelper __h = new FEMPlasticBilinearMaterialPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMPlasticBilinearMaterialPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMPlasticBilinearMaterialPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMPlasticBilinearMaterial"))
                {
                    FEMPlasticBilinearMaterialPrxHelper __h = new FEMPlasticBilinearMaterialPrxHelper();
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

    public static FEMPlasticBilinearMaterialPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMPlasticBilinearMaterialPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMPlasticBilinearMaterial", __ctx))
                {
                    FEMPlasticBilinearMaterialPrxHelper __h = new FEMPlasticBilinearMaterialPrxHelper();
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

    public static FEMPlasticBilinearMaterialPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMPlasticBilinearMaterialPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMPlasticBilinearMaterialPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMPlasticBilinearMaterialPrxHelper __h = new FEMPlasticBilinearMaterialPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMPlasticBilinearMaterialPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMPlasticBilinearMaterialPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMPlasticBilinearMaterialPrxHelper __h = new FEMPlasticBilinearMaterialPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMPlasticBilinearMaterialDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMPlasticBilinearMaterialDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMPlasticBilinearMaterialPrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMPlasticBilinearMaterialPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMPlasticBilinearMaterialPrxHelper result = new FEMPlasticBilinearMaterialPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
