public class LinkedBinaryTree<E> {
    public interface Position<T> { T getElement(); }

    private static class Node<E> implements Position<E> {
        private E element;
        private Node<E> parent;
        private Node<E> left;
        private Node<E> right;

        Node(E e, Node<E> p, Node<E> l, Node<E> r) {
            element = e;
            parent = p;
            left = l;
            right = r;
        }

        public E getElement() { return element; }
    }

    private Node<E> root;
    private int size;

    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }
    public Position<E> root() { return root; }

    private Node<E> validate(Position<E> p) {
        if (p == null) throw new IllegalArgumentException("Position is null");
        if (!(p instanceof Node<?>)) throw new IllegalArgumentException("Not a valid position");
    Node<E> node = (Node<E>) p;
        return node;
    }

    public Position<E> addRoot(E e) {
        if (!isEmpty()) throw new IllegalStateException("Tree already has a root");
        root = new Node<>(e, null, null, null);
        size = 1;
        return root;
    }

    public Position<E> addLeft(Position<E> p, E e) {
        Node<E> node = validate(p);
        if (node.left != null) throw new IllegalArgumentException("Left child already exists");
        node.left = new Node<>(e, node, null, null);
        size++;
        return node.left;
    }

    public Position<E> addRight(Position<E> p, E e) {
        Node<E> node = validate(p);
        if (node.right != null) throw new IllegalArgumentException("Right child already exists");
        node.right = new Node<>(e, node, null, null);
        size++;
        return node.right;
    }

    public Position<E> parent(Position<E> p) { return validate(p).parent; }
    public Position<E> left(Position<E> p) { return validate(p).left; }
    public Position<E> right(Position<E> p) { return validate(p).right; }
}