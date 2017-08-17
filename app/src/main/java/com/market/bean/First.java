package com.market.bean;


import java.util.List;

/**
 * Created by litienan on 2017/7/12.
 */

public class First {
    private int age;
    private String name;
    private List<String> list;

    public First(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "First{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
