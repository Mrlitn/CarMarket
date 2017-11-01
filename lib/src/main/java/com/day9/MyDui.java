package com.day9;

/**
 * Created by litienan on 2017/10/19.
 */

public class MyDui {

    public static void main(String[] args){
        Person p = new Superman();
        System.out.println(p.name);
    }

}

class Person{
    public String name = "Jhon";

    public void bus(){

    }

}

class Superman extends Person{
    public String name = "abc";

    public void bus(){

    }

    public void fly(){

    }

}
