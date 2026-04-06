import java.util.*;

// Function to find factorial
public class FactorialFunction {

    public static int factorial(int n){

        int f = 1;

        // loop 1 → n tak multiply karta jayega
        for(int i = 1 ; i <= n ; i++){
            f = f * i;
        }

        return f;
    }

    public static void main(String[] args){
        System.out.println("Factorial = " + factorial(4));
    }
}
