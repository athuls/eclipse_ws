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

public final class FEMShellLayerFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public long mGroup;

    public int mLayerNumber;

    public int mMaterialID;

    public double mPThick;

    public int mRecordNmb;

    public FEMShellLayerFields()
    {
    }

    public FEMShellLayerFields(long id, long mGroup, int mLayerNumber, int mMaterialID, double mPThick, int mRecordNmb)
    {
        this.id = id;
        this.mGroup = mGroup;
        this.mLayerNumber = mLayerNumber;
        this.mMaterialID = mMaterialID;
        this.mPThick = mPThick;
        this.mRecordNmb = mRecordNmb;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMShellLayerFields _r = null;
        try
        {
            _r = (FEMShellLayerFields)rhs;
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
            if(mGroup != _r.mGroup)
            {
                return false;
            }
            if(mLayerNumber != _r.mLayerNumber)
            {
                return false;
            }
            if(mMaterialID != _r.mMaterialID)
            {
                return false;
            }
            if(mPThick != _r.mPThick)
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
        __h = 5 * __h + (int)mGroup;
        __h = 5 * __h + mLayerNumber;
        __h = 5 * __h + mMaterialID;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mPThick);
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
        __os.writeLong(mGroup);
        __os.writeInt(mLayerNumber);
        __os.writeInt(mMaterialID);
        __os.writeDouble(mPThick);
        __os.writeInt(mRecordNmb);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mGroup = __is.readLong();
        mLayerNumber = __is.readInt();
        mMaterialID = __is.readInt();
        mPThick = __is.readDouble();
        mRecordNmb = __is.readInt();
    }
}
