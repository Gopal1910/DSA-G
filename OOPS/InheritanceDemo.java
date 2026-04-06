import java.util.*;

// Inheritance example
public class InheritanceDemo {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();     // Animal
        d.walk();    // Mammal
        System.out.println(d.legs);
    }
}

// Base class
class Animal {
    void eat() {
        System.out.println("Eats");
    }
}

// Derived class
class Mammal extends Animal {
    int legs = 4;

    void walk() {
        System.out.println("Walks");
    }
}

// Multilevel inheritance
class Dog extends Mammal {
}
