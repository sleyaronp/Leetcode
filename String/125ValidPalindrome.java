public class Solution {
  public boolean isPalindrome(String s) {
    if(s == null || s.length() == 0) return true;
    
    int i = 0, j = s.length()-1;
    while(i<j){
      
      //skip the none letter and digits
      while(i<j && !Character.isLetterOrDigit(s.charAt(i))) i++;
      while(i<j && !Character.isLetterOrDigit(s.charAt(j))) j--;

      if(i<j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){ //compare ignoring the case
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}
