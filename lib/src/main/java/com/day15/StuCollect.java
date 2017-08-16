package com.day15;

/**
 * Created by litienan on 2017/6/11.
 */

public class StuCollect {
    private String name;
    private int age;

    public StuCollect(String name, int age) {
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

    @Override
    public String toString() {
        return "StuCollect{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
