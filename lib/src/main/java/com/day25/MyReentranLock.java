package com.day25;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by litienan on 2017/7/3.
 */

public class MyReentranLock {

    public static void main(String args[]) {
        final Printers p = new Printers();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    p.print();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    p.print1();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    p.print2();
                }
            }
        }.start();
    }

}


class Printers {
    private int flag = 1;
    private ReentrantLock r = new ReentrantLock();
    private Condition c1 = r.newCondition();
    private Condition c2 = r.newCondition();
    private Condition c3 = r.newCondition();

    public void print() {
        r.lock();
        try {
            if (flag != 1) {
                c1.await();
            }
            System.out.println("1");
        } catch (Exception e) {

        }
        flag = 2;
        c2.signal();
        r.unlock();
    }

    public void print1() {
        r.lock();
        try {
            if (flag != 2) {
                c2.await();
            }
            System.out.println("2");
        } catch (Exception e) {

        }
        flag = 3;
        c3.signal();
        r.unlock();
    }

    public void print2() {
        r.lock();
        try {
            if (flag != 3) {
                c3.await();
            }
            System.out.println("3");
        } catch (Exception e) {

        }
        flag = 1;
        c1.signal();
        r.unlock();
    }

}