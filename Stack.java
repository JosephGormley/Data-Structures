/* Author: Joseph Gormley
   Date:   03-02-18 */

public class Stack{
   
  /*******************
   * CLASS MEMBER(S) *
   *******************/
   Node top;
   
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
   public Node push(int data){
      
      // Creat node with given data. 
      Node n = new Node(data);
      
      // Add node to the top of the stack.
      n.next = top;
      top = n;
      
      // Update min if necessary.
      if(top.next != null){ // If not the only Node in the list.
         if(top.data < top.next.min){
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
   public void pop(){
      
     if(isEmpty()){
        return;
     }
   
     top = top.next;
     return;     
   }
    
   public int stackMin(){ return top == null? -1 : top.min; }


   public int peek(){ return top == null? -1 : top.data; }
      
  /**********************
   * HELPER FUNCTION(S) *
   **********************/
   public void printStack(){
   
      // Traverse stack.
      for(Node current = top; current != null; current = current.next){
         System.out.println(current.data);
      }
   }
}

class Node {
  
  /*******************
   * CLASS MEMBER(S) *
   *******************/
   int data;
   int min;
   Node next; 
      
  /************************
   * CLASS CONSTRUCTOR(S) *
   ************************/
   public Node(int data){
      this.data = data;
      this.next = null;
      min = -1;
   }

}
