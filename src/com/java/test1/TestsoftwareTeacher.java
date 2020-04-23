package com.java.test1;

/**
 * @Author: nxw
 * @Date: 2020/4/15 15:40
 */
public class TestsoftwareTeacher {
    public static void main(String[] args) {
        Teacher teacher1 = new softwareTeacher(2, "自行车", '男', 15,"硕士","副教授");
        System.out.println(teacher1.toString());
        teacher1.startWork(8);
        teacher1.teach("software");
        teacher1.teachProcedure();
        teacher1.offWork(15);
    }
}
