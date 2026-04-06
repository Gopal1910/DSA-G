import java.util.*;

// Program to take full sentence input
public class InputFullLine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full sentence: ");
        String name = sc.nextLine();      // takes complete line with spaces

        System.out.println("You entered: " + name);
    }
}
