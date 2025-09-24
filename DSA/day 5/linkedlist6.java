public class linkedlist6 {

    // Define Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list
    Node head;

    // Method to add node at the end
    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to print list
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to count nodes
    int countNodes() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Method to find index of a value
    int indexOf(int target) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1; // Not found
    }

    // Main to test functionality
    public static void main(String[] args) {
        linkedlist6 list = new linkedlist6();
        list.append(10);
        list.append(20);
        list.append(30);
        list.printList();

        System.out.println("Total nodes: " + list.countNodes());
        System.out.println("Index of 20: " + list.indexOf(20));
    }
}
