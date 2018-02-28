/* Author: Joseph Gormley 
   Date: 12/6/17 */

import java.util.HashSet;

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

      // Create Node for data. 
      front = new Node<T>(data, front);

   }

   /* Inserts an item to the end of the list */
   public void insertToEnd(T data){

      // Iterate to end of list.	
      Node<T> endNode = front;
      while(endNode.next != null){
         endNode = endNode.next;
      }

      // Create Node for data and add to the list.
      endNode.next = new Node<T>(data, null);

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
        
   /* Deletes ALL occurences of data in list. */
   // #1. Cracking the Coding Interview  
   public void removeDups(){
        
      HashSet<T> hs = new HashSet<T>(); // Used to store list for efficiency. 
 
      Node<T> prev = null;
      for(Node<T> curr = front; curr != null; curr = curr.next){
         if(!hs.contains(curr.data)){ // Add to HashSet. 
            hs.add(curr.data);
         }else{ // This data is a duplicate and should be deleted.
            prev.next = prev.next.next;
         }
         prev = curr;     
      }

    }

    /* Return kth to last item in the list. */
    // #2. Cracking the Coding Interview
    public T returnKthToLast(int k){  
      

       return null;
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

// End of class. 
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
// End of class. 
}
