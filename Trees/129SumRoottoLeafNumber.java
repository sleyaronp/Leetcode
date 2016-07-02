public class Solution {
  public int sumNumbers(TreeNode root) {
    if(root == null) return 0;
    if(root.left == null && root.right == null) return root.val;
    
    return rootleafsum(root, 0);
  }
  
  public int rootleafsum(TreeNode node, int currentSum){
    if(node == null) return 0;
    
    currentSum = currentSum*10 + node.val; // 1->2, from 1 to 1*10 + 2 = 12
    
    if(node.left == null && node.right == null) return currentSum;
    
    return rootleafsum(node.left, currentSum) + rootleafsum(node.right, currentSum);
  }
}
