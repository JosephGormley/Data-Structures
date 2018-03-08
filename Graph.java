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
   
   // DFS.
   public void dfs(int vertex){
 
      Stack<Integer> s = new Stack<Integer>();
      boolean[] visited = new boolean[vertices];
      visited[vertex] = true;
      
      s.push(vertex);
      int v = s.peek().data;

      while(!s.isEmpty()){
         
         for(int i = 0; i < nodes[v].length; i++){
            System.out.println(s.peek().data);
            if(nodes[v][i] == 1 && visited[i] == false){
                s.push(i);
                visited[i] = true;
                v = s.peek().data;
                i = 0;
            }
         }

         s.pop();
         v = s.peek().data;
      }
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

