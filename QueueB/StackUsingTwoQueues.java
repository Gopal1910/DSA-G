import java.util.*;

/*
 * STACK USING TWO QUEUES
 * ---------------------
 * Stack follows LIFO (Last In First Out)
 *
 * We use two queues:
 * q1 -> main queue (always holds stack in correct order)
 * q2 -> helper queue
 *
 * PUSH OPERATION (Costly) : O(n)
 * 1. Add new element to q2
 * 2. Move all elements from q1 -> q2
 * 3. Swap q1 and q2
 *
 * POP OPERATION (Efficient) : O(1)
 * - Remove from front of q1
 *
 * PEEK OPERATION : O(1)
 */

public class StackUsingTwoQueues {

    static class Stack {

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // check if stack is empty
        public boolean isEmpty() {
            return q1.isEmpty();
        }

        // push element (O(n))
        public void push(int data) {

            // step 1: add element to q2
            q2.add(data);

            // step 2: move all elements from q1 to q2
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            // step 3: swap q1 and q2
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        // pop element (O(1))
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.remove();
        }

        // peek top element (O(1))
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.peek();
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
