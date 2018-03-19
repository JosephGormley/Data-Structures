/* Author: Joseph Gormley 
   Date: 12/6/17 */
public class Driver {
	
	public static void main(String[] args){

                System.out.println("Graph Test");
		System.out.println("--------\n");

		// Create Graph.
                Graph g = new Graph(8);
                g.addEdge(0, 2); // 1
                g.addEdge(0, 4); // 2
                g.addEdge(1, 2); // 3
                g.addEdge(2, 0); // 4
                g.addEdge(2, 5); // 5
                g.addEdge(2, 6); // 6
                g.addEdge(3, 7); // 7
                g.addEdge(4, 7); // 8
                g.addEdge(5, 1); // 9
                g.addEdge(6, 4); // 10
                g.addEdge(7, 5); // 11
                g.addEdge(7, 6); // 12
                System.out.println( g.routeBetweenVertices(0, 1)? "There is a route between 0 and 1" : "There is NOT a route between 0 and 1");;
                
                
	}

}
