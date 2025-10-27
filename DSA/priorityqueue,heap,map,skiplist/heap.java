public class heap {
    // Min-heap behavior using a sorted singly linked list (ascending)
    static class Node {
        int val;
        Node next;

        Node(int v) {
            this.val = v;
        }
    }

    static class MinHeapLL {
        Node head;
        int size;

        // Insert value in sorted order (smallest at head)
        void push(int val) {
            Node n = new Node(val);

            if (head == null || val < head.val) {
                n.next = head;
                head = n;
                size++;
                return;
            }

            Node cur = head;
            while (cur.next != null && cur.next.val <= val) {
                cur = cur.next;
            }
            n.next = cur.next;
            cur.next = n;
            size++;
        }

        int peek() {
            return head == null ? Integer.MIN_VALUE : head.val;
        }

        int pop() {
            if (head == null) return Integer.MIN_VALUE;
            int v = head.val;
            head = head.next;
            size--;
            return v;
        }

        int size() {
            return size;
        }

        void printAll() {
            System.out.print("HeapLL: ");
            for (Node c = head; c != null; c = c.next) {
                System.out.print(c.val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MinHeapLL h = new MinHeapLL();

        h.push(5);
        h.push(3);
        h.push(8);
        h.push(1);

        h.printAll();
        System.out.println("peek: " + h.peek());
        System.out.println("pop: " + h.pop());
        System.out.println("pop: " + h.pop());
        h.printAll();
    }
}
