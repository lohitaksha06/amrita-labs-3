public class reverselinkedlist {
    Node head;
    void reverseList(){
        Node prev = null, curr = head, next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
        
    }
}
