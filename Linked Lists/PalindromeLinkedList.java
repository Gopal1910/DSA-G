public class PalindromeLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head;

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    public static boolean isPalindrome() {
        if (head == null || head.next == null) return true;

        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse second half
        Node prev = null;
        while (slow != null) {
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        Node left = head;
        Node right = prev;

        while (right != null) {
            if (left.data != right.data) return false;
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {
        addLast(1);
        addLast(2);
        addLast(2);
        addLast(1);

        System.out.println(isPalindrome()); // true
    }
}
