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

public final class SensorTimeDataFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public long mStructure;

    public long mSensor;

    public short mChannel;

    public double mStartTime;

    public String mStatus;

    public long mNode;

    public SensorTimeDataFields()
    {
    }

    public SensorTimeDataFields(long id, long mStructure, long mSensor, short mChannel, double mStartTime, String mStatus, long mNode)
    {
        this.id = id;
        this.mStructure = mStructure;
        this.mSensor = mSensor;
        this.mChannel = mChannel;
        this.mStartTime = mStartTime;
        this.mStatus = mStatus;
        this.mNode = mNode;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        SensorTimeDataFields _r = null;
        try
        {
            _r = (SensorTimeDataFields)rhs;
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
            if(mStructure != _r.mStructure)
            {
                return false;
            }
            if(mSensor != _r.mSensor)
            {
                return false;
            }
            if(mChannel != _r.mChannel)
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
            if(mNode != _r.mNode)
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
        __h = 5 * __h + (int)mStructure;
        __h = 5 * __h + (int)mSensor;
        __h = 5 * __h + (int)mChannel;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mStartTime);
        if(mStatus != null)
        {
            __h = 5 * __h + mStatus.hashCode();
        }
        __h = 5 * __h + (int)mNode;
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
        __os.writeLong(mStructure);
        __os.writeLong(mSensor);
        __os.writeShort(mChannel);
        __os.writeDouble(mStartTime);
        __os.writeString(mStatus);
        __os.writeLong(mNode);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mStructure = __is.readLong();
        mSensor = __is.readLong();
        mChannel = __is.readShort();
        mStartTime = __is.readDouble();
        mStatus = __is.readString();
        mNode = __is.readLong();
    }
}
