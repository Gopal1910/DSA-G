import java.util.*;

/*
 * INTERLEAVE TWO HALVES OF QUEUE
 * -----------------------------
 * Input: 1 2 3 4 5 6
 * Output:1 4 2 5 3 6
 */

public class InterleaveQueue {

    public static void interLeave(Queue<Integer> q) {

        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();

        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }

        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 10; i++) q.add(i);

        interLeave(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
