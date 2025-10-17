public class binarypractice{
    class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }

    }
    static int countTotal(Node root){
        if(root == null)
        return 0;
        return 1 + countTotal(root.left) + countTotal(root.right);
        

    }
    static int countLeaf(Node root){
        if(root == null)
        return 0;
        if(root.left == null && root.right == null)
        return 1;
        return countLeaf(root.right) + countLeaf(root.left);

        
    }
    static void inorder(Node root){
        if(root == null)
        return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
        
    }
   static Node insert(Node root, int key) {
        if (root == null)
            return new Node(key);
        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);
        return root;
    }




}