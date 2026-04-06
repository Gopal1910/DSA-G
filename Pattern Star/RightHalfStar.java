import java.util.*;

// Print pattern:
// *
// * *
// * * *
// * * * *
public class RightHalfStar {
    public static void main(String[] args) {

        int n = 4; // number of rows

        for(int i = 1; i <= n; i++){

            // inner loop stars print karega
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();   // next line
        }
    }
}
