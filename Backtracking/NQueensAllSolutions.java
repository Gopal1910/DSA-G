import java.util.*;

// N Queens - print all solutions
public class NQueensAllSolutions {

    public static boolean isSafe(char board[][], int row, int col) {

        // vertical up
        for (int i = row - 1; i >= 0; i--)
            if (board[i][col] == 'Q') return false;

        // diagonal left up
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;

        // diagonal right up
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length; i--, j++)
            if (board[i][j] == 'Q') return false;

        return true;
    }

    public static void nQueens(char board[][], int row) {

        // base case
        if (row == board.length) {
            printBoard(board);
            System.out.println("--------");
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';     // place
                nQueens(board, row + 1);  // recurse
                board[row][col] = 'x';    // backtrack
            }
        }
    }

    public static void printBoard(char board[][]) {
        for (char[] r : board) {
            for (char c : r) System.out.print(c + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for (char[] r : board)
            Arrays.fill(r, 'x');

        nQueens(board, 0);
    }
}
