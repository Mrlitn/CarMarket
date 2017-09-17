package com.day10;

/**
 * Created by litienan on 2017/9/6.
 */

public class MyInner3 {

    public static void main(String[] args) {
//        Outer3.Inner3 oi = new Outer3().new Inner3();
//        oi.methed();

//        Outer3 o = new Outer3();
//        o.show();

//        Outer3.Inner oi = new Outer3.Inner();
//        oi.methed();

        Inter3 i3 = new Inter3() { //父类指针指向子类对象
            @Override
            public void print() {

            }
        };

        //匿名内部类
        new Inter3() {
            @Override
            public void print() {
                System.out.println("print");
            }
        }.print();

    }

}

interface Inter3 {
    void print();
}

class Outer3 {
    private int num = 10;

    class Inter implements Inter3 {

        @Override
        public void print() {
            System.out.println("print");
        }
    }

    private class Inner3 {
        public void methed() {
            System.out.println(num);
        }
    }

    public void show() {
        Inner3 i = new Inner3();
        i.methed();
    }

    static class Inner {
        private int num = 20;

        public void methed() {
            System.out.println(num);
        }
    }

}
