public class Solution {
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> list = new ArrayList<Integer>();
    
    if(nums.length == 0 || nums == null) return result;
    
    Arrays.sort(nums); //sort to ascending order
    
    helper(result, list, nums, 0);
    return result;
  }
  
  public void helper(List<List<Integer>> result, List<Integer> list, int[] nums, int start){
    result.add(new ArrayList<Integer> (list));
    
    for(int i=start; i<nums.length; i++){
      list.add(nums[i]);
      helper(result, list, nums, i+1);
      list.remove(list.size()-1);
    }
  }
}
