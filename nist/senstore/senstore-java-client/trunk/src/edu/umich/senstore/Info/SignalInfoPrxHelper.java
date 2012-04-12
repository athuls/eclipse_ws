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

public final class SignalInfoPrxHelper extends Ice.ObjectPrxHelperBase implements SignalInfoPrx
{
    public static SignalInfoPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        SignalInfoPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (SignalInfoPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::Info::SignalInfo"))
                {
                    SignalInfoPrxHelper __h = new SignalInfoPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static SignalInfoPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        SignalInfoPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (SignalInfoPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::SenStore::Info::SignalInfo", __ctx))
                {
                    SignalInfoPrxHelper __h = new SignalInfoPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static SignalInfoPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        SignalInfoPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::Info::SignalInfo"))
                {
                    SignalInfoPrxHelper __h = new SignalInfoPrxHelper();
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

    public static SignalInfoPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        SignalInfoPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::SenStore::Info::SignalInfo", __ctx))
                {
                    SignalInfoPrxHelper __h = new SignalInfoPrxHelper();
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

    public static SignalInfoPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        SignalInfoPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (SignalInfoPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                SignalInfoPrxHelper __h = new SignalInfoPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static SignalInfoPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        SignalInfoPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            SignalInfoPrxHelper __h = new SignalInfoPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _SignalInfoDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _SignalInfoDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, SignalInfoPrx v)
    {
        __os.writeProxy(v);
    }

    public static SignalInfoPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            SignalInfoPrxHelper result = new SignalInfoPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
