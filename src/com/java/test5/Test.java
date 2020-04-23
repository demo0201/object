package com.java.test5;

/**
 * @Author: nxw
 * @Date: 2020/4/15 16:14
 */
public class Test {
    public static void main(String[] args) {
        Employee.company = "千瓦时";

        Employee e1 = new Employee(3230);
        Employee e2 = new Employee("阿斯顿", 25, '男', 3500);

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        e1.sing();
        e2.play();
    }
}
