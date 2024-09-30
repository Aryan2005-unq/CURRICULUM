import java.io.*;
import java.util.*;
class Animal {
    final String type = "Mammal";

    Animal() {
        System.out.println("Animal constructor called.");
    }

    final void sound() {
        System.out.println("Animals make sound.");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String breed) {
        super();
        this.breed = breed;
    }

    void displayInfo() {
        System.out.println("Animal type: " + super.type);
        System.out.println("Dog breed: " + this.breed);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Golden Retriever");
        dog.displayInfo();
        dog.sound();
    }
}
