import java.util.*;

// Bubble Sort algorithm
// Bade elements ko dheere-dheere right side le jata hai
public class BubbleSort {

    public static void bubbleSort(int arr[]) {

        // Har turn me ek largest element end me fix ho jata hai
        for(int turn = 0; turn < arr.length - 1; turn++){

            for(int j = 0; j < arr.length - 1 - turn; j++){

                // Agar current element bada hai next se → swap
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Array print karne ka function
    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        bubbleSort(arr);
        printArr(arr);
    }
}
