import java.util.*;

// Array ke saare subarrays print karna
public class Subarrays {

    public static void printSubarrays(int numbers[]) {

        int totalSubarrays = 0;

        for(int i = 0; i < numbers.length; i++){

            for(int j = i; j < numbers.length; j++){

                // ek subarray print karna
                for(int k = i; k <= j; k++){
                    System.out.print(numbers[k] + " ");
                }

                totalSubarrays++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total subarrays: " + totalSubarrays);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}
