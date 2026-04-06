import java.util.*;

public class BST_RootToLeaf {

// Root to leaf paths

    class Node {
        int data;
        Node left, right;

        Node(int v) {
            data = v;
        }
    }

    Node root;

//     // Insert into BST
    Node insert(Node root, int val) {
        if (root == null) return new Node(val);

        if (val < root.data)
            root.left = insert(root.left, val);
        else if (val > root.data)
            root.right = insert(root.right, val);

        return root;
    }

//     // Print all root-to-leaf paths
    void printPaths(Node root, List<Integer> path) {
        if (root == null) return;

        path.add(root.data);

        if (root.left == null && root.right == null) {
            System.out.println(path);
        } else {
            printPaths(root.left, path);
            printPaths(root.right, path);
        }

        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        BST_RootToLeaf bst = new BST_RootToLeaf();

        int[] values = {8, 5, 10, 3, 6, 11, 14};
        for (int v : values)
            bst.root = bst.insert(bst.root, v);

        System.out.println("Root to Leaf Paths:");
        bst.printPaths(bst.root, new ArrayList<>());
    }
}
