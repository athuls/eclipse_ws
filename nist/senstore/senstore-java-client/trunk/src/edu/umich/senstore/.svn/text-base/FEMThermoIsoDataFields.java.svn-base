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

public final class FEMThermoIsoDataFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mALPHA;

    public double mE;

    public int mMaterialID;

    public double mNU;

    public int mRecordNmb;

    public double mTheta;

    public FEMThermoIsoDataFields()
    {
    }

    public FEMThermoIsoDataFields(long id, double mALPHA, double mE, int mMaterialID, double mNU, int mRecordNmb, double mTheta)
    {
        this.id = id;
        this.mALPHA = mALPHA;
        this.mE = mE;
        this.mMaterialID = mMaterialID;
        this.mNU = mNU;
        this.mRecordNmb = mRecordNmb;
        this.mTheta = mTheta;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMThermoIsoDataFields _r = null;
        try
        {
            _r = (FEMThermoIsoDataFields)rhs;
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
            if(mALPHA != _r.mALPHA)
            {
                return false;
            }
            if(mE != _r.mE)
            {
                return false;
            }
            if(mMaterialID != _r.mMaterialID)
            {
                return false;
            }
            if(mNU != _r.mNU)
            {
                return false;
            }
            if(mRecordNmb != _r.mRecordNmb)
            {
                return false;
            }
            if(mTheta != _r.mTheta)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mALPHA);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mE);
        __h = 5 * __h + mMaterialID;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mNU);
        __h = 5 * __h + mRecordNmb;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTheta);
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
        __os.writeDouble(mALPHA);
        __os.writeDouble(mE);
        __os.writeInt(mMaterialID);
        __os.writeDouble(mNU);
        __os.writeInt(mRecordNmb);
        __os.writeDouble(mTheta);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mALPHA = __is.readDouble();
        mE = __is.readDouble();
        mMaterialID = __is.readInt();
        mNU = __is.readDouble();
        mRecordNmb = __is.readInt();
        mTheta = __is.readDouble();
    }
}
