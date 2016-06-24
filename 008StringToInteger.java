public class Solution {
    public int myAtoi(String str) {
       if(str.length() == 0 || str == null) return 0;
      
       str = str.trim(); 
       
       int i = 0;
       char flag = '+';
      //recognize the sign
      if(str.charAt(0) == '+') {
        i++;
      }else if(str.charAt(0) == '-'){
        flag = '-';
        i++;
      }
      
      double result = 0; //store the result into a double
      
      //calculate the value
      while(i<str.length() && str.charAt(i)>= '0' && str.charAt(i) <= '9'){
        result = result*10 + (str.charAt(i) - '0'); //from the lowest digit
        i++;
      }
      
      if(flag == '-') result = -result;
      
      if(result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
      if(result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
      
      return (int)result;
    }
}
