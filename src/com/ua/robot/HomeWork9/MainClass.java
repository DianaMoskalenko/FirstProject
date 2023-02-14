package com.ua.robot.HomeWork9;

public class MainClass {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.name = "Nik";
        student1.age = 20;
        student1.sex = "male";
        student1.phone = "+380(055)555-55-55";
        student1.grade = "92/100";
        student1.course = 3;
        System.out.println(student1);

        Teacher teacher1 = new Teacher();

        teacher1.name = "Lisa";
        teacher1.age = 43;
        teacher1.sex = "female";
        teacher1.phone = "+380(099)999-99-99";
        teacher1.subject = "Math";
        System.out.println(teacher1);

        ArrayClass arr1 = new ArrayClass();
        arr1.fillArray();
        arr1.sortArray1();
        arr1.sortArray2();
    }

}
