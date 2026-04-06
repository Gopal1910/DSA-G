import java.util.*;

// Matrix ke primary + secondary diagonal ka sum
public class DiagonalSum {

    public static int diagonalSum(int matrix[][]) {

        int sum = 0;

        // Optimized approach → O(n)
        for(int i = 0; i < matrix.length; i++){

            // Primary diagonal (i == j)
            sum += matrix[i][i];

            // Secondary diagonal (i + j = n - 1)
            if(i != matrix.length - i - 1){
                sum += matrix[i][matrix.length - i - 1];
            }
        }

        return sum;
    }

    public static void main(String args[]) {

        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Diagonal Sum = " + diagonalSum(matrix));
    }
}
