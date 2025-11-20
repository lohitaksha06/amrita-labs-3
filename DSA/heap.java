public class heap {

    // Linked binary tree node
    static class Node {
        int val;
        Node left;
        Node right;
        Node parent;

        Node(int v) {
            val = v;
        }
    }

    // Simple linked binary heap (min or max)
    static class HeapTree {
        Node root;
        int size;
        boolean isMin; // true => min-heap, false => max-heap

        HeapTree(boolean isMin) {
            this.isMin = isMin;
        }

        int peek() {
            if (root == null) return -1;
            return root.val;
        }

        void insert(int val) {
            Node n = new Node(val);
            size++;
            if (root == null) {
                root = n;
                return;
            }
            java.util.ArrayDeque<Node> q = new java.util.ArrayDeque<Node>();
            q.add(root);
            while (!q.isEmpty()) {
                Node cur = q.poll();
                if (cur.left == null) {
                    cur.left = n;
                    n.parent = cur;
                    break;
                } else {
                    q.add(cur.left);
                }
                if (cur.right == null) {
                    cur.right = n;
                    n.parent = cur;
                    break;
                } else {
                    q.add(cur.right);
                }
            }
            heapifyUp(n);
        }

        int deleteRoot() {
            if (root == null) return -1;
            int out = root.val;
            if (size == 1) {
                root = null;
                size = 0;
                return out;
            }
            // find last node by level-order
            Node last = null;
            java.util.ArrayDeque<Node> q = new java.util.ArrayDeque<Node>();
            q.add(root);
            while (!q.isEmpty()) {
                last = q.poll();
                if (last.left != null) q.add(last.left);
                if (last.right != null) q.add(last.right);
            }
            // move last value to root and unlink last
            root.val = last.val;
            Node p = last.parent;
            if (p.left == last) p.left = null; else p.right = null;
            size--;
            heapifyDown(root);
            return out;
        }

        void printLevelOrder() {
            if (root == null) {
                System.out.println("(empty)");
                return;
            }
            java.util.ArrayDeque<Node> q = new java.util.ArrayDeque<Node>();
            q.add(root);
            System.out.print("Heap: ");
            while (!q.isEmpty()) {
                Node cur = q.poll();
                System.out.print(cur.val + " ");
                if (cur.left != null) q.add(cur.left);
                if (cur.right != null) q.add(cur.right);
            }
            System.out.println();
        }

        void heapifyUp(Node n) {
            while (n.parent != null && better(n.val, n.parent.val)) {
                int t = n.val; n.val = n.parent.val; n.parent.val = t;
                n = n.parent;
            }
        }

        void heapifyDown(Node n) {
            while (n != null) {
                Node best = n;
                if (n.left != null && better(n.left.val, best.val)) best = n.left;
                if (n.right != null && better(n.right.val, best.val)) best = n.right;
                if (best == n) break;
                int t = n.val; n.val = best.val; best.val = t;
                n = best;
            }
        }

        boolean better(int a, int b) {
            if (isMin) return a < b;
            return a > b;
        }
    }

    static void heapSortAsc(int[] arr) {
        HeapTree h = new HeapTree(false); // max-heap
        for (int i = 0; i < arr.length; i++) h.insert(arr[i]);
        for (int i = arr.length - 1; i >= 0; i--) arr[i] = h.deleteRoot();
    }

    static void heapSortDesc(int[] arr) {
        HeapTree h = new HeapTree(true); // min-heap
        for (int i = 0; i < arr.length; i++) h.insert(arr[i]);
        for (int i = arr.length - 1; i >= 0; i--) arr[i] = h.deleteRoot(); // fills descending
    }

    public static void main(String[] args) {
        // Min-heap demo
        HeapTree minH = new HeapTree(true);
        minH.insert(5);
        minH.insert(3);
        minH.insert(8);
        minH.insert(1);
        minH.printLevelOrder();
        System.out.println("min peek: " + minH.peek());
        System.out.println("min deleteRoot: " + minH.deleteRoot());
        System.out.println("min deleteRoot: " + minH.deleteRoot());
        minH.printLevelOrder();

        // Max-heap demo
        HeapTree maxH = new HeapTree(false);
        maxH.insert(5);
        maxH.insert(3);
        maxH.insert(8);
        maxH.insert(1);
        maxH.printLevelOrder();
        System.out.println("max peek: " + maxH.peek());
        System.out.println("max deleteRoot: " + maxH.deleteRoot());
        System.out.println("max deleteRoot: " + maxH.deleteRoot());
        maxH.printLevelOrder();

        // Heap sort demos
        int[] arr1 = {5, 3, 8, 1, 4};
        heapSortAsc(arr1);
        System.out.print("heapSortAsc: ");
        for (int i = 0; i < arr1.length; i++) System.out.print(arr1[i] + " ");
        System.out.println();

        int[] arr2 = {5, 3, 8, 1, 4};
        heapSortDesc(arr2);
        System.out.print("heapSortDesc: ");
        for (int i = 0; i < arr2.length; i++) System.out.print(arr2[i] + " ");
        System.out.println();
    }
}
 
