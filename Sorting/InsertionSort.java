import java.util.*;

// Insertion Sort
// Cards jaisa sorting (left side sorted hota jata hai)
public class InsertionSort {

    public static void insertionSort(int arr[]) {

        for(int i = 1; i < arr.length; i++){

            int curr = arr[i];      // current element
            int prev = i - 1;

            // Correct position dhoondhna
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Current element ko correct jagah insert
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        insertionSort(arr);
        printArr(arr);
    }
}
