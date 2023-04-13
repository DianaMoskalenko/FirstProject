package com.ua.robot.HomeWork20;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int number = 0;
        boolean isValid = false;

        do {
            try {
                System.out.println("Input a number: ");
                number = myObj.nextInt();
                isValid = true;
            } catch (NoSuchElementException e) {
                System.out.println("InputMismatchException");
                myObj.nextLine();
            }
        } while (!isValid);
    }
}
