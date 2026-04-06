import java.util.*;

// Binary Search (Array sorted hona chahiye)
public class BinarySearch {

    public static int binarySearch(int numbers[], int key) {

        int start = 0;
        int end = numbers.length - 1;

        while(start <= end){

            int mid = (start + end) / 2;

            if(numbers[mid] == key){
                return mid; // key mil gayi
            }

            if(numbers[mid] < key){
                start = mid + 1; // right side jao
            } else {
                end = mid - 1; // left side jao
            }
        }
        return -1; // key nahi mili
    }

    public static void main(String args[]) {
        int numbers[] = {1, 2, 4, 5, 6};
        int key = 10;

        System.out.println("Key ka index: " + binarySearch(numbers, key));
    }
}
