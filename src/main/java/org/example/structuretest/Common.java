package org.example.structuretest;

public class Common implements Inter{
    private final String pro;

    private final Inter inter;

    public Common(String pro) {
        this.pro = pro;
        if (pro.equals("1")) {
            this.inter = new Test1();
        } else {
            this.inter = new Test2();
        }
    }

    @Override
    public void save() {
        inter.save();
    }

    public void commonMethod() {
        System.out.println("commonMethod");
    }
}
