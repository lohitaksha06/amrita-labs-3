//2 write and execute a java program to insert a new node before a given node in a DLL (doubly linked list)
//3write and execute a java program to sort a dll in ascending order using bubble sort
//4 write a execute a java program to delete all nodes with a given value in a dll
import java.util.Scanner;

public class question2 {

    // Node class for DLL
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
            prev = null;
            next = null;
        }
    }

    // Head of the DLL
    Node head = null;

    // Method to insert at end
    void insertAtEnd(int value) {
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

    // Method to insert before a given value
    void insertBefore(int target, int newValue) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;

        // If inserting before head
        if (current.data == target) {
            Node newNode = new Node(newValue);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }

        // Traverse to find the target
        while (current != null && current.data != target) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Target value not found.");
            return;
        }

        Node newNode = new Node(newValue);
        Node prevNode = current.prev;

        
        newNode.prev = prevNode;
        newNode.next = current;
        prevNode.next = newNode;
        current.prev = newNode;
    }

    
    void printList() {
        Node current = head;
        System.out.print("DLL: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    
    public static void main(String[] args) {
        question2 dll = new question2();

        // Predefined list
        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);

        System.out.println("Original List:");
        dll.printList();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value to insert before: ");
        int target = sc.nextInt();
        System.out.print("Enter new value to insert: ");
        int newVal = sc.nextInt();

        dll.insertBefore(target, newVal);

        System.out.println("After Insertion:");
        dll.printList();
    }
}
