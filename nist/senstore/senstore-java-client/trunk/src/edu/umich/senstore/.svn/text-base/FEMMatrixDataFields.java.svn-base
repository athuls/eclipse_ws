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

public final class FEMMatrixDataFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mCoeff;

    public int mColumnIndex;

    public int mMatrixID;

    public int mRecordNmb;

    public int mRowIndex;

    public FEMMatrixDataFields()
    {
    }

    public FEMMatrixDataFields(long id, double mCoeff, int mColumnIndex, int mMatrixID, int mRecordNmb, int mRowIndex)
    {
        this.id = id;
        this.mCoeff = mCoeff;
        this.mColumnIndex = mColumnIndex;
        this.mMatrixID = mMatrixID;
        this.mRecordNmb = mRecordNmb;
        this.mRowIndex = mRowIndex;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMMatrixDataFields _r = null;
        try
        {
            _r = (FEMMatrixDataFields)rhs;
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
            if(mCoeff != _r.mCoeff)
            {
                return false;
            }
            if(mColumnIndex != _r.mColumnIndex)
            {
                return false;
            }
            if(mMatrixID != _r.mMatrixID)
            {
                return false;
            }
            if(mRecordNmb != _r.mRecordNmb)
            {
                return false;
            }
            if(mRowIndex != _r.mRowIndex)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mCoeff);
        __h = 5 * __h + mColumnIndex;
        __h = 5 * __h + mMatrixID;
        __h = 5 * __h + mRecordNmb;
        __h = 5 * __h + mRowIndex;
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
        __os.writeDouble(mCoeff);
        __os.writeInt(mColumnIndex);
        __os.writeInt(mMatrixID);
        __os.writeInt(mRecordNmb);
        __os.writeInt(mRowIndex);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mCoeff = __is.readDouble();
        mColumnIndex = __is.readInt();
        mMatrixID = __is.readInt();
        mRecordNmb = __is.readInt();
        mRowIndex = __is.readInt();
    }
}
