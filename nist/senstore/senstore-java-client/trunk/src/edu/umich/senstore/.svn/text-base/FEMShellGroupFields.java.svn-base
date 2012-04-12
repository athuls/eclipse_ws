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

public final class FEMShellGroupFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mDisplacement;

    public long mGroup;

    public long mMaterial;

    public int mNLayers;

    public String mResult;

    public short mSectionResult;

    public String mStressReference;

    public double mThickness;

    public FEMShellGroupFields()
    {
    }

    public FEMShellGroupFields(long id, String mDisplacement, long mGroup, long mMaterial, int mNLayers, String mResult, short mSectionResult, String mStressReference, double mThickness)
    {
        this.id = id;
        this.mDisplacement = mDisplacement;
        this.mGroup = mGroup;
        this.mMaterial = mMaterial;
        this.mNLayers = mNLayers;
        this.mResult = mResult;
        this.mSectionResult = mSectionResult;
        this.mStressReference = mStressReference;
        this.mThickness = mThickness;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMShellGroupFields _r = null;
        try
        {
            _r = (FEMShellGroupFields)rhs;
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
            if(mMaterial != _r.mMaterial)
            {
                return false;
            }
            if(mNLayers != _r.mNLayers)
            {
                return false;
            }
            if(mResult != _r.mResult && mResult != null && !mResult.equals(_r.mResult))
            {
                return false;
            }
            if(mSectionResult != _r.mSectionResult)
            {
                return false;
            }
            if(mStressReference != _r.mStressReference && mStressReference != null && !mStressReference.equals(_r.mStressReference))
            {
                return false;
            }
            if(mThickness != _r.mThickness)
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
        __h = 5 * __h + (int)mMaterial;
        __h = 5 * __h + mNLayers;
        if(mResult != null)
        {
            __h = 5 * __h + mResult.hashCode();
        }
        __h = 5 * __h + (int)mSectionResult;
        if(mStressReference != null)
        {
            __h = 5 * __h + mStressReference.hashCode();
        }
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mThickness);
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
        __os.writeLong(mMaterial);
        __os.writeInt(mNLayers);
        __os.writeString(mResult);
        __os.writeShort(mSectionResult);
        __os.writeString(mStressReference);
        __os.writeDouble(mThickness);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDisplacement = __is.readString();
        mGroup = __is.readLong();
        mMaterial = __is.readLong();
        mNLayers = __is.readInt();
        mResult = __is.readString();
        mSectionResult = __is.readShort();
        mStressReference = __is.readString();
        mThickness = __is.readDouble();
    }
}
