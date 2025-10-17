//write a program to create a binary tree using linked represntation and also write a function to count
//a) total number of nodes
//b) number of leaf nodes (bottom nodes)
//c)number of internal nodes

public class binarytree1 {
    static class Node{
        int data;
        Node left;
        Node right;
    
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
} 
static int countTotal(Node root){
    if(root == null){
        return 0;
    }
    return 1 + countTotal(root.left) + countTotal(root.right);
}
static int leafNode(Node root){
    if(root == null)
        return 0;
    if(root.left == null && root.right == null) 
        return 1;
    return leafNode(root.left) + leafNode(root.right);
}

static int countInternalNodes(Node root) {
    if (root == null) return 0;
    if (root.left == null && root.right == null) return 0;
    return 1 + countInternalNodes(root.left) + countInternalNodes(root.right);
}

public static void main(String[] args) {
 
    
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    
    System.out.println("Total nodes: " + countTotal(root));
    System.out.println("Leaf nodes: " + leafNode(root));
    System.out.println("Internal nodes: " + countInternalNodes(root));
}
}
