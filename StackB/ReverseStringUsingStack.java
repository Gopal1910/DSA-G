import java.util.*;

/*
 * REVERSE STRING USING STACK
 * -------------------------
 * - Push all characters
 * - Pop one by one -> reverse order
 */

public class ReverseStringUsingStack {

    public static String reverseString(String str) {

        Stack<Character> s = new Stack<>();

        // push characters
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        // pop characters
        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            result.append(s.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Gopal"));
    }
}
