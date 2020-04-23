package com.java.test1;

/**
 * @Author: nxw
 * @Date: 2020/4/15 15:30
 */
public class softwareTeacher extends Teacher {
    public softwareTeacher(int id, String name, char sex, int age, String education, String teacherTitle) {
        super(id, name, sex, age, education, teacherTitle);
    }

    @Override
    public void teachProcedure() {
        System.out.println("我先教软件");
    }
}
