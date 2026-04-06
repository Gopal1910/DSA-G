import java.util.*;

// Recursion se 1 se n tak print karna
public class PrintIncreasing {

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printInc(n - 1);       // pehle call
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        printInc(10);
    }
}
