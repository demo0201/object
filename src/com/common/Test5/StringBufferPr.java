package com.common.Test5;

/**
 * @Author: nxw
 * @Date: 2020/4/17 14:27
 */
public class StringBufferPr {
    public static void main(String[] args) {
        StringBuffer stringBuffer1 = new StringBuffer("3213");

        System.out.println(stringBuffer1.insert(2, "88"));
        System.out.println(stringBuffer1.append("321"));
        System.out.println(stringBuffer1.replace(0, 2, "987"));

    }
}
