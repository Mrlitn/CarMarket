package com.day9;

/**
 * Created by litienan on 2017/9/5.
 */

public class MyPolymorphic3 {

    public static void main(String[] args) {
        A a = new B();
        a.show();

        B b = new C();
        b.show();
//        demo();
    }

    public static void demo() {
        Father3 f = new Son3();
        //成员方法，编译看左边，运行看右边
        f.print();
        //成员变量，编译看左边，运行也看左边
        System.out.println(f.num);
        //编译看左边，运行也看左边
        f.methed();
    }

}

class Father3 {
    int num = 10;

    public void print() {
        System.out.println("Father");
    }

    public static void methed() {

    }

}

class Son3 extends Father3 {
    int num = 20;

    public void print() {
        System.out.println("Son");
    }

}

class A {

    public void show() {
        show2();
    }

    public void show2() {
        System.out.println("A show2");
    }

}

class B extends A {

    public void show2() {
        System.out.println("B show2 love");
    }

}

class C extends B {
    public void show() {
        super.show();
    }

    public void show2() {
        System.out.println("C show2 You");
    }
}
