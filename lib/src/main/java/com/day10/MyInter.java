package com.day10;

/**
 * 内部类
 * Created by litienan on 2017/7/19.
 */

public class MyInter {

    public static void main(String args[]) {
//        Outer.Inter oi = new Outer().new Inter();
//        oi.print();

//        Outer o = new Outer();
//        o.methed();

//        Outer.Inter2 oi2 = new Outer.Inter2();
//        oi2.print2();

//        Outer.Inter3.print3();

        //匿名内部类
//        Outer o = new Outer();
//        o.methed();

        Outers.methed().print();
    }

}

class Outers {

    public static Innters methed() {
        return new Innters() {
            @Override
            public void print() {
                System.out.println("print");
            }
        };
    }

}

interface Innters {
    void print();
}

class Outer {
    private int num = 10;

    private class Inter {
        public void print() {
            System.out.println("private print=" + num);
        }
    }

    static class Inter2 {

        public void print2() {
            System.out.println("static print ");
        }

    }

    static class Inter3 {
        public static void print3() {
            System.out.println("static3 print ");
        }
    }

    public void demo() {
        //局部内部类
        class Inter4 {
            final int i = 10;

            public void print4() {
                System.out.println("print4" + i);
            }
        }

    }

    class Inter4 implements Innters {
        @Override
        public void print() {
            System.out.println("Inter4");
        }
    }

    public void methed() {
//        Inter i = new Inter();
//        i.print();

//        Inter4 i4 = new Inter4();
//        i4.print();

        //匿名内部类最好只有一个方法使用
        new Innters() {
            @Override
            public void print() {
                System.out.println("Inter4");
            }
        }.print();
    }

}

