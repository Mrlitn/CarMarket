package com.day17;

/**
 * Created by litienan on 2017/6/16.
 */

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Person p = (Person) obj;
        return p.getAge() == this.age && p.getName() == this.name;
    }

    @Override
    public int hashCode() {
        return 10;
    }


    @Override
    public int compareTo(Person o) {
        int num = this.age - o.age;
        return num == 0 ? this.name.compareTo(o.name) : num;
    }
}
