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

public final class FEMGeneralFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mDescription;

    public int mElementID;

    public long mGroup;

    public int mMatrixSet;

    public short mNodeAmount;

    public int mRecordNmb;

    public String mSave;

    public FEMGeneralFields()
    {
    }

    public FEMGeneralFields(long id, String mDescription, int mElementID, long mGroup, int mMatrixSet, short mNodeAmount, int mRecordNmb, String mSave)
    {
        this.id = id;
        this.mDescription = mDescription;
        this.mElementID = mElementID;
        this.mGroup = mGroup;
        this.mMatrixSet = mMatrixSet;
        this.mNodeAmount = mNodeAmount;
        this.mRecordNmb = mRecordNmb;
        this.mSave = mSave;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMGeneralFields _r = null;
        try
        {
            _r = (FEMGeneralFields)rhs;
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
            if(mElementID != _r.mElementID)
            {
                return false;
            }
            if(mGroup != _r.mGroup)
            {
                return false;
            }
            if(mMatrixSet != _r.mMatrixSet)
            {
                return false;
            }
            if(mNodeAmount != _r.mNodeAmount)
            {
                return false;
            }
            if(mRecordNmb != _r.mRecordNmb)
            {
                return false;
            }
            if(mSave != _r.mSave && mSave != null && !mSave.equals(_r.mSave))
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
        __h = 5 * __h + mElementID;
        __h = 5 * __h + (int)mGroup;
        __h = 5 * __h + mMatrixSet;
        __h = 5 * __h + (int)mNodeAmount;
        __h = 5 * __h + mRecordNmb;
        if(mSave != null)
        {
            __h = 5 * __h + mSave.hashCode();
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
        __os.writeLong(id);
        __os.writeString(mDescription);
        __os.writeInt(mElementID);
        __os.writeLong(mGroup);
        __os.writeInt(mMatrixSet);
        __os.writeShort(mNodeAmount);
        __os.writeInt(mRecordNmb);
        __os.writeString(mSave);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDescription = __is.readString();
        mElementID = __is.readInt();
        mGroup = __is.readLong();
        mMatrixSet = __is.readInt();
        mNodeAmount = __is.readShort();
        mRecordNmb = __is.readInt();
        mSave = __is.readString();
    }
}
