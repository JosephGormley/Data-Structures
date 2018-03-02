/* Author: Joseph Gormley 
   Date: 12/6/17 */
public class Driver {
	
	public static void main(String[] args){

		System.out.println("\nSingly LinkedList Test");
		System.out.println("----------------------\n");

		// Create list of strings.
		SinglyLinkedList<String> sll = new SinglyLinkedList<String>();


		sll.insertToFront("item1");
                sll.insertToFront("Hey");
		sll.insertToFront("item2");
		sll.insertToFront("item3");
		sll.insertToEnd("item0");
                sll.insertToEnd("item2");
                sll.insertToFront("Hey");
		sll.printList();

		System.out.println();
	
                System.out.println();
		sll.printList();

		System.out.println("\nTest complete!\n");

	}

}
