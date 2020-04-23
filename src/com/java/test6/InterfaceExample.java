package com.java.test6;

import java.util.Scanner;

/**
 * @Author: nxw
 * @Date: 2020/4/15 16:30
 */
public class InterfaceExample {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Circle或Rectangle 请输入：");
        String str1 = sc1.nextLine();
        if (str1.equals("Circle") ){
            System.out.print("请输入半径:");
            double r = sc1.nextDouble();
            Circle circle = new Circle(r);
            System.out.println("周长为"+circle.grith());
            System.out.println("面积为"+circle.area());
        }
        else if (str1.equals("Rectangle") ){
            System.out.println(str1);
            System.out.print("请输入长:");
            double l = sc1.nextDouble();
            System.out.print("请输入宽:");
            double w = sc1.nextDouble();
            Rectangle rectangle = new Rectangle(l,w);
            System.out.println("周长为"+rectangle.grith());
            System.out.println("面积为"+rectangle.area());
        }
    }
}
