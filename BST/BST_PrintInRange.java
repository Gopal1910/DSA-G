public class BST_PrintInRange {

// print in range 

    class Node {
        int data;
        Node left, right;

        Node(int v) {
            data = v;
        }
    }

    Node root;

//     // Insert
    Node insert(Node root, int val) {
        if (root == null) return new Node(val);

        if (val < root.data)
            root.left = insert(root.left, val);
        else if (val > root.data)
            root.right = insert(root.right, val);

        return root;
    }

//     // Print nodes in range [x, y]
    void printInRange(Node root, int x, int y) {
        if (root == null) return;

        if (root.data > x)
            printInRange(root.left, x, y);

        if (root.data >= x && root.data <= y)
            System.out.print(root.data + " ");

        if (root.data < y)
            printInRange(root.right, x, y);
    }

    public static void main(String[] args) {
        BST_PrintInRange bst = new BST_PrintInRange();

        int[] values = {8, 5, 10, 3, 6, 11, 1, 4, 14};
        for (int v : values)
            bst.root = bst.insert(bst.root, v);

        int x = 6, y = 10;

        System.out.print("Values in range [" + x + ", " + y + "]: ");
        bst.printInRange(bst.root, x, y);
    }
}
