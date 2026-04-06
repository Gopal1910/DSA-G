public class RemoveFromLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head, tail;
    static int size;

    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Remove first node
    public static int removeFirst() {
        if (size == 0) return -1;

        int val = head.data;
        head = head.next;
        size--;

        if (size == 0) tail = null;
        return val;
    }

    // Remove last node
    public static int removeLast() {
        if (size == 0) return -1;
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        while (prev.next != tail) {
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        addLast(1);
        addLast(2);
        addLast(3);

        print();
        removeFirst();
        print();
        removeLast();
        print();
    }
}
