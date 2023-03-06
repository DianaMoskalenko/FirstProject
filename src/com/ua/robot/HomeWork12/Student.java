package com.ua.robot.HomeWork12;

public class Student extends Personality{

    public Student(String name, int age, String speciality) {
        super(name, age, speciality);
    }



    @Override
    public void talkAboutMyself() {
        System.out.println("I am a student");
        System.out.println("My name is " + getName());
        System.out.println("I am " + getAge() + " years old");
    }
    public void work() {
        System.out.println("I am " + getSpeciality() );
    }
}
