/*
 * STACK IMPLEMENTATION USING LINKED LIST
 * -------------------------------------
 * - Head of linked list = TOP of stack
 * - push = insert at head
 * - pop = remove from head
 * - No overflow issue (memory based)
 */

public class StackUsingLinkedList {

    static class Stack {

        // Node structure
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        static Node head = null;

        // check empty
        public static boolean isEmpty() {
            return head == null;
        }

        // push element
        public static void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // pop element
        public static int pop() {
            if (isEmpty()) return -1;
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek element
        public static int peek() {
            if (isEmpty()) return -1;
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);

        while (!Stack.isEmpty()) {
            System.out.println(Stack.pop());
        }
    }
}
