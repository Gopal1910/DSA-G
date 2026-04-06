import java.util.*;

// Demonstration of Call By Value
public class SwapNumbers {

    public static void swap(int a,int b){

        // swapping logic
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Inside function:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args){

        int a = 10;
        int b = 20;

        swap(a,b);   // function call

        // Original values change nahi hoti (Java = Call By Value)
        System.out.println("Outside function:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
