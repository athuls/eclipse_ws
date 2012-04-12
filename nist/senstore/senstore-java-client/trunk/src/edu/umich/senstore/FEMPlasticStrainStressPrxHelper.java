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

public final class FEMPlasticStrainStressPrxHelper extends Ice.ObjectPrxHelperBase implements FEMPlasticStrainStressPrx
{
    public FEMPlasticStrainStressFields
    getFields()
    {
        return getFields(null, false);
    }

    public FEMPlasticStrainStressFields
    getFields(java.util.Map<String, String> __ctx)
    {
        return getFields(__ctx, true);
    }

    @SuppressWarnings("unchecked")
    private FEMPlasticStrainStressFields
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
                _FEMPlasticStrainStressDel __del = (_FEMPlasticStrainStressDel)__delBase;
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
    setFields(FEMPlasticStrainStressFields fields, String[] fieldNames)
    {
        setFields(fields, fieldNames, null, false);
    }

    public void
    setFields(FEMPlasticStrainStressFields fields, String[] fieldNames, java.util.Map<String, String> __ctx)
    {
        setFields(fields, fieldNames, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private void
    setFields(FEMPlasticStrainStressFields fields, String[] fieldNames, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                _FEMPlasticStrainStressDel __del = (_FEMPlasticStrainStressDel)__delBase;
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

    public static FEMPlasticStrainStressPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        FEMPlasticStrainStressPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMPlasticStrainStressPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMPlasticStrainStress"))
                {
                    FEMPlasticStrainStressPrxHelper __h = new FEMPlasticStrainStressPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMPlasticStrainStressPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        FEMPlasticStrainStressPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMPlasticStrainStressPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::FEMPlasticStrainStress", __ctx))
                {
                    FEMPlasticStrainStressPrxHelper __h = new FEMPlasticStrainStressPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static FEMPlasticStrainStressPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMPlasticStrainStressPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMPlasticStrainStress"))
                {
                    FEMPlasticStrainStressPrxHelper __h = new FEMPlasticStrainStressPrxHelper();
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

    public static FEMPlasticStrainStressPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        FEMPlasticStrainStressPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::FEMPlasticStrainStress", __ctx))
                {
                    FEMPlasticStrainStressPrxHelper __h = new FEMPlasticStrainStressPrxHelper();
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

    public static FEMPlasticStrainStressPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        FEMPlasticStrainStressPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (FEMPlasticStrainStressPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                FEMPlasticStrainStressPrxHelper __h = new FEMPlasticStrainStressPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static FEMPlasticStrainStressPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        FEMPlasticStrainStressPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            FEMPlasticStrainStressPrxHelper __h = new FEMPlasticStrainStressPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _FEMPlasticStrainStressDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _FEMPlasticStrainStressDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, FEMPlasticStrainStressPrx v)
    {
        __os.writeProxy(v);
    }

    public static FEMPlasticStrainStressPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            FEMPlasticStrainStressPrxHelper result = new FEMPlasticStrainStressPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
