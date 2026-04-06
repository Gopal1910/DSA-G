import java.util.*;

/*
 * PUSH ELEMENT AT BOTTOM OF STACK
 * -------------------------------
 * - Recursion ka use
 * - Stack ke saare elements temporarily pop
 * - Bottom me new element push
 */

public class PushAtBottomOfStack {

    public static void pushAtBottom(Stack<Integer> s, int data) {

        // base case: stack empty
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        // pop top
        int top = s.pop();

        // recursive call
        pushAtBottom(s, data);

        // push back top
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
