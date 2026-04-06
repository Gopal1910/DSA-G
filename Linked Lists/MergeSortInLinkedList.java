public class MergeSortInLinkedList {

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

    // ================= MERGE SORT =================
    // Time: O(n log n), Space: O(log n)
    public Node mergeSort(Node head) {

        // base case
        if (head == null || head.next == null) {
            return head;
        }

        // find middle
        Node mid = getMid(head);

        // split list
        Node rightHead = mid.next;
        mid.next = null;

        // recursive sort
        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);

        // merge sorted lists
        return merge(left, right);
    }

    // ================= FIND MID =================
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // ================= MERGE TWO SORTED LL =================
    private Node merge(Node head1, Node head2) {

        Node dummy = new Node(-1);
        Node temp = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // attach remaining nodes
        if (head1 != null) {
            temp.next = head1;
        } else {
            temp.next = head2;
        }

        return dummy.next;
    }

    // ================= MAIN =================
    public static void main(String[] args) {

        MergeSortInLinkedList ll = new MergeSortInLinkedList();

        ll.addLast(4);
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(3);

        System.out.println("Before Sorting:");
        ll.print();

        ll.head = ll.mergeSort(ll.head);

        System.out.println("After Sorting:");
        ll.print();
    }
}
