import java.util.*;

/*
 * MAXIMUM AREA IN HISTOGRAM
 * ------------------------
 * Given heights of bars, find largest rectangle area
 *
 * Core Idea:
 * - Use stack to maintain increasing heights
 * - When smaller height comes → calculate area
 *
 * Formula:
 * width = rightIndex - leftIndex - 1
 * area = height * width
 *
 * Time: O(n)
 * Space: O(n)
 */



        // For basic 
 
    //    public static int maxArea(int[] arr) {
    //     int n = arr.length;
    //     int maxArea = 0;

    //     int[] nsr = new int[n]; // next smaller right
    //     int[] nsl = new int[n]; // next smaller left

    //     Stack<Integer> s = new Stack<>();

    //     // ---------- Next Smaller Right ----------
    //     for (int i = n - 1; i >= 0; i--) {
    //         while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
    //             s.pop();
    //         }
    //         if (s.isEmpty()) {
    //             nsr[i] = n;
    //         } else {
    //             nsr[i] = s.peek();
    //         }
    //         s.push(i);
    //     }

    //     // clear stack
    //     s = new Stack<>();

    //     // ---------- Next Smaller Left ----------
    //     for (int i = 0; i < n; i++) {
    //         while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
    //             s.pop();
    //         }
    //         if (s.isEmpty()) {
    //             nsl[i] = -1;
    //         } else {
    //             nsl[i] = s.peek();
    //         }
    //         s.push(i);
    //     }

    //     // ---------- Calculate Max Area ----------
    //     for (int i = 0; i < n; i++) {
    //         int width = nsr[i] - nsl[i] - 1;
    //         int area = arr[i] * width;
    //         maxArea = Math.max(maxArea, area);
    //     }

    //     return maxArea;
    // }

    // public static void main(String[] args) {
    //     int[] arr = {2, 1, 5, 6, 2, 3};
    //     System.out.println(maxArea(arr)); // Output: 10
    // }


    // For Interview optimized 


public class MaxAreaInHistogram {

    public static int maxArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {

            int currentHeight = (i == n) ? 0 : heights[i];

            // calculate area for taller bars
            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {

                int height = heights[stack.pop()];
                int right = i;
                int left = stack.isEmpty() ? -1 : stack.peek();

                int width = right - left - 1;
                int area = height * width;

                maxArea = Math.max(maxArea, area);
            }

            stack.push(i);
        }

        return maxArea;
    }

    public static void main(String[] args) {

        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println("Maximum Area = " + maxArea(heights));
    }
}
