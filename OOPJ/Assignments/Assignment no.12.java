// Implement a recursive method to generate the nth Fibonacci number.

// The Fibonacci series consists of the first two numbers as 0 and 1 and the subsequent numbers are the sum of the previous two numbers. Implement the logic inside findFibonacci() method.

// Fibonacci numbers  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,

// Test the functionalities using the main method of the Tester class.

public class Tester {
    public static void main(String[] args) {
        int n = 10; // For example, finding the 10th Fibonacci number
        int fibonacciNumber = findFibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacciNumber);
    }

    public static int findFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
}
