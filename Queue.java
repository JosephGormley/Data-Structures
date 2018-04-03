public class Queue<T> {
 
  /****************** 
   * CLASS FIELD(S) *
   ******************/
   NodeGen<T> front;
   
  /************************
   * CLASS CONSTRUCTOR(S) *
   ************************/
   // Default constructor is fine for this class. 
     
  /*******************
   * CLASS METHOD(S) *
   *******************/
   /* Added an element to the end of the queue */
   public void enQueue(T data){

      // Create new node. 
      NodeGen<T> n = new NodeGen<T>(data);
 
      // Edge case, empty list.
      if(front == null){
         front = n;
         return;
      }
      
      // Traverse to the end of the queue. 
      NodeGen<T> curr = front;
      while(curr.next != null){
         curr = curr.next;         
      }
     
      // Add node to the end of the queue. 
      curr.next = n;
      return;      
   }
  
   /* Removes an item from the queue */
   public T deQueue(){

      NodeGen<T> ret = front;
      front = front.next;

      return ret.data;
   }

   public boolean isEmpty(){

      return front == null;
   }

  /********************
   * HELPER METHOD(S) *
   ********************/
   public void printQueue(){
      for(NodeGen<T> curr = front; curr != null; curr = curr.next){
         System.out.println(curr.data);
      }
   }

} // End of class.

class NodeGen<T> {

  /*******************
   * CLASS MEMBER(S) *
   *******************/
   T data;
   NodeGen<T> next;

  /************************
   * CLASS CONSTRUCTOR(S) *
   ************************/
   public NodeGen(T data){
      this.data = data;
      this.next = null;
   }
   
}

