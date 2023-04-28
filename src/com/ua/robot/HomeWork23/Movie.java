package com.ua.robot.HomeWork23;

import java.io.Serial;
import java.io.Serializable;
import java.io.*;

public class Movie implements Serializable {
    @Serial
    private static final long serialVersionUID = -7248145543599501035L;
    private String name;

    public void writeToFile(String fileName) {
        try (OutputStream os = new FileOutputStream(fileName); ObjectOutputStream oos = new ObjectOutputStream(os)) {
            oos.writeObject(getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Object readFromFile(String fileName) {
        try (InputStream is = new FileInputStream(fileName); ObjectInputStream ois = new ObjectInputStream(is)) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Movie() {

    }

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                '}';
    }
}
