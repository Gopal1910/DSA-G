import java.util.*;

// Merge Sort using Divide & Conquer
public class MergeSort {

    // Array print karne ka helper
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Merge Sort function
    public static void mergeSort(int arr[], int si, int ei) {

        // base case
        if (si >= ei) {
            return;
        }

        // mid nikalna
        int mid = si + (ei - si) / 2;

        // left part sort
        mergeSort(arr, si, mid);

        // right part sort
        mergeSort(arr, mid + 1, ei);

        // merge both sorted parts
        merge(arr, si, mid, ei);
    }

    // Merge two sorted parts
    public static void merge(int arr[], int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1];
        int i = si;        // left part pointer
        int j = mid + 1;   // right part pointer
        int k = 0;         // temp pointer

        // compare & merge
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // bache hue left elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // bache hue right elements
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // temp ko original array me copy
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
