import java.util.*;

/*
 * STACK USING JAVA COLLECTION FRAMEWORK
 * -----------------------------------
 * - Uses java.util.Stack class
 * - Internally extends Vector
 * - Thread-safe but slower
 */

public class StackUsingCollections {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        // LIFO order
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
