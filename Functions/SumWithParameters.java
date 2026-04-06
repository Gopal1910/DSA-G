import java.util.*;

// Function with parameters (values function call se milti hain)
public class SumWithParameters {

    public static void calculateSum(int a,int b){
        int sum = a + b;        // calculation
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args){
        calculateSum(10,20);    // passing values
    }
}
