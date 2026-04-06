public class DetectAndRemoveCycle {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    // -------------------------------
    // Detect cycle in Linked List
    // Time: O(n), Space: O(1)
    // -------------------------------
    public static boolean detectCycle() {

        if (head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        // slow moves 1 step, fast moves 2 steps
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // cycle found
            if (slow == fast) {
                return true;
            }
        }

        // no cycle
        return false;
    }

    // --------------------------------
    // Remove cycle from Linked List
    // --------------------------------
    public static void removeCycle() {

        if (head == null || head.next == null) {
            return;
        }

        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        // Step 1: detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        // no cycle found
        if (!cycle) {
            return;
        }

        // Step 2: find starting point of cycle
        slow = head;
        Node prev = null; // previous node of fast

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: remove cycle
        prev.next = null;
    }

    // Print Linked List
    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // -------------------------------
    // Main function (Testing)
    // -------------------------------
    public static void main(String[] args) {

        // create nodes
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // create cycle (5 -> 3)
        head.next.next.next.next.next = head.next.next;

        System.out.println("Cycle present? " + detectCycle());

        removeCycle();

        System.out.println("Cycle present after removal? " + detectCycle());

        print(); // 1 -> 2 -> 3 -> 4 -> 5 -> null
    }
}
