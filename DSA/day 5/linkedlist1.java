// write a java program to create a singly linked list and display all its elements

public class linkedlist1 {
    
    static class Node {
        int data;
        Node next;
        
        Node(int d) {
            data = d;
            next = null;
        }
    }
    
    public static void main(String args[]) {
        Node first = new Node(12);
        Node second = new Node(23);
        Node third = new Node(24);
        Node fourth = new Node(45);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        Node current = first;
        if(current == null){
            System.out.println("your list is empty");
        }
        else {
            while(current != null){
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
}

    
    

