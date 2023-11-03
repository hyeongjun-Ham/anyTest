package org.example.structuretest;

public class Client {
    public static void main(String[] args) {
        Inter common = new Common("1");

        common.save();

        common.commonMethod();


    }
}
