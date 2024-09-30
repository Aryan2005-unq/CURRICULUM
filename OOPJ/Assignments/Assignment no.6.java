// Calculate and return the sum of all the even numbers present in the numbers array passed to the method calculateSumOfEvenNumbers. Implement the logic inside calculateSumOfEvenNumbers() method.

// Test the functionalities using the main() method of the Tester class.

public class Tester {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = calculateSumOfEvenNumbers(numbers);
        System.out.println("Sum of even numbers: " + sum);
    }

    public static int calculateSumOfEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}
