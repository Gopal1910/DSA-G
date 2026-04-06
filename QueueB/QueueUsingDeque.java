import java.util.*;

/*
 * QUEUE USING DEQUE
 * ----------------
 * enqueue → addLast
 * dequeue → removeFirst
 */

public class QueueUsingDeque {

    public static void main(String[] args) {

        Deque<Integer> q = new ArrayDeque<>();

        q.addLast(1);
        q.addLast(2);
        q.addLast(3);

        System.out.println(q.removeFirst());
        System.out.println(q.peekFirst());
    }
}
