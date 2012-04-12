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

public final class FEMMatrixSetsFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public int mDamping;

    public String mDescription;

    public int mMass;

    public int mMatrixSetID;

    public int mStiffness;

    public int mStress;

    public FEMMatrixSetsFields()
    {
    }

    public FEMMatrixSetsFields(long id, int mDamping, String mDescription, int mMass, int mMatrixSetID, int mStiffness, int mStress)
    {
        this.id = id;
        this.mDamping = mDamping;
        this.mDescription = mDescription;
        this.mMass = mMass;
        this.mMatrixSetID = mMatrixSetID;
        this.mStiffness = mStiffness;
        this.mStress = mStress;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMMatrixSetsFields _r = null;
        try
        {
            _r = (FEMMatrixSetsFields)rhs;
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
            if(mDamping != _r.mDamping)
            {
                return false;
            }
            if(mDescription != _r.mDescription && mDescription != null && !mDescription.equals(_r.mDescription))
            {
                return false;
            }
            if(mMass != _r.mMass)
            {
                return false;
            }
            if(mMatrixSetID != _r.mMatrixSetID)
            {
                return false;
            }
            if(mStiffness != _r.mStiffness)
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
        __h = 5 * __h + mDamping;
        if(mDescription != null)
        {
            __h = 5 * __h + mDescription.hashCode();
        }
        __h = 5 * __h + mMass;
        __h = 5 * __h + mMatrixSetID;
        __h = 5 * __h + mStiffness;
        __h = 5 * __h + mStress;
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
        __os.writeInt(mDamping);
        __os.writeString(mDescription);
        __os.writeInt(mMass);
        __os.writeInt(mMatrixSetID);
        __os.writeInt(mStiffness);
        __os.writeInt(mStress);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDamping = __is.readInt();
        mDescription = __is.readString();
        mMass = __is.readInt();
        mMatrixSetID = __is.readInt();
        mStiffness = __is.readInt();
        mStress = __is.readInt();
    }
}
