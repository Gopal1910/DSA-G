import java.util.*;

// Selection Sort
// Har step me sabse chhota element dhundh kar correct position par rakhta hai
public class SelectionSort {

    public static void selectionSort(int arr[]) {

        for(int i = 0; i < arr.length - 1; i++){

            int minPos = i;

            // Minimum element ka index find karo
            for(int j = i + 1; j < arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }

            // Swap current element with minimum
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
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
        selectionSort(arr);
        printArr(arr);
    }
}
