/* Author: Joseph Gormley 
   Date: 12/6/17 */
public class Driver {
	
	public static void main(String[] args){

                System.out.println("Adjacency List Graph Test: ");
              
		// Create Adjacency List Graph.
                AdjacencyListGraph alg = new AdjacencyListGraph(8);
   
                alg.initialize();

                alg.addEdge(0, 1);

                alg.addEdge(1, 2);
		alg.addEdge(1, 5);

                alg.addEdge(2, 0);
                alg.addEdge(2, 1);
                alg.addEdge(2, 6);

                alg.addEdge(3, 7);

                alg.addEdge(4, 2);

                alg.addEdge(5, 1);
                alg.addEdge(5, 6);

                alg.addEdge(6, 5);

                alg.addEdge(7, 5);
		alg.addEdge(7, 6);
                
                //System.out.println(alg.graph[7].get(0));

                //alg.printLists();
                alg.bfs(3);
	}

}
