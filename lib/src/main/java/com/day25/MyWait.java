package com.day25;

/**
 * Created by litienan on 2017/7/2.
 */

public class MyWait {

    public static void main(String args[]) {
        final Printer p = new Printer();
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
    }

}

class Printer {
    private int flag = 1;

    public void print() {
        synchronized (this) {
            if (flag != 1) {
                try {
                    this.wait();
                } catch (Exception e) {

                }
            }
            System.out.println("1");

            flag = 2;
            this.notify();
        }
    }

    public void print1() {
        synchronized (this) {
            if (flag != 2) {
                try {
                    this.wait();
                } catch (Exception e) {

                }
            }
            System.out.println("2");
            flag = 1;
            this.notify();
        }
    }

}