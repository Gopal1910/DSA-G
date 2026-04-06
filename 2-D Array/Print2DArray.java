import java.util.*;

// 2D Array (Matrix) ko print karna
public class Print2DArray {

    public static void main(String args[]) {

        int matrix[][] = {
            {1, 2, 3, 4},
            {4, 5, 6, 7},
            {8, 9, 10, 11},
            {12, 13, 14, 15}
        };

        // Rows ke liye loop
        for(int i = 0; i < matrix.length; i++){

            // Columns ke liye loop
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }

            // Har row ke baad new line
            System.out.println();
        }
    }
}
