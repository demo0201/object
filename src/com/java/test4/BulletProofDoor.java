package com.java.test4;

/**
 * @Author: nxw
 * @Date: 2020/4/15 15:57
 */
public class BulletProofDoor extends Door implements Bulletafe{
    @Override
    public void open() {
        System.out.println("打开防弹门");
    }

    @Override
    public void close() {
        System.out.println("关闭防弹门");
    }

    @Override
    public void bulletProof() {
        System.out.println("我是防弹门");
    }
}
