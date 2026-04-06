import java.util.*;

// Factorial using recursion
public class FactorialRecursion {

    public static int fact(int n) {
        if (n == 0) {          // base case
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
