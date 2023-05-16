package Cryptography;

import javax.crypto.Cipher;

public class CipherInfo {
    

    private String msg;
 

    public CipherInfo(String msg) {
        this.msg = msg;
        
    }

    

    public String message() {
        return msg;
    }
}
