public class Solution {
    public String intToRoman(int num) {
       if(num == 0) return "";    
        
       int[] number = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
       String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
       
       int i = 0; //counter for the arrays above, start from first to the last
       
       StringBuilder result = new StringBuilder();
       while(num>0){
          int k = num/number[i]; //determines how many single symbols you should add to one
          for(int j=0; j<k; j++){ 
            num = num - number[i]; //deduce once
            result.append(roman[i]);
          }
          i++;
       }
       
       return result.toString();
    }
}
