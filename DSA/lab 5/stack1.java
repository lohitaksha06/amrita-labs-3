//implement a stack (showing pop,push,isEmpty) using linked list add 5 elements in stack and 3 elements in linked list
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;

    public Stack() {
        top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }
        return top.data;
    }

    

    // this funcion imma use for showcasing the stack
    public void display() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class stack1 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(12);
        stack.push(16);
        stack.push(24);
        stack.push(27);
        System.out.print("stack values: ");
        stack.display();

        Node head = new Node(100);
        head.next = new Node(200);
        head.next.next = new Node(300);
        System.out.print("linked list values: ");


        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

        System.out.println("Top value: " + stack.peek()); 
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("is empty? " + stack.isEmpty());
        System.out.println("Pop: " + stack.pop());
        System.out.println("is empty? " + stack.isEmpty());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
    }
}
