// write a function to insert a node at the beginning and end of a single linked list by taking input
import java.util.*;
public class linkedlist2 {
    
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
        
    }
    
    // inserts function at beginning
    public static Node insertAtStart(Node head, int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        return newNode;  
    }
    // inserts function at the end
    public static void insertAtEnd(Node head, int value) {
        Node newNode = new Node(value);
        
        if(head == null) {
            head = newNode;
            return;
        }
        
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter your first number");
    int b = scanner.nextInt();
    System.out.println("enter your second number");
    int c = scanner.nextInt();
    Node first = new Node(11);
    Node second = new Node(12);
    Node third = new Node(14);
    Node fourth = new Node(15);
    

    first.next = second;
    second.next = third;
    third.next = fourth;
    // inserting b at the beginning
    first = insertAtStart(first, b);
    
    // inserting c at the end
    insertAtEnd(first, c);
    
    
    Node current = first;
    if(current == null) {
        System.out.println("list is empty");
    } else {
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        
    }



}
    
}
