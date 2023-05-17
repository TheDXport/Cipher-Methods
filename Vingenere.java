package Cryptography;

import java.sql.Array;

import javax.crypto.Cipher;

public class Vingenere extends CipherInfo {

    //instance variable
    private String sKey;

    public Vingenere(String message, String sKey) { // constructor 
        super(message);
        this.sKey = sKey;
    }

   
    public String encrypt() { // encryptes a message
        String encrypted = "";
        String nMsg = super.message().toUpperCase();

        for (int i = 0; i < nMsg.length(); i++) {
            if ( nMsg.charAt(i) + sKey.charAt(i) > 156) { // handles extreme out of bound cases
                encrypted += (char)(nMsg.charAt(i) + sKey.charAt(i) - 91);
            } else {
                if ((nMsg.charAt(i) + sKey.charAt(i) - 65 > 90)) { // handles regular out of bound cases
                    encrypted += (char)(nMsg.charAt(i) + sKey.charAt(i) - 91);
                } else {
                    encrypted += (char)(nMsg.charAt(i) + sKey.charAt(i) - 65);
                }
                
            }

        }
        return encrypted;
    }
    
    public String decrypt() { // decryptes a message 
        String decrypted = "";
        String encrypted = super.message().toUpperCase();

        for (int i = 0; i < encrypted.length(); i++) {
            int spaces = encrypted.charAt(i) - sKey.charAt(i); // gets the amount of spaces in a vingenere table
            decrypted += (char)((((spaces) + 26) % 26) + 65); 
        }
        return decrypted;
    }

    public String getMessage() {
        return super.message();
    }
    
}
