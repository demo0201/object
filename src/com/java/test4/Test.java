package com.java.test4;

/**
 * @Author: nxw
 * @Date: 2020/4/15 15:58
 */
public class Test {
    public static void main(String[] args) {
        FireProofDoor door1 = new FireProofDoor();
        BulletProofDoor door2 = new BulletProofDoor();

        door1.fireProof();
        door1.open();
        door1.close();
        door2.bulletProof();
        door2.open();
        door2.close();
    }
}
