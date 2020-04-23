package com.java.test3;

/**
 * @Author: nxw
 * @Date: 2020/4/15 15:47
 */
public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike start");
    }

    @Override
    public void stop() {
        System.out.println("Bike stop");
    }
}
