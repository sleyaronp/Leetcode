public class Solution {
  public String convertToTitle(int n) {
    if(n == 0) return null;
    
    StringBuilder result = new StringBuilder();
    while(n>0){
      n--; //minus one
      Char ch = (Char) ( n%26 + 'A'); //convert from number to character
      result.append(ch);
      n /= 26;
    }
    result.reverse();
    return result.toString();
  }
}
