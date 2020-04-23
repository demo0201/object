package com.common.Test2;

/**
 * @Author: nxw
 * @Date: 2020/4/17 14:13
 */
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
public class Equals {
    public static void main(String[] args) {
        String str = new String("hello");
        String str1 = "hello";

        System.out.println(str == str1);
        System.out.println(str.equals(str1));

        Person p1 = new Person("asd", 12);
        Person p2 = new Person("asd", 12);
        System.out.println(p1.equals(p2));
    }
}
