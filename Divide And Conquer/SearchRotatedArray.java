import java.util.*;

// Rotated sorted array me search (Modified Binary Search)
public class SearchRotatedArray {

    public static int search(int arr[], int target) {

        int si = 0;
        int ei = arr.length - 1;

        while (si <= ei) {

            int mid = si + (ei - si) / 2;

            // target mil gaya
            if (arr[mid] == target) {
                return mid;
            }

            // left part sorted hai
            if (arr[si] <= arr[mid]) {

                if (arr[si] <= target && target < arr[mid]) {
                    ei = mid - 1;   // left me jao
                } else {
                    si = mid + 1;   // right me jao
                }
            }
            // right part sorted hai
            else {

                if (arr[mid] < target && target <= arr[ei]) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }
        }
        return -1; // target nahi mila
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println(search(arr, target));
    }
}
