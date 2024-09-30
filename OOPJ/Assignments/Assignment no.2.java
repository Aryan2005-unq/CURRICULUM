// Implement a program to display the sum of two given numbers if the numbers are same. If the numbers are not same, display the double of the sum.
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        displayResult(num1, num2);
        scanner.close();
    }

    public static void displayResult(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("The sum is: " + calculateSum(num1, num2));
        } else {
            System.out.println("Double the sum is: " + doubleSum(num1, num2));
        }
    }

    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    public static int doubleSum(int num1, int num2) {
        return 2 * (num1 + num2);
    }
}
