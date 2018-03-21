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
   public TreeNode insideInsert(TreeNode tn, int data){ 
   

      // Base case.
      if(tn == null){  
         return new TreeNode(data);    
      }

      // Recursive call.
      if(data < tn.data){
  
         tn.leftChild = insideInsert(tn.leftChild, data);

      }else if(data > tn.data){
         
         tn.rightChild = insideInsert(tn.rightChild, data);

      }else{ // Duplicates not aloud.
         System.out.println("Error: Duplicates not aloud.");
         return tn; 
      }

      // Update height along recursive call. 
      tn.height = 1 + Math.max(getHeight(tn.leftChild), getHeight(tn.rightChild));  
 
      // Is node balanced? (Since this is recursive it is a bottom top approach). 
      int balance = getBalance(tn);     
      
      // If unbalanced, four cases.
      // Right right
      if(balance < -1 && data > tn.rightChild.data){

         System.out.println("Entering case of right right");

         TreeNode x = tn.rightChild;
         TreeNode y = x.leftChild;
 
         x.leftChild = tn;
         tn.rightChild = y;

         // Update heights. Starting at old root. 
         tn.height = Math.max(getHeight(tn.leftChild), getHeight(tn.rightChild)) + 1;
         x.height = Math.max(getHeight(x.leftChild), getHeight(x.rightChild)) + 1;         
          
         return x;
      }
      
      
     
      
      return tn; // Unchanged node pointer.
   }

   

  /********************
   * HELPER METHOD(S) *
   ********************/
   /* Helper method to retrieve balance on a given TreeNode */
   private int getBalance(TreeNode tn){
   
      if(tn == null){
         return 0;
      }

      return getHeight(tn.leftChild) - getHeight(tn.rightChild);
   }

   /* Helper method to retrieve height given a TreeNode. */
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
      System.out.println(tn.data + " with a weight of: " + tn.height);
      printInOrder(tn.rightChild);

   }

  /*********************
   * WRAPPED METHOD(S) *
   *********************/
   /* Wrapper class for insert() */
   public void insert(int data){
 
      root = insideInsert(root, data);

   }
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
