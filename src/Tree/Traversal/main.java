package Tree.Traversal;

public class main {
    public static void main(String[] args) {

        BinaryTreeTraversal tree = new BinaryTreeTraversal();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);

        System.out.print("\nPreorder Traversal: ");
        tree.postorder(tree.root);

        System.out.print("\nPostorder Traversal: ");
        tree.preorder(tree.root);
    }
}
