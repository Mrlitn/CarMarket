package com.day24;

/**
 * Created by litienan on 2017/6/30.
 */

public class MyThread {

    public static void main(String args[]) {
        new Ticket().start();
        new Ticket().start();
        new Ticket().start();

//        demo3();
    }

    public static void demo() {
        new Thread() {
            @Override
            public void run() {
                System.out.print("aaaaaaa");
            }
        }.start();
    }

    public static void demo1() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("bbbbbbb");
            }
        }).start();
    }

    public static void demo2() {
        new Thread() {
            @Override
            public void run() {
                System.out.print(this.getName() + "...aaaa");
            }
        }.start();

        new Thread("ccc") {
            @Override
            public void run() {
                System.out.print(this.getName() + "...bbbbbbb");
            }
        }.start();
    }

    public static void demo3() {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.println(this.getName() + "...aaa");
                    } catch (Exception e) {

                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.println(this.getName() + "...bbbbb");
                    } catch (Exception e) {

                    }
                }
            }
        }.start();
    }

    public static void demo4() {
        //线程守护
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 4; i++) {
                    System.out.println(i + "....fei");
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 40; i++) {
                    System.out.println(i + "----shou");
                }
            }
        };

        t2.setDaemon(true);
        t1.start();
        t2.start();
    }

}

class Ticket extends Thread {
    private static int tickets = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (Ticket.class) {
                try {
                    if (tickets <= 0) {
                        break;
                    }
                    Thread.sleep(10);
                } catch (Exception e) {

                }

                System.out.println(this.getName() + "还剩" + tickets-- + "张票");
            }
        }
    }
}

class Demo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}

