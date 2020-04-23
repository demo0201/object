package com.java.test3;

/**
 * @Author: nxw
 * @Date: 2020/4/15 15:48
 */
public class Bus implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bus start");
    }

    @Override
    public void stop() {
        System.out.println("Bus stop");
    }
}
