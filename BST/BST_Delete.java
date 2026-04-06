public class BST_Delete {

// delete a node in bst

    class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    Node root;

//     // Insert
    Node insert(Node root, int value) {
        if (root == null) return new Node(value);

        if (value < root.data)
            root.left = insert(root.left, value);
        else if (value > root.data)
            root.right = insert(root.right, value);

        return root;
    }

//     // Find minimum (used in delete)
    Node minValue(Node root) {
        while (root.left != null)
            root = root.left;
        return root;
    }

//     // Delete node
    Node delete(Node root, int key) {

        if (root == null) return null;

        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);

        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            Node successor = minValue(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }

        return root;
    }

//     // Inorder traversal
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        BST_Delete bst = new BST_Delete();
        int[] values = {5, 1, 3, 4, 2, 7};

        for (int v : values)
            bst.root = bst.insert(bst.root, v);

        System.out.print("Inorder before delete: ");
        bst.inorder(bst.root);

        bst.root = bst.delete(bst.root, 3);

        System.out.print("\nInorder after delete 3: ");
        bst.inorder(bst.root);
    }
}
