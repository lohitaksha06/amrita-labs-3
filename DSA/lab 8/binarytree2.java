//count number of trees then total number of nodes

public class binarytree2 {
    
    static class Node {
        int data;
        Node left, right;
        
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    
    static int countTrees(Node root) {
        if (root == null) return 0;
        int leftTrees = countTrees(root.left);
        int rightTrees = countTrees(root.right);
        return 1 + leftTrees + rightTrees;
    }
    
    static int countNodes(Node root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        System.out.println("Number of trees: " + countTrees(root));
        System.out.println("Total nodes: " + countNodes(root));
    }
}
