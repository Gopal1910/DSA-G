import java.util.*;

/*
 * QUEUE USING LINKED LIST
 * ----------------------
 * front = head
 * rear  = tail
 *
 * add & remove → O(1)
 */

public class QueueUsingLinkedList {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    static class Queue {
        static Node head = null, tail = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);

            if (tail == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if (isEmpty()) return -1;

            int front = head.data;
            head = head.next;

            if (head == null) tail = null;
            return front;
        }

        public static int peek() {
            if (isEmpty()) return -1;
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue.add(10);
        Queue.add(20);
        Queue.add(30);

        while (!Queue.isEmpty()) {
            System.out.println(Queue.remove());
        }
    }
}
