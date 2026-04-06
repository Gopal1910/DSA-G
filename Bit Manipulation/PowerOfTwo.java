import java.util.*;

// Check number power of 2 hai ya nahi
public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n){
        return (n & (n - 1)) == 0;
    }

    public static void main(String args[]){
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(5));
    }
}
