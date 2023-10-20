package org.example;

import java.util.Collections;
import java.util.List;

public class Dictionary {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>(List.of("INTEGRITY", "INSTALL", "PATCH"));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
