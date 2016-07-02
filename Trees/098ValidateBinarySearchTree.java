/*
Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees. 
*/

public class Solution {
  public boolean isValidBST(TreeNode root) {
    if(root == null) return true;
    
    return validBST(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
  }
  
  public boolean validBST(TreeNode node, double low, double high){
    if(node == null) return true;
    if(node.val <= low || node.val >= high) return false;
    return validBST(node.left, low, node.val) && validBST(node.right, node.val, high);
  }
}
