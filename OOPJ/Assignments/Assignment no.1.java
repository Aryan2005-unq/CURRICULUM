// Implement a program to find the area of a circle by using the formula given below and display the calculated area. 

// Area = pi*radius*radius 

// The value of pi is 3.14.
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = calculateArea(radius);
        displayArea(area);
        scanner.close();
    }

    public static double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    public static void displayArea(double area) {
        System.out.println("The area of the circle is: " + area);
    }
}
