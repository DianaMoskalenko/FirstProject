package com.ua.robot.HomeWork18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Nick", 5);
        Student s2 = new Student("Steve", 2);
        Student s3 = new Student("Mark", 4);
        Student s4 = new Student("Andrew", 4);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        System.out.println(students);

        Collections.sort(students, Comparator.comparingInt(Student::getAveragemark));
        System.out.println(students);

        Collections.sort(students,((o1, o2) -> o1.getName().compareTo( o2.getName())));
        System.out.println(students);

    }
}
