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

public final class ClassInfoPrxHelper extends Ice.ObjectPrxHelperBase implements ClassInfoPrx
{
    public static ClassInfoPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        ClassInfoPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (ClassInfoPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::Info::ClassInfo"))
                {
                    ClassInfoPrxHelper __h = new ClassInfoPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static ClassInfoPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        ClassInfoPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (ClassInfoPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::Info::ClassInfo", __ctx))
                {
                    ClassInfoPrxHelper __h = new ClassInfoPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static ClassInfoPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        ClassInfoPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::Info::ClassInfo"))
                {
                    ClassInfoPrxHelper __h = new ClassInfoPrxHelper();
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

    public static ClassInfoPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        ClassInfoPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::Info::ClassInfo", __ctx))
                {
                    ClassInfoPrxHelper __h = new ClassInfoPrxHelper();
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

    public static ClassInfoPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        ClassInfoPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (ClassInfoPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                ClassInfoPrxHelper __h = new ClassInfoPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static ClassInfoPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        ClassInfoPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            ClassInfoPrxHelper __h = new ClassInfoPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _ClassInfoDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _ClassInfoDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, ClassInfoPrx v)
    {
        __os.writeProxy(v);
    }

    public static ClassInfoPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            ClassInfoPrxHelper result = new ClassInfoPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
