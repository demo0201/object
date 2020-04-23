package com.common.Test1;

/**
 * @Author: nxw
 * @Date: 2020/4/17 14:09
 */
public class ToString {
    public static void main(String[] args) {
        Double a1 = new Double(12.0);
        Integer a2 = new Integer(12);
        String a3 = new String("123");
        StringBuffer a4 = new StringBuffer("123");

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(a4.toString());
    }
}
