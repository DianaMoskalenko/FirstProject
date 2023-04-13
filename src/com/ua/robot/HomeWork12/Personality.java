package com.ua.robot.HomeWork12;

public abstract class Personality {

    private String name;
    private int age;
    private String speciality;

    public abstract void talkAboutMyself();

    public abstract void work();

    public String getSpeciality() {
        return speciality;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Personality(String name, int age, String speciality) {
        this.name = name;
        this.age = age;
        this.speciality = speciality;
    }

}
