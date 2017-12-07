/* Author: Joseph Gormley 
   Date: 12/6/17 */
public class Driver {
	
	public static void main(String[] args){

		System.out.println("\nSingly LinkedList Test");
		System.out.println("----------------------\n");

		// Create list of strings.
		SinglyLinkedList<String> sll = new SinglyLinkedList<String>();


		sll.insertToFront("item1");
		sll.insertToFront("item2");
		sll.insertToFront("item3");
		
		sll.printList();
		sll.delete("item3");
		sll.printList();

		System.out.println("\nTest complete!\n");

	}
	
}
