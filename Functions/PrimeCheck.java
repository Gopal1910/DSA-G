import java.util.*;

// Function to check if number is prime
public class PrimeCheck {

    public static boolean isPrime(int n){

        // 1 , 0 , negative prime nahi
        if(n <= 1) return false;

        // sirf √n tak check karna best hai
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return false;   // divisible means not prime
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPrime(11));
    }
}
