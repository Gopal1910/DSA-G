import java.util.*;

// N-Queen problem : Sirf 1 valid solution print karna
public class NQueenOneSolution {

    // Check karna ki queen rakhna safe hai ya nahi
    public static boolean isSafe(char board[][], int row, int col) {

        //  Same column me upar check
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        //  Left upper diagonal check
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Right upper diagonal check
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Agar sab jagah safe hai
        return true;
    }

    // Backtracking function (sirf 1 solution chahiye)
    public static boolean nQueens(char board[][], int row) {

        //  Base case: saari queens place ho gayi
        if (row == board.length) {
            return true;
        }

        // Har column me try karo
        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {

                // Queen place karo
                board[row][col] = 'Q';

                // Next row ke liye recursion
                if (nQueens(board, row + 1)) {
                    return true;   // 🔥 sirf 1 solution milte hi stop
                }

                // ❌ Backtracking: queen hatao
                board[row][col] = 'x';
            }
        }

        // Agar is row me kahi queen fit nahi hui
        return false;
    }

    // Board print karne ka function
    public static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 4;
        char board[][] = new char[n][n];

        // Board ko 'x' se initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        // Agar solution possible hai
        if (nQueens(board, 0)) {
            System.out.println("✔ One solution exists:");
            printBoard(board);
        } else {
            System.out.println("❌ No solution exists");
        }
    }
}
