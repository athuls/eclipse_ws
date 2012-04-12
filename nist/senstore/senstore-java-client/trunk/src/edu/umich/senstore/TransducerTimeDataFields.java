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

public final class TransducerTimeDataFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public long mTransducer;

    public long mSensor;

    public long mNode;

    public short mOrientation;

    public int mAmplification;

    public short mChannel;

    public String mFilter;

    public double mStartTime;

    public String mStatus;

    public TransducerTimeDataFields()
    {
    }

    public TransducerTimeDataFields(long id, long mTransducer, long mSensor, long mNode, short mOrientation, int mAmplification, short mChannel, String mFilter, double mStartTime, String mStatus)
    {
        this.id = id;
        this.mTransducer = mTransducer;
        this.mSensor = mSensor;
        this.mNode = mNode;
        this.mOrientation = mOrientation;
        this.mAmplification = mAmplification;
        this.mChannel = mChannel;
        this.mFilter = mFilter;
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
        TransducerTimeDataFields _r = null;
        try
        {
            _r = (TransducerTimeDataFields)rhs;
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
            if(mTransducer != _r.mTransducer)
            {
                return false;
            }
            if(mSensor != _r.mSensor)
            {
                return false;
            }
            if(mNode != _r.mNode)
            {
                return false;
            }
            if(mOrientation != _r.mOrientation)
            {
                return false;
            }
            if(mAmplification != _r.mAmplification)
            {
                return false;
            }
            if(mChannel != _r.mChannel)
            {
                return false;
            }
            if(mFilter != _r.mFilter && mFilter != null && !mFilter.equals(_r.mFilter))
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
        __h = 5 * __h + (int)mTransducer;
        __h = 5 * __h + (int)mSensor;
        __h = 5 * __h + (int)mNode;
        __h = 5 * __h + (int)mOrientation;
        __h = 5 * __h + mAmplification;
        __h = 5 * __h + (int)mChannel;
        if(mFilter != null)
        {
            __h = 5 * __h + mFilter.hashCode();
        }
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
        __os.writeLong(mTransducer);
        __os.writeLong(mSensor);
        __os.writeLong(mNode);
        __os.writeShort(mOrientation);
        __os.writeInt(mAmplification);
        __os.writeShort(mChannel);
        __os.writeString(mFilter);
        __os.writeDouble(mStartTime);
        __os.writeString(mStatus);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mTransducer = __is.readLong();
        mSensor = __is.readLong();
        mNode = __is.readLong();
        mOrientation = __is.readShort();
        mAmplification = __is.readInt();
        mChannel = __is.readShort();
        mFilter = __is.readString();
        mStartTime = __is.readDouble();
        mStatus = __is.readString();
    }
}
