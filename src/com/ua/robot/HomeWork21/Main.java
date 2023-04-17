package com.ua.robot.HomeWork21;

public class Main {
    public static void main(String[] args) {

        try {
            raiseToPower(-5);
        } catch (NegativeNumberException e) {
            System.out.println("NegativeNumberException! Non-negative value required!");
        }
    }

    private static int raiseToPower(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException();
        }
        return number * number;
    }
}
