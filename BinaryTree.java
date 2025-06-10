package chitra;
class Node {
    String name;
    Node left, right;

    Node(String name) {
        this.name = name;
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        // Build tree
        Node root = new Node("mom");
        root.left = new Node("dad");
        root.right = new Node("you");

        // Print root
        System.out.println("Root: " + root.name);

        // Print children of root
        System.out.println("Left child of " + root.name + ": " + root.left.name);
        System.out.println("Right child of " + root.name + ": " + root.right.name);

        // Top to bottom (preorder)
        System.out.print("Top to bottom: ");
        preorder(root);
        System.out.println();

        // Total nodes
        System.out.println("Total nodes: " + countNodes(root));

        // Leaf nodes
        System.out.println("Leaf nodes: " + countLeaves(root));

        // Inorder (left to right)
        System.out.print("Left to right: ");
        inorder(root);
        System.out.println();

        // Mirror the tree
        mirror(root);
        System.out.print("After mirror (left to right): ");
        inorder(root);
        System.out.println();

        // Print all paths
        System.out.println("Paths from top to leaves:");
        printPaths(root, "");
    }

    static void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.name + " ");
        preorder(node.left);
        preorder(node.right);
    }

    static void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.name + " ");
        inorder(node.right);
    }

    static int countNodes(Node node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    static int countLeaves(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeaves(node.left) + countLeaves(node.right);
    }

    static void mirror(Node node) {
        if (node == null) return;
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
        mirror(node.left);
        mirror(node.right);
    }

    static void printPaths(Node node, String path) {
        if (node == null) return;
        path += node.name + " ";
        if (node.left == null && node.right == null)
            System.out.println(path.trim());
        printPaths(node.left, path);
        printPaths(node.right, path);
    }
}