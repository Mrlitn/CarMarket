package com.day17;

/**
 * Created by litienan on 2017/7/25.
 */

public class Student2 implements Comparable<Student2> {
    private String name;
    private int age;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student2 o) {
        int num = this.age - o.getAge();
        return num == 0 ? this.name.compareTo(o.getName()) : num;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student2)) return false;

        Student2 student2 = (Student2) o;

        if (getAge() != student2.getAge()) return false;
        return getName() != null ? getName().equals(student2.getName()) : student2.getName() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        return result;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
