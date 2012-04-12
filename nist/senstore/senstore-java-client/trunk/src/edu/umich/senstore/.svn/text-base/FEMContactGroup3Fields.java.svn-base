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

public final class FEMContactGroup3Fields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public int mContGroupID;

    public double mDepth;

    public String mDescription;

    public String mForces;

    public double mFriction;

    public String mIniPenetration;

    public String mNodeToNode;

    public double mOffset;

    public String mPenetrAlgorithm;

    public double mTBirth;

    public double mTDeath;

    public String mTied;

    public double mTiedOffset;

    public double mTolerance;

    public String mTractions;

    public FEMContactGroup3Fields()
    {
    }

    public FEMContactGroup3Fields(long id, int mContGroupID, double mDepth, String mDescription, String mForces, double mFriction, String mIniPenetration, String mNodeToNode, double mOffset, String mPenetrAlgorithm, double mTBirth, double mTDeath, String mTied, double mTiedOffset, double mTolerance, String mTractions)
    {
        this.id = id;
        this.mContGroupID = mContGroupID;
        this.mDepth = mDepth;
        this.mDescription = mDescription;
        this.mForces = mForces;
        this.mFriction = mFriction;
        this.mIniPenetration = mIniPenetration;
        this.mNodeToNode = mNodeToNode;
        this.mOffset = mOffset;
        this.mPenetrAlgorithm = mPenetrAlgorithm;
        this.mTBirth = mTBirth;
        this.mTDeath = mTDeath;
        this.mTied = mTied;
        this.mTiedOffset = mTiedOffset;
        this.mTolerance = mTolerance;
        this.mTractions = mTractions;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMContactGroup3Fields _r = null;
        try
        {
            _r = (FEMContactGroup3Fields)rhs;
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
            if(mContGroupID != _r.mContGroupID)
            {
                return false;
            }
            if(mDepth != _r.mDepth)
            {
                return false;
            }
            if(mDescription != _r.mDescription && mDescription != null && !mDescription.equals(_r.mDescription))
            {
                return false;
            }
            if(mForces != _r.mForces && mForces != null && !mForces.equals(_r.mForces))
            {
                return false;
            }
            if(mFriction != _r.mFriction)
            {
                return false;
            }
            if(mIniPenetration != _r.mIniPenetration && mIniPenetration != null && !mIniPenetration.equals(_r.mIniPenetration))
            {
                return false;
            }
            if(mNodeToNode != _r.mNodeToNode && mNodeToNode != null && !mNodeToNode.equals(_r.mNodeToNode))
            {
                return false;
            }
            if(mOffset != _r.mOffset)
            {
                return false;
            }
            if(mPenetrAlgorithm != _r.mPenetrAlgorithm && mPenetrAlgorithm != null && !mPenetrAlgorithm.equals(_r.mPenetrAlgorithm))
            {
                return false;
            }
            if(mTBirth != _r.mTBirth)
            {
                return false;
            }
            if(mTDeath != _r.mTDeath)
            {
                return false;
            }
            if(mTied != _r.mTied && mTied != null && !mTied.equals(_r.mTied))
            {
                return false;
            }
            if(mTiedOffset != _r.mTiedOffset)
            {
                return false;
            }
            if(mTolerance != _r.mTolerance)
            {
                return false;
            }
            if(mTractions != _r.mTractions && mTractions != null && !mTractions.equals(_r.mTractions))
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
        __h = 5 * __h + mContGroupID;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mDepth);
        if(mDescription != null)
        {
            __h = 5 * __h + mDescription.hashCode();
        }
        if(mForces != null)
        {
            __h = 5 * __h + mForces.hashCode();
        }
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mFriction);
        if(mIniPenetration != null)
        {
            __h = 5 * __h + mIniPenetration.hashCode();
        }
        if(mNodeToNode != null)
        {
            __h = 5 * __h + mNodeToNode.hashCode();
        }
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mOffset);
        if(mPenetrAlgorithm != null)
        {
            __h = 5 * __h + mPenetrAlgorithm.hashCode();
        }
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTBirth);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTDeath);
        if(mTied != null)
        {
            __h = 5 * __h + mTied.hashCode();
        }
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTiedOffset);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTolerance);
        if(mTractions != null)
        {
            __h = 5 * __h + mTractions.hashCode();
        }
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
        __os.writeInt(mContGroupID);
        __os.writeDouble(mDepth);
        __os.writeString(mDescription);
        __os.writeString(mForces);
        __os.writeDouble(mFriction);
        __os.writeString(mIniPenetration);
        __os.writeString(mNodeToNode);
        __os.writeDouble(mOffset);
        __os.writeString(mPenetrAlgorithm);
        __os.writeDouble(mTBirth);
        __os.writeDouble(mTDeath);
        __os.writeString(mTied);
        __os.writeDouble(mTiedOffset);
        __os.writeDouble(mTolerance);
        __os.writeString(mTractions);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mContGroupID = __is.readInt();
        mDepth = __is.readDouble();
        mDescription = __is.readString();
        mForces = __is.readString();
        mFriction = __is.readDouble();
        mIniPenetration = __is.readString();
        mNodeToNode = __is.readString();
        mOffset = __is.readDouble();
        mPenetrAlgorithm = __is.readString();
        mTBirth = __is.readDouble();
        mTDeath = __is.readDouble();
        mTied = __is.readString();
        mTiedOffset = __is.readDouble();
        mTolerance = __is.readDouble();
        mTractions = __is.readString();
    }
}
