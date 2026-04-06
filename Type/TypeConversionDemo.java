import java.util.*;

// Type Conversion happens automatically when smaller type goes to bigger type
public class TypeConversionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int → float (Allowed because float is bigger)
        System.out.print("Enter any Integer Number: ");
        float number = sc.nextInt();   // int automatically converted to float

        System.out.println("Stored as Float = " + number);

        // ❌ float → int not allowed automatically
        // int num = sc.nextFloat();
        // This gives error because int is smaller than float
    }
}
