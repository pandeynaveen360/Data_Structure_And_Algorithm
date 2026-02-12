package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {

    class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    // BFS Traversal (Level Order)
    void BFS(Node node) {

        if (node == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while (!q.isEmpty()) {
            Node current = q.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                q.add(current.left);
            }

            if (current.right != null) {
                q.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        BFSTraversal tree = new BFSTraversal();

        tree.root = tree.new Node(1);
        tree.root.left = tree.new Node(2);
        tree.root.right = tree.new Node(3);
        tree.root.left.left = tree.new Node(4);
        tree.root.left.right = tree.new Node(5);

        tree.BFS(tree.root);
    }
}
