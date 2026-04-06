import java.util.*;

public class NQueensCount {

    static int count = 0;

    public static boolean isSafe(char board[][], int row, int col) {

        for (int i = row - 1; i >= 0; i--)
            if (board[i][col] == 'Q') return false;

        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;

        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length; i--, j++)
            if (board[i][j] == 'Q') return false;

        return true;
    }

    public static void nQueens(char board[][], int row) {

        if (row == board.length) {
            count++;
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nQueens(board, row + 1);
                board[row][col] = 'x';
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for (char[] r : board)
            Arrays.fill(r, 'x');

        nQueens(board, 0);
        System.out.println("Total ways = " + count);
    }
}
