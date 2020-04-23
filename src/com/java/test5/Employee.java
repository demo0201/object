package com.java.test5;

/**
 * @Author: nxw
 * @Date: 2020/4/15 16:05
 */
public class Employee extends Role {
    final int id=101;
    static String company;
    private double salary;

    public Employee(double id) {
        super();
        this.salary = id;
    }

    public Employee(String name, int age, char sex, double salary) {
        super(name, age, sex);
        this.salary = salary;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Employee.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void play() {
        super.say();
    }

    @Override
    public String toString(){
        return super.getName()+super.getAge()+super.getSex()+salary+company;
    }
}
