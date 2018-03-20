import java.lang.Math;

public class AVLTree {

  /******************
   * CLASS FIELD(S) *
   ******************/
   TreeNode root; 

  /************************
   * CLASS CONSTRUCTOR(S) *  
   ************************/
   // Default constructor is fine for this class. 

  /*******************
   * CLASS METHOD(S) *
   *******************/
   /* Inserts data into tree while maintaining balance. */
   public TreeNode insert(TreeNode tn, int data){ 
   
      // Create Tree Node. 
      TreeNode tn = new TreeNode(data);

      // Base case.
      if(tn == null){  
         return null;    
      }

      // Recursive call.
      if(tn.data < data){
  
         tn.leftChild = insert(tn.leftChild, data);

      }else if(tn.data > data){
         
         t.rightChild = insert(tn.rightChild, data);

      }else{ // Duplicates not aloud.
         System.out.println("Error: Duplcates not aloud.");
         return tn; 
      }

      // Update height along recursive call. 
      tn.height = 1 + Math.max(getHeight(tn.LeftChild)), getHeight(tn.rightChild);  
       
      // Is it balanced?

      return tn; // Unchanged node pointer.
   }

   

  /********************
   * HELPER METHOD(S) *
   ********************/
   /* A Helper method to retrieve height given a TreeNode. */
   private int getHeight(TreeNode tn){

      if(tn == null){
         return 0;
      }

      return tn.height;

   }

   /* Prints the AVL tree in a inOrder traversal. */
   public void printInOrder(TreeNode tn){ 

      if(tn == null){
         return; 
      }

      printInOrder(tn.leftChild);
      System.out.println(tn.data + " with a weight of: " + tn.weight);
      printInOrder(tn.rightChild);

   }

  /*********************
   * WRAPPED METHOD(S) *
   *********************/

}

class TreeNode {
 
  /******************
   * CLASS FIELD(S) *
   ******************/
   int data;
   int height;
   TreeNode leftChild;
   TreeNode rightChild; 

  /************************
   * CLASS CONSTRUCTOR(S) *
   ************************/
   public TreeNode(int data){
      this.data = data;
      height = 1;
      leftChild = null;
      rightChild = null;
   }

}
