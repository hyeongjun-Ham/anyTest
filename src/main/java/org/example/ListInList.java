package org.example;

import org.example.exception.Service;

import java.util.ArrayList;
import java.util.List;

public class ListInList {

    public static void main(String[] args) {
//        List<String> a = new ArrayList<>();
//        TestListClass testListClass1 = new TestListClass(1L, "1");
//        TestListClass testListClass2 = new TestListClass(2L, "2");
//        TestListClass testListClass3 = new TestListClass(1L, "3");
//        TestListClass testListClass4 = new TestListClass(2L, "4");
//        TestListClass testListClass5 = new TestListClass(1L, "5");
//        List<TestListClass> list = new ArrayList<>();
//        list.add(testListClass1);
//        list.add(testListClass2);
//        list.add(testListClass3);
//        list.add(testListClass4);
//        list.add(testListClass5);
//
//        List<List<TestListClass>> c = new ArrayList<>();
//        for (TestListClass t : list) {
//            for (List<TestListClass> in : c) {
//
//            }
//        }
//        System.out.println(c);


        String a = "aaa";
//        String b = "aaa";
        String b = new String("aaa");
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }





}
