import java.util.*;

// super keyword example
public class SuperKeywordDemo {
    public static void main(String[] args) {

        Horse h = new Horse();
    }
}

class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Horse extends Animal {
    Horse() {
        super(); // parent constructor call
        System.out.println("Horse constructor");
    }
}
