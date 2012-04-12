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

public final class FEMOrthotropicMaterialListHelper
{
    public static void
    write(IceInternal.BasicStream __os, FEMOrthotropicMaterialPrx[] __v)
    {
        if(__v == null)
        {
            __os.writeSize(0);
        }
        else
        {
            __os.writeSize(__v.length);
            for(int __i0 = 0; __i0 < __v.length; __i0++)
            {
                FEMOrthotropicMaterialPrxHelper.__write(__os, __v[__i0]);
            }
        }
    }

    public static FEMOrthotropicMaterialPrx[]
    read(IceInternal.BasicStream __is)
    {
        FEMOrthotropicMaterialPrx[] __v;
        final int __len0 = __is.readSize();
        __is.startSeq(__len0, 2);
        __v = new FEMOrthotropicMaterialPrx[__len0];
        for(int __i0 = 0; __i0 < __len0; __i0++)
        {
            __v[__i0] = FEMOrthotropicMaterialPrxHelper.__read(__is);
            __is.checkSeq();
            __is.endElement();
        }
        __is.endSeq(__len0);
        return __v;
    }
}
