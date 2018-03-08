/* Author: Joseph Gormley 
   Date: 12/6/17 */
public class Driver {
	
	public static void main(String[] args){

                System.out.println("Graph Test");
		System.out.println("----------------------\n");

		// Create graph.
                Graph g = new Graph(6);
                g.addEdge(0, 1);
                g.addEdge(0, 2);
                g.addEdge(0, 3);
                g.addEdge(4, 1);
                g.addEdge(5, 3);
                g.addEdge(5, 4);
                g.printGraph();
                


		System.out.println("\nTest complete!\n");

	}

}
