/* Author: Joseph Gormley 
   Date: 12/6/17 */
public class Driver {
	
	public static void main(String[] args){

                System.out.println("AVL Tree Test");
		System.out.println("-------------\n");

		// Create LinkedList.
                SinglyLinkedList<Integer>  sll = new SinglyLinkedList<Integer>();                
                
                // Insert elements.
                /* sll.insertToEnd(50);
                sll.printList();
                System.out.println();
  
                sll.insertToEnd(60);
                sll.printList();
                System.out.println(); 
         
                sll.insertToEnd(70);
                sll.printList();
                System.out.println(); 
                */
                System.out.println("4 item in list is: " + sll.get(4));
                   
	}

}
