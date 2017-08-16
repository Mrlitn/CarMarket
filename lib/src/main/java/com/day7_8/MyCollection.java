package com.day7_8;

import java.util.Scanner;

/**
 * Created by litienan on 2017/7/18.
 */

public class MyCollection {
    public static int i = 0;
    private int j = 0;

    public static void main(String args[]) {
        demo1();
    }

    static {
        //优先于main方法执行 只执行一次
        System.out.println("主方法静态代码块");
    }

    public static void demo() {
        //静态只能访问静态
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入您的数字～");
        int random = (int) (Math.random() * 100) + 1;

        while (true) {
            int i = scanner.nextInt();
            if (random > i) {
                System.out.println("小了");
            } else if (random < i) {
                System.out.println("大了");
            } else {
                System.out.println("中了");
                break;
            }
        }

    }

    public static void demo1() {
        MyClass myClass = new MyClass("22", 11);
    }

}

class MyClass {
    static int classNum = 11;
    private String name;
    private int age;

    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    {
        //构造代码块创造一次对象执行一次，优先于构造方法
        System.out.println("构造代码块");
    }

    static {
        //随着类的加载而加载，只执行一次
        System.out.println("静态代码块");
    }
}
