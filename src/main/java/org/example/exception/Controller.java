package org.example.exception;

public class Controller {

    public static void exceptionTest() throws Exception {
        Service.exceptionTest();
        System.out.println("controller");
    }

    public static void main(String[] args) throws Exception {
        exceptionTest();
    }
}
