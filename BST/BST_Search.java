import java.util.*;

public class BST_Search {

// serching in bst  - o(h)

    class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    Node root;

//     // Insert into BST
    Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

//     // Search in BST
    boolean search(Node root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

//     // Inorder traversal (sorted)
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BST_Search bst = new BST_Search();

        int[] values = {5, 1, 3, 4, 2, 7};

        for (int v : values) {
            bst.root = bst.insert(bst.root, v);
        }

        System.out.print("Inorder: ");
        bst.inorder(bst.root);

        int key1 = 4;
        int key2 = 10;

        System.out.println("\nSearch " + key1 + ": " + bst.search(bst.root, key1));
        System.out.println("Search " + key2 + ": " + bst.search(bst.root, key2));
    }
}
