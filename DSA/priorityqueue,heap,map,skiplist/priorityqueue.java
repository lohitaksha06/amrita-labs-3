public class priorityqueue {
    // Linked-list priority queues
    static class Node { 
        int val; 
        Node next; 
        Node(int v){ val=v; } 
    }

    static Node insertAsc(Node head, int val){
        Node n=new Node(val);
        if(head==null || val<head.val){ 
            n.next=head; 
            return n; 
        }
        Node c=head; 
        while(c.next!=null && c.next.val<=val) {
            c=c.next; 
        }
        n.next=c.next; 
        c.next=n; 
        return head;
    }

    static Node insertDesc(Node head, int val){
        Node n=new Node(val);
        if(head==null || val>head.val){ 
            n.next=head; 
            return n; 
        }
        Node c=head; 
        while(c.next!=null && c.next.val>=val) {
            c=c.next; 
        }
        n.next=c.next; 
        c.next=n; 
        return head;
    }

    static int poll(Node[] headBox){ 
        if(headBox[0]==null) return Integer.MIN_VALUE; 
        int v=headBox[0].val; 
        headBox[0]=headBox[0].next; 
        return v; 
    }

    static void minOrderDemo(){
        Node head=null; 
        head=insertAsc(head,5); 
        head=insertAsc(head,3); 
        head=insertAsc(head,8); 
        head=insertAsc(head,1);

        System.out.print("min order: "); 
        Node[] box=new Node[]{head}; 
        int x; 
        while((x=poll(box))!=Integer.MIN_VALUE) {
            System.out.print(x+" "); 
        }
        System.out.println();
    }

    static void maxOrderDemo(){
        Node head=null; 
        head=insertDesc(head,5); 
        head=insertDesc(head,3); 
        head=insertDesc(head,8); 
        head=insertDesc(head,1);

        System.out.print("max order: "); 
        Node[] box=new Node[]{head}; 
        int x; 
        while((x=poll(box))!=Integer.MIN_VALUE) {
            System.out.print(x+" "); 
        }
        System.out.println();
    }

    public static void main(String[] args){
        minOrderDemo();
        maxOrderDemo();
    }
}
