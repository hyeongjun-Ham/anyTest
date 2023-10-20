package org.example;

public class SetterTest {
    public static void main(String[] args) {
        TestEntity testEntity = new TestEntity();

        testEntity.setAge(10);
        testEntity.setName("test");

        System.out.println(testEntity.toString());

        testEntity.setName(null);
        System.out.println(testEntity.toString());

        TestEntity testEntity2 = new TestEntity();
        testEntity2.setAge(10);
        System.out.println(testEntity2.toString());
    }
}
