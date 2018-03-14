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

   public void insert(int data){ }

   

  /********************
   * HELPER METHOD(S) *
   ********************/
   public void printInOrder(){ }

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
