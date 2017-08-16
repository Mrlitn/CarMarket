package com.day25;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by litienan on 2017/7/30.
 */

public class MyThread2 {

    public static void main(String[] args) {
        demo5();
    }

    //单例模式：在内存中只有一个对象
    public static void demo() {

    }

    //Runtime 是多线程
    public static void demo1() {
        try {
            Runtime r = Runtime.getRuntime();
            r.exec("shutdown -s -t 300");  //300秒后关机  -a的意思是关机
        } catch (Exception e) {

        }
    }

    //Timer计时器
    public static void demo2() {
        Timer t = new Timer();
        t.schedule(new MyTime(), new Date());
    }

    //线程间通讯  等待唤醒机制 wait() notify()  notifyAll()
    public static void demo3() {

    }

    //三条及以上线程通讯 ReentrantLock
    public static void demo4() {
        final Printer2 p2 = new Printer2();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    p2.print1();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    p2.print2();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    p2.print3();
                }
            }
        }.start();
    }

    //线程组
    // 工厂设计模式
    public static void demo5() {
        DogFactery df = new DogFactery();
        Dog d = (Dog) df.creatAnimal();
        d.eat();
    }

}

abstract class Animal2 {
    abstract void eat();
}

interface Factery {
    Animal2 creatAnimal();
}

class Dog extends Animal2 {
    @Override
    void eat() {
        System.out.println("狗吃肉");
    }
}

class Cat extends Animal2 {
    @Override
    void eat() {
        System.out.println("猫吃鱼");
    }
}

class CatFactery implements Factery {
    @Override
    public Animal2 creatAnimal() {
        return new Cat();
    }
}

class DogFactery implements Factery {
    @Override
    public Animal2 creatAnimal() {
        return new Dog();
    }
}

class Printer2 {
    private int flag = 1;
    private ReentrantLock r = new ReentrantLock();
    private Condition c1 = r.newCondition();
    private Condition c2 = r.newCondition();
    private Condition c3 = r.newCondition();

    public void print1() {
        try {
            r.lock();
            if (flag != 1) {
                c1.await();  //等待
            }

            System.out.println("aaa");

            flag = 2;
            c2.signal();  //唤醒
            r.unlock();

        } catch (Exception e) {

        }

    }

    public void print2() {
        try {
            r.lock();
            if (flag != 2) {
                c2.await();
            }

            System.out.println("bbb");

            flag = 3;
            c3.signal();
            r.unlock();

        } catch (Exception e) {

        }

    }

    public void print3() {
        try {
            r.lock();
            if (flag != 3) {
                c3.await();
            }

            System.out.println("ccc");

            flag = 1;
            c1.signal();
            r.unlock();

        } catch (Exception e) {

        }

    }

}

class MyTime extends TimerTask {

    @Override
    public void run() {
        System.out.println("come on~");
    }

}

//饿汉式
class Single {
    private static Single s = new Single();

    private Single() {
    }

    public static Single getInstance() {
        return s;
    }

}

//懒汉式
class Single2 {
    private static Single2 s2;

    private Single2() {
    }

    public static Single2 getInstance2() {
        if (s2 == null) {
            s2 = new Single2();
        }
        return s2;
    }
}

//二者区别 懒汉式:时间换空间（不推荐），多线程访问可能会出现多个对象
//饿汉式 空间换时间
