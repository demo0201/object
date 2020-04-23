package com.java.test1;

/**
 * @Author: nxw
 * @Date: 2020/4/15 15:20
 */
public abstract class Teacher {
    private int id;
    private String name;
    private char sex;
    private int age;
    private String education;
    private String teacherTitle;

    public Teacher(int id, String name, char sex, int age, String education, String teacherTitle) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.education = education;
        this.teacherTitle = teacherTitle;
    }

    public void startWork(int time){
        System.out.println(this.name+time+"上班");
    }

    public void offWork(int time){
        System.out.println(this.name+time+"下班");
    }

    public void teach(String course){
        System.out.println(this.name+"教"+course);
    }

    abstract public void teachProcedure();

    @Override
    public String toString() {
        return "教师编号："+id+"教师名字："+name;
    }
}
