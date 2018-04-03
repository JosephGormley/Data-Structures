/* Author: Joseph Gormley
   Date:   03-02-18 */

public class Stack<T extends Comparable<T>>{
   
  /*******************
   * CLASS MEMBER(S) *
   *******************/
   NodeGen<T> top;
   
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
   public NodeGen<T> push(T data){
      
      // Creat node with given data. 
      NodeGen<T> n = new NodeGen<T>(data);
      
      // Add node to the top of the stack.
      n.next = top;
      top = n;
      
      return top;
      
   }  
      
   /* Takes out and returns top of stack */
   public void pop(){
      
     if(isEmpty()){
        return;
     }
   
     top = top.next;
     return;     
   }
    
   public int stackMin(){ return top == null? -1 : top.min; }


   public T peek(){ return top == null? null : top.data; }
      
  /**********************
   * HELPER FUNCTION(S) *
   **********************/
   public void printStack(){
   
      // Traverse stack.
      for(NodeGen<T> current = top; current != null; current = current.next){
         System.out.println(current.data);
      }
   }
}

class NodeGen<T> {
  
  /*******************
   * CLASS MEMBER(S) *
   *******************/
   T data;
   int min;
   NodeGen<T> next; 
      
  /************************
   * CLASS CONSTRUCTOR(S) *
   ************************/
   public NodeGen(T data){
      this.data = data;
      this.next = null;
      min = -1;
   }

}
