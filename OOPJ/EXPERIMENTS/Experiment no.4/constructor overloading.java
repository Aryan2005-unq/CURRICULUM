import java.io.*;
import java.util.*;
class Person {
    String name;
    int age;

    Person() {
        name = "Unknown";
        age = 0;
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("John", 25);

        person1.display();
        person2.display();
    }
}
