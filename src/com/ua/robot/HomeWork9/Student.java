package com.ua.robot.HomeWork9;

public class Student {
    public String name;
    public int age;
    public String sex;
    public String phone;
    public String grade;
    public  int course;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", grade='" + grade + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
