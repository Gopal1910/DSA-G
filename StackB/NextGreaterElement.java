import java.util.*;

/*
 * NEXT GREATER ELEMENT (NGE)
 * -------------------------
 * For each element, find next greater element on right
 * Uses stack
 * Traverse from right to left
 */

public class NextGreaterElement {

    public static void nextGreater(int[] arr) {

        Stack<Integer> s = new Stack<>();
        int[] nge = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            // remove smaller elements
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            nge[i] = s.isEmpty() ? -1 : s.peek();
            s.push(arr[i]);
        }

        for (int x : nge) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        nextGreater(arr);
    }
}
