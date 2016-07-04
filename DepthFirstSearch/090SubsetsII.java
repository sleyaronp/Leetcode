public class Solution {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> item = new ArrayList<Integer>();
        
    if(nums.length == 0 || nums == null) return result;
      Arrays.sort(nums); 
        
      helper(result, item, nums, 0);
      return result;
    }
    
  public void helper(List<List<Integer>> result, List<Integer> list, int[] nums, int start){
    result.add(new ArrayList<Integer> (list));
    
    for(int i=start; i<nums.length; i++){
      if(i>start && nums[i] == nums[i-1]) continue; //skip the duplicates
        list.add(nums[i]);
        helper(result, list, nums, i+1);
        list.remove(list.size()-1);
      }
    }
}

