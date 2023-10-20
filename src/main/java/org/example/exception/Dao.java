package org.example.exception;

public class Dao {
    public static void exceptionTest() throws Exception {

        System.out.println("exception 시작");
        try {
            throw new IllegalArgumentException("임의 exception");

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception();
        }

    }
}
