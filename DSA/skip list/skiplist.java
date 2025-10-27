
 public class skiplist {
        class Node{
            int value;   
            Node[] forward;
        public Node(int value,int level){
            this.value = value;
            this.forward = new Node[level + 1];
        }
    }
    public class skip{
                private Node head;
                private int maxLevel;
                private int level;
                private Random random;

    }
    public skiplist(int level, int maxLevel){
        maxLevel = 16;
        level = 0;
        head = new Node(Integer.Min_Value )
    }

    
}
            
