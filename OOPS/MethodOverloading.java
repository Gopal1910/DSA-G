import java.util.*;

// Compile time polymorphism
public class MethodOverloading {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        System.out.println(c.sum(2, 3));
        System.out.println(c.sum(2.5f, 3.5f));
        System.out.println(c.sum(1, 2, 3));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
