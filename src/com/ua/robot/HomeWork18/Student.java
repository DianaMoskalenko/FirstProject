package com.ua.robot.HomeWork18;

public class Student {

    private String name;
    private int averagemark;

    public Student(String name, int averagemark) {
        this.name = name;
        this.averagemark = averagemark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averagemark=" + averagemark +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAveragemark() {
        return averagemark;
    }

    public void setAveragemark(int averagemark) {
        this.averagemark = averagemark;
    }
}