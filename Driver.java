/* Author: Joseph Gormley 
   Date: 12/6/17 */
public class Driver {
	
	public static void main(String[] args){

                System.out.println("AVL Test");
		System.out.println("--------\n");

		// Create AVL Tree.
                AVLTree t = new AVLTree();
                
                t.insert(5);
                t.insert(1); 
                t.insert(12);
                t.insert(11);
                t.insert(4); 
                t.insert(7);
                
                System.out.println("Printing tree - inOrder");
                t.printInOrder(t.root);
	}

}
