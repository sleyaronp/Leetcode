public class Solution {
  public List<List<Integer>> combine(int n, int k) {
    List<Integer> list = new ArrayList<Integer>();
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    
    if(n<=0 || n<k) return result;
    
    helper(result, list, n, k, 1);
    return result;
  }
  
  public void helper(List<List<Integer>> result, List<Integer> list, int n, int k, int start){
    if(list.size() == k){ //choose k from n
      result.add(new ArrayList<Integer> (list));
      return;
    }
    
    for(int i=start; i<=n; i++){
      list.add(i);
      helper(result, list, n, k, i+1);
      list.remove(list.size()-1);
    }
  }
}
