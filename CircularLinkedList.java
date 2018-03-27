/* Author: Joseph Gormle
   Date: March 26, 2018 */

public class CircularLinkedList {


  /******************
   * CLASS FIELD(S) *
   ******************/
   int size;
   Node rear; 

  /************************
   * CLASS CONSTRUCTOR(S) *
   ************************/ 
   // Default constructor is fine for this class. 


  /*******************
   * CLASS METHOD(S) *
   *******************/
   public Node sortedInsertInside(int data){
      
      // Create new node for data.
      Node n = new Node(data);

      // Edge case - empty list. 
      if(rear == null){
         // Add n. 
         rear = n;
         // Must point to itself.
         rear.next = rear;
         size++;
         return rear;
      }

      // Find location to insert data by traversing list.  
      Node curr = rear.next;
      Node prev = null; 
      do{
         if(data <= curr.data){ // This is the location! Insert here.   
            break; // Break loop and insert data.             
         }else{ // Wrong location, check next. 
            prev = curr;  
            curr = curr.next;
         }
      }while(curr != rear.next);

      // Insertion
      // Note: If prev is null, data goes to front.  
      if(prev == null){
         curr.next = n;
      }else{
         prev.next = n;
      }
      n.next = curr;

      // Changing rear is dependent on location of data. 
      if(data > rear.data){
         rear = rear.next;
      } 
 
      // Return rear for case that rear changed. 
      return rear;
   }

  /********************
   * HELPER METHOD(S) *
   ********************/
   public void printList(){
   
      // Edge case - empty list.
      if(rear == null){
         System.out.println("printList() - Empty Case");
         return;
      } 

      Node curr = rear.next;
      do{
         System.out.print(curr.data + "->");
         curr = curr.next;
      }while(curr != rear.next);

      System.out.println();
   }

  /******************
   * WRAPPER METHOD *
   ******************/
   public void sortedInsert(int data){ rear = sortedInsertInside(data); }
 

// End of class
}

class Node {

  /******************
   * CLASS FIELD(S) *
   ******************/
   int data;
   Node next;

 /************************
  * CLASS CONSTRUCTOR(S) *
  ************************/
  public Node(int data){
     this.data = data;
     this.next = null;
  }

// End of class.
}
