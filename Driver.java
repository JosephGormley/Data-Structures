/* Author: Joseph Gormley 
   Date: 12/6/17 */
public class Driver {
	
	public static void main(String[] args){

		// Create list of strings.
		SinglyLinkedList<String> sll = new SinglyLinkedList<String>();

		sll.front = sll.insertToFront("Item1");
		sll.front = sll.insertToFront("Item2");

		sll.printList();

	}
}