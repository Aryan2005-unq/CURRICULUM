import java.io.*;
import java.util.*;
class hello {
    public static void main(String[] args)
        throws IOException
     {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any two numbers:");
        int a=Integer.parseInt(bf.readLine());
        int b =Integer.parseInt(bf.readLine());
        System.out.println("Enter your name:");
        String name= bf.readLine();
        System.out.println("Hey "+name+" ! your sum of numbers i.e "+a+" + "+b+" = "+(a+b));
        
    }
}

