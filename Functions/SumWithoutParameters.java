import java.util.*;

// Function that takes input inside and prints sum
public class SumWithoutParameters {

    public static void calculateSum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        int sum = a + b;   // adding numbers
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        calculateSum();
    }
}
