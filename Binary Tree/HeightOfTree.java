public class HeightOfTree {

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    // Height = longest path from root
    static int height(Node root) {
        if (root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);

        System.out.println(height(root));
    }
}
