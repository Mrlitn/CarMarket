package com.day9;

/**
 * Created by litienan on 2017/7/19.
 */

public class MyTest {

    public static void main(String[] args) {
        
    }

}

abstract class Ani {
    public String name;
    public int age;

    public Ani() {
    }

    public Ani(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void sleep();

    public abstract void eat();

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

interface Jump {
    void jump();
}

class CatTest extends Ani {

    public CatTest() {
    }

    public CatTest(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

}

class JumpCat extends CatTest implements Jump {
    public JumpCat() {
    }

    public JumpCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void jump() {

    }

}


