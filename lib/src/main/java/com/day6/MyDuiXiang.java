package com.day6;

/**
 * 面向对象
 * Created by litienan on 2017/7/16.
 */

public class MyDuiXiang {

    public static void main(String args[]) {
        int[] arr = new int[4];

        int[] arr1 = {1,2,3};


        Person[] p = new Person[4];

        Person[] p1 = {new Person()};
        demo(1);
    }

    public static void demo(int i) {

    }

    public static void demo1(Person p) {

    }

}

class Person {
    private String name;

    public void speak() {
        int num = 0;
        System.out.println(name);
        System.out.println(num);
    }

}
