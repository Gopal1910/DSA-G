public class SearchInLinkedList {

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

    // Iterative Search - O(n)
    public static int itrSearch(int key) {
        Node temp = head;
        int idx = 0;

        while (temp != null) {
            if (temp.data == key) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    // Recursive helper
    public static int helper(Node node, int key) {
        if (node == null) return -1;
        if (node.data == key) return 0;

        int idx = helper(node.next, key);
        return (idx == -1) ? -1 : idx + 1;
    }

    public static int recSearch(int key) {
        return helper(head, key);
    }

    public static void main(String[] args) {
        addLast(10);
        addLast(20);
        addLast(30);

        System.out.println(itrSearch(20)); // 1
        System.out.println(recSearch(30)); // 2
    }
}
