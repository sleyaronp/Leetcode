public class Solution {
  public int romanToInt(String s) {
     if(s == null || s.length() == 0) return 0;
     
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();  //<Key, Value>
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
    
    int length = s.length();
    int result = map.get(s.charAt(length-1));  //unit digit
    
    //if ends at 1, won't get the result at s.charAt(0);
    //also don't start from the length-1 th digit because result already got that number
    for(int i=length-2; i>=0; i--){  //calculate from second digit
       if(map.get(s.charAt(i+1)) <= map.get(s.charAt(i))){
         result += map.get(s.charAt(i));
      }
       else{
         result -= map.get(s.charAt(i));
       }
    }
    return result;
  }
}
