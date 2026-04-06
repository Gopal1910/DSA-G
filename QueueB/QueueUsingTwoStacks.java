import java.util.*;

/*
 * QUEUE USING TWO STACKS
 * ---------------------
 * enqueue → O(1)
 * dequeue → amortized O(1)
 */

public class QueueUsingTwoStacks {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void add(int data) {
        s1.push(data);
    }

    public static int remove() {
        if (isEmpty()) return -1;

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);

        while (!isEmpty()) {
            System.out.println(remove());
        }
    }
}
