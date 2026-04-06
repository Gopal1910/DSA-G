import java.util.*;

// Array ko reverse karna
public class ReverseArray {

    public static void reverse(int numbers[]) {

        int first = 0;
        int last = numbers.length - 1;

        while(first < last){

            // swap logic
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};

        reverse(numbers);

        // reversed array print
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
