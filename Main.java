package Cryptography;

import javax.lang.model.type.DeclaredType;

import ClassStuff.prime;

public class Main {
 
    public static void main(String[] args) {
       Caesar c = new Caesar("VON JOZZOVSX", 10);
       System.out.println(c.decrypt());
    }


    //@POTENTIAL IDEA !!
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
