//circular linkedlist and insert and delete at start and end and traverse it

public class circumlinkedlist {

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircumLinkedList {
    private Node head = null;
    private Node tail = null;

    public void insertAtStart(int data) {
        Node newNode = new Node(data);

        if (head == null) { 
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; 
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) { 
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    
    public void deleteAtStart() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head == tail) { 
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head == tail) { 
            head = null;
            tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) { 
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
        }
    }
    public void traverse(){
        if(head == tail){
            

        }
    }

    
    }


    public static void main(String[] args) {
        CircumLinkedList cll = new CircumLinkedList();

        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtStart(5);
        cll.insertAtEnd(30);

        cll.traverse(); // 5 10 20 30

        cll.deleteAtStart();
        cll.traverse(); // 10 20 30

        cll.deleteAtEnd();
        cll.traverse(); // 10 20
    }
}

    
}
