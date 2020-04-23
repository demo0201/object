package com.java.test1;

/**
 * @Author: nxw
 * @Date: 2020/4/15 15:31
 */
public class TestMusicTeacher {
    public static void main(String[] args) {
        Teacher teacher1 = new MusicTeacher(1, "阿斯顿", '男', 15,"硕士","副教授");
        System.out.println(teacher1.toString());
        teacher1.startWork(8);
        teacher1.teach("Music");
        teacher1.teachProcedure();
        teacher1.offWork(15);
    }
}
