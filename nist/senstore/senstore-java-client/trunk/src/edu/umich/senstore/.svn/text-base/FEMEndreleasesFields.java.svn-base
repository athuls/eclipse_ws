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

public final class FEMEndreleasesFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mDescription;

    public int mEndRelease;

    public short mMoment1;

    public short mMoment2;

    public short mMoment3;

    public short mMoment4;

    public short mMoment5;

    public short mMoment6;

    public FEMEndreleasesFields()
    {
    }

    public FEMEndreleasesFields(long id, String mDescription, int mEndRelease, short mMoment1, short mMoment2, short mMoment3, short mMoment4, short mMoment5, short mMoment6)
    {
        this.id = id;
        this.mDescription = mDescription;
        this.mEndRelease = mEndRelease;
        this.mMoment1 = mMoment1;
        this.mMoment2 = mMoment2;
        this.mMoment3 = mMoment3;
        this.mMoment4 = mMoment4;
        this.mMoment5 = mMoment5;
        this.mMoment6 = mMoment6;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMEndreleasesFields _r = null;
        try
        {
            _r = (FEMEndreleasesFields)rhs;
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
            if(mDescription != _r.mDescription && mDescription != null && !mDescription.equals(_r.mDescription))
            {
                return false;
            }
            if(mEndRelease != _r.mEndRelease)
            {
                return false;
            }
            if(mMoment1 != _r.mMoment1)
            {
                return false;
            }
            if(mMoment2 != _r.mMoment2)
            {
                return false;
            }
            if(mMoment3 != _r.mMoment3)
            {
                return false;
            }
            if(mMoment4 != _r.mMoment4)
            {
                return false;
            }
            if(mMoment5 != _r.mMoment5)
            {
                return false;
            }
            if(mMoment6 != _r.mMoment6)
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
        if(mDescription != null)
        {
            __h = 5 * __h + mDescription.hashCode();
        }
        __h = 5 * __h + mEndRelease;
        __h = 5 * __h + (int)mMoment1;
        __h = 5 * __h + (int)mMoment2;
        __h = 5 * __h + (int)mMoment3;
        __h = 5 * __h + (int)mMoment4;
        __h = 5 * __h + (int)mMoment5;
        __h = 5 * __h + (int)mMoment6;
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
        __os.writeString(mDescription);
        __os.writeInt(mEndRelease);
        __os.writeShort(mMoment1);
        __os.writeShort(mMoment2);
        __os.writeShort(mMoment3);
        __os.writeShort(mMoment4);
        __os.writeShort(mMoment5);
        __os.writeShort(mMoment6);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mDescription = __is.readString();
        mEndRelease = __is.readInt();
        mMoment1 = __is.readShort();
        mMoment2 = __is.readShort();
        mMoment3 = __is.readShort();
        mMoment4 = __is.readShort();
        mMoment5 = __is.readShort();
        mMoment6 = __is.readShort();
    }
}
