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
      }else{ 
         System.out.println("Error: Duplicates not aloud.");
         return tn; 
      }

      // Update height along recursive call. 
      tn.height = 1 + Math.max(getHeight(tn.leftChild), getHeight(tn.rightChild));  
 
      // Is node balanced? (Since this is visually a bottom-top approach). 
      int balance = getBalance(tn);     
      
      // If unbalanced, four cases.
      // Left left. 
      /*        o
               / \
              n   o
                 / \
                n   o 
                   / \
                  n   n          */                             
      if(balance > 1 && data < tn.leftChild.data){
         return rightRotation(tn); 
      }
      
      // Right right.
      /*            o
                   / \
                  o   n
                 / \ 
                o   n         
               / \            
              n   n              */ 
      if(balance < -1 && data > tn.rightChild.data){
         return leftRotation(tn);
      }
      
      // Left right. 
      /*         o
                / \
               o   n
              / \
             n    o           
                 / \           
                n   n              */
      if(balance > 1 && data > tn.leftChild.data){
         tn.leftChild = leftRotation(tn.leftChild);
         return rightRotation(tn);
      }

      // Right left.
      /*       o
              / \
             n   o
                / \
               o   n
              / \
             n   n                */
      if(balance < -1 && data < tn.rightChild.data){
         tn.rightChild = rightRotation(tn.rightChild); 
         return leftRotation(tn);
      }

      return tn;
   }

  /********************
   * HELPER METHOD(S) *
   ********************/
   public TreeNode leftRotation(TreeNode tn){
      
      TreeNode x = tn.rightChild;
      TreeNode y = x.leftChild; 

      // Rotate left. 
      x.leftChild = tn;
      tn.rightChild = y; 

      // Update heights (x height is dependent on tn height).
      tn.height = Math.max(getHeight(tn.leftChild), getHeight(tn.rightChild)) + 1;
      x.height = Math.max(getHeight(x.leftChild), getHeight(x.rightChild)) + 1;

      return tn;

   }                             

   public TreeNode rightRotation(TreeNode tn){

      TreeNode x = tn.leftChild;
      TreeNode y = x.rightChild;

      // Rotate right. 
      x.rightChild = tn;
      tn.leftChild = y; 

      // Update heights (x height is dependent on tn height). 
      tn.height = Math.max(getHeight(tn.leftChild), getHeight(tn.rightChild)) + 1; 
      x.height = Math.max(getHeight(x.leftChild), getHeight(x.rightChild)) + 1;     
      
      return tn;
   }

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
      System.out.println(tn.data + " with a height of: " + tn.height);
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
