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
      graph[vertex1].insert(vertex2);
      graph[vertex1].printList();
      return; 
   }
 
  /********************
   * HELPER METHOD(S) *
   ********************/
   public void dfs(int vertex){
   
      //Stack<Integer> s = new Stack<Integer>();
       
      //s.pop(vertex);
       
   }

   public void printEdges(){
   
   }

}
