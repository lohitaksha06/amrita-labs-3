import java.util.*;
//write and execute a java program to insert a new node after a given node(based on node value) in a ddl


class Node {
    int data;
    Node prev;
    Node next;

    Node(int d) {
        data = d;
        prev = null;
        next = null;
    }
}

public class question1 {
    static Node head = null;

    public static void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }
    public static void insertAfterValue(int targetValue, int newValue) {
        Node current = head;

       
        while (current != null && current.data != targetValue) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Value " + targetValue + " not found.");
            return;
        }

        Node newNode = new Node(newValue);
        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
    }

    public static void printList() {
        Node current = head;
        System.out.print("Doubly Linked List: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initial DLL
        insertAtEnd(11);
        insertAtEnd(12);
        insertAtEnd(14);
        insertAtEnd(15);

        printList();

        System.out.print("Enter the value after which to insert: ");
        int target = scanner.nextInt();

        System.out.print("Enter the new value to insert: ");
        int newValue = scanner.nextInt();

        insertAfterValue(target, newValue);

        printList();

        scanner.close();
    }
}
