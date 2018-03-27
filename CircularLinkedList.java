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
   public Node insertInside(int data){
      
      // Create new node for data.
      Node n = new Node(data);

      // Edge case - empty list. 
      if(rear == null){
         System.out.println("insertInside() - Empty Case");
         n.next = n;
         return n;
      }

      Node front;
      // Add to the end of the list.
      front = rear.next; 
      rear.next = n;
      n.next = front;  
      rear = rear.next;
      size++;
 
      return null;
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
         System.out.println(curr.data + "->");
         curr = curr.next;
      }while(curr != rear.next);

   }

  /******************
   * WRAPPER METHOD *
   ******************/
   public void insert(int data){ rear = insertInside(data); }
 

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
