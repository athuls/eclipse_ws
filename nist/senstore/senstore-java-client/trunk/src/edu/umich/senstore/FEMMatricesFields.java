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

public final class FEMMatricesFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mDescription;

    public int mLump;

    public int mMatrixID;

    public String mMatrixType;

    public int mND;

    public int mNS;

    public FEMMatricesFields()
    {
    }

    public FEMMatricesFields(long id, String mDescription, int mLump, int mMatrixID, String mMatrixType, int mND, int mNS)
    {
        this.id = id;
        this.mDescription = mDescription;
        this.mLump = mLump;
        this.mMatrixID = mMatrixID;
        this.mMatrixType = mMatrixType;
        this.mND = mND;
        this.mNS = mNS;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMMatricesFields _r = null;
        try
        {
            _r = (FEMMatricesFields)rhs;
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
            if(mDescription != _r.mDescription && mDescription != null && !mDescription.equals(_r.mDescription))
            {
                return false;
            }
            if(mLump != _r.mLump)
            {
                return false;
            }
            if(mMatrixID != _r.mMatrixID)
            {
                return false;
            }
            if(mMatrixType != _r.mMatrixType && mMatrixType != null && !mMatrixType.equals(_r.mMatrixType))
            {
                return false;
            }
            if(mND != _r.mND)
            {
                return false;
            }
            if(mNS != _r.mNS)
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
        if(mDescription != null)
        {
            __h = 5 * __h + mDescription.hashCode();
        }
        __h = 5 * __h + mLump;
        __h = 5 * __h + mMatrixID;
        if(mMatrixType != null)
        {
            __h = 5 * __h + mMatrixType.hashCode();
        }
        __h = 5 * __h + mND;
        __h = 5 * __h + mNS;
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
        __os.writeString(mDescription);
        __os.writeInt(mLump);
        __os.writeInt(mMatrixID);
        __os.writeString(mMatrixType);
        __os.writeInt(mND);
        __os.writeInt(mNS);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDescription = __is.readString();
        mLump = __is.readInt();
        mMatrixID = __is.readInt();
        mMatrixType = __is.readString();
        mND = __is.readInt();
        mNS = __is.readInt();
    }
}
