import java.util.*;

// Abstract class example
public class AbstractionDemo {
    public static void main(String[] args) {

        Horse h = new Horse();
        h.walk();
        h.eat();
    }
}

abstract class Animal {
    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk(); // compulsory override
}

class Horse extends Animal {
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}
