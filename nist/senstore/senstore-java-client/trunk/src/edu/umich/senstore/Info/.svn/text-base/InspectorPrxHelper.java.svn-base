// **********************************************************************
//
// Copyright (c) 2003-2009 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.3.1

package edu.umich.senstore.Info;

public final class InspectorPrxHelper extends Ice.ObjectPrxHelperBase implements InspectorPrx
{
    public ClassInfo
    getClassInfo(String name)
    {
        return getClassInfo(name, null, false);
    }

    public ClassInfo
    getClassInfo(String name, java.util.Map<String, String> __ctx)
    {
        return getClassInfo(name, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private ClassInfo
    getClassInfo(String name, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getClassInfo");
                __delBase = __getDelegate(false);
                _InspectorDel __del = (_InspectorDel)__delBase;
                return __del.getClassInfo(name, __ctx);
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

    public String[]
    getClassNames(edu.umich.senstore.ClassType[] clsTypes)
    {
        return getClassNames(clsTypes, null, false);
    }

    public String[]
    getClassNames(edu.umich.senstore.ClassType[] clsTypes, java.util.Map<String, String> __ctx)
    {
        return getClassNames(clsTypes, __ctx, true);
    }

    @SuppressWarnings("unchecked")
    private String[]
    getClassNames(edu.umich.senstore.ClassType[] clsTypes, java.util.Map<String, String> __ctx, boolean __explicitCtx)
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
                __checkTwowayOnly("getClassNames");
                __delBase = __getDelegate(false);
                _InspectorDel __del = (_InspectorDel)__delBase;
                return __del.getClassNames(clsTypes, __ctx);
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

    public static InspectorPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        InspectorPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (InspectorPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::Info::Inspector"))
                {
                    InspectorPrxHelper __h = new InspectorPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static InspectorPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        InspectorPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (InspectorPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::Info::Inspector", __ctx))
                {
                    InspectorPrxHelper __h = new InspectorPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static InspectorPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        InspectorPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::Info::Inspector"))
                {
                    InspectorPrxHelper __h = new InspectorPrxHelper();
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

    public static InspectorPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        InspectorPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::Info::Inspector", __ctx))
                {
                    InspectorPrxHelper __h = new InspectorPrxHelper();
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

    public static InspectorPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        InspectorPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (InspectorPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                InspectorPrxHelper __h = new InspectorPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static InspectorPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        InspectorPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            InspectorPrxHelper __h = new InspectorPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _InspectorDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _InspectorDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, InspectorPrx v)
    {
        __os.writeProxy(v);
    }

    public static InspectorPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            InspectorPrxHelper result = new InspectorPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
