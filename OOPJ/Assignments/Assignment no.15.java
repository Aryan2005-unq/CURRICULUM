// Implement a program to find the number of rabbits and chickens in a farm. Given the number of heads and legs of the chickens and rabbits in a farm, identify and display the number of chickens and rabbits in the farm.

// If the given input cannot make a valid number of rabbits and chickens, then display an appropriate message.

import java.util.Scanner;

public class FarmAnimals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of heads: ");
        int heads = scanner.nextInt();

        System.out.print("Enter the number of legs: ");
        int legs = scanner.nextInt();

        findAnimals(heads, legs);
    }

    public static void findAnimals(int heads, int legs) {
        int rabbits = (legs - 2 * heads) / 2;
        int chickens = heads - rabbits;

        if (legs % 2 != 0 || chickens < 0 || rabbits < 0) {
            System.out.println("No valid solution.");
        } else {
            System.out.println("Number of chickens: " + chickens);
            System.out.println("Number of rabbits: " + rabbits);
        }
    }
}
