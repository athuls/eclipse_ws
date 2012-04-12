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

public final class VarInfo implements java.lang.Cloneable, java.io.Serializable
{
    public String name;

    public String descr;

    public String varType;

    public String className;

    public VarInfo()
    {
    }

    public VarInfo(String name, String descr, String varType, String className)
    {
        this.name = name;
        this.descr = descr;
        this.varType = varType;
        this.className = className;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        VarInfo _r = null;
        try
        {
            _r = (VarInfo)rhs;
        }
        catch(ClassCastException ex)
        {
        }

        if(_r != null)
        {
            if(name != _r.name && name != null && !name.equals(_r.name))
            {
                return false;
            }
            if(descr != _r.descr && descr != null && !descr.equals(_r.descr))
            {
                return false;
            }
            if(varType != _r.varType && varType != null && !varType.equals(_r.varType))
            {
                return false;
            }
            if(className != _r.className && className != null && !className.equals(_r.className))
            {
                return false;
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 0;
        if(name != null)
        {
            __h = 5 * __h + name.hashCode();
        }
        if(descr != null)
        {
            __h = 5 * __h + descr.hashCode();
        }
        if(varType != null)
        {
            __h = 5 * __h + varType.hashCode();
        }
        if(className != null)
        {
            __h = 5 * __h + className.hashCode();
        }
        return __h;
    }

    public java.lang.Object
    clone()
    {
        java.lang.Object o = null;
        try
        {
            o = super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return o;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeString(name);
        __os.writeString(descr);
        __os.writeString(varType);
        __os.writeString(className);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        name = __is.readString();
        descr = __is.readString();
        varType = __is.readString();
        className = __is.readString();
    }
}
