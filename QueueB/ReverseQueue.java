import java.util.*;

/*
 * REVERSE A QUEUE
 * --------------
 * Queue → Stack → Queue
 */

public class ReverseQueue {

    public static void reverseQueue(Queue<Integer> q) {

        Stack<Integer> s = new Stack<>();

        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);

        reverseQueue(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
