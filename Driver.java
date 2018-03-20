/* Author: Joseph Gormley 
   Date: 12/6/17 */
public class Driver {
	
	public static void main(String[] args){

                System.out.println("LinkedList Test");
		System.out.println("---------------\n");

		// Create LinkedList.
                SinglyLinkedList<Integer> sl = new SinglyLinkedList<Integer>();
                
                // Insert elements.
                sl.insertToEnd(3);
                sl.insertToEnd(5);
                sl.insertToEnd(8);
                sl.insertToEnd(5);
                sl.insertToEnd(10);
                sl.insertToEnd(2);
                sl.insertToEnd(1);
 
                // Print list.
                sl.printList();
                System.out.println();                

                // Test partition.
                sl.front = sl.partition(sl.front, 5);      
                
                // Compare results.
                sl.printList();          
	}

}
