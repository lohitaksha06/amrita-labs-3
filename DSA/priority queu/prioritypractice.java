

public class prioritypractice {
     class Node{
        int priority;
        String data;
        Node next;
        Node prev;
        Node(String data,int priority){
            this.data = data;
            this.priority = priority;
            this.next = null;
            this.prev = null;
        }

        class patientqueue{
            Node head;

            void insert(String data, int priority){
                Node newNode = new Node(data,priority);
                if(head == null || priority < head.priority){
                    newNode.next = head;
                    head = newNode;
                    return;
                }
                Node temp = head;
                while(temp.next != null && temp.next.next)

                }

            }
        }
        
    }
    
}
