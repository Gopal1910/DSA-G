public class CircularLinkedList {

    // ================= NODE CLASS =================
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // ================= ADD FIRST =================
    // Insert node at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);

        // empty list
        if (head == null) {
            head = tail = newNode;
            newNode.next = head; // circular link
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head; // maintain circular link
    }

    // ================= ADD LAST =================
    // Insert node at end
    public void addLast(int data) {
        Node newNode = new Node(data);

        // empty list
        if (head == null) {
            head = tail = newNode;
            newNode.next = head; // circular link
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head; // circular link
    }

    // ================= REMOVE FIRST =================
    public void removeFirst() {

        if (head == null) {
            System.out.println("CLL is empty");
            return;
        }

        // single node
        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
        tail.next = head;
    }

    // ================= REMOVE LAST =================
    public void removeLast() {

        if (head == null) {
            System.out.println("CLL is empty");
            return;
        }

        // single node
        if (head == tail) {
            head = tail = null;
            return;
        }

        Node temp = head;

        // reach node before tail
        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = head;
        tail = temp;
    }

    // ================= PRINT =================
    public void print() {

        if (head == null) {
            System.out.println("CLL is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    // ================= MAIN =================
    public static void main(String[] args) {

        CircularLinkedList cll = new CircularLinkedList();

        cll.addFirst(3);
        cll.addFirst(2);
        cll.addFirst(1);

        System.out.println("After addFirst:");
        cll.print();

        cll.addLast(4);
        cll.addLast(5);

        System.out.println("After addLast:");
        cll.print();

        cll.removeFirst();
        System.out.println("After removeFirst:");
        cll.print();

        cll.removeLast();
        System.out.println("After removeLast:");
        cll.print();
    }
}
