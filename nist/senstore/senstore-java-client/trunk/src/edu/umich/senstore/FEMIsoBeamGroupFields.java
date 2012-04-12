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

public final class FEMIsoBeamGroupFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mDisplacement;

    public long mGroup;

    public String mIniStrain;

    public int mMaterialID;

    public String mResult;

    public int mSectionID;

    public FEMIsoBeamGroupFields()
    {
    }

    public FEMIsoBeamGroupFields(long id, String mDisplacement, long mGroup, String mIniStrain, int mMaterialID, String mResult, int mSectionID)
    {
        this.id = id;
        this.mDisplacement = mDisplacement;
        this.mGroup = mGroup;
        this.mIniStrain = mIniStrain;
        this.mMaterialID = mMaterialID;
        this.mResult = mResult;
        this.mSectionID = mSectionID;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMIsoBeamGroupFields _r = null;
        try
        {
            _r = (FEMIsoBeamGroupFields)rhs;
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
            if(mDisplacement != _r.mDisplacement && mDisplacement != null && !mDisplacement.equals(_r.mDisplacement))
            {
                return false;
            }
            if(mGroup != _r.mGroup)
            {
                return false;
            }
            if(mIniStrain != _r.mIniStrain && mIniStrain != null && !mIniStrain.equals(_r.mIniStrain))
            {
                return false;
            }
            if(mMaterialID != _r.mMaterialID)
            {
                return false;
            }
            if(mResult != _r.mResult && mResult != null && !mResult.equals(_r.mResult))
            {
                return false;
            }
            if(mSectionID != _r.mSectionID)
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
        if(mDisplacement != null)
        {
            __h = 5 * __h + mDisplacement.hashCode();
        }
        __h = 5 * __h + (int)mGroup;
        if(mIniStrain != null)
        {
            __h = 5 * __h + mIniStrain.hashCode();
        }
        __h = 5 * __h + mMaterialID;
        if(mResult != null)
        {
            __h = 5 * __h + mResult.hashCode();
        }
        __h = 5 * __h + mSectionID;
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
        __os.writeString(mDisplacement);
        __os.writeLong(mGroup);
        __os.writeString(mIniStrain);
        __os.writeInt(mMaterialID);
        __os.writeString(mResult);
        __os.writeInt(mSectionID);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDisplacement = __is.readString();
        mGroup = __is.readLong();
        mIniStrain = __is.readString();
        mMaterialID = __is.readInt();
        mResult = __is.readString();
        mSectionID = __is.readInt();
    }
}
