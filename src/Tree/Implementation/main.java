package Tree.Implementation;

public class main {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);




        System.out.println("Binary Tree Created Successfully");
    }
}
