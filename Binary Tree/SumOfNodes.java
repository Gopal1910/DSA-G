public class SumOfNodes {

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    // Sum of all nodes
    static int sum(Node root) {
        if (root == null) return 0;
        return sum(root.left) + sum(root.right) + root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        System.out.println(sum(root));
    }
}
