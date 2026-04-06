import java.util.*;

// Counting Sort
// Frequency count ke base par sorting
public class CountingSort {

    public static void countingSort(int arr[]) {

        // Step 1: sabse bada element find karo
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        // Step 2: count array banao
        int count[] = new int[largest + 1];

        // Step 3: frequency store karo
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        // Step 4: sorting using count array
        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingSort(arr);
        printArr(arr);
    }
}
