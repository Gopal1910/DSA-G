public class PreorderTraversal {

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    static int idx = -1;

    // Build tree
    static Node buildTree(int[] nodes) {
        idx++;
        if (nodes[idx] == -1) return null;

        Node root = new Node(nodes[idx]);
        root.left = buildTree(nodes);
        root.right = buildTree(nodes);
        return root;
    }

    // Root -> Left -> Right
    static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = buildTree(arr);
        preorder(root);
    }
}
