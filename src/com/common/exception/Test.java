package com.common.exception;

/**
 * @Author: nxw
 * @Date: 2020/4/20 19:28
 */
public class Test {
    public static void main(String[] args) throws MyE {
        throw new MyE("123");
    }
}
