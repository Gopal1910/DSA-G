import java.util.*;

// Backtracking example on array
public class BacktrackingArray {

    public static void changeArr(int arr[], int i, int val) {

        // base case: poora array bhar gaya
        if (i == arr.length) {
            printArr(arr);
            return;
        }

        // kaam: value assign
        arr[i] = val;

        // recursion: next index
        changeArr(arr, i + 1, val + 1);

        // backtracking step: value revert
        arr[i] = arr[i] - 2;
    }

    public static void printArr(int arr[]) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
