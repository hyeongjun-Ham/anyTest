package org.example.structuretest;

public interface Inter {

    void save();
    default void commonMethod() {
        System.out.println("commonMethod");
    }
}
