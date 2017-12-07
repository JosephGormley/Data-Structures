/* Author: Joseph Gormley 
   Date: 12/6/17 */
public class SinglyLinkedList<T extends Comparable<T>> {

	/*************
	 * MEMBER(S) *
     *************/
	Node<T> front; // Will represent first node in list. 


	/******************
	 * CONSTRUCTOR(S) *
     ******************/
	// Default constructor is fine for this class.


    /*************
	 * METHOD(S) *
     *************/
	/* Inserts an item to the front of the list */
	public void insertToFront(T data){

		// Create Node for data and increment size. 
		front = new Node<T>(data, front);

	}

	/* Deletes first occurrence of data in list */
	public void delete(T data){


		// Check to see if first item is first occurrence of data. 
		if(front.data.compareTo(data) == 0){
			if(front.next == null){
				// Delete only item in list. 
				front = null;
				return; 
			}

			front = front.next; 
			return;
		}

		Node<T> prev = front;
		// Search remaining of list for first occurrence of data.
		for(Node<T> toDelete = front.next; toDelete != null; toDelete = toDelete.next){
			if(toDelete.data.compareTo(data) == 0){
				// Delete this node.
				prev.next = prev.next.next;
				return;
			}

			prev = toDelete;

		}

	}

	//TODO 
	/* Deletes ALL occurences of data in list */
	public void deleteAll(T data){


	}


	/********************
	 * HELPER METHOD(S) *
     ********************/
	/* Prints out the list */
	public void printList(){

		// Iterate list
		for(Node<T> toPrint = front; toPrint != null; toPrint = toPrint.next){
			System.out.println(toPrint.data);
		}

		return;
	}

}
 

/* This class will store data and a pointer to the next data */
class Node<T> {

	/*******************
	 * CLASS MEMBER(S) *
     *******************/
	T data; 
	Node<T> next; 


	/******************
	 * CONSTRUCTOR(S) *
     ******************/
	public Node(T data, Node<T> next){
		this.data = data;
		this.next = next;
	}

}