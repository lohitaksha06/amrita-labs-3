import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class binarytree5 {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }

    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static int sumAtLevel(Node root, int level) {
        if (root == null) return 0;
        Deque<Node> nodes = new ArrayDeque<>();
        Deque<Integer> levels = new ArrayDeque<>();
        nodes.add(root);
        levels.add(0);
        int sum = 0;
        while (!nodes.isEmpty()) {
            Node node = nodes.poll();
            int currentLevel = levels.poll();
            if (currentLevel == level) sum += node.data;
            if (node.left != null) {
                nodes.add(node.left);
                levels.add(currentLevel + 1);
            }
            if (node.right != null) {
                nodes.add(node.right);
                levels.add(currentLevel + 1);
            }
        }
        return sum;
    }

    static List<Integer> ancestorsOf(Node root, int target) {
        List<Integer> result = new ArrayList<>();
        findAncestors(root, target, result);
        return result;
    }

    static boolean findAncestors(Node root, int target, List<Integer> result) {
        if (root == null) return false;
        if (root.data == target) return true;
        if (findAncestors(root.left, target, result) || findAncestors(root.right, target, result)) {
            result.add(root.data);
            return true;
        }
        return false;
    }

    static List<Integer> nodesAtDistance(Node root, int distance) {
        List<Integer> result = new ArrayList<>();
        collectAtDistance(root, distance, result);
        return result;
    }

    static void collectAtDistance(Node root, int distance, List<Integer> result) {
        if (root == null) return;
        if (distance == 0) {
            result.add(root.data);
            return;
        }
        collectAtDistance(root.left, distance - 1, result);
        collectAtDistance(root.right, distance - 1, result);
    }

    static List<Integer> levelOrder(Node root) {
        List<Integer> order = new ArrayList<>();
        if (root == null) return order;
        Deque<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            order.add(node.data);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return order;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(6);
        root.right = new Node(14);
        root.left.left = new Node(4);
        root.left.right = new Node(8);
        root.right.left = new Node(12);
        root.right.right = new Node(16);
        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();
        int level = 2;
        System.out.println("Sum at level " + level + ": " + sumAtLevel(root, level));
        int target = 12;
        List<Integer> ancestors = ancestorsOf(root, target);
        System.out.println("Ancestors of " + target + ": " + ancestors);
        List<Integer> distanceNodes = nodesAtDistance(root, level);
        System.out.println("Nodes at distance " + level + ": " + distanceNodes);
        List<Integer> bfs = levelOrder(root);
        System.out.println("Level order: " + bfs);
    }
}
