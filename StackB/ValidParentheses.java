import java.util.*;

/*
 * VALID PARENTHESES
 * ----------------
 * Given a string containing (), {}, []
 * Check whether brackets are balanced & properly nested
 *
 * Logic:
 * - Opening bracket → push into stack
 * - Closing bracket → pop & match
 * - End me stack empty hona chahiye
 *
 * Time: O(n)
 * Space: O(n)
 */

public class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // closing brackets
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // stack empty → valid
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s1 = "()[]{}";
        String s2 = "(]";
        String s3 = "([)]";
        String s4 = "{[]}";

        System.out.println(s1 + " -> " + isValid(s1));
        System.out.println(s2 + " -> " + isValid(s2));
        System.out.println(s3 + " -> " + isValid(s3));
        System.out.println(s4 + " -> " + isValid(s4));
    }
}
