import java.io.*;
import java.util.*;
class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int num = sc.nextInt();
        System.out.println("Enter your name:");
        String name= sc.nextLine();
        name+=sc.nextLine();
        System.out.println("Your name is "+name+" and entered number is "+num);
        sc.close();
    }
}

