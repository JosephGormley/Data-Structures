/* Author: Joseph Gormley
   Date:   03-02-18 */

public class Stack<T extends Comparable<T>> {
   
  /*******************
   * CLASS MEMBER(S) *
   *******************/
   Node<T> top;
   
  /***********************
   * CLASS COSTRUCTOR(S) *
   ***********************/
   // Default class is fine for this case. 
   
  /*******************
   * CLASS METHOD(S) *
   *******************/
   /* Returns true if empty, false otherwise */
   public boolean isEmpty(){
      return top == null;
   }
   
   /* Push data on to the top of the stack */
   public Node<T>  push(T data){
      
      // Creat node with given data. 
      Node<T> n = new Node<T>(data);
      
      // Add node to the top of the stack.
      n.next = top;
      top = n;
      
      // Update min if necessary.
      if(top.next != null){ // If not the only Node in the list.
         if(top.data.compareTo(top.next.min) > 0){
            top.min = top.next.min;
         }else{
            top.min = data;
         }
      }else{ // Only Node in the list.
         top.min = top.data;
      }
      
      return top;
      
   }  
      
   /* Takes out and returns top of stack */
   public Node<T> pop(){
      
     if(isEmpty()){
        return null;
     }
    
     Node<T> tmp = top;
     top = top.next;    
   
     return tmp;
     
   }
    
   public T stackMin(){
   
      return top.min;
   
   }


   public Node<T> peek(){
  
      return top;
   }
      
  /**********************
   * HELPER FUNCTION(S) *
   **********************/
   public void printStack(){
   
      // Traverse stack.
      for(Node<T> current = top; current != null; current = current.next){
         System.out.println(current.data);
      }
   }
}

class Node<T> {
  
  /*******************
   * CLASS MEMBER(S) *
   *******************/
   T data;
   T min;
   Node<T> next; 
      
  /************************
   * CLASS CONSTRUCTOR(S) *
   ************************/
   public Node(T data){
      this.data = data;
      this.next = null;
      min = null;
   }

}
