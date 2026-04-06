import java.util.*;

public class IntersectionOfArrays {

    public static void intersection(int arr1[], int arr2[]) {

        // Store arr1 elements
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr1) set.add(x);

        // Store common elements only
        HashSet<Integer> result = new HashSet<>();

        for (int x : arr2) {
            if (set.contains(x)) {
                result.add(x);   // common element found
                set.remove(x);   // avoid duplicate counting
            }
        }

        System.out.println("Intersection = " + result);
    }

    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        intersection(arr1, arr2);
    }
}
