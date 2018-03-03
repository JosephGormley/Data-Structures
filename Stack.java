/* Author: Joseph Gormley
   Date:   03-02-18 */

public class Stack<T extends Comparable<T>> {

   /******************
   * CLASS MEMBER(S) *
   ******************/
   Node<T> top;

   /****************
   * COSTRUCTOR(S) *
   ****************/
   // Default class is fine for this case. 

   /************
   * METHOD(S) *
   ************/
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

      return top;

   }

   public Node<T> pop(){

     if(isEmpty()){
        return null;
     }
 
     Node<T> tmp = top;
     top = top.next;    

     return tmp;

   }

  /* ********************
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
   Node<T> next; 

  /******************
   * CONSTRUCTOR(S) *
   ******************/
   public Node(T data){
      this.data = data;
      this.next = null;
   }

}
