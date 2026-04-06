import java.util.*;

// Bitwise AND se odd/even check karna
public class OddEvenBit {

    public static void oddOrEven(int n){
        int bitMask = 1;

        // LSB check
        if((n & bitMask) == 0){
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }

    public static void main(String args[]){
        oddOrEven(3);
        oddOrEven(14);
        oddOrEven(11);
    }
}
