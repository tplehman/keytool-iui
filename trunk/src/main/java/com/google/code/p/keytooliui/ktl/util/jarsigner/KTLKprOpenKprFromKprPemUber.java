package com.google.code.p.keytooliui.ktl.util.jarsigner;

/**
    "Kpr" for "private key"
**/




// ----
import java.security.KeyStore;

import java.awt.*;
import java.io.*;

final public class KTLKprOpenKprFromKprPemUber extends KTLKprOpenKprFromKprPemKPAbs
{
    // ------
    // PUBLIC

    public KTLKprOpenKprFromKprPemUber(
        Frame frmOwner, 
       
        
        // input
        String strPathAbsOpenKst, // existing keystore of type Uber 
        char[] chrsPasswdOpenKst,
        
        String strPathAbsFileOpenKpr,
        String strPathAbsFileOpenCrts//,
        //char[] chrsPasswdsFileOpenKpr
        )
    {
        super(
            frmOwner, 
    
        
            // input
            strPathAbsOpenKst, // existing keystore of type JKS 
            chrsPasswdOpenKst,
        
            strPathAbsFileOpenKpr, // private key to import
            strPathAbsFileOpenCrts,
            //chrsPasswdsFileOpenKpr,
            KTLAbs.f_s_strProviderKstUber
            );
            
    }
    
    // ---------
    // protected
    
    protected KeyStore _getKeystoreOpen_(File fleOpen)
    {
        return UtilKstUber.s_getKeystoreOpen(
            super._frmOwner_, 
   
            fleOpen,
            super._chrsPasswdKst_);
    }
}
