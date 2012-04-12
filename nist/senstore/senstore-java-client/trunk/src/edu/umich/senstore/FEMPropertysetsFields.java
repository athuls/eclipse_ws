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

public final class FEMPropertysetsFields implements java.lang.Cloneable, java.io.Serializable
{
    public long id;

    public double mC;

    public String mDescription;

    public double mK;

    public double mM;

    public int mNC;

    public int mNK;

    public int mNM;

    public String mNonlinear;

    public int mPropertysetID;

    public double mS;

    public FEMPropertysetsFields()
    {
    }

    public FEMPropertysetsFields(long id, double mC, String mDescription, double mK, double mM, int mNC, int mNK, int mNM, String mNonlinear, int mPropertysetID, double mS)
    {
        this.id = id;
        this.mC = mC;
        this.mDescription = mDescription;
        this.mK = mK;
        this.mM = mM;
        this.mNC = mNC;
        this.mNK = mNK;
        this.mNM = mNM;
        this.mNonlinear = mNonlinear;
        this.mPropertysetID = mPropertysetID;
        this.mS = mS;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FEMPropertysetsFields _r = null;
        try
        {
            _r = (FEMPropertysetsFields)rhs;
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
            if(mC != _r.mC)
            {
                return false;
            }
            if(mDescription != _r.mDescription && mDescription != null && !mDescription.equals(_r.mDescription))
            {
                return false;
            }
            if(mK != _r.mK)
            {
                return false;
            }
            if(mM != _r.mM)
            {
                return false;
            }
            if(mNC != _r.mNC)
            {
                return false;
            }
            if(mNK != _r.mNK)
            {
                return false;
            }
            if(mNM != _r.mNM)
            {
                return false;
            }
            if(mNonlinear != _r.mNonlinear && mNonlinear != null && !mNonlinear.equals(_r.mNonlinear))
            {
                return false;
            }
            if(mPropertysetID != _r.mPropertysetID)
            {
                return false;
            }
            if(mS != _r.mS)
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
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mC);
        if(mDescription != null)
        {
            __h = 5 * __h + mDescription.hashCode();
        }
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mK);
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mM);
        __h = 5 * __h + mNC;
        __h = 5 * __h + mNK;
        __h = 5 * __h + mNM;
        if(mNonlinear != null)
        {
            __h = 5 * __h + mNonlinear.hashCode();
        }
        __h = 5 * __h + mPropertysetID;
        __h = 5 * __h + (int)java.lang.Double.doubleToLongBits(mS);
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
        __os.writeDouble(mC);
        __os.writeString(mDescription);
        __os.writeDouble(mK);
        __os.writeDouble(mM);
        __os.writeInt(mNC);
        __os.writeInt(mNK);
        __os.writeInt(mNM);
        __os.writeString(mNonlinear);
        __os.writeInt(mPropertysetID);
        __os.writeDouble(mS);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readLong();
        mC = __is.readDouble();
        mDescription = __is.readString();
        mK = __is.readDouble();
        mM = __is.readDouble();
        mNC = __is.readInt();
        mNK = __is.readInt();
        mNM = __is.readInt();
        mNonlinear = __is.readString();
        mPropertysetID = __is.readInt();
        mS = __is.readDouble();
    }
}
