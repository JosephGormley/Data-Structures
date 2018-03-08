// This is a graph represented as a Matrix. 
public class Graph {
   
   // Fields. 
   int[][] nodes;
   int vertices = 0; 
   int edges = 0;

   // Constructor.
   public Graph(int vertices){
      nodes = new int[vertices][vertices];
      this.vertices = vertices; 
   }

   // Methods.
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



      return false;
   }

   // Helper functions.
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

class Node {

   // Fields.
   int data;
   Node[] children;

   // Constructor.
   public Node(int data){

      this.data = data;

   }

}

