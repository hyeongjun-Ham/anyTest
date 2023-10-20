package org.example.poly;

public class Sha512 extends IEncrypt{

    public Sha512(String type) {
        super(type);
    }

    @Override
    public String encrypt() {
        return "512";
    }

    public Sha512() {

    }
}
