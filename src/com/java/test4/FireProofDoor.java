package com.java.test4;

/**
 * @Author: nxw
 * @Date: 2020/4/15 15:55
 */
public class FireProofDoor extends Door implements FireSafe{
    @Override
    public void open() {
        System.out.println("打开防火门");
    }

    @Override
    public void close() {
        System.out.println("关闭防火门");
    }

    @Override
    public void fireProof() {
        System.out.println("我是防火门");
    }
}
