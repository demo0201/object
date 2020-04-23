package com.java.test3;

/**
 * @Author: nxw
 * @Date: 2020/4/15 15:49
 */
public class interfaceDemo {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        Bus bus1 = new Bus();

        bike1.start();
        bike1.stop();
        bus1.start();
        bus1.stop();
    }
}
