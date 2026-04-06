import java.util.*;

public class UnionOfArrays {
    public static void main(String[] args) {

        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        // HashSet automatically keeps UNIQUE elements
        HashSet<Integer> set = new HashSet<>();

        // Add elements of both arrays
        for (int x : arr1) set.add(x);
        for (int x : arr2) set.add(x);

        // Union = all unique elements
        System.out.println("Union = " + set);

        // Size of union
        System.out.println("Size = " + set.size());
    }
}
