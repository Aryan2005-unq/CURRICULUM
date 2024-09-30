import java.io.*;
import java.util.*;
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two numbers is "+calc.add(10, 20));
        System.out.println("Sum of three numbers is "+calc.add(10, 20, 30));
        System.out.println("Sum of two float numbers is "+calc.add(5.5, 7.8));
    }
}
