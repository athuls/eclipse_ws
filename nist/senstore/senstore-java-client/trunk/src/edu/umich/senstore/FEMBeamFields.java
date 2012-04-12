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

public final class FEMBeamFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public long mAuxNode;

    public String mDescription;

    public int mElementID;

    public int mEndRelease;

    public double mEpsin;

    public long mGroup;

    public double mIRigidEnd;

    public double mJRigidEnd;

    public int mMaterialID;

    public long mNode1;

    public long mNode2;

    public int mRecordNmb;

    public String mSave;

    public int mSectionID;

    public int mSubdivision;

    public double mTBirth;

    public double mTDeath;

    public FEMBeamFields()
    {
    }

    public FEMBeamFields(long id, long mAuxNode, String mDescription, int mElementID, int mEndRelease, double mEpsin, long mGroup, double mIRigidEnd, double mJRigidEnd, int mMaterialID, long mNode1, long mNode2, int mRecordNmb, String mSave, int mSectionID, int mSubdivision, double mTBirth, double mTDeath)
    {
        this.id = id;
        this.mAuxNode = mAuxNode;
        this.mDescription = mDescription;
        this.mElementID = mElementID;
        this.mEndRelease = mEndRelease;
        this.mEpsin = mEpsin;
        this.mGroup = mGroup;
        this.mIRigidEnd = mIRigidEnd;
        this.mJRigidEnd = mJRigidEnd;
        this.mMaterialID = mMaterialID;
        this.mNode1 = mNode1;
        this.mNode2 = mNode2;
        this.mRecordNmb = mRecordNmb;
        this.mSave = mSave;
        this.mSectionID = mSectionID;
        this.mSubdivision = mSubdivision;
        this.mTBirth = mTBirth;
        this.mTDeath = mTDeath;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMBeamFields _r = null;
        try
        {
            _r = (FEMBeamFields)rhs;
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
            if(mAuxNode != _r.mAuxNode)
            {
                return false;
            }
            if(mDescription != _r.mDescription && mDescription != null && !mDescription.equals(_r.mDescription))
            {
                return false;
            }
            if(mElementID != _r.mElementID)
            {
                return false;
            }
            if(mEndRelease != _r.mEndRelease)
            {
                return false;
            }
            if(mEpsin != _r.mEpsin)
            {
                return false;
            }
            if(mGroup != _r.mGroup)
            {
                return false;
            }
            if(mIRigidEnd != _r.mIRigidEnd)
            {
                return false;
            }
            if(mJRigidEnd != _r.mJRigidEnd)
            {
                return false;
            }
            if(mMaterialID != _r.mMaterialID)
            {
                return false;
            }
            if(mNode1 != _r.mNode1)
            {
                return false;
            }
            if(mNode2 != _r.mNode2)
            {
                return false;
            }
            if(mRecordNmb != _r.mRecordNmb)
            {
                return false;
            }
            if(mSave != _r.mSave && mSave != null && !mSave.equals(_r.mSave))
            {
                return false;
            }
            if(mSectionID != _r.mSectionID)
            {
                return false;
            }
            if(mSubdivision != _r.mSubdivision)
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

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 0;
        __h = 5 * __h + (int)id;
        __h = 5 * __h + (int)mAuxNode;
        if(mDescription != null)
        {
            __h = 5 * __h + mDescription.hashCode();
        }
        __h = 5 * __h + mElementID;
        __h = 5 * __h + mEndRelease;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mEpsin);
        __h = 5 * __h + (int)mGroup;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mIRigidEnd);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mJRigidEnd);
        __h = 5 * __h + mMaterialID;
        __h = 5 * __h + (int)mNode1;
        __h = 5 * __h + (int)mNode2;
        __h = 5 * __h + mRecordNmb;
        if(mSave != null)
        {
            __h = 5 * __h + mSave.hashCode();
        }
        __h = 5 * __h + mSectionID;
        __h = 5 * __h + mSubdivision;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTBirth);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mTDeath);
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
        __os.writeLong(mAuxNode);
        __os.writeString(mDescription);
        __os.writeInt(mElementID);
        __os.writeInt(mEndRelease);
        __os.writeDouble(mEpsin);
        __os.writeLong(mGroup);
        __os.writeDouble(mIRigidEnd);
        __os.writeDouble(mJRigidEnd);
        __os.writeInt(mMaterialID);
        __os.writeLong(mNode1);
        __os.writeLong(mNode2);
        __os.writeInt(mRecordNmb);
        __os.writeString(mSave);
        __os.writeInt(mSectionID);
        __os.writeInt(mSubdivision);
        __os.writeDouble(mTBirth);
        __os.writeDouble(mTDeath);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mAuxNode = __is.readLong();
        mDescription = __is.readString();
        mElementID = __is.readInt();
        mEndRelease = __is.readInt();
        mEpsin = __is.readDouble();
        mGroup = __is.readLong();
        mIRigidEnd = __is.readDouble();
        mJRigidEnd = __is.readDouble();
        mMaterialID = __is.readInt();
        mNode1 = __is.readLong();
        mNode2 = __is.readLong();
        mRecordNmb = __is.readInt();
        mSave = __is.readString();
        mSectionID = __is.readInt();
        mSubdivision = __is.readInt();
        mTBirth = __is.readDouble();
        mTDeath = __is.readDouble();
    }
}
