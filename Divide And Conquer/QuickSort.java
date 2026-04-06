import java.util.*;

// Quick Sort using Divide & Conquer
public class QuickSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {

        // base case
        if (si >= ei) {
            return;
        }

        // pivot index
        int pIdx = partition(arr, si, ei);

        // left part
        quickSort(arr, si, pIdx - 1);

        // right part
        quickSort(arr, pIdx + 1, ei);
    }

    // Partition logic
    public static int partition(int arr[], int si, int ei) {

        int pivot = arr[ei];   // pivot = last element
        int i = si - 1;        // smaller elements index

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // pivot ko correct position pe lana
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i; // pivot index
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
