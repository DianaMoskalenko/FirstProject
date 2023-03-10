package com.ua.robot.HomeWork14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 7: ");
        int dayNumber = sc.nextInt();

    DayOfWeek dayOfWeek = DayOfWeek.of(dayNumber);;
        System.out.println(dayOfWeek);

    }
}
