import java.util.*;

// Print all primes from 2 to n
public class PrimeInRange {

    public static boolean isPrime(int n){
        if(n<=1) return false;

        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void primeInRange(int n){

        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args){
        primeInRange(20);
    }
}
