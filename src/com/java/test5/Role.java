package com.java.test5;

/**
 * @Author: nxw
 * @Date: 2020/4/15 16:01
 */
public abstract class Role {
    private String name;
    private int age;
    private char sex;

    public Role() {
    }

    public Role(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    abstract public void play();

    public void say(){
        System.out.println(this.name+"在说");
    }

    final void sing(){
        System.out.println(this.name+"在唱");
    }


}
