// This is a graph represented as a Matrix. 
public class Graph {
   
  /******************
   * CLASS FIELD(S) *
   ******************/
   int[][] nodes;
   int vertices = 0; 
   int edges = 0;

  /************************
   * CLASS CONSTRUCTOR(S) *
   ************************/ 
   public Graph(int vertices){
      nodes = new int[vertices][vertices];
      this.vertices = vertices; 
   }

  /*******************
   * CLASS METHOD(S) *
   *******************/
   /* Adds an edge to the matrix representation of the graph.
      vertex1 -> Start connecting point of the edge.
      vertex2 -> End connecting point of the edge. */
   public void addEdge(int vertex1, int vertex2){

      // Parameter check.
      if(vertex1 >= vertices || vertex1 < 0 || vertex2 >= vertices || vertex2 < 0){
         System.out.println("addEdge(int vertex1, int vertex2): parameter out of bounds");
         return;
      }


      // Update matrix.
      nodes[vertex1][vertex2] = 1;
      
      edges++;
   }   
   
   // Closest route between two nodes. This question is from CTCI.
   public boolean routeBetweenVertices(int vertex1, int vertex2){
      // Looking for closest route, so BFS would be more appropriate than DFS. 
      // Note: BFS uses a queue. 
      Queue<Integer> q = new Queue<Integer>();
      boolean[] visited = new boolean[vertices];
      int vertex = vertex1;
 
      // Enqueue and visit root.
      q.enQueue(vertex);
      visited[vertex] = true;
     
      while(!q.isEmpty()){
         vertex = q.deQueue().data;
         // Have we already visited vertex?
         int i = 0; // To traverse neighbors.  
         while(i < vertices){
            if(nodes[vertex][i] == 1 && visited[i] == false){ 
               if(i == vertex){
                  return true; // There is a route between given vertices. 
               }
               q.enQueue(i);
               visited[i] = true;
            }
            
            i++;
         }
      } 
 
      return false; // No route exists between given vertivces. 
   }
   
   /* DFS traversal through the graph.
      vertex -> starting vertex */
   public void dfs(int vertex){
 
      Stack<Integer> s = new Stack<Integer>();
      boolean[] visited = new boolean[vertices];
      
      s.push(vertex);
      visited[vertex] = true;
      int v = s.peek().data;

      System.out.print(v);

      while(!s.isEmpty()){
         
         int i = 0;
         while(i < vertices){
            if(nodes[v][i] == 1 && visited[i] == false){
                s.push(i);
                visited[i] = true;
                v = s.peek().data; 

                // Print out new vertex and start iteration over.
                System.out.print(v);
                i = 0;
            }else{
               i++;
            }
         }

         s.pop();
         if(s.peek() != null){
            v = s.peek().data;
         }
      }
      System.out.println();
      return;
   }

   /* BFS traversal through the graph.
      vertex -> starting vertex */
   public void bfs(int vertex){

      Queue<Integer> q = new Queue<Integer>();
      boolean visited[] = new boolean[vertices];
      int v = vertex; // Current vector.
      int i = 0;      // Used for iterating v's neighbors. 
    
      q.enQueue(v);
      visited[v] = true;
      System.out.print(v);

      while(!q.isEmpty()){
         i = 0;
         v = q.deQueue().data; 
         while(i < vertices){
            if(nodes[v][i] == 1 && visited[i] == false){
               q.enQueue(i);
               visited[i] = true; 
               System.out.print(i);
            }else{
               i++;
            }
         }
         
      } 
      
      System.out.println();
      return;
   } 

  /********************
   * HELPER METHOD(S) *
   ********************/
   /* Prints out 2d array representation of the graph.
      Note: 1 represents an edge. 
            0 represents no edge. */
   public void printGraph(){

      // Traverse 2d array.
      for(int i = 0; i < nodes.length; i++){
        for(int j = 0; j < nodes[i].length; j++){
           System.out.print(nodes[i][j] + " ");
        }
        System.out.println();
      }

   }
}

