import java.util.*;

// Function value return karega
public class SumReturn {

    public static int calculateSum(int a,int b){
        return a + b;   // result back bhej diya
    }

    public static void main(String[] args){
        int ans = calculateSum(5,7); // jo return aaya ans me store
        System.out.println("Sum = " + ans);
    }
}
