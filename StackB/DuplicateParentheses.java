import java.util.*;

/*
 * DUPLICATE PARENTHESES
 * --------------------
 * Check whether expression contains unnecessary brackets
 *
 * Example:
 * ((a+b)) → true
 * (a+(b)/c) → false
 *
 * Logic:
 * - Closing ')' par check:
 *   if top is '(' → duplicate found
 * - Otherwise pop till '('
 *
 * Time: O(n)
 * Space: O(n)
 */

public class DuplicateParentheses {

    public static boolean hasDuplicate(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing bracket
            if (ch == ')') {

                // duplicate case
                if (stack.peek() == '(') {
                    return true;
                }

                // pop until opening bracket
                while (stack.peek() != '(') {
                    stack.pop();
                }
                stack.pop(); // remove '('
            }
            // opening bracket or operand
            else {
                stack.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String s1 = "((a+b))";
        String s2 = "(a+(b)/c)";
        String s3 = "(a+b)+(c+d)";
        String s4 = "(((a+b)+c))";

        System.out.println(s1 + " -> " + hasDuplicate(s1));
        System.out.println(s2 + " -> " + hasDuplicate(s2));
        System.out.println(s3 + " -> " + hasDuplicate(s3));
        System.out.println(s4 + " -> " + hasDuplicate(s4));
    }
}
