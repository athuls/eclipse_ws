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

public final class FEMBeamNodeFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mDisplacement;

    public long mGroup;

    public String mIniStrain;

    public int mMaterialID;

    public String mMC;

    public int mMCrigidity;

    public double mREmultiplyer;

    public String mResult;

    public String mREtype;

    public short mRINT;

    public int mSectionID;

    public short mSINT;

    public short mTINT;

    public FEMBeamNodeFields()
    {
    }

    public FEMBeamNodeFields(long id, String mDisplacement, long mGroup, String mIniStrain, int mMaterialID, String mMC, int mMCrigidity, double mREmultiplyer, String mResult, String mREtype, short mRINT, int mSectionID, short mSINT, short mTINT)
    {
        this.id = id;
        this.mDisplacement = mDisplacement;
        this.mGroup = mGroup;
        this.mIniStrain = mIniStrain;
        this.mMaterialID = mMaterialID;
        this.mMC = mMC;
        this.mMCrigidity = mMCrigidity;
        this.mREmultiplyer = mREmultiplyer;
        this.mResult = mResult;
        this.mREtype = mREtype;
        this.mRINT = mRINT;
        this.mSectionID = mSectionID;
        this.mSINT = mSINT;
        this.mTINT = mTINT;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMBeamNodeFields _r = null;
        try
        {
            _r = (FEMBeamNodeFields)rhs;
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
            if(mMC != _r.mMC && mMC != null && !mMC.equals(_r.mMC))
            {
                return false;
            }
            if(mMCrigidity != _r.mMCrigidity)
            {
                return false;
            }
            if(mREmultiplyer != _r.mREmultiplyer)
            {
                return false;
            }
            if(mResult != _r.mResult && mResult != null && !mResult.equals(_r.mResult))
            {
                return false;
            }
            if(mREtype != _r.mREtype && mREtype != null && !mREtype.equals(_r.mREtype))
            {
                return false;
            }
            if(mRINT != _r.mRINT)
            {
                return false;
            }
            if(mSectionID != _r.mSectionID)
            {
                return false;
            }
            if(mSINT != _r.mSINT)
            {
                return false;
            }
            if(mTINT != _r.mTINT)
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
        if(mMC != null)
        {
            __h = 5 * __h + mMC.hashCode();
        }
        __h = 5 * __h + mMCrigidity;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mREmultiplyer);
        if(mResult != null)
        {
            __h = 5 * __h + mResult.hashCode();
        }
        if(mREtype != null)
        {
            __h = 5 * __h + mREtype.hashCode();
        }
        __h = 5 * __h + (int)mRINT;
        __h = 5 * __h + mSectionID;
        __h = 5 * __h + (int)mSINT;
        __h = 5 * __h + (int)mTINT;
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
        __os.writeString(mMC);
        __os.writeInt(mMCrigidity);
        __os.writeDouble(mREmultiplyer);
        __os.writeString(mResult);
        __os.writeString(mREtype);
        __os.writeShort(mRINT);
        __os.writeInt(mSectionID);
        __os.writeShort(mSINT);
        __os.writeShort(mTINT);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDisplacement = __is.readString();
        mGroup = __is.readLong();
        mIniStrain = __is.readString();
        mMaterialID = __is.readInt();
        mMC = __is.readString();
        mMCrigidity = __is.readInt();
        mREmultiplyer = __is.readDouble();
        mResult = __is.readString();
        mREtype = __is.readString();
        mRINT = __is.readShort();
        mSectionID = __is.readInt();
        mSINT = __is.readShort();
        mTINT = __is.readShort();
    }
}
