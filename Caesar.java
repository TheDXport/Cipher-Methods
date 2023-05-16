package Cryptography;

public class Caesar extends CipherInfo {
    
    private int shift;

    public Caesar(String m, int s) {
        super(m);
        shift = s;
    }

    public String encrypt() {
        String msgN = super.message().toUpperCase();
        String encrypted = "";
        for (int i = 0; i< msgN.length(); i++) {
            if (msgN.charAt(i) + shift > 90) {
                encrypted += (char)(msgN.charAt(i) - 25);
            } else {
                encrypted += (char)(msgN.charAt(i) + shift);
            }
        } 
        return encrypted;
    }



    public String decrypt() {
        String msgN = super.message().toUpperCase();
        String decrypted = "";
        for (int i = 0; i < msgN.length(); i++) {
            decrypted += (char)(msgN.charAt(i) - shift+1);
        }
        return decrypted;
    }

    public String getMessage() {
        return super.message();
    }

    public int getShift() {
        return shift;
    }
    
}
