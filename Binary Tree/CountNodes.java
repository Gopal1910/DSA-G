public class CountNodes {

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    // Count total nodes
    static int count(Node root) {
        if (root == null) return 0;
        return count(root.left) + count(root.right) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(count(root));
    }
}
