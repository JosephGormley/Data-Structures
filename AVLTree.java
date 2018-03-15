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
      // Add node as child of prev, update weights.  
      if(data < prev.data){
         prev.leftChild = tn; 
      }else{
         prev.rightChild = tn;
      }

      // TODO @ JOE:
      // Note: This is an AVL tree, so must balance (if necessary). 
      balanceTree(tn);  
       
      return;
   }

   

  /********************
   * HELPER METHOD(S) *
   ********************/
   /* Balances the AVL tree in respect to a maximum difference of one. */
   /* Note: I may have to return a TreeNode due to different root */
   public void balanceTree(TreeNode tn){

      updateWeights(root);

      // TODO @ Joe: Implement rotations.       
      // There is four possible rotation cases. 
      // Right rotation - unbalanced Tree Node's left child's left child is tn. 
      
      // Left rotation - unbalanced Tree Node's right child's right child is tn. 

      // Left -> Right rotation - unbalanced Tree Node's right child's left child is tn. 
      // Note: this is followed by a right rotation. 

      // Right -> Left rotation - unbalanced Tree Node's left child's right child is tn. 
      // Note: this is followed by a left rotation.
   }
   
   /* Updates every weight of the tree. This is used to determine if tree is balanced. */
   public int updateWeights(TreeNode tn){
      
      // Base case.
      if(tn == null){
         return -1; 
      }
 
      // Update the weight of given Tree Node. 
      // Node: Recursive call. 
      tn.weight = Math.abs(updateWeights(tn.leftChild) - updateWeights(tn.rightChild));
 
      // Return weight. 
      return tn.weight; 
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

}

class TreeNode {
 
  /******************
   * CLASS FIELD(S) *
   ******************/
   int data;
   int weight;
   TreeNode leftChild;
   TreeNode rightChild; 

  /************************
   * CLASS CONSTRUCTOR(S) *
   ************************/
   public TreeNode(int data){
      this.data = data;
      weight = 0;
      leftChild = null;
      rightChild = null;
   }

}
