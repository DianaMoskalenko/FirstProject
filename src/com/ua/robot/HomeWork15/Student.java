package com.ua.robot.HomeWork15;

public class Student {
    public String name;
    public String surname;
    public int age;
    public String group;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                '}';
    }

    public Student(String name, String surname, int age, String group) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.group = group;
    }
}
