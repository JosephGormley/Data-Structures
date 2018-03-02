/* Author: Joseph Gormley 
   Date:   03/01/18 */ 

public class BinarySearchTree<T extends Comparable<T>> {
    
   /******************
   * CLASS MEMBER(S) *
   *******************/
   Node<T> root;

   /*****************
   * CONSTRUCTOR(S) *
   *****************/
   // Default constructor is fine for this case. 
   

   /************
   * METHOD(S) *
   ************/
   public void addData(T data){
      
      // Edge case. 


      // Create node for data.
      Node<T> n = new Node<T>(data, null, null);
      
      // Traverse the tree to add data.
      Node<T> curr = root;
 
      while(true){
         if(n.data.compareTo(curr.data) < 0){ // Data to add is less than the curr data.
            if(curr.leftChild != null){ // Traverse left. 
               
               curr = curr.leftChild;

            }else{ // Add data.
           
               curr.leftChild = n;
               return;

            }
         }else{ // Data to add is larger than the curr data. 
            if(curr.rightChild != null){ // Traverse right.

               curr = curr.rightChild;

            }else{ // Add data. 

               curr.rightChild = n;
               return;

            }
          }
      } // End of while loop. 
   } // End of method.

   ********************
   * HELPER METHOD(S) *
   ********************
   public void inOrderTraverse(){






   } // End of method. 
   
}// End of class.



class Node<T> {

   /******************
   * CLASS MEMBER(S) *
   ******************/
   T data;
   Node<T> leftChild;
   Node<T> rightChild;
 
   /*****************
   * CONSTRUCTOR(S) *
   *****************/
   public Node(T data, Node<T> leftChild, Node<T> rightChild){

      this.data = data;    
      this.leftChild = leftChild;
      this.rightChild = rightChild;
   }
}   

