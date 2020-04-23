package com.java.test6;

/**
 * @Author: nxw
 * @Date: 2020/4/15 16:28
 */
public class Rectangle implements Shape2D{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double grith() {
        return 2*(width+height);
    }

    @Override
    public double area() {
        return width*height;
    }
}
