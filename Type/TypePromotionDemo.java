// Type Promotion means small data types automatically convert to bigger type in expressions
import java.util.*;
public class TypePromotionDemo {
    public static void main(String[] args) {

        // Example 1 → promoting to int
        // short a = 5;
        // byte b = 25;
        // char c = 'c';

        // sab ka type int ban jata hai expression me
        // byte result = (byte)(a + b + c);

        // System.out.println(result);

        // Example 2 → promoting to double
        int a = 10;
        float b = 20.5f;
        long c = 25;
        double d = 30.5;

        // sabse bada datatype = double
        double ans = a + b + c + d;

        System.out.println("Final Answer = " + ans);
    }
}
