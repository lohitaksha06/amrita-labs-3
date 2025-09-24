public class queue {
    static class Queue {
        private final int[] a;
        private int f = 0, r = -1, n = 0;

        Queue(int cap) { a = new int[cap]; }

        boolean isEmpty() { return n == 0; }
        boolean isFull()  { return n == a.length; }

        void enqueue(int x) {
            if (isFull()) return;
            r = (r + 1) % a.length;
            a[r] = x;
            n++;
        }

        int dequeue() {
            if (isEmpty()) return -1;
            int x = a[f];
            f = (f + 1) % a.length;
            n--;
            return x;
        }

        int peek() { return isEmpty() ? -1 : a[f]; }

    void addRear(int x) { enqueue(x); }

        void print() {
            for (int i = 0; i < n; i++) {
                int idx = (f + i) % a.length;
                System.out.print(a[idx] + (i < n - 1 ? " " : ""));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
    System.out.println(q.isFull());
    q.enqueue(40);
    q.enqueue(50);
    System.out.println(q.isFull());
    q.print();
    System.out.println(q.dequeue());
    System.out.println(q.peek());
    q.print();
    q.addRear(60);
    q.print();
    }
}