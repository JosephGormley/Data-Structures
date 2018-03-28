/* Author: Joseph Gormley 
   Date: 12/6/17 */
public class Driver {
	
	public static void main(String[] args){

                System.out.println("Adjacency Graph Test: ");
              
		// Create Adjacency list Graph.
                AdjacencyListGraph alg = new AdjacencyListGraph(8);;
                
                alg.initialize();

                // Insert elements.
                alg.addEdge(0, 1);
                alg.addEdge(0, 3);
                alg.addEdge(0, 4);

                alg.addEdge(1, 3);
 
                alg.addEdge(2, 0);
                alg.addEdge(2, 4);
                alg.addEdge(2, 5);
                alg.addEdge(2, 6);
                
                alg.addEdge(3, 5);

                alg.addEdge(5, 1);
                alg.addEdge(5, 3);
                alg.addEdge(5, 6);
                alg.addEdge(5, 7);
 
                alg.addEdge(6, 4);
                alg.addEdge(6, 5);
                
                System.out.print("BFS: ");
                alg.bfs(0);
               /* 
  
               CircularLinkedList cll = new CircularLinkedList();

                cll.sortedInsert(10);
                cll.sortedInsert(30);
                cll.sortedInsert(20);
                cll.sortedInsert(12);
                cll.printList(); 
                System.out.println(cll.get(4));
              */
   
	}

}
