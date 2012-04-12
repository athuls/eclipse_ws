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

public final class FEMNTNContactFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public int mContactorNode;

    public int mContGroupID;

    public int mContPair;

    public String mPrintRes;

    public int mRecordNmb;

    public String mSaveRes;

    public int mTargetNode;

    public double mTargetNx;

    public double mTargetNy;

    public double mTargetNz;

    public FEMNTNContactFields()
    {
    }

    public FEMNTNContactFields(long id, int mContactorNode, int mContGroupID, int mContPair, String mPrintRes, int mRecordNmb, String mSaveRes, int mTargetNode, double mTargetNx, double mTargetNy, double mTargetNz)
    {
        this.id = id;
        this.mContactorNode = mContactorNode;
        this.mContGroupID = mContGroupID;
        this.mContPair = mContPair;
        this.mPrintRes = mPrintRes;
        this.mRecordNmb = mRecordNmb;
        this.mSaveRes = mSaveRes;
        this.mTargetNode = mTargetNode;
        this.mTargetNx = mTargetNx;
        this.mTargetNy = mTargetNy;
        this.mTargetNz = mTargetNz;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMNTNContactFields _r = null;
        try
        {
            _r = (FEMNTNContactFields)rhs;
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
            if(mContactorNode != _r.mContactorNode)
            {
                return false;
            }
            if(mContGroupID != _r.mContGroupID)
            {
                return false;
            }
            if(mContPair != _r.mContPair)
            {
                return false;
            }
            if(mPrintRes != _r.mPrintRes && mPrintRes != null && !mPrintRes.equals(_r.mPrintRes))
            {
                return false;
            }
            if(mRecordNmb != _r.mRecordNmb)
            {
                return false;
            }
            if(mSaveRes != _r.mSaveRes && mSaveRes != null && !mSaveRes.equals(_r.mSaveRes))
            {
                return false;
            }
            if(mTargetNode != _r.mTargetNode)
            {
                return false;
            }
            if(mTargetNx != _r.mTargetNx)
            {
                return false;
            }
            if(mTargetNy != _r.mTargetNy)
            {
                return false;
            }
            if(mTargetNz != _r.mTargetNz)
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
        __h = 5 * __h + mContactorNode;
        __h = 5 * __h + mContGroupID;
        __h = 5 * __h + mContPair;
        if(mPrintRes != null)
        {
            __h = 5 * __h + mPrintRes.hashCode();
        }
        __h = 5 * __h + mRecordNmb;
        if(mSaveRes != null)
        {
            __h = 5 * __h + mSaveRes.hashCode();
        }
        __h = 5 * __h + mTargetNode;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTargetNx);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTargetNy);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTargetNz);
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
        __os.writeInt(mContactorNode);
        __os.writeInt(mContGroupID);
        __os.writeInt(mContPair);
        __os.writeString(mPrintRes);
        __os.writeInt(mRecordNmb);
        __os.writeString(mSaveRes);
        __os.writeInt(mTargetNode);
        __os.writeDouble(mTargetNx);
        __os.writeDouble(mTargetNy);
        __os.writeDouble(mTargetNz);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mContactorNode = __is.readInt();
        mContGroupID = __is.readInt();
        mContPair = __is.readInt();
        mPrintRes = __is.readString();
        mRecordNmb = __is.readInt();
        mSaveRes = __is.readString();
        mTargetNode = __is.readInt();
        mTargetNx = __is.readDouble();
        mTargetNy = __is.readDouble();
        mTargetNz = __is.readDouble();
    }
}
