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
  
                tree.insert(40);
                tree.printInOrder(tree.root);
                System.out.println(); 
         
                tree.insert(30);
                tree.printInOrder(tree.root);
                System.out.println(); 
                
                tree.insert(20);
                tree.printInOrder(tree.root);
                System.out.println();

                tree.insert(10);
                tree.printInOrder(tree.root);
                System.out.println();                   
	}

}
