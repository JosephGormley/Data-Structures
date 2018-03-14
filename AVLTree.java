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
   public void insert(int data){ 
   
      // Create Tree Node. 
      TreeNode tn = new TreeNode(data);

      // Edge case (empty tree).
      if(root == null){
         root = tn;  
         return;    
      }

      // Traverse to proper location for data. 
      TreeNode prev = null; 
      TreeNode curr = root;
      while(curr != null){
         // Increase prev pointer since we move curr the following line.    
         prev = curr;   
         // Traverse down to next node. 
         curr = data < curr.data? curr.leftChild : curr.rightChild; 
      }

      // At this point, prev is pointing to data's parent. 
      // Compare data, add node to tree. 
      if(data < prev.data){
         prev.leftChild = tn;
      }else{
         prev.rightChild = tn;
      }

      // TODO @ JOE:
      // Note: This is an AVL tree, so must balance (if necessary). 
  
       
      return;
   }

   

  /********************
   * HELPER METHOD(S) *
   ********************/
   public void printInOrder(TreeNode tn){ 

      if(tn == null){
         return; 
      }

      printInOrder(tn.leftChild);
      System.out.println(tn.data);
      printInOrder(tn.rightChild);

   }

}

class TreeNode {
 
  /******************
   * CLASS FIELD(S) *
   ******************/
   int data;
   TreeNode leftChild;
   TreeNode rightChild; 

  /************************
   * CLASS CONSTRUCTOR(S) *
   ************************/
   public TreeNode(int data){
      this.data = data;
      leftChild = null;
      rightChild = null;
   }

}
