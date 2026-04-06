import java.util.*;

// Type Casting means converting one data type into another manually
public class TypeCastingDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // float → int (manual cast required)
        float a = 25.12f;

        // int b = a; ❌ error (lossy conversion)
        int b = (int) a;   // ✔ correct → type casting

        System.out.println("After Casting float to int: " + b);

        // Character to ASCII Conversion
        char ch = 'a';
        char ch2 = 'b';

        int i = ch;       // converts char → int (ASCII value)
        int i2 = ch2;

        System.out.println("ASCII of a = " + i);
        System.out.println("ASCII of b = " + i2);
    }
}
