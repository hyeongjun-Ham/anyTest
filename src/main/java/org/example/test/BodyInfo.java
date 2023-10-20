package org.example.test;

public class BodyInfo implements NewInstance.Info {
    @Override
    public void myInfo() {
        System.out.println("나의 키는 200cm");
        System.out.println("나의 몸무게는 100kg");
    }
}
