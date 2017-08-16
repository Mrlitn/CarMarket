package com.day24;

/**
 * 线程
 * Created by litienan on 2017/7/29.
 */

public class MyThread2 {

    public static void main(String[] args) {
//        Thread1 t1 = new Thread1();
//        t1.start();  //开启线程

//        Thread2 t2 = new Thread2();
//        Thread t = new Thread(t2);
//        t.start();
//
//        for (int i = 0; i < 100; i++) {
//            System.out.println("2b");
//        }

        demo8();
    }

    //JVM是多线程的
    public static void demo() {
        //匿名内部类
        //第一种
        new Thread() {
            @Override
            public void run() {

            }
        }.start();

        //第二种
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }

    //线程的方法
    public static void demo1() {
        new Thread() {
            @Override
            public void run() {
                this.setName("设置线程名");
                System.out.println(this.getName() + "--aaa");
            }
        }.start();

        new Thread("我是线程名") {  //构造方法负名
            @Override
            public void run() {
                System.out.println(this.getName() + "--bb");
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("11");
                System.out.println(Thread.currentThread().getName() + "--aa");
            }
        }).start();
    }

    //休眠线程
    public static void demo2() {
        new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 1000; i++) {
                        Thread.sleep(100);
                        System.out.println("==" + i);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    //守护线程
    public static void demo3() {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 2; i++) {
                    System.out.println("==" + i);
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println("--" + i);
                }
            }
        };

        t2.setDaemon(true);  //true 设置为守护线程  (非守护线程执行完毕，守护线程就结束)

        t1.start();
        t2.start();
    }

    //加入线程
    public static void demo4() {
        final Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("=" + i);
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println("---" + i);
                    if (i == 2) {
                        try {
                            t1.join();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };

        //线程优先级  1-10
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t2.start();
        t1.start();
    }

    //同步代码块 :当多线程并发时，我们希望代码执行时，不切换到其他线程工作，这就需要同步
    public static void demo5() {

        Thread t1 = new Thread() {
            @Override
            public void run() {

            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {

            }
        };
    }

    //1、非静态同步方法的锁是this
    //2、静态同步方法的锁是该类的字节码对象
    public static void demo6() {
        final Prainter p = new Prainter();
        new Thread() {
            @Override
            public void run() {
                p.printer1();
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                p.printer2();
            }
        }.start();
    }

    //线程完全问题
    public static void demo7() {
        new Tickers().start();
        new Tickers().start();
        new Tickers().start();
        new Tickers().start();
    }

    public static void demo8() {
        Ticks t = new Ticks();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
    }

    //死锁
    public static void demo9() {

    }

}

class Ticks implements Runnable {
    private int tickets = 100;

    @Override
    public void run() {
        synchronized (Ticks.class) {
            while (true) {
                if (tickets <= 0) {
                    break;
                }

                try {
                    Thread.sleep(100);
                } catch (Exception e) {

                }

                System.out.println(Thread.currentThread().getName() + "=" + tickets-- + "张票");
            }
        }
    }

}

class Tickers extends Thread {
    private static int tickets = 100;

    @Override
    public void run() {
        synchronized (Tickers.class) {
            while (true) {
                if (tickets <= 0) {
                    break;
                }

                try {
                    Thread.sleep(100);
                } catch (Exception e) {

                }

                System.out.println(getName() + "窗口卖出了" + tickets-- + "张票");
            }
        }
    }

}


class Prainter {

    public synchronized void printer1() {

    }

    public synchronized void printer2() {

    }

//    public static synchronized void printer1() {
//
//    }
//
//    public static synchronized void printer2() {
//
//    }

}

class Thread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("aaaa");
        }
    }

}

class Thread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("222aaaa");
        }
    }

}