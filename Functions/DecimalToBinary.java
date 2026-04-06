import java.util.*;

// Convert Decimal Number to Binary
public class DecimalToBinary {

    public static void decToBin(int n){

        int myNum = n;
        int pow = 1;
        int binNum = 0;

        while(n > 0){

            int rem = n % 2;        // remainder
            binNum += rem * pow;    // store binary
            pow *= 10;
            n /= 2;
        }

        System.out.println("Binary of " + myNum + " = " + binNum);
    }

    public static void main(String[] args){
        decToBin(7);
        decToBin(10);
    }
}
