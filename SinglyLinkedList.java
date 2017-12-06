/* Author: Joseph Gormley 
   Date: 12/6/17 */
public class SinglyLinkedList<T> {

	/* Class members */
	Node<T> front;
	int size;

	/* Default constructor is fine for this class */

	/* Inserts an item to the front of a Linked List 
	   NOTE: This returns a new front for the list */
	public Node<T> insertToFront(T data){

		// Create Node for data
		Node<T> n = new Node<T>(data, front);

		return n;

	}

	/* Prints out the Linked List */
	public void printList(){

		// Iterate list
		for(Node<T> tmp = front; tmp != null; tmp = tmp.next){
			System.out.println(tmp.data);
		}

		return;
	}

}

/* This class will store data and a pointer to the next data */
class Node<T> {

	// Class members
	T data; 
	Node<T> next; 

	// Constructor
	public Node(T data, Node<T> next){
		this.data = data;
		this.next = next;
	}
}