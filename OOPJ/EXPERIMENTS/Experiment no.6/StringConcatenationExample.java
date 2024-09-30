import java.util.Scanner;
import java.io.*;
public class StringConcatenationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String predefinedString = " World";
        
        System.out.println("Enter a string to concatenate:");
        String userInput = scanner.nextLine();
         System.out.println("Enter another string to concatenate:");
        String userInput1 = scanner.nextLine();
	
        
        String result = userInput.concat(userInput1);
        
        
        System.out.println("Concatenated string is: " + result);
	int output=result.length();
        
        System.out.println("Length of the string is: " + output);
	int show=userInput.compareTo(userInput1);
	 System.out.println("Result after comparing is : " + show);

        scanner.close();
    }
}


