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

public final class ArrayInfoPrxHelper extends Ice.ObjectPrxHelperBase implements ArrayInfoPrx
{
    public static ArrayInfoPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        ArrayInfoPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (ArrayInfoPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::Info::ArrayInfo"))
                {
                    ArrayInfoPrxHelper __h = new ArrayInfoPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static ArrayInfoPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        ArrayInfoPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (ArrayInfoPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::Info::ArrayInfo", __ctx))
                {
                    ArrayInfoPrxHelper __h = new ArrayInfoPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static ArrayInfoPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        ArrayInfoPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::Info::ArrayInfo"))
                {
                    ArrayInfoPrxHelper __h = new ArrayInfoPrxHelper();
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

    public static ArrayInfoPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        ArrayInfoPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::Info::ArrayInfo", __ctx))
                {
                    ArrayInfoPrxHelper __h = new ArrayInfoPrxHelper();
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

    public static ArrayInfoPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        ArrayInfoPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (ArrayInfoPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                ArrayInfoPrxHelper __h = new ArrayInfoPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static ArrayInfoPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        ArrayInfoPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            ArrayInfoPrxHelper __h = new ArrayInfoPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _ArrayInfoDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _ArrayInfoDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, ArrayInfoPrx v)
    {
        __os.writeProxy(v);
    }

    public static ArrayInfoPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            ArrayInfoPrxHelper result = new ArrayInfoPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
