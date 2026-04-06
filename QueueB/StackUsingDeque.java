import java.util.*;

/*
 * STACK USING DEQUE
 * ----------------
 * Stack follows LIFO (Last In First Out)
 *
 * We use Deque because:
 * - Faster than Stack class
 * - Recommended by Java documentation
 *
 * Mapping:
 * push  -> addLast()
 * pop   -> removeLast()
 * peek  -> peekLast()
 *
 * Time Complexity:
 * push  -> O(1)
 * pop   -> O(1)
 * peek  -> O(1)
 */

public class StackUsingDeque {

    static class Stack {
        Deque<Integer> dq = new ArrayDeque<>();

        // check if stack is empty
        public boolean isEmpty() {
            return dq.isEmpty();
        }

        // push element onto stack
        public void push(int data) {
            dq.addLast(data);
        }

        // pop element from stack
        public int pop() {
            if (dq.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return dq.removeLast();
        }

        // peek top element
        public int peek() {
            if (dq.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return dq.peekLast();
        }
    }

    // ================= MAIN =================
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
