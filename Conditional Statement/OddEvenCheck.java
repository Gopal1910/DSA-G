import java.util.*;

public class OddEvenCheck {
    public static void main(String[] args) {

        // Program to check Odd or Even
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
