/* Author: Joseph Gormley 
   Date: 12/6/17 */

import java.util.HashSet;

public class SinglyLinkedList {

  /******************
   * CLASS FIELD(S) *
   ******************/ 
   Node front; // Will represent first node in list. 
   int size; // Number of elements in the list. 

  /************************
   * CLASS CONSTRUCTOR(S) *
   ************************/
   public SinglyLinkedList(){
      front = null;
      size = 0;
   }
 
  /*************************
   * GETTER(S) / SETTER(S) *
   *************************/
   public int getSize(){ return size; }

  /*******************
   * CLASS METHOD(S) *
   *******************/
   /* Inserts an item to the front of the list */
   public void insertToFront(int data){

      // Create Node for data. 
      front = new Node(data, front);
      size++;
   }

   /* Inserts an item to the end of the list */
   public void insertToEnd(int data){

      // Create node to insert.
      Node n = new Node(data, null);

      // Empty case.
      if(front == null){
         front = n;
         size++;
         return;
      }

      // Iterate to end of list.	
      Node endNode = front;
      while(endNode.next != null){
         endNode = endNode.next;
      }

      // Create Node for data and add to the list.
      endNode.next = n;
      size++;
   }
    
   /* Retrieves ith element in the list */
   public int get(int i){
   
      int itemNumber = 0;

      // Edge case - Empty list. 
      if(front == null){
         System.out.println("get() - list is empty.");
         return -1; 
      }

      // Edge case - i > size of list. 
      if(i >= size || i < 0){
         System.out.println("get() - " + i + " is less than or greater than the size of the list: '" + size + "'");
         return -1;
      }
       
      // Traverse list to ith item. 
      for(Node n = front; n != null; n = n.next){
         // Reached item i.
         if(itemNumber == i){ 
            return n.data; 
         }
         
         itemNumber++;
      }

      System.out.println("SHOULD NOT BE HERE!"); 
      // Should never be reached. 
      // For compilier reasons. 
      return -1;
      
   }
   
   /* Deletes first occurrence of data in list */
   public void delete(int data){

      // Check to see if first item is first occurrence of data. 
      if(front.data == data){
         if(front.next == null){
            // Delete only item in list. 
	    front = null;
            return; 
	 }

	 front = front.next; 
         return;
      }  

      Node prev = front;

      // Search remaining of list for first occurrence of data.
      for(Node toDelete = front.next; toDelete != null; toDelete = toDelete.next){
	 if(toDelete.data == data){
	    // Delete this node.
	    prev.next = prev.next.next;
	    return;
	 }

	 prev = toDelete;
      }
      
      size--;
   }
        
   /* Deletes ALL occurences of data in list. */
   // #1. Cracking the Coding Interview  
   public void removeDups(){
        
      HashSet<Integer> hs = new HashSet<Integer>(); // Used to store list for efficiency. 
 
      Node prev = null;
      for(Node curr = front; curr != null; curr = curr.next){
         if(!hs.contains(curr.data)){ // Add to HashSet. 
            hs.add(curr.data);
         }else{ // This data is a duplicate and should be deleted.
            prev.next = prev.next.next;
            size--;
         }
         prev = curr;     
      }

    }

    /* Return kth to last item in the list. */
    // #2. Cracking the Coding Interview
    public Node returnKthToLast(int k){  
      
       int listSize = 0;

       // Get size of linked list. 
       for(Node curr = front; curr != null; curr = curr.next){
          listSize++;  
       }
 
       // Recursive call.
       return returnIndex(front, listSize - (k - 1));
    }

    /* Delete a given note (must be a missle node) given only a pointer to it */
    // #3. Cracking the Coding Interview
    public void  deleteMiddleNode(Node toDelete){

       // Do not have to worry about edeg cases due to nature of the method. 
  
       // Collect data from node in front;
       int nodeData = toDelete.next.data;

       // Place data in node given.
       toDelete.data = nodeData;

       // Change pointer. 
       toDelete.next = toDelete.next.next; 
 
      return;
   }

   /* Partiton node around T data. */ 
   // #4. Cracking the Coding Interview
   public Node partition(Node front, int n){

      // Set up our new list. 
      // List will always use head as pivot node. 
      Node head = front; // head is the pivot node. 
      Node tail = front; // Only one node in list at this point. 
      Node ptr = front; // Will be used to iterate list.     
      ptr = ptr.next; 

      // Iterate through the remaining list.
      while(ptr != null){
         Node next = ptr.next; 
         if(ptr.data < n){ 
            // Insert data to head of the list.
            ptr.next = head;
            head = ptr;
         }else{
            // Insert data to the tail of the list. 
            tail.next = ptr;          
            tail = ptr;
         } 
         ptr = next; 
      }
      tail.next = null;

      // Return head. (May not be same one).
      return head;
    
   }


  /********************
   * HELPER METHOD(S) *
   ********************/
   /* Prints out the list */
   public void printList(){

      // Iterate list
      for(Node toPrint = front; toPrint != null; toPrint = toPrint.next){
         System.out.print(toPrint.data + "->");
      }
      
      System.out.println();

      return;
   }


   /* Recursive call to delete iterate items in list */
   public Node returnIndex(Node current, int numberOfItem){
      
      // Edge Case 
      if(numberOfItem == 1){
         return current;
      }

      // Base Case 
      if(numberOfItem == 0){
         return current;
      }

      // Recursive Call
     return returnIndex(current.next, --numberOfItem);
   }

// End of class. 
}
 

/* This class will store data and a pointer to the next data */
class Node {

  /*******************
   * CLASS MEMBER(S) *
   *******************/
   int data; 
   Node next; 

  /************************
   * CLASS CONSTRUCTOR(S) *
   ************************/
   public Node(int data, Node next){
      this.data = data;
      this.next = next;
   }
// End of class. 
}
