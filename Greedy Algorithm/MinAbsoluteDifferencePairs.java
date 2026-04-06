import java.util.*;

public class MinAbsoluteDifferencePairs {

    // Minimum Absolute Difference Pairs

    public static void main(String[] args) {

        int A[] = {1, 2, 3};
        int B[] = {2, 1, 3};

        // Sort both arrays
        Arrays.sort(A);
        Arrays.sort(B);

        // Calculate minimum absolute difference
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += Math.abs(A[i] - B[i]);
        }

        System.out.println("Minimum Absolute Difference = " + sum);
    }
}
