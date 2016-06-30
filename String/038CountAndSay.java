public class Solution {
    public String countAndSay(int n) {
      if(n < 0) return "";
      if(n == 0) return 1;
      
      String result = "1";
      int i = 1;
      
      while(i<n){
        StringBuilder cur = new StringBuilder();
        int count = 1; 
        for(int j=1; j<result.length(); j++){ //count within the string result
          if(result.charAt(j) == result.charAt(j-1)){
            count++; //count until no replicates
          }else{
            cur.append(count);
            cur.append(result.charAt(j-1));
            count = 1; //reset the count for next digit
          }
        }
        //add the last digit
           cur.append(count);
           cur.append(result.charAt(result.length()-1));
           i++;
           result = cur.toString();
      }
         return result;
    }
  }
