public class DiameterOfTree {

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    static class Info {
        int height, diameter;
        Info(int h, int d) {
            height = h;
            diameter = d;
        }
    }

    // Optimized diameter
    static Info diameter(Node root) {
        if (root == null) return new Info(0,0);

        Info left = diameter(root.left);
        Info right = diameter(root.right);

        int height = Math.max(left.height, right.height) + 1;
        int dia = Math.max(left.height + right.height + 1,
                  Math.max(left.diameter, right.diameter));

        return new Info(height, dia);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        System.out.println(diameter(root).diameter);
    }
}
