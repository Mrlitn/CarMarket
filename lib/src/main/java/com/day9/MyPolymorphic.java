package com.day9;

/**
 * 多态
 * Created by litienan on 2017/7/19.
 */

public class MyPolymorphic {

    public static void main(String[] args) {
        //父类指针指向子类对象，即向上转型
        Animal a = new Cat();
        a.eat();
        a.print();

        //向下转型
        Cat a1 = (Cat) a;
        a1.fly();

        System.out.println(a.num + "==" + a.s);

    }
    
    public static void methed(Animal a) {
        if (a instanceof Dog) {
            Dog dog = (Dog) a;
            dog.lookHome();
        } else if (a instanceof Cat) {
            Cat cat = (Cat) a;
            cat.fly();
        } else {
            a.eat();
        }
    }

}

class Animal {
    public int num = 10;
    public String s = "aa";

    public void eat() {
        System.out.println("吃食");
    }

    public void print() {

    }

}

class Cat extends Animal {
    public int num = 20;
    public String s = "bb";

    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    public void print() {
        System.out.println("吃鱼");
    }

    public void fly() {
        System.out.println("会飞");
    }
}

class Dog extends Animal {

    public void lookHome() {
        System.out.println("看家");
    }

}