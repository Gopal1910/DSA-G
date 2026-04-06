import java.util.*;

// nCr = n! / (r! (n-r)!)
public class BinomialCoefficient {

    // factorial function reuse ho raha
    public static int factorial(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f *= i;
        }
        return f;
    }

    // Binomial formula
    public static int binCoeff(int n,int r){
        return factorial(n) / (factorial(r) * factorial(n-r));
    }

    public static void main(String[] args){
        System.out.println("Binomial Coefficient = " + binCoeff(5,2));
    }
}
