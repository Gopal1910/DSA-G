public class BuildTree {

    // Node structure
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    static int idx = -1;

    // Build tree using preorder
    static Node buildTree(int[] nodes) {
        idx++;
        if (nodes[idx] == -1) return null;

        Node root = new Node(nodes[idx]);
        root.left = buildTree(nodes);
        root.right = buildTree(nodes);
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = buildTree(preorder);
        System.out.println(root.data); // root data
    }
}
