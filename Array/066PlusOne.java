//Given a non-negative number represented as an array of digits, plus one to the number.

public class Solution {
    public int[] plusOne(int[] digits) {
      int carry = 1; //add carry directly
      
      for(int i = digits.length - 1; i>=0; i--){
        if(digits[i] < 9){
          digits[i] += carry;
          return digits; //return result here if no carry
        }else if(digits[i] == 9){
          digits[i] = 0;
        }
      }
      
      //add a new digit ahead, in the situation of all nine
      int[] result = new int[digits.length+1];
      result[0] = 1;
      return result;
    }
  }
