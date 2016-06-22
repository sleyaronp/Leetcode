public class Solution {
   public String longestPalindrome(String s) {
      if(s == null || s.length() == 0) return null;
      if(s.length() == 1) return s;
      
      String result = new String();
      for(int i=0; i<s.length(); i++){
         String temp = helper(s, i, i); //the result string contains odd number of letters
         if(temp.length() > result.length()) result = temp;
         
         temp = helper(s, i, i+1);  //the result string contains even number of letters
         if(temp.length() > result.length()) result = temp;
      }
      return result;
   }
   
   public String helper(String s, int start, int end){
      while(start >= 0 && end <= s.length()-1 && s.charAt(start) == s.charAt(end){
        start--;
        end++;
      }
      
      return s.substring(start+1, end); //end when start<0, so need to add 1 to substring correctly
   }
}
