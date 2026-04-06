public class SubtreeCheck {

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    // Check identical trees
    static boolean isIdentical(Node a, Node b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        if (a.data != b.data) return false;
        return isIdentical(a.left, b.left) && isIdentical(a.right, b.right);
    }

    // Check subtree
    static boolean isSubtree(Node root, Node subRoot) {
        if (subRoot == null) return true;
        if (root == null) return false;

        if (isIdentical(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubtree(root, subRoot));
    }
}
