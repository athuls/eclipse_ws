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

public final class FEMShellAxesOrthoDataFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public int mAxOrthoID;

    public int mElementID;

    public int mRecordNmb;

    public FEMShellAxesOrthoDataFields()
    {
    }

    public FEMShellAxesOrthoDataFields(long id, int mAxOrthoID, int mElementID, int mRecordNmb)
    {
        this.id = id;
        this.mAxOrthoID = mAxOrthoID;
        this.mElementID = mElementID;
        this.mRecordNmb = mRecordNmb;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMShellAxesOrthoDataFields _r = null;
        try
        {
            _r = (FEMShellAxesOrthoDataFields)rhs;
        }
        catch(ClassCastException ex)
        {
        }

        if(_r != null)
        {
            if(id != _r.id)
            {
                return false;
            }
            if(mAxOrthoID != _r.mAxOrthoID)
            {
                return false;
            }
            if(mElementID != _r.mElementID)
            {
                return false;
            }
            if(mRecordNmb != _r.mRecordNmb)
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
        __h = 5 * __h + (int)id;
        __h = 5 * __h + mAxOrthoID;
        __h = 5 * __h + mElementID;
        __h = 5 * __h + mRecordNmb;
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
        __os.writeLong(id);
        __os.writeInt(mAxOrthoID);
        __os.writeInt(mElementID);
        __os.writeInt(mRecordNmb);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mAxOrthoID = __is.readInt();
        mElementID = __is.readInt();
        mRecordNmb = __is.readInt();
    }
}
