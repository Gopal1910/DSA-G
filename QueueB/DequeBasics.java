import java.util.*;

/*
 * DEQUE (DOUBLE ENDED QUEUE)
 * -------------------------
 * Add/remove from both ends
 */

public class DequeBasics {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);

        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
    }
}
