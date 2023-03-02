package com.ua.robot.HomeWork12;

public abstract class Personality {

    private String name;
    private int age;

public abstract void talkAboutMyself();
public abstract void work();
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Personality(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
