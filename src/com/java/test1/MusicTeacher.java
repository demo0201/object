package com.java.test1;

/**
 * @Author: nxw
 * @Date: 2020/4/15 15:28
 */
public class MusicTeacher extends Teacher {

    public MusicTeacher(int id, String name, char sex, int age, String education, String teacherTitle) {
        super(id, name, sex, age, education, teacherTitle);
    }

    @Override
    public void teachProcedure() {
        System.out.println("我先教音乐");
    }
}
