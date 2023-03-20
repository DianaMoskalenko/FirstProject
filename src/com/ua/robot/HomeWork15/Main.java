package com.ua.robot.HomeWork15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<Integer>(10);
        for(int i = 0; i < 10; i++) {
            firstList.add(i);
        }
        System.out.println(firstList.toString());

        List<Integer> secondList = new LinkedList<>();
        for(int i = 0; i < 2000000; i++) {
            secondList.add(i);
        }

        Student student1 = new Student("Artem", "Suhak" , 19, "12A");
        Student student2 = new Student("Ed", "Nikolov" , 19, "27C");
        Student student3 = new Student("Vlad", "Koval" , 21, "21B");
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students.toString());
    }
}
