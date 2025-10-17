public class binarytree4 {
    
    // Node class (linked representation)
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Function to count total nodes
    static int countTotal(Node root) {
        if (root == null)
            return 0;
        return 1 + countTotal(root.left) + countTotal(root.right);
    }

    // Function to count leaf (bottom) nodes
    static int countLeaf(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        return countLeaf(root.left) + countLeaf(root.right);
    }

    // Function to count internal nodes
    static int countInternal(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 0; // leaf node → not internal
        return 1 + countInternal(root.left) + countInternal(root.right);
    }

    // Function for inorder traversal
    static void inorder(Node root) {
        if (root == null)
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

    static Node delete(Node root, int key) {
        if (root == null)
            return null;
        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;
            int minValue = smallest(root.right);
            root.data = minValue;
            root.right = delete(root.right, minValue);
        }
        return root;
    }

    static int smallest(Node node) {
        Node current = node;
        while (current.left != null)
            current = current.left;
        return current.data;
    }

    static int sum(Node root) {
        if (root == null)
            return 0;
        return root.data + sum(root.left) + sum(root.right);
    }

    // Question: search for a given value in the binary tree
    static boolean contains(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        if (contains(root.left, key))
            return true;
        return contains(root.right, key);
    }

    // Question: find the height of the binary tree
    static int height(Node root) {
        if (root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    // Question: mirror the binary tree (swap left and right children)
    static void mirror(Node root) {
        if (root == null)
            return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }

    // Question: print ancestors of a given node value
    static void printAncestors(Node root, int key) {
        if (root == null) {
            System.out.println("Ancestors of " + key + ": value not found");
            return;
        }
        if (root.data == key) {
            System.out.println("Ancestors of " + key + ": none (value is at root)");
            return;
        }
        System.out.print("Ancestors of " + key + ": ");
        if (!printAncestorsHelper(root, key)) {
            System.out.println("value not found");
            return;
        }
        System.out.println();
    }

    static boolean printAncestorsHelper(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        if (printAncestorsHelper(root.left, key) || printAncestorsHelper(root.right, key)) {
            System.out.print(root.data + " ");
            return true;
        }
        return false;
    }

    // Question: sum all nodes at a given level (root is level 0)
    static int sumAtLevel(Node root, int level) {
        if (root == null)
            return 0;
        if (level == 0)
            return root.data;
        return sumAtLevel(root.left, level - 1) + sumAtLevel(root.right, level - 1);
    }

    public static void main(String[] args) {
        // Creating a binary tree manually
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        // Traversal
        System.out.print("Inorder traversal: ");
        inorder(root);
        System.out.println();

        // Counting nodes
        System.out.println("Total number of nodes: " + countTotal(root));
        System.out.println("Number of leaf nodes: " + countLeaf(root));
        System.out.println("Number of internal nodes: " + countInternal(root));
        System.out.println("Sum of all nodes: " + sum(root));

        int key = 5;
        System.out.println("Contains " + key + ": " + contains(root, key));
        System.out.println("Height of tree: " + height(root));

        root = insert(root, 7);
        root = insert(root, 0);
        System.out.print("Inorder after insertions: ");
        inorder(root);
        System.out.println();

        root = delete(root, 2);
        System.out.print("Inorder after deleting 2: ");
        inorder(root);
        System.out.println();

        printAncestors(root, 5);
        int level = 2;
        System.out.println("Sum at level " + level + ": " + sumAtLevel(root, level));

        mirror(root);
        System.out.print("Inorder after mirroring: ");
        inorder(root);
        System.out.println();
    }
}
```
