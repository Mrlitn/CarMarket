package com.day25;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by litienan on 2017/7/3.
 */

public class fuxi {

    public static void main(String args[]) {
        final Print p = new Print();

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

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    p.print3();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    p.print4();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    p.print5();
                }
            }
        }.start();
    }

}

class Print {
    private int flag = 1;
    ReentrantLock r = new ReentrantLock();
    Condition c1 = r.newCondition();
    Condition c2 = r.newCondition();
    Condition c3 = r.newCondition();
    Condition c4 = r.newCondition();
    Condition c5 = r.newCondition();

    public void print1() {
        r.lock();
        try {
            if (flag != 1) {
                c1.await();
            }
            System.out.println("111");
        } catch (Exception e) {

        }

        flag = 2;
        c2.signal();
        r.unlock();
    }

    public void print2() {
        r.lock();
        try {
            if (flag != 2) {
                c2.await();
            }
            System.out.println("222");
        } catch (Exception e) {

        }

        flag = 3;
        c3.signal();
        r.unlock();
    }

    public void print3() {
        r.lock();
        try {
            if (flag != 3) {
                c3.await();
            }
            System.out.println("333");
        } catch (Exception e) {

        }

        flag = 4;
        c4.signal();
        r.unlock();
    }

    public void print4() {
        r.lock();
        try {
            if (flag != 4) {
                c4.await();
            }
            System.out.println("444");
        } catch (Exception e) {

        }

        flag = 5;
        c5.signal();
        r.unlock();
    }

    public void print5() {
        r.lock();
        try {
            if (flag != 5) {
                c5.await();
            }
            System.out.println("555");
        } catch (Exception e) {

        }

        flag = 1;
        c1.signal();
        r.unlock();
    }
}