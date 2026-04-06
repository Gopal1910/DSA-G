import java.util.*;

// Skip numbers that are multiples of 10
public class ContinueSkipTen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter Number: ");
            int n = sc.nextInt();

            if(n % 10 == 0){
                continue;   // skip printing
            }

            System.out.println("You Entered: " + n);

        }while(true);
    }
}
