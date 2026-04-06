import java.util.*;

// Recursion se n se 1 tak print karna
public class PrintDecreasing {

    public static void printDec(int n) {
        if (n == 1) {          // base case
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);       // recursive call
    }

    public static void main(String[] args) {
        printDec(10);
    }
}
