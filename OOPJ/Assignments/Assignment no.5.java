// Complete the removeWhiteSpaces() method given in the Tester class.

// Method Description

// removeWhiteSpaces(String str)

// Remove all the white spaces from the string passed to the method and return the modified string.

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = removeWhiteSpaces(input);
        displayResult(result);
        scanner.close();
    }

    public static String removeWhiteSpaces(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void displayResult(String result) {
        System.out.println("String without white spaces: " + result);
    }
}
