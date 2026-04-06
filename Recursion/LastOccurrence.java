import java.util.*;

// Array me last occurrence find karna
public class LastOccurrence {

    public static int lastOcc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int found = lastOcc(arr, key, i + 1);
        if (found == -1 && arr[i] == key) {
            return i;
        }
        return found;
    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(lastOcc(arr, 5, 0));
    }
}
