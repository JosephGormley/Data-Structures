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
   }

   public void bfs(int vertex){





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

