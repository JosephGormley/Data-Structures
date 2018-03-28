/* Author: Joseph Gormley
   Date: March 22nd, 2018 */

import java.util.LinkedList; 

public class AdjacencyListGraph {
   
  /******************
   * CLASS FIELD(S) *
   ******************/
   CircularLinkedList[] graph; 
   int vertices; 

  /************************
   * CLASS CONSTRUCTOR(S) *
   ************************/
   public AdjacencyListGraph(int vertices){
      graph = new CircularLinkedList[vertices];
      this.vertices = vertices; 
   }

  /*******************
   * CLASS METHOD(S) *
   *******************/
   public void initialize(){
    
      // Fill graph with empty Circular Linked Lists. 
      for(int i = 0; i < vertices; i++){
         graph[i] = new CircularLinkedList();
      }
   }

   /* Adds an edge to the matrix representation of the graph.
      vertex1 -> Start connecting point of the edge.
      vertex2 -> End connecting point of the edge. */
   public void addEdge(int vertex1, int vertex2){
   
      // Add given edge to the graph representation. 
      graph[vertex1].sortedInsert(vertex2);
      return; 
   }
 
  /***********************
   * TRAVERSAL METHOD(S) *
   ***********************/
   /* DFS traversal iteratively. */
   public void dfs(int vertex){
   
      Stack s = new Stack();
      char[] visited = new char[vertices];
      
      // Pop / Visted given vertex.
      int v = vertex;   
      s.push(v);
      visited[v] = 'V';
      System.out.print(v);     
      while(!s.isEmpty()){
         
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
              i++; // Not an unvisited island? Try next neighbor.  
           }
         }

         s.pop();
         if(s != null){ v = s.peek(); }     
     }
 
     System.out.println();
     return;
   }
 
   /* BFS traversal recursively. */
   public void bfs(int vertex){


 
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
         for(int col = 0; col < graph[row].getSize(); col++){
            System.out.print(graph[row].get(col) + "->");
         }

         System.out.println();
      }

   } // End of method. 

} // End of class.
