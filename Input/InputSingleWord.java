import java.util.*;

// Program to take single word input
public class InputSingleWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single word: ");
        String input = sc.next();     // takes only one word

        System.out.println("You entered: " + input);
    }
}
