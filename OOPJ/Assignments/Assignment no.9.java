// Find and return the count of the adjacent occurrence of a number in the numbers array passed to the findTotalCount() method. Implement the logic inside findTotalCount() method.

// Test the functionalities using the main method of the Tester class.

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to count: ");
        int target = scanner.nextInt();
        int count = findTotalCount(numbers, target);
        System.out.println("Count of adjacent occurrences of " + target + ": " + count);
        scanner.close();
    }

    public static int findTotalCount(int[] numbers, int target) {
        int count = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == target && numbers[i] == numbers[i + 1]) {
                count++;
            }
        }
        return count;
    }
}
