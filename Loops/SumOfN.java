import java.util.*;

// Calculate sum of first n natural numbers
public class SumOfN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while(i <= n){
            sum += i;
            i++;
        }

        System.out.println("Sum is : " + sum);
    }
}
