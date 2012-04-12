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

public final class FEMPlasticStrainStressFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public int mMaterialID;

    public int mRecordNumber;

    public double mStrain;

    public double mStress;

    public FEMPlasticStrainStressFields()
    {
    }

    public FEMPlasticStrainStressFields(long id, int mMaterialID, int mRecordNumber, double mStrain, double mStress)
    {
        this.id = id;
        this.mMaterialID = mMaterialID;
        this.mRecordNumber = mRecordNumber;
        this.mStrain = mStrain;
        this.mStress = mStress;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMPlasticStrainStressFields _r = null;
        try
        {
            _r = (FEMPlasticStrainStressFields)rhs;
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
            if(mMaterialID != _r.mMaterialID)
            {
                return false;
            }
            if(mRecordNumber != _r.mRecordNumber)
            {
                return false;
            }
            if(mStrain != _r.mStrain)
            {
                return false;
            }
            if(mStress != _r.mStress)
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
        __h = 5 * __h + mMaterialID;
        __h = 5 * __h + mRecordNumber;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mStrain);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mStress);
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
        __os.writeInt(mMaterialID);
        __os.writeInt(mRecordNumber);
        __os.writeDouble(mStrain);
        __os.writeDouble(mStress);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mMaterialID = __is.readInt();
        mRecordNumber = __is.readInt();
        mStrain = __is.readDouble();
        mStress = __is.readDouble();
    }
}
