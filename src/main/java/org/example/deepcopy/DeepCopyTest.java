package org.example.deepcopy;

public class DeepCopyTest {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("===================");

        a = 5;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("===================");
    }
}
