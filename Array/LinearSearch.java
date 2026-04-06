import java.util.*;

// Linear Search = ek ek element check karna
public class LinearSearch {

    // Ye function key ka index return karega
    public static int linearSearch(int numbers[], int key) {

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == key){
                return i; // key mil gayi
            }
        }
        return -1; // key nahi mili
    }

    public static void main(String args[]) {
        int numbers[] = {1, 4, 5, 6, 10, 12, 14, 16};
        int key = 4;

        int index = linearSearch(numbers, key);

        if(index == -1){
            System.out.println("NOT FOUND");
        } else {
            System.out.println("Key index par hai: " + index);
        }
    }
}
