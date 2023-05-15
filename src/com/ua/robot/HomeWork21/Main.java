package com.ua.robot.HomeWork21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        try {
            raiseToPower(a);
        } catch (NegativeNumberException e) {
            System.out.println("NegativeNumberException! Non-negative value required!");
        }
        System.out.println(raiseToPower(a));
    }

    private static int raiseToPower(int a) throws NegativeNumberException {
        if (a < 0) {
            throw new NegativeNumberException();
        }
        return a * a;
    }
}
