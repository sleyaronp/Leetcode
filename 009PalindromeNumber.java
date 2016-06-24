public class Solution {
    public boolean isPalindrome(int x) {
      boolean palindrome = false;
      
      if(x<0) return false;
      if(x>=0 && x<=9) return true;
      if(x>10){
        //convert the number to string
        String num = Integer.toString(x);
        
        //set two flags
        int low = 0;
        int high = num.length()-1;
        
        while(low<high){
           if(num.charAt(low) != num.charAt(high)){
            palindrome = false;
            break;
          } else palindrome = true;
            low++;
            high--;
        }
      }
      return palindrome;
    }
}
