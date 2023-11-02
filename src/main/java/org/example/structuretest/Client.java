package org.example.structuretest;

public class Client {
    public static void main(String[] args) {
        Common common = new Common("1");

        common.save();

        common.commonMethod();


    }
}
