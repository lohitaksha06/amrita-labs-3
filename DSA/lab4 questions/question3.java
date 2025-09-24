
//3write and execute a java program to sort a dll in ascending order using bubble sort
public class question3 {

    // Node class for DLL
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Head of the DLL
    Node head = null;

    // Insert at the end
    void insertAtEnd(int data) {
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
        newNode.prev = current;
    }

    // Bubble Sort on DLL
    void bubbleSort() {
        if (head == null) return;

        boolean swapped;
        Node current;

        do {
            swapped = false;
            current = head;

            while (current.next != null) {
                if (current.data > current.next.data) {
                    // Swap data
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }

        } while (swapped);
    }

    // Print the list
    void printList() {
        Node current = head;
        System.out.print("DLL: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main function
    public static void main(String[] args) {
        question3 dll = new question3();

        // Add elements
        dll.insertAtEnd(45);
        dll.insertAtEnd(10);
        dll.insertAtEnd(32);
        dll.insertAtEnd(8);
        dll.insertAtEnd(17);

        System.out.println("Before Sorting:");
        dll.printList();

        dll.bubbleSort();

        System.out.println("After Sorting in Ascending Order:");
        dll.printList();
    }
}
