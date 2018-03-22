/* Author: Joseph Gormley 
   Date: 12/6/17 */
public class Driver {
	
	public static void main(String[] args){

                System.out.println("AVL Tree Test");
		System.out.println("-------------\n");

		// Create LinkedList.
                AVLTree tree = new AVLTree();
                
                // Insert elements.
                tree.insert(50);
                tree.printInOrder(tree.root);
                System.out.println();
  
                tree.insert(60);
                tree.printInOrder(tree.root);
                System.out.println(); 
         
                tree.insert(55);
                tree.printInOrder(tree.root);
                System.out.println(); 
                   
	}

}
