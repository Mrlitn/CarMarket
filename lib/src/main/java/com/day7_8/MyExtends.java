package com.day7_8;

/**
 * Created by litienan on 2017/7/18.
 */

public class MyExtends {

    public static void main(String args[]) {
//        Dog d = new Dog();
//        d.print();

        Cat c = new Cat();
        System.out.println("=======");
        Cat c1 = new Cat();

    }

}

class Animal {
    static {
        System.out.println("Animal----fu1");
    }

    {
        System.out.println("Animal----fu2 ");
    }

    private String color;
    public int leg = 10;

    public Animal() {
        System.out.println("Animal----fu3");
    }

    public Animal(String color, int leg) {
        System.out.println("Animal----yes");
        this.color = color;
        this.leg = leg;
    }

    public void run() {
        System.out.println("run");
    }

    public void eat() {
        System.out.println("eat");
    }

}

class Dog extends Animal {
    public int leg = 20;
    public int leg1 = 10;

    public Dog() {
        this(11111);
        System.out.println("Dog--no");
    }

    public Dog(int leg) {
        super("", leg);
        this.leg = leg;
        System.out.println("Dog--yes");
    }

    public void print() {
        System.out.println(this.leg);
        System.out.println(super.leg);
        System.out.println(leg1);
    }

}

class Cat extends Animal {
    static {
        System.out.println("Cat----1");
    }

    {
        System.out.println("Cat----2");
    }

    public Cat() {
        System.out.println("Cat----3");
    }

}

