// Implement a class Rectangle with the instance variables and methods mentioned below. 
// Method Description
// calculateArea()
// Calculate and return the area of the rectangle. The area should be rounded off to two decimal digits.

// calculatePerimeter()
// Calculate and return the perimeter of the rectangle. The perimeter should be rounded off to two decimal digits.
import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return Math.round((length * width) * 100.0) / 100.0;
    }

    public double calculatePerimeter() {
        return Math.round((2 * (length + width)) * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        scanner.close();
    }
}
