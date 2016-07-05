public class Solution {
  public List<String> letterCombinations(String digits) {
    String[] comb = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    //from 0 to 9, 0 for blank
        
    List<String> result = new ArrayList<String>();
    StringBuilder list = new StringBuilder();
    
    if(digits == null || digits.length() == 0) return result;

    helper(result, list, digits, comb, 0);
    return result;
 }
    
  public void helper(List<String> result, StringBuilder list, String digits, String[] comb, int s){
    if(s == digits.length()){ 
        //this for loop controls the number of digits we want to add in each list
        result.add(list.toString()); //result.add(new StringBuilder(list).toString());
        return;
      }
        
    for(int i=0; i<comb[digits.charAt(s) - '0'].length(); i++){
    //this loop limits the scale of digits that will be added to the list
    //in this case, one digit come from one number-letter combination
    list.append(comb[digits.charAt(s) - '0'].charAt(i));
    helper(result, list, digits, comb, s+1); //then append from second digit
    list.deleteCharAt(list.length()-1);
    }
  }
}
