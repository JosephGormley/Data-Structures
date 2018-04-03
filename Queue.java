public class Queue<T> {
 
  /****************** 
   * CLASS FIELD(S) *
   ******************/
   Node<T> front;
   
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
      Node<T> n = new Node<T>(data, null);
 
      // Edge case, empty list.
      if(front == null){
         front = n;
         return;
      }
      
      // Traverse to the end of the queue. 
      Node<T> curr = front;
      while(curr.next != null){
         curr = curr.next;         
      }
     
      // Add node to the end of the queue. 
      curr.next = n;
      return;      
   }
  
   /* Removes an item from the queue */
   public T deQueue(){

      Node<T> ret = front;
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
      for(Node<T> curr = front; curr != null; curr = curr.next){
         System.out.println(curr.data);
      }
   }

} // End of class.
