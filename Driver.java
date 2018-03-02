/* Author: Joseph Gormley 
   Date: 12/6/17 */
public class Driver {
	
	public static void main(String[] args){

		//System.out.println("\nSingly LinkedList Test");
                System.out.println("Binary Search Tree Test");
		System.out.println("----------------------\n");

		// Create list of strings.
		//SinglyLinkedList<String> sll = new SinglyLinkedList<String>();

                // Create a Binary Search tree
                BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();

                // Add values to the bst.
                bst.addData(7);
                bst.addData(3);
                bst.addData(5);
                bst.addData(1);
                bst.addData(4);
                bst.addData(6);
                bst.addData(10);
                bst.addData(9);
                bst.printInOrder();;                 



		/*sll.insertToFront("item1");
                sll.insertToFront("Hey");
		sll.insertToFront("item2");
		sll.insertToFront("item3");
		sll.insertToEnd("item0");
                sll.insertToEnd("item2");
                sll.insertToFront("Hey");
		sll.printList();
		System.out.println();
                System.out.println();
		sll.printList(); */


		System.out.println("\nTest complete!\n");

	}

}
