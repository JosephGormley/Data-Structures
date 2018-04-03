/* Author: Joseph Gormley
   Date: March 22nd, 2018 */

public class AdjacencyListGraph {
   
  /******************
   * CLASS FIELD(S) *
   ******************/
   SinglyLinkedList[] graph; 
   int vertices; 

  /************************
   * CLASS CONSTRUCTOR(S) *
   ************************/
   public AdjacencyListGraph(int vertices){
      graph = new SinglyLinkedList[vertices];
      this.vertices = vertices; 
   }

  /*******************
   * CLASS METHOD(S) *
   *******************/
   public void initialize(){
    
      // Fill graph with empty Circular Linked Lists. 
      for(int i = 0; i < vertices; i++){
         graph[i] = new SinglyLinkedList();
      }
   }

   /* Adds an edge to the matrix representation of the graph.
      vertex1 -> Start connecting point of the edge.
      vertex2 -> End connecting point of the edge. */
   public void addEdge(int vertex1, int vertex2){
   
      // Add given edge to the graph representation. 
      graph[vertex1].insertToEnd(vertex2);
      return; 
   }

   public boolean pathBetweenVertices(int vertex1, int vertex2){

      return false;
   }
             
  /***********************
   * TRAVERSAL METHOD(S) *
   ***********************/
   /* DFS traversal iteratively. */  
   public void dfs(int vertex){
   
      Stack<Integer> s = new Stack<Integer>();
      char[] visited = new char[vertices];
      
      // Pop / Visted given vertex.
      int v = vertex;   
      s.push(v);
      visited[v] = 'V';
      System.out.print(v);
      while(!s.isEmpty()){;

         // Iterate through vertex's neighbors (in ascending order).
         int i = 0;
         while(i < graph[v].getSize()){ 
           if(visited[graph[v].get(i)] != 'V'){
              v = graph[v].get(i);
              s.push(v);
              visited[v] = 'V';
              System.out.print(v);
              i = 0; // Check new v's neighbors. 
           }else{
              i++; // Not an unvisited vertice? Try next neighbor.  
           }
         }
 
         // All neighbors have visisted. 

         s.pop();
         if(s.peek() != null){ v = s.peek(); }     
     }
 
     System.out.println();
     return;
   }
         
   /* BFS traversal iteratively. */
   public void bfs(int vertex){

      Queue<Integer> q = new Queue<Integer>();
      char[] visited = new char[vertices];

      int v = vertex;
      q.enQueue(v);
      visited[v] = 'V';
      System.out.println(v);
      while(!q.isEmpty()){
         v = q.deQueue();
         int i = 0; 
         // Iterate through v's neighbors.
         while(i < graph[v].getSize()){
            if(visited[Integer.parseInt(graph[v].get(i) + "" )] != 'V'){
               q.enQueue(v);
               visited[v] = 'V';
               System.out.println(v);
            }
            i++; // Not an unvisited vertice? Try next neighbor. 
         }
   
      }
   }

  /********************
   * HELPER METHOD(S) *
   ********************/
   public void printSizes(){
   
      // Iterate through array.
      for(int i = 0; i < vertices; i++){
         System.out.print(graph[i].getSize());
      }
      System.out.println();
      return;
   }

   public void printLists(){
   
      // Iterate rows of array.
      for(int row = 0; row < graph.length; row++){
         // Iterate lists in each row.
         System.out.print("graph[" + row + "]: ");
         graph[row].printList();
      }

   } // End of method. 

} // End of class.
