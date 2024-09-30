// Complete the reverseEachWord() method given in the Tester class.

// Method Description

// reverseEachWord(String str)

// Reverse each word in the string passed to the method without changing the order of the words and return the modified string.
// Test the functionalities using the main() method of the Tester class.

public class Tester {
    public static void main(String[] args) {
        String input = "Hello World! This is a test.";
        String result = reverseEachWord(input);
        System.out.println("Modified string: " + result);
    }

    public static String reverseEachWord(String str) {
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedString.append(reversedWord).append(" ");
        }

        return reversedString.toString().trim();
    }
}
