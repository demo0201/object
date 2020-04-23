package com.common.Test4;

/**
 * @Author: nxw
 * @Date: 2020/4/17 14:20
 */
public class StringPr {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println(str.indexOf('o'));
        System.out.println(str.lastIndexOf('o'));
        System.out.println(str.replace('l', 'm'));

        String s1 = str.split(" ")[0];
        String s2 = str.split(" ")[1];
        System.out.println(s1.equals(s2));
    }
}
