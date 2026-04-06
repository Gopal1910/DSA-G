import java.util.*;

public class MajorityElementNby3 {

    // Print elements appearing more than n/3 times
    public static void majorityElement(int nums[]) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        // Step 1 → count frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2 → check frequency > n/3
        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.println("Majority element: " + key);
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        majorityElement(nums);
    }
}
