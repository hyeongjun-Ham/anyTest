package org.example.exception;

public class Service {

    public static void exceptionTest() throws Exception {
        Dao.exceptionTest();
        System.out.println("service");
    }
}
