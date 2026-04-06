import java.util.*;

// Program to calculate sum of 2 numbers
public class SumTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
