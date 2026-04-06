public class DoublyLinkedList {

    // ================= NODE CLASS =================
    // Each node has:
    // 1. data
    // 2. prev -> pointer to previous node
    // 3. next -> pointer to next node
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    // ================= ADD FIRST =================
    // Insert node at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);

        // empty list
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // ================= ADD LAST =================
    // Insert node at end
    public void addLast(int data) {
        Node newNode = new Node(data);

        // empty list
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // ================= REMOVE FIRST =================
    public void removeFirst() {

        if (head == null) {
            System.out.println("DLL is empty");
            return;
        }

        // single node
        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // ================= REMOVE LAST =================
    public void removeLast() {

        if (head == null) {
            System.out.println("DLL is empty");
            return;
        }

        // single node
        if (head == tail) {
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    // ================= PRINT FORWARD =================
    public void printForward() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // ================= PRINT BACKWARD =================
    public void printBackward() {
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("null");
    }

    // ================= REVERSE DLL =================
    // Time: O(n), Space: O(1)
    public void reverse() {

        // empty or single node
        if (head == null || head.next == null) {
            return;
        }

        Node curr = head;
        Node temp = null;

        while (curr != null) {
            // swap prev and next
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            // move to next node (old next)
            curr = curr.prev;
        }

        // update head
        if (temp != null) {
            head = temp.prev;
        }
    }

    // ================= MAIN =================
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        System.out.println("Original DLL:");
        dll.printForward();

        dll.reverse();

        System.out.println("Reversed DLL:");
        dll.printForward();
    }
}
