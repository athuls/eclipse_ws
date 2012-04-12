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

public final class StructureFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public String mName;

    public String mDescription;

    public String mType;

    public Unit mDistanceUnit;

    public Unit mForceUnit;

    public Unit mWeightUnit;

    public StructureFields()
    {
    }

    public StructureFields(long id, String mName, String mDescription, String mType, Unit mDistanceUnit, Unit mForceUnit, Unit mWeightUnit)
    {
        this.id = id;
        this.mName = mName;
        this.mDescription = mDescription;
        this.mType = mType;
        this.mDistanceUnit = mDistanceUnit;
        this.mForceUnit = mForceUnit;
        this.mWeightUnit = mWeightUnit;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        StructureFields _r = null;
        try
        {
            _r = (StructureFields)rhs;
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
            if(mName != _r.mName && mName != null && !mName.equals(_r.mName))
            {
                return false;
            }
            if(mDescription != _r.mDescription && mDescription != null && !mDescription.equals(_r.mDescription))
            {
                return false;
            }
            if(mType != _r.mType && mType != null && !mType.equals(_r.mType))
            {
                return false;
            }
            if(mDistanceUnit != _r.mDistanceUnit && mDistanceUnit != null && !mDistanceUnit.equals(_r.mDistanceUnit))
            {
                return false;
            }
            if(mForceUnit != _r.mForceUnit && mForceUnit != null && !mForceUnit.equals(_r.mForceUnit))
            {
                return false;
            }
            if(mWeightUnit != _r.mWeightUnit && mWeightUnit != null && !mWeightUnit.equals(_r.mWeightUnit))
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
        if(mName != null)
        {
            __h = 5 * __h + mName.hashCode();
        }
        if(mDescription != null)
        {
            __h = 5 * __h + mDescription.hashCode();
        }
        if(mType != null)
        {
            __h = 5 * __h + mType.hashCode();
        }
        if(mDistanceUnit != null)
        {
            __h = 5 * __h + mDistanceUnit.hashCode();
        }
        if(mForceUnit != null)
        {
            __h = 5 * __h + mForceUnit.hashCode();
        }
        if(mWeightUnit != null)
        {
            __h = 5 * __h + mWeightUnit.hashCode();
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
        __os.writeString(mName);
        __os.writeString(mDescription);
        __os.writeString(mType);
        mDistanceUnit.__write(__os);
        mForceUnit.__write(__os);
        mWeightUnit.__write(__os);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mName = __is.readString();
        mDescription = __is.readString();
        mType = __is.readString();
        mDistanceUnit = Unit.__read(__is);
        mForceUnit = Unit.__read(__is);
        mWeightUnit = Unit.__read(__is);
    }
}
