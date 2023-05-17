package Cryptography;

import javax.crypto.Cipher;

public class CipherInfo {
    
    // instance variables
    private String msg; 
 

    public CipherInfo(String msg) { // Cipher message constructor 
        this.msg = msg;
        
    }

    

    public String message() {  // gets the message for each of the cipher class 
        return msg;
    }
}
