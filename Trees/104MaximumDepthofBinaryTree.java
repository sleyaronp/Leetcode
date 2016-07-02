//recursive
public class Solution {
  public int maxDepth(TreeNode root){
    int depth = 0;
    if(root ==  null) return 0;
    
    return getDepth(root, 1);
  }
  
  public int getDepth(TreeNode node, int currentDepth){
    if(node == null) return 0;
    
    int left = currentDepth, right = currentDepth;
    
    if(node.left != null) left = getDepth(node.left, currentDepth+1);
    if(node.right != null) right = getDepth(node.right, currentDepth+1);
    
    return left>right ? left: right;
  }
}
