//Every elements should only be used once

public class Solution {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<Integer> list = new ArrayList<Integer>();
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    
    if(candidates == null || candidates.length == 0) return result;
    
    Arrays.sort(candidates);
    helper(result, list, candidates, target, 0);
    return result;
  }
  
  public void helper(List<List<Integer>> result, List<Integer> list, int[] candidates, int target, int start){
    if(target < 0) return;
    else if(target == 0){
      result.add(new ArrayList<Integer> (list));
      return;
    }
    else{
      for(int i=start; i<candidates.length; i++){
        if(i>start && candidates[i] == candidates[i-1]) continue;
        list.add(candidates[i]);
        helper(result, list, candidates, target - candidates[i], i+1); //no reuse of elements, start from next element, therefore i+1
        list.remove(list.size()-1);
      }
    }
  }
}
