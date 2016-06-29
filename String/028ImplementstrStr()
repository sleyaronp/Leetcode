//Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

public class Solution {
    public int strStr(String haystack, String needle) {
      if(haystack.length() == 0) return -1;
      if(needle.length() == 0) return 0;
      
      //set 2 pointers, one for the haystack, one for the needle
      for(int i=0; i < haystack.length() - needle.length() +1; i++){
        int j = 0;
        for(j=0; j < needle.length(); j++){
          if(needle.charAt(i+j) != haystack.charAt(i)){  //two word does not match
            break;  //break out of the for loop, j does not increment if words does not match
            //j only increment when the char in the needle matches the char in the haystack
          }
        }
        if(needle.length() == j){
          return i;
        }
      }
      return -1;
    }
}
