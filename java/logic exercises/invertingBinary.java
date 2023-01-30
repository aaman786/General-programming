// A node contains the value, left and right pointers
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class invertingBinary {
    Node root;

    void invert() {
        root = invert(root);
    }

    Node invert(Node node) {
        if (node == null)
            return node;

        /* recursive calls */
        Node left = invert(node.left);
        Node right = invert(node.right);

        /* swap the left and right pointers */
        node.left = right;
        node.right = left;

        return node;
    }

    void print_tree() {
        printTree(root);
    }

    // print InOrder binary tree traversal.
    void printTree(Node node) {
        if (node == null)
            return;

        printTree(node.left);
        System.out.print(node.data + " ");

        printTree(node.right);
    }

    /* testing for example nodes */
    public static void main(String args[]) {
        /* creating a binary tree and entering the nodes */
        invertingBinary tree = new invertingBinary();
        tree.root = new Node(2);
        tree.root.left = new Node(1);
        tree.root.right = new Node(4);
        tree.root.right.left = new Node(3);
        tree.root.right.right = new Node(5);

        /* print inorder traversal of the input tree */
        System.out.println("Inorder traversal of input tree is :");
        tree.print_tree();
        System.out.println("");

        /* invert tree */
        tree.invert();

        /* print inorder traversal of the minor tree */
        System.out.println("Inorder traversal of binary tree is : ");
        tree.print_tree();

    }
}
