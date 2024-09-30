// Find the next 15 leap years from the year passed as parameter to the findLeapYears() method. Include the year passed as parameter if it is a leap year. Implement the logic inside findLeapYears() method and return an int array containing all the leap years.

import java.util.Scanner;

public class LeapYearFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        int[] leapYears = findLeapYears(year);
        System.out.println("Next 15 leap years:");
        for (int leapYear : leapYears) {
            System.out.println(leapYear);
        }
        scanner.close();
    }

    public static int[] findLeapYears(int startYear) {
        int[] leapYears = new int[15];
        int count = 0;
        int year = startYear;

        while (count < 15) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                leapYears[count] = year;
                count++;
            }
            year++;
        }

        return leapYears;
    }
}
