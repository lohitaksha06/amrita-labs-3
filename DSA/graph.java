public class graph {
    
 class Graph{
    int vertices;
    int[][] adjMatrices;
    Graph(int v){
        vertices = v;
        adjMatrices = new int[v][v];
    }
    void addEdge(int src, int dest){
        adjMatrices[src][dest] = 1;
        adjMatrices[dest][src] = 1;

    }
 }
 
 static class Queue{
    int[] items;
    int front,rear,size;
    Queue(int capacity){
        front = 0;
        rear = -1;
        size = 0;
    }
    void enqueue(int value){
        rear++;
        items[rear] = value;
        size++;
    }
    int dequeue(){
        int value = items[front];
        front++;
        size--;
        return value;
    }
    boolean isEmpty(){
        return size == 0;
    }
 }
void BFS(int start) {
        boolean[] visited = new boolean[vertices];
        Queue queue = new Queue(vertices);
        visited[start] = true;
        queue.enqueue(start);
        while(!queue.isEmpty()){
            int current = queue.dequeue();
            for(int i = 0; i < vertices; i++){
                if(adjMatrices[current][i] == 1 && !visited[i]){
                    visited[i] = true;
                    queue.enqueue(i);
                }
            }
        }
        
    }

}

