import java.util.*;

// Matrix ko spiral order me print karna
public class SpiralMatrix {

    public static void printSpiral(int matrix[][]) {

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol){

            // TOP row
            for(int j = startCol; j <= endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }

            // RIGHT column
            for(int i = startRow + 1; i <= endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }

            // BOTTOM row
            for(int j = endCol - 1; j >= startCol; j--){
                if(startRow == endRow) break;
                System.out.print(matrix[endRow][j] + " ");
            }

            // LEFT column
            for(int i = endRow - 1; i >= startRow + 1; i--){
                if(startCol == endCol) break;
                System.out.print(matrix[i][startCol] + " ");
            }

            // Boundary update
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        System.out.println();
    }

    public static void main(String args[]) {

        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        printSpiral(matrix);
    }
}
