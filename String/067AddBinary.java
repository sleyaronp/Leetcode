public class Solution {
    public String addBinary(String a, String b) {
      StringBuilder result = new StringBuilder();
      
      int carry = 0;
      int i = a.length()-1, j = b.length()-1; 
      while(i >= 0 || j >=0 || carry == 1){
        int sum = carry; //add the previous carry first
        if(j >= 0) sum += b.charAt(j--) - '0'; //decrease after execution, gets the ASCII code, 0 for 0
        if(i >= 0) sum += a.charAt(i--) - '0';
        result.append(sum%2); //append is to the last digit, needs to reverse afterwards
        carry = sum/2; //2(10) for 10(2), meaning a carry
      }
      
      return result.reverse().toString();
    }
  }
