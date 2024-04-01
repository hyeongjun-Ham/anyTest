package org.example;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("123");
        set.add("123");
        set.add("123");
        set.add("1234");

        System.out.println(set);
    }
}
