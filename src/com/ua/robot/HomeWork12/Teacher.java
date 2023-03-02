package com.ua.robot.HomeWork12;

public class Teacher extends Personality{


    public Teacher(String name, int age, String speciality) {
        super(name, age, speciality);
    }
    @Override
    public void talkAboutMyself() {
        System.out.println("I am a teacher");
        System.out.println("My name is " + getName());
        System.out.println("I am " + getAge() + " years old");
    }
    public void work(){
        System.out.println("I am " + getSpeciality());
    }
}
