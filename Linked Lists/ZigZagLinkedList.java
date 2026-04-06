public class ZigZagLinkedList {

    // ================= NODE CLASS =================
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    // ================= ADD LAST =================
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // ================= PRINT =================
    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // ================= ZIG ZAG =================
    // Steps:
    // 1. Find mid
    // 2. Reverse second half
    // 3. Alternate merge
    public void zigZag() {

        // base case
        if (head == null || head.next == null) {
            return;
        }

        // Step 1: find mid
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // Step 2: reverse second half
        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: zig-zag merge
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;

            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    // ================= MAIN =================
    public static void main(String[] args) {

        ZigZagLinkedList ll = new ZigZagLinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        System.out.println("Before ZigZag:");
        ll.print();

        ll.zigZag();

        System.out.println("After ZigZag:");
        ll.print();
    }
}
