package com.ua.robot.HomeWork9;

public class Teacher {
    public String name;
    public int age;
    public String sex;
    public String phone;
    public String subject;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
