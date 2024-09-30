// Complete the moveSpecialCharacters() method given in the Tester class.

// Method Description

// moveSpecialCharacters(String str)

// Move all the special characters present in the string passed to the method to the end of the string and return the modified string.
// Note: Assume that the input string does not have any space.

// Test the functionalities using the main() method of the Tester class. 

public class Tester {
    public static void main(String[] args) {
        String input = "abc@123#def$gh!";
        String result = moveSpecialCharacters(input);
        System.out.println("Modified string: " + result);
    }

    public static String moveSpecialCharacters(String str) {
        StringBuilder lettersAndDigits = new StringBuilder();
        StringBuilder specialCharacters = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                lettersAndDigits.append(ch);
            } else {
                specialCharacters.append(ch);
            }
        }
        
        return lettersAndDigits.append(specialCharacters).toString();
    }
}
