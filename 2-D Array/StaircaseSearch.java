import java.util.*;

// Sorted matrix me element search karna (Staircase Search)
public class StaircaseSearch {

    public static boolean searchMatrix(int matrix[][], int key) {

        int row = 0;
        int col = matrix[0].length - 1; // top-right corner

        // Jab tak matrix ke andar ho
        while(row < matrix.length && col >= 0){

            if(matrix[row][col] == key){
                System.out.println("Key found at (" + row + ", " + col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--; // left move
            }
            else{
                row++; // down move
            }
        }

        System.out.println("Key not found");
        return false;
    }

    public static void main(String args[]) {

        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int key = 33;
        searchMatrix(matrix, key);
    }
}
