import java.util.*;

/*
 * CIRCULAR QUEUE USING ARRAY
 * -------------------------
 * Solves wasted space problem of linear queue
 *
 * Formula:
 * rear = (rear + 1) % size
 * front = (front + 1) % size
 *
 * All operations → O(1)
 */

public class CircularQueueUsingArray {

    static class Queue {
        static int[] arr;
        static int size;
        static int front = -1, rear = -1;

        Queue(int n) {
            arr = new int[n];
            size = n;
        }

        public static boolean isEmpty() {
            return front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            if (front == -1) front = 0;
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) return -1;

            int result = arr[front];

            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        public static int peek() {
            if (isEmpty()) return -1;
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
