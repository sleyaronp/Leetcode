public class Solution {
  public List<List<Integer>> permute(int[] nums) {
    List<Integer> list = new ArrayList<Integer>();
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    
    if(nums.length == 0 || nums == null) return result;
    
    helper(result, list, nums);
    return result;
  }
  
  public void helper(List<List<Integer>> result, List<Integer> list, int[] nums){
    if(list.size() == nums.size){
      result.add(new ArrayList<Integer> (list));
      return;
    }
    
    for(int i=0; i<nums.length; i++){
      if(list.contains(nums[i])) continue; //skip the ones already exists
    
      list.add(nums[i]);
      helper(result, list, num);
      list.remove(list.size()-1);
    }
  }
} 
