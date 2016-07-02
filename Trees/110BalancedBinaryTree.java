//For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
public class Solution {
  public boolean isBalanced(TreeNode root) {
    if(root == null) return true;
    
    return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <=1 &&
    isBalanced(root.left) && isBalanced(root.right);
  }
  
  public int maxDepth(TreeNode node){
    if(node == null) return 0;
    
    return Math.max(maxDepth(node.left), maxDepth(node.right)) + 1; //add the root
  }
}
