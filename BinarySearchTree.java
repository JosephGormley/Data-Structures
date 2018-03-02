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
      
      // Create node for data.
      Node<T> n = new Node<T>(data, null, null);

      // Edge case. 
      if(root == null){
         root = n;
         return;
      }
      
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

   /*******************
   * HELPER METHOD(S) *
   *******************/
   /* Prints out tree in order */
   public void printInOrder(){
      inOrderTraverse(root);
      return;
   }

   public void inOrderTraverse(Node<T> current){
      
     if(current.leftChild != null){ // Left.

        inOrderTraverse(current.leftChild);

     }

     System.out.println(current.data); // Visit.
  
     if(current.rightChild != null){ // Right.

        inOrderTraverse(current.rightChild);
      
     }    

     if(current.leftChild != null && current.rightChild != null){
     
        return;

     }  

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

