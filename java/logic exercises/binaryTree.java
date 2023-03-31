class Node {
    int data;
    Node leftNode;
    Node righNode;

    Node(int data) {
        this.data = data;
        leftNode = null;
        righNode = null;

    }
}

public class binaryTree {

    public static void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.leftNode);
        System.out.print(node.data + " ");
        inorderTraversal(node.righNode);
    }

    static Node invertBianryTree(Node node) {
        if (node == null) {
            return node;
        }

        Node left = node.leftNode;
        Node right = node.righNode;

        node.righNode = left;
        node.leftNode = right;

        return node;
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        Node first = new Node(6);
        Node second = new Node(9);
        root.leftNode = first;
        root.righNode = second;

        inorderTraversal(root);
        invertBianryTree(root);
        System.out.println();
        inorderTraversal(root);

    }

}
