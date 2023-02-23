package com.ua.robot.HomeWork10;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.introduse();
        car.Type();

        PassengerCar passengerCar = new PassengerCar();
        passengerCar.introduse();
        passengerCar.Type();

        Lorry lorry = new Lorry();
        lorry.introduse();
        lorry.Type();
    }
}
