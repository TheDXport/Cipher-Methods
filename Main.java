package Cryptography;

import javax.lang.model.type.DeclaredType;

import ClassStuff.prime;

public class Main {
 
    public static void main(String[] args) {
        
        // Caesar c = new Caesar("GSBOLMJO", 1);

        // System.out.println( "Originial: " + c.getMessage());
        // System.out.println( c.encrypt());
        // System.out.println( c.decrypt());

       Vingenere v1 = new Vingenere("FRANKLIN", "BROOKLYN");
       System.out.println("Encrypted v1: " + v1.encrypt());


    Vingenere v2 = new Vingenere(v1.encrypt(), "BROOKLYN");
    
        System.out.println("Decrypted v2: " + v2.decrypt());
        // System.out.println("Decrypted Message: " + v2.decrypt());


    }

    // public static String recurCaesarEncrypt(String s, int i) {

    //     String Ns = "";
    //     while (i != 0) {
    //               i--;
    //             Ns = recurCaesarEncrypt(s, i--);
    //     }
    //     return Ns;
    // }
   
    // RECUR CAESAR 

    // HELLO -> IFMMP -> JGNNQ -> KHOOR -> LIPPS // recur of 5 iterations per a one unit shift to the right, maybe have the 
    // index shifting down as well perhaps?

    // so instead of the previous texts, it would look something like this with an iteration of 5 and a decreasing of 1 from 5:
    // HELLO -> MJQQT -> QNUUX -> TQXX? -> VSZZA ---> WTAAB
    // c.(5)    c.(4)    c.(3)    c.(2)    c.(1)      FINAL where c cannot be 0 as it wouldn't shift regardless of the spacing..

}
