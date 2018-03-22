/* Author: Joseph Gormley
   Date: March 22nd, 2018 */
public class AdjacencyListGraph {
   
  /******************
   * CLASS FIELD(S) *
   ******************/
   LinkedList<Integer>[] graph; 
   
  /************************
   * CLASS CONSTRUCTOR(S) *
   ************************/
   public AdjacencyListGraph(int vertices){
      graph = LinkedList[vertices];
   }

  /*******************
   * CLASS METHOD(S) *
   *******************/
   /* Adds an edge to the matrix representation of the graph.
      vertex1 -> Start connecting point of the edge.
      vertex2 -> End connecting point of the edge. */
   public void addEdge(int vertex1, int vertex2){
   
      // Add given edge to the graph representation. 
      graph[vertex].insert(vertex2);
      return; 
     
   }
 
  /********************
   * HELPER METHOD(S) *
   ********************
   public void dfs(int vertex){
   
      Stack<Integer> s = new Stack();
       
      s.pop(vertex);
       
   }

}
