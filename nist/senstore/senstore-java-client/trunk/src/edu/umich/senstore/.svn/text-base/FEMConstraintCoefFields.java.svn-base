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

public final class FEMConstraintCoefFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mCoefficient;

    public int mConstraintID;

    public String mDescription;

    public String mMasterDOF;

    public int mMasterNode;

    public int mRecordNmb;

    public FEMConstraintCoefFields()
    {
    }

    public FEMConstraintCoefFields(long id, double mCoefficient, int mConstraintID, String mDescription, String mMasterDOF, int mMasterNode, int mRecordNmb)
    {
        this.id = id;
        this.mCoefficient = mCoefficient;
        this.mConstraintID = mConstraintID;
        this.mDescription = mDescription;
        this.mMasterDOF = mMasterDOF;
        this.mMasterNode = mMasterNode;
        this.mRecordNmb = mRecordNmb;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMConstraintCoefFields _r = null;
        try
        {
            _r = (FEMConstraintCoefFields)rhs;
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
            if(mCoefficient != _r.mCoefficient)
            {
                return false;
            }
            if(mConstraintID != _r.mConstraintID)
            {
                return false;
            }
            if(mDescription != _r.mDescription && mDescription != null && !mDescription.equals(_r.mDescription))
            {
                return false;
            }
            if(mMasterDOF != _r.mMasterDOF && mMasterDOF != null && !mMasterDOF.equals(_r.mMasterDOF))
            {
                return false;
            }
            if(mMasterNode != _r.mMasterNode)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mCoefficient);
        __h = 5 * __h + mConstraintID;
        if(mDescription != null)
        {
            __h = 5 * __h + mDescription.hashCode();
        }
        if(mMasterDOF != null)
        {
            __h = 5 * __h + mMasterDOF.hashCode();
        }
        __h = 5 * __h + mMasterNode;
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
        __os.writeDouble(mCoefficient);
        __os.writeInt(mConstraintID);
        __os.writeString(mDescription);
        __os.writeString(mMasterDOF);
        __os.writeInt(mMasterNode);
        __os.writeInt(mRecordNmb);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mCoefficient = __is.readDouble();
        mConstraintID = __is.readInt();
        mDescription = __is.readString();
        mMasterDOF = __is.readString();
        mMasterNode = __is.readInt();
        mRecordNmb = __is.readInt();
    }
}
