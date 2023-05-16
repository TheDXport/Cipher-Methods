package Cryptography;

import java.sql.Array;

import javax.crypto.Cipher;

public class Vingenere extends CipherInfo {
    
    private String sKey;

    public Vingenere(String message, String sKey) {
        super(message);
        this.sKey = sKey;
    }

   
    public String encrypt() {
        String encrypted = "";
        String nMsg = super.message().toUpperCase();

        for (int i = 0; i < nMsg.length(); i++) {
            if ( nMsg.charAt(i) + sKey.charAt(i) > 156) {
                encrypted += (char)(nMsg.charAt(i) + sKey.charAt(i) - 91);
            } else {
                if ((nMsg.charAt(i) + sKey.charAt(i) - 65 > 90)) {
                    encrypted += (char)(nMsg.charAt(i) + sKey.charAt(i) - 91);
                } else {
                    encrypted += (char)(nMsg.charAt(i) + sKey.charAt(i) - 65);
                }
                
            }

        }
        return encrypted;
    }
    
    public String decrypt() {
        String decrypted = "";
        String encrypted = super.message().toUpperCase();

        for (int i = 0; i < encrypted.length(); i++) {
            
            decrypted += (char)((((encrypted.charAt(i) - sKey.charAt(i)) + 26) % 26) + 65);

        }
        return decrypted;
    }




    public String getMessage() {
        return super.message();
    }
    
}
