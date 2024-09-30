import java.io.*;
import java.util.*;
class Car {
    String model;
    String color;
    int year;

    void start() {
        System.out.println(model + " is starting.");
    }

    void drive() {
        System.out.println(model + " is driving.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Tesla Model S";
        car1.color = "Red";
        car1.year = 2020;

        Car car2 = new Car();
        car2.model = "BMW M3";
        car2.color = "Black";
        car2.year = 2019;

        car1.start();
        car1.drive();

        car2.start();
        car2.drive();
    }
}
