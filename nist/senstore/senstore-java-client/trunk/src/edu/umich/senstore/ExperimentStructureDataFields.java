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

public final class ExperimentStructureDataFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public long mExperiment;

    public long mStructure;

    public double mStartTime;

    public String mStatus;

    public ExperimentStructureDataFields()
    {
    }

    public ExperimentStructureDataFields(long id, long mExperiment, long mStructure, double mStartTime, String mStatus)
    {
        this.id = id;
        this.mExperiment = mExperiment;
        this.mStructure = mStructure;
        this.mStartTime = mStartTime;
        this.mStatus = mStatus;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        ExperimentStructureDataFields _r = null;
        try
        {
            _r = (ExperimentStructureDataFields)rhs;
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
            if(mExperiment != _r.mExperiment)
            {
                return false;
            }
            if(mStructure != _r.mStructure)
            {
                return false;
            }
            if(mStartTime != _r.mStartTime)
            {
                return false;
            }
            if(mStatus != _r.mStatus && mStatus != null && !mStatus.equals(_r.mStatus))
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
        __h = 5 * __h + (int)mExperiment;
        __h = 5 * __h + (int)mStructure;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mStartTime);
        if(mStatus != null)
        {
            __h = 5 * __h + mStatus.hashCode();
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
        __os.writeLong(mExperiment);
        __os.writeLong(mStructure);
        __os.writeDouble(mStartTime);
        __os.writeString(mStatus);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mExperiment = __is.readLong();
        mStructure = __is.readLong();
        mStartTime = __is.readDouble();
        mStatus = __is.readString();
    }
}
