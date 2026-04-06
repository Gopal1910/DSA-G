import java.util.*;

// Print Pattern:
// 1
// 1 2
// 1 2 3
// 1 2 3 4
public class NumberHalfPyramid {
    public static void main(String[] args) {

        int n = 4;

        for(int i = 1; i <= n; i++){

            // 1 se i tak print karo
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
