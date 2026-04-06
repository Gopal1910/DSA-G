import java.util.*;

// Prefix sum approach – O(n^2)
public class MaxSubarrayPrefix {

    public static void maxSubarraySum(int numbers[]) {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        // prefix array banana
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        // subarray sum using prefix
        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){

                currSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i-1];

                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max Subarray Sum = " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubarraySum(numbers);
    }
}
