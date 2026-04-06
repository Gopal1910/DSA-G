import java.util.*;

public class LevelOrderTraversal {

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    static int idx = -1;

    static Node buildTree(int[] nodes) {
        idx++;
        if (nodes[idx] == -1) return null;

        Node root = new Node(nodes[idx]);
        root.left = buildTree(nodes);
        root.right = buildTree(nodes);
        return root;
    }

    // BFS using queue
    static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.data + " ");
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = buildTree(arr);
        levelOrder(root);
    }
}
