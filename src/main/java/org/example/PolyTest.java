package org.example;

import org.example.poly.IEncrypt;
import org.example.poly.EncryptCreator;
import org.example.poly.Sha256;
import org.example.poly.Sha512;

public class PolyTest {
    public static void main(String[] args) {
        String input = "512";
        EncryptCreator encryptCreator = new EncryptCreator();
        encryptCreator.addMap("256", new Sha256());
        encryptCreator.addMap("512", new Sha512());




        IEncrypt encrypt = encryptCreator.getEncryption(input);
        System.out.println(encrypt.encrypt());

    }
}
