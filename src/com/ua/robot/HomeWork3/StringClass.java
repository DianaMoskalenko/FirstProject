package com.ua.robot.HomeWork3;

public class StringClass {
    public static void main(String[] args) {


        String str = "Hello Kitty";

        System.out.println(str);

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println(str.charAt(0));

        int lenght = str.length();
        int lastIndex = lenght - 1;

        System.out.println(str.charAt(lastIndex));
    }
}