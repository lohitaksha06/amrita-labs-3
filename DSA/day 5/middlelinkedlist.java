import java.util.*;
static class Node{
    int data;
    Node next;

}
public class middlelinkedlist {
    int findMiddle(){
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return(slow != null)?slow.data:-1;
        
    }
    
}
