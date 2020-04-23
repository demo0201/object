package com.java.test2;

/**
 * @Author: nxw
 * @Date: 2020/4/15 15:44
 */
public class Test {
    public static void main(String[] args) {
        Vehicle car1 = new Car();
        Vehicle motorbike1 = new Motorbike();

        car1.wheelsNum();
        car1.run();
        motorbike1.wheelsNum();
        motorbike1.run();
    }
}
