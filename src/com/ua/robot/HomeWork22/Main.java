package com.ua.robot.HomeWork22;

public class Main {
    public static void main(String[] args) {
        final String FILE_NAME = "movies.txt";

        Movie m1 = new Movie("Harry Potter 1");
        Movie m2 = new Movie("Harry Potter 2");
        Movie m3 = new Movie("Harry Potter 3");

        m1.writeToFile(FILE_NAME);
        m1.readFromFile(FILE_NAME);

        m2.writeToFile(FILE_NAME);
        m2.readFromFile(FILE_NAME);

        m3.writeToFile(FILE_NAME);
        m3.readFromFile(FILE_NAME);
    }

    }
