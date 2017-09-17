package com.day7_8;

/**
 * Created by litienan on 2017/9/4.
 */

public class MyExtends3 {

    public static void main(String[] args) {
        demo();
    }

    static {
        //优先于main方法执行,用于加载驱动

    }

    public static void demo() {
        Dog3 d = new Dog3();

//        Dog3 d1 = new Dog3("ss", 11);
    }

}

class Animal3 {
    //继承共性：看顶层的类，使用用最底层的类
    //子类只能继承父类非私有的成员；子类不能继承父类构造方法
    private String name;
    private int leg;

    public Animal3() {
        System.out.println("父类空参");
    }

    public Animal3(String name, int age) {
        System.out.println("父类有参");
        System.out.println(name + "==" + age);
    }

    public void eat() {
        System.out.println("eat");
    }

    public void sleep() {
        System.out.println("sleep");
    }

}

class Dog3 extends Animal3 {

    public Dog3() {
//        super("aa", 11);
        this("bb", 22);
        System.out.println("子类空参");
    }

    public Dog3(String name, int age) {
        //子类访问父类空参的构造方法
        super(name, age);
        System.out.println("子类有参");
    }

}

class Cat3 extends Animal3 {

}

class Student {
    private String name;
    private int age;

    static {
        //
    }

    {
        System.out.println("构造代码");
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

}
