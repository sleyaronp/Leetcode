/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
//Inorder: left, father, right

public class Solution {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<Integer>();
    
    if(root != null){
      helper(root, result);
    }
    return result;
  }
  
  public void helper(TreeNode node, List<Integer> list){
    if(node.left != null){
      helper(node.left, list);
    }
    
    list.add(node.val);
    
    if(node.right != null){
      helper(node.right, list);
    }
  
  }
}

/* ----------------Stack Method---------------------------*/ 

public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        while( !stack.isEmpty() || root != null){
            if(root != null){ //push until there is no left child
                stack.push(root);
                root = root.left;
            }else{
                root = stack.pop();
                result.add(root.val);
                root = root.right;
            }
        }
         return result;
    }
