
//write a function to delete the first node and last node of a linked list
import java.util.*;

public class linkedlist3 {
    // Node class definition
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Head of the linked list
    Node head;

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

    
    void deleteFirstAndLast() {
        if (head == null || head.next == null) {
            
            head = null;
            return;
        }

      
        head = head.next;

        
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedlist3 list = new linkedlist3();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        System.out.println("Original List:");
        list.printList();

        list.deleteFirstAndLast();

        System.out.println("After deleting first and last:");
        list.printList();
    }
}

