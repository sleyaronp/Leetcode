public class Solution {
  public List<Integer> grayCode(int n) {
    if(n==0){
      List<Integer> result = new ArrayList<Integer>();
      result.add(0);
      return result;
    } 
    
    List<Integer> result = grayCode(n-1); //backtracking, recursive here
    int numToAdd = 1<<(n-1); //left shift of 2 digits here
    //calculate in binary but actual show in decimal
    
    //add in reverse order and the prefix
    for(int i=result.size()-1; i>=0; i--){
      result.add(numToAdd + result.get(i));
    }
    
    return result;
  }
}
