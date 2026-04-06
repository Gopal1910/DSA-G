import java.util.*;

// String basics + input/output
public class StringBasics {
    public static void main(String args[]) {

        // String create karna
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");

        // Strings immutable hote hain (change nahi hote)

        Scanner sc = new Scanner(System.in);

        // nextLine poori line leta hai
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Your name is: " + name);
    }
}
