//Permutations with duplicates

public class Solution {
  public List<List<Integer>> permuteUnique(int[] nums) {
    List<Integer> list = new ArrayList<Integer>();
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    
    Arrays.sort(nums);
    boolean[] visited = new boolean[nums.length];
    
    if(nums.length == 0 || nums == null) return result;
    helper(result, list, nums, visited);
    return result;
  }
  
  public void helper(List<List<Integer>> result, List<Integer> list, int[] nums, boolean[] visited){
    if(list.size() == nums.length) {
      result.add(new ArrayList<Integer> (list));
      return;
    }
    
    for(int i=0; i<nums.length; i++){
      if(visited[i] || (i>0 && nums[i] == nums[i-1] && !visited[i-1])){ 
      //先判断前面的一个数是否和自己相等，相等的时候则前面的数必须使用了，自己才能使用
        continue;
      }
      
      visited[i] = true;
      list.add(nums[i]);
      helper(result, list, nums, visited);
      list.remove(list.size()-1);
      visited[i] = false;
    }
  }
}
