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

      System.out.println("Inserting edge " + vertex2 + " in graph[" + vertex1 + "]");
   
      // Add given edge to the graph representation. 
      graph[vertex1].sortedInsert(vertex2);
      System.out.print("graph[" + vertex1 + "]: ");
      graph[vertex1].printList();
      return; 
   }
 
  /********************
   * HELPER METHOD(S) *
   ********************/
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
         System.out.print("Iterating through " + v + ": ");
         for(int i = 0; i < graph[v].getSize(); i++){
           System.out.print(graph[v].get(i));
           if(visited[graph[v].get(i)] != 'V'){
              v = graph[v].get(i);
              s.push(v);
              visited[v] = 'V';
              //System.out.print(v);
              i = 0;
           }
         }
         System.out.println("Popping out: " + s.peek());
         s.pop();
         if(s != null){ v = s.peek(); }     
     }
 
     System.out.println();
     return;
   }

   public void printSizes(){
   
      // Iterate through array.
      for(int i = 0; i < vertices; i++){
         System.out.print(graph[i].getSize());
      }

      return;
   }

}
