// This is a graph represented as a Matrix. 
public class Graph {
   
   // Fields. 
   char[][] nodes;

   // Constructor.
   public Graph(int size){
      nodes = new char[size][size];
   }
   
}

class Node {

   // Fields.
   char data;
   Node[] children;

   // Constructor.
   public Node(char data){

      this.data = data;

   }

}

