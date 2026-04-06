import java.util.*;

public class SubarraySumK {

    // Count subarrays whose sum = K
    public static int countSubarrays(int arr[], int K) {

        // prefixSum → frequency map
        HashMap<Integer, Integer> map = new HashMap<>();

        // Important base case → handles subarray starting from index 0
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : arr) {

            sum += num; // running prefix sum

            // If (sum − K) seen before → valid subarray exists
            if (map.containsKey(sum - K)) {
                count += map.get(sum - K);
            }

            // store current prefix sum frequency
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int K = 3;

        System.out.println("Answer = " + countSubarrays(arr, K));
    }
}
