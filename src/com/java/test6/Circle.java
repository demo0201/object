package com.java.test6;

/**
 * @Author: nxw
 * @Date: 2020/4/15 16:25
 */
public class Circle implements Shape2D{
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double grith() {
        return 2*PI*r;
    }

    @Override
    public double area() {
        return PI*r*r;
    }

}
