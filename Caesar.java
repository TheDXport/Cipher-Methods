package Cryptography;

public class Caesar extends CipherInfo {
    
    private int shift;

    public Caesar(String m, int s) { // constructor of the Caesar class
        super(m);
        shift = s;
    }

    public String encrypt() {
        String msgN = super.message().toUpperCase(); // convert everything to uppercase for consistency
        String encrypted = "";
        for (int i = 0; i< msgN.length(); i++) { // loops through the entire string
            if (msgN.charAt(i) == 32) { // handles spaces
                encrypted += " ";
            } else if (msgN.charAt(i) + shift > 90) { // if the shift goes out of bounds when the shift is added
                encrypted += (char)(msgN.charAt(i) + shift - 26); 
            } else {
                encrypted += (char)(msgN.charAt(i) + shift);
            }

            }
        
        return encrypted;
    }



    public String decrypt() {
        String msgN = super.message().toUpperCase(); // convert everything to uppercase for consistency
        String decrypted = "";
        for (int i = 0; i < msgN.length(); i++) {
            if (msgN.charAt(i) == 32) { // handles spaces
                decrypted += " ";
            } else if (msgN.charAt(i) - shift < 65) { // if the shift goes out of bounds when the character at i is subtracted by the shift
                decrypted += (char)(msgN.charAt(i) - shift + 26);
            } else {
                decrypted += (char)(msgN.charAt(i) - shift);
            }
          

        }
        return decrypted;
    }

    public String getMessage() { // gets the message, whether it's encrypted or plain text, of the Caesar class
        return super.message();
    }

    public int getShift() { // gets the total amount of shifts for the Caesar 
        return shift;
    }
    
}
