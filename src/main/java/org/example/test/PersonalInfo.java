package org.example.test;

public class PersonalInfo implements NewInstance.Info {
    @Override
    public void myInfo() {
        System.out.println("나의 이름은 aaa");
        System.out.println("나의 나이는 25세");
    }
}
